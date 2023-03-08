package org.hl7.fhir.utilities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPReply;
import org.hl7.fhir.exceptions.FHIRException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class FTPClient {

  private static final Logger logger = LoggerFactory.getLogger(FTPClient.class);

  private final org.apache.commons.net.ftp.FTPClient clientImpl;

  @Getter
  private long createRemotePathIfNotExistsMillis;

  @Getter
  private long storeFileTimeMillis;

  @Getter
  private long deleteFileTimeMillis;

  @Getter
  private final String server;

  @Getter
  private final String path;

  private String resolvedPath = null;

  @Getter
  private final String user;

  @Getter
  private final String password;

  @Getter
  private final int port;

  private final String remoteSeparator;

  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  private class FTPReplyCodeAndString {
    @Getter
    private final int replyCode;

    @Getter
    private final String replyString;

    public String toString()
    {
      return "Reply code: " + replyCode + " Message: " + replyString;
    }
  }

  /**
   * Connect to an FTP server
   * @param server - the server to connect to (usually just an IP address). It's up to the system to figure out access (VPN etc)
   * @param path - the path on the FTP server to treat all the operations as relative to 
   * @param user - username for the FTP server
   * @param password - password for the FTP server
   */
  public FTPClient(String server, String path, String user, String password) {
    this (server, -1, path, user, password);
  }

  protected FTPClient(String server, int port, String path, String user, String password) {
    this.server = server;
    this.port = port;
    this.remoteSeparator = "/";
    this.path = buildPath(path);

    this.user = user;
    this.password = password;

    clientImpl = new org.apache.commons.net.ftp.FTPClient();
  }

  private String buildPath(String path) {
    if (path.length() == 0) {
      return "";
    }
    if (path.endsWith(remoteSeparator))
    {
      return path;
    }
    return path + remoteSeparator;
  }

  /**
   * Connect to the server, throw an exception if it fails
   */
  public void connect() throws IOException {
    if (port != -1) {
      clientImpl.connect(server, port);
    }
    else {
      clientImpl.connect(server);
    }

    clientImpl.login(user, password);

    throwExceptionForNegativeCompletion("FTP server could not connect.", true);

    resetTimers();

    logger.debug("Initial Working directory: " + clientImpl.printWorkingDirectory());

    clientImpl.changeWorkingDirectory(path);

    throwExceptionForNegativeCompletion("FTP server could not establish default working directory", true);

    resolvedPath = clientImpl.printWorkingDirectory();

    logger.debug("Resolved working directory: " + resolvedPath);
  }

  private void resetTimers() {
    this.createRemotePathIfNotExistsMillis = 0;
    this.storeFileTimeMillis = 0;
    this.deleteFileTimeMillis = 0;
  }

  /**
   * Delete a file on the FTP server
   * 
   * @param path - relative to the path provided in the constructor 
   */
  public void delete(String path) throws IOException {
    String resolvedPath = resolveRemotePath(path);
    logger.debug("Deleting remote file: " + resolvedPath);
    long startTime = System.currentTimeMillis();
    clientImpl.deleteFile(resolvedPath);
    this.deleteFileTimeMillis += System.currentTimeMillis() - startTime;
    throwExceptionForNegativeCompletion("Error deleting file.", false);
    logger.debug("Remote file deleted: " + resolvedPath);
  }

  /**
   * Takes a file path and creates all intermediate directories if they do not yet exist.
   * @param filePath relative to the path provided in the constructor and including the file name
   * @throws IOException
   */
  protected void createRemotePathIfNotExists(String filePath) throws IOException {
    long startTime = System.currentTimeMillis();
    String[] subPath = filePath.split(remoteSeparator);
    try {
    for (int i = 0 ; i < subPath.length - 1; i++){
      if (subPath[i].isEmpty() ) {
        continue;
      }
      boolean exists = clientImpl.changeWorkingDirectory(subPath[i]);
      if (!exists) {
        logger.debug("Remote directory does not exist: " + clientImpl.printWorkingDirectory() + remoteSeparator + subPath[i]);
        clientImpl.makeDirectory(subPath[i]);
        clientImpl.changeWorkingDirectory(subPath[i]);
        logger.debug("Made remote directory: " + clientImpl.printWorkingDirectory());
      }
    }} catch (IOException e) {
      throw new IOException("Error creating remote path: " + filePath, e);
    } finally {
      clientImpl.changeWorkingDirectory(this.resolvedPath);
    }
    this.createRemotePathIfNotExistsMillis += System.currentTimeMillis() - startTime;
  }

  protected boolean remotePathExists(String path) throws IOException {
    boolean output;
    try {
      output = clientImpl.changeWorkingDirectory(path);
    } finally {
      clientImpl.changeWorkingDirectory(this.resolvedPath);
    }
    return output;
  }

  private String resolveRemotePath(String path) {
    if (path.startsWith(remoteSeparator)) {
      throw new IllegalArgumentException("Absolute remote path is not permitted. Path: " + path);
    }
    return String.join(remoteSeparator, path);
  }

  /**
   * Upload a file from the local system to the FTP Server
   * @param source - absolute path on local system
   * @param path - relative to the path provided in the constructor
   */
  public void upload(String source, String path) throws IOException {
    String resolvedPath = resolveRemotePath(path);
    logger.debug("Uploading file to remote path: " + resolvedPath);


    attemptUpload(source, resolvedPath);

    FTPReplyCodeAndString reply = getFTPReplyCodeAndString();
    if (FTPReply.isPositiveCompletion(reply.replyCode)) {
      logger.debug("Remote file uploaded: " + resolvedPath);
      return;
    } else if (possibleDirectoryNotExistsCode(reply)) {
      createRemotePathIfNotExists(resolvedPath);
      attemptUpload(source, resolvedPath);
      throwExceptionForNegativeCompletion("Error uploading file (second attempt).", false);
      return;
    }

    throwExceptionForNegativeCompletion(reply,"Error uploading file.", false);
    logger.debug("Remote file uploaded: " + resolvedPath);
  }


  private boolean possibleDirectoryNotExistsCode(FTPReplyCodeAndString reply) {
    /*
    Note: This code may be 550 on some servers (IIS) and 553 on others (mockftpserver).
     */
    return reply.replyCode == 550 || reply.replyCode == 553;
  }

  private void attemptUpload(String source, String resolvedPath) throws IOException {
    final long startTime = System.currentTimeMillis();
    FileInputStream localStream = new FileInputStream(source);
    clientImpl.setFileType(FTP.BINARY_FILE_TYPE);
    clientImpl.enterLocalPassiveMode();
    clientImpl.storeFile(resolvedPath, localStream);
    localStream.close();
    this.storeFileTimeMillis += System.currentTimeMillis() - startTime;
  }

  private FTPReplyCodeAndString getFTPReplyCodeAndString() {
    final int replyCode = clientImpl.getReplyCode();
    final String replyString = clientImpl.getReplyString();

    return new FTPReplyCodeAndString(replyCode, replyString);
  }

  private void throwExceptionForNegativeCompletion(String localErrorMessage, boolean disconnectOnError) throws IOException {
    FTPReplyCodeAndString reply = getFTPReplyCodeAndString();
    throwExceptionForNegativeCompletion(reply, localErrorMessage, disconnectOnError);
  }

  private void throwExceptionForNegativeCompletion(FTPReplyCodeAndString reply, String localErrorMessage, boolean disconnectOnError) throws IOException {
    if (FTPReply.isPositiveCompletion(reply.replyCode)) {
      return;
    }

    if (disconnectOnError) {
      clientImpl.disconnect();
    }
    throw new IOException(localErrorMessage + " " + reply);
  }

  public void disconnect() throws IOException {
    clientImpl.disconnect();
  }


  public static void main(String[] args) throws IOException, FHIRException {
    /*
    FTPClient ftp = new FTPClient(getNamedParam(args, "-upload-server"), getNamedParam(args, "-upload-path"), getNamedParam(args, "-upload-user"), getNamedParam(args, "-upload-password"));
    ftp.connect();
    ftp.upload("/Users/grahamegrieve/temp/test.xml", "testing/test.xml");
    ftp.delete("testing/test.xml");
    ftp.disconnect();
     */
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
    FTPClient ftp = new FTPClient("localhost", "bleh", "dummyFtpUser", "shrampythexmasshramp");
    ftp.connect();
    ftp.upload("D:\\IN\\2023-03-08-ftpclient-speed\\test.xml", "nah/perhaps/test.xml");
    ftp.upload("D:\\IN\\2023-03-08-ftpclient-speed\\test.xml", "nah/maybe/test.xml");
    //ftp.delete("nah/perhaps/test.xml");
    ftp.disconnect();
  }
  private static String getNamedParam(String[] args, String param) {
    boolean found = false;
    for (String a : args) {
      if (found)
        return a;
      if (a.equals(param)) {
        found = true;
      }
    }
    return null;
  }

  
}

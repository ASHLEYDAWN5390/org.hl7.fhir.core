package org.hl7.fhir.r5.test;

import org.hl7.fhir.r5.formats.XmlParser;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.Resource;
import org.hl7.fhir.r5.test.utils.TestingUtilities;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class NewTest {

  @Test
  void testXMLParse() throws IOException {
    InputStream stream = TestingUtilities.loadTestResourceStream("validator",
      "xml_v10.xml");
    CodeSystem resource = (CodeSystem) new XmlParser().parse(stream);
  }
}

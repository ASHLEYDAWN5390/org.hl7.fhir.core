package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Fri, Jul 15, 2022 11:20+1000 for FHIR v5.0.0-snapshot2

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
@ResourceDef(name="QuestionnaireResponse", profile="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse")
public class QuestionnaireResponse extends DomainResource {

    public enum QuestionnaireResponseStatus {
        /**
         * This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it.
         */
        INPROGRESS, 
        /**
         * This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive.
         */
        COMPLETED, 
        /**
         * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
         */
        AMENDED, 
        /**
         * This QuestionnaireResponse was entered in error and voided.
         */
        ENTEREDINERROR, 
        /**
         * This QuestionnaireResponse has been partially filled out with answers but has been abandoned. No subsequent changes can be made.
         */
        STOPPED, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static QuestionnaireResponseStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("amended".equals(codeString))
          return AMENDED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("stopped".equals(codeString))
          return STOPPED;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown QuestionnaireResponseStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case INPROGRESS: return "in-progress";
            case COMPLETED: return "completed";
            case AMENDED: return "amended";
            case ENTEREDINERROR: return "entered-in-error";
            case STOPPED: return "stopped";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case INPROGRESS: return "http://hl7.org/fhir/questionnaire-answers-status";
            case COMPLETED: return "http://hl7.org/fhir/questionnaire-answers-status";
            case AMENDED: return "http://hl7.org/fhir/questionnaire-answers-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/questionnaire-answers-status";
            case STOPPED: return "http://hl7.org/fhir/questionnaire-answers-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case INPROGRESS: return "This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it.";
            case COMPLETED: return "This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive.";
            case AMENDED: return "This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.";
            case ENTEREDINERROR: return "This QuestionnaireResponse was entered in error and voided.";
            case STOPPED: return "This QuestionnaireResponse has been partially filled out with answers but has been abandoned. No subsequent changes can be made.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case INPROGRESS: return "In Progress";
            case COMPLETED: return "Completed";
            case AMENDED: return "Amended";
            case ENTEREDINERROR: return "Entered in Error";
            case STOPPED: return "Stopped";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class QuestionnaireResponseStatusEnumFactory implements EnumFactory<QuestionnaireResponseStatus> {
    public QuestionnaireResponseStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
          return QuestionnaireResponseStatus.INPROGRESS;
        if ("completed".equals(codeString))
          return QuestionnaireResponseStatus.COMPLETED;
        if ("amended".equals(codeString))
          return QuestionnaireResponseStatus.AMENDED;
        if ("entered-in-error".equals(codeString))
          return QuestionnaireResponseStatus.ENTEREDINERROR;
        if ("stopped".equals(codeString))
          return QuestionnaireResponseStatus.STOPPED;
        throw new IllegalArgumentException("Unknown QuestionnaireResponseStatus code '"+codeString+"'");
        }
        public Enumeration<QuestionnaireResponseStatus> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<QuestionnaireResponseStatus>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
          return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.INPROGRESS);
        if ("completed".equals(codeString))
          return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.COMPLETED);
        if ("amended".equals(codeString))
          return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.AMENDED);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.ENTEREDINERROR);
        if ("stopped".equals(codeString))
          return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.STOPPED);
        throw new FHIRException("Unknown QuestionnaireResponseStatus code '"+codeString+"'");
        }
    public String toCode(QuestionnaireResponseStatus code) {
      if (code == QuestionnaireResponseStatus.INPROGRESS)
        return "in-progress";
      if (code == QuestionnaireResponseStatus.COMPLETED)
        return "completed";
      if (code == QuestionnaireResponseStatus.AMENDED)
        return "amended";
      if (code == QuestionnaireResponseStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == QuestionnaireResponseStatus.STOPPED)
        return "stopped";
      return "?";
      }
    public String toSystem(QuestionnaireResponseStatus code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class QuestionnaireResponseItemComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
         */
        @Child(name = "linkId", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Pointer to specific item from Questionnaire", formalDefinition="The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource." )
        protected StringType linkId;

        /**
         * A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.
         */
        @Child(name = "definition", type = {UriType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="ElementDefinition - details for the item", formalDefinition="A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item." )
        protected UriType definition;

        /**
         * Text that is displayed above the contents of the group or as the text of the question being answered.
         */
        @Child(name = "text", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Name for group or question text", formalDefinition="Text that is displayed above the contents of the group or as the text of the question being answered." )
        protected StringType text;

        /**
         * The respondent's answer(s) to the question.
         */
        @Child(name = "answer", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="The response(s) to the question", formalDefinition="The respondent's answer(s) to the question." )
        protected List<QuestionnaireResponseItemAnswerComponent> answer;

        /**
         * Sub-questions, sub-groups or display items nested beneath a group.
         */
        @Child(name = "item", type = {QuestionnaireResponseItemComponent.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Child items of group item", formalDefinition="Sub-questions, sub-groups or display items nested beneath a group." )
        protected List<QuestionnaireResponseItemComponent> item;

        private static final long serialVersionUID = -1395483402L;

    /**
     * Constructor
     */
      public QuestionnaireResponseItemComponent() {
        super();
      }

    /**
     * Constructor
     */
      public QuestionnaireResponseItemComponent(String linkId) {
        super();
        this.setLinkId(linkId);
      }

        /**
         * @return {@link #linkId} (The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
         */
        public StringType getLinkIdElement() { 
          if (this.linkId == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create QuestionnaireResponseItemComponent.linkId");
            else if (Configuration.doAutoCreate())
              this.linkId = new StringType(); // bb
          return this.linkId;
        }

        public boolean hasLinkIdElement() { 
          return this.linkId != null && !this.linkId.isEmpty();
        }

        public boolean hasLinkId() { 
          return this.linkId != null && !this.linkId.isEmpty();
        }

        /**
         * @param value {@link #linkId} (The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
         */
        public QuestionnaireResponseItemComponent setLinkIdElement(StringType value) { 
          this.linkId = value;
          return this;
        }

        /**
         * @return The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
         */
        public String getLinkId() { 
          return this.linkId == null ? null : this.linkId.getValue();
        }

        /**
         * @param value The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
         */
        public QuestionnaireResponseItemComponent setLinkId(String value) { 
            if (this.linkId == null)
              this.linkId = new StringType();
            this.linkId.setValue(value);
          return this;
        }

        /**
         * @return {@link #definition} (A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
         */
        public UriType getDefinitionElement() { 
          if (this.definition == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create QuestionnaireResponseItemComponent.definition");
            else if (Configuration.doAutoCreate())
              this.definition = new UriType(); // bb
          return this.definition;
        }

        public boolean hasDefinitionElement() { 
          return this.definition != null && !this.definition.isEmpty();
        }

        public boolean hasDefinition() { 
          return this.definition != null && !this.definition.isEmpty();
        }

        /**
         * @param value {@link #definition} (A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
         */
        public QuestionnaireResponseItemComponent setDefinitionElement(UriType value) { 
          this.definition = value;
          return this;
        }

        /**
         * @return A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.
         */
        public String getDefinition() { 
          return this.definition == null ? null : this.definition.getValue();
        }

        /**
         * @param value A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.
         */
        public QuestionnaireResponseItemComponent setDefinition(String value) { 
          if (Utilities.noString(value))
            this.definition = null;
          else {
            if (this.definition == null)
              this.definition = new UriType();
            this.definition.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #text} (Text that is displayed above the contents of the group or as the text of the question being answered.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public StringType getTextElement() { 
          if (this.text == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create QuestionnaireResponseItemComponent.text");
            else if (Configuration.doAutoCreate())
              this.text = new StringType(); // bb
          return this.text;
        }

        public boolean hasTextElement() { 
          return this.text != null && !this.text.isEmpty();
        }

        public boolean hasText() { 
          return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (Text that is displayed above the contents of the group or as the text of the question being answered.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public QuestionnaireResponseItemComponent setTextElement(StringType value) { 
          this.text = value;
          return this;
        }

        /**
         * @return Text that is displayed above the contents of the group or as the text of the question being answered.
         */
        public String getText() { 
          return this.text == null ? null : this.text.getValue();
        }

        /**
         * @param value Text that is displayed above the contents of the group or as the text of the question being answered.
         */
        public QuestionnaireResponseItemComponent setText(String value) { 
          if (Utilities.noString(value))
            this.text = null;
          else {
            if (this.text == null)
              this.text = new StringType();
            this.text.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #answer} (The respondent's answer(s) to the question.)
         */
        public List<QuestionnaireResponseItemAnswerComponent> getAnswer() { 
          if (this.answer == null)
            this.answer = new ArrayList<QuestionnaireResponseItemAnswerComponent>();
          return this.answer;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public QuestionnaireResponseItemComponent setAnswer(List<QuestionnaireResponseItemAnswerComponent> theAnswer) { 
          this.answer = theAnswer;
          return this;
        }

        public boolean hasAnswer() { 
          if (this.answer == null)
            return false;
          for (QuestionnaireResponseItemAnswerComponent item : this.answer)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public QuestionnaireResponseItemAnswerComponent addAnswer() { //3
          QuestionnaireResponseItemAnswerComponent t = new QuestionnaireResponseItemAnswerComponent();
          if (this.answer == null)
            this.answer = new ArrayList<QuestionnaireResponseItemAnswerComponent>();
          this.answer.add(t);
          return t;
        }

        public QuestionnaireResponseItemComponent addAnswer(QuestionnaireResponseItemAnswerComponent t) { //3
          if (t == null)
            return this;
          if (this.answer == null)
            this.answer = new ArrayList<QuestionnaireResponseItemAnswerComponent>();
          this.answer.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #answer}, creating it if it does not already exist {3}
         */
        public QuestionnaireResponseItemAnswerComponent getAnswerFirstRep() { 
          if (getAnswer().isEmpty()) {
            addAnswer();
          }
          return getAnswer().get(0);
        }

        /**
         * @return {@link #item} (Sub-questions, sub-groups or display items nested beneath a group.)
         */
        public List<QuestionnaireResponseItemComponent> getItem() { 
          if (this.item == null)
            this.item = new ArrayList<QuestionnaireResponseItemComponent>();
          return this.item;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public QuestionnaireResponseItemComponent setItem(List<QuestionnaireResponseItemComponent> theItem) { 
          this.item = theItem;
          return this;
        }

        public boolean hasItem() { 
          if (this.item == null)
            return false;
          for (QuestionnaireResponseItemComponent item : this.item)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public QuestionnaireResponseItemComponent addItem() { //3
          QuestionnaireResponseItemComponent t = new QuestionnaireResponseItemComponent();
          if (this.item == null)
            this.item = new ArrayList<QuestionnaireResponseItemComponent>();
          this.item.add(t);
          return t;
        }

        public QuestionnaireResponseItemComponent addItem(QuestionnaireResponseItemComponent t) { //3
          if (t == null)
            return this;
          if (this.item == null)
            this.item = new ArrayList<QuestionnaireResponseItemComponent>();
          this.item.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #item}, creating it if it does not already exist {3}
         */
        public QuestionnaireResponseItemComponent getItemFirstRep() { 
          if (getItem().isEmpty()) {
            addItem();
          }
          return getItem().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("linkId", "string", "The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.", 0, 1, linkId));
          children.add(new Property("definition", "uri", "A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.", 0, 1, definition));
          children.add(new Property("text", "string", "Text that is displayed above the contents of the group or as the text of the question being answered.", 0, 1, text));
          children.add(new Property("answer", "", "The respondent's answer(s) to the question.", 0, java.lang.Integer.MAX_VALUE, answer));
          children.add(new Property("item", "@QuestionnaireResponse.item", "Sub-questions, sub-groups or display items nested beneath a group.", 0, java.lang.Integer.MAX_VALUE, item));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1102667083: /*linkId*/  return new Property("linkId", "string", "The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.", 0, 1, linkId);
          case -1014418093: /*definition*/  return new Property("definition", "uri", "A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.", 0, 1, definition);
          case 3556653: /*text*/  return new Property("text", "string", "Text that is displayed above the contents of the group or as the text of the question being answered.", 0, 1, text);
          case -1412808770: /*answer*/  return new Property("answer", "", "The respondent's answer(s) to the question.", 0, java.lang.Integer.MAX_VALUE, answer);
          case 3242771: /*item*/  return new Property("item", "@QuestionnaireResponse.item", "Sub-questions, sub-groups or display items nested beneath a group.", 0, java.lang.Integer.MAX_VALUE, item);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1102667083: /*linkId*/ return this.linkId == null ? new Base[0] : new Base[] {this.linkId}; // StringType
        case -1014418093: /*definition*/ return this.definition == null ? new Base[0] : new Base[] {this.definition}; // UriType
        case 3556653: /*text*/ return this.text == null ? new Base[0] : new Base[] {this.text}; // StringType
        case -1412808770: /*answer*/ return this.answer == null ? new Base[0] : this.answer.toArray(new Base[this.answer.size()]); // QuestionnaireResponseItemAnswerComponent
        case 3242771: /*item*/ return this.item == null ? new Base[0] : this.item.toArray(new Base[this.item.size()]); // QuestionnaireResponseItemComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1102667083: // linkId
          this.linkId = TypeConvertor.castToString(value); // StringType
          return value;
        case -1014418093: // definition
          this.definition = TypeConvertor.castToUri(value); // UriType
          return value;
        case 3556653: // text
          this.text = TypeConvertor.castToString(value); // StringType
          return value;
        case -1412808770: // answer
          this.getAnswer().add((QuestionnaireResponseItemAnswerComponent) value); // QuestionnaireResponseItemAnswerComponent
          return value;
        case 3242771: // item
          this.getItem().add((QuestionnaireResponseItemComponent) value); // QuestionnaireResponseItemComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("linkId")) {
          this.linkId = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("definition")) {
          this.definition = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("text")) {
          this.text = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("answer")) {
          this.getAnswer().add((QuestionnaireResponseItemAnswerComponent) value);
        } else if (name.equals("item")) {
          this.getItem().add((QuestionnaireResponseItemComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1102667083:  return getLinkIdElement();
        case -1014418093:  return getDefinitionElement();
        case 3556653:  return getTextElement();
        case -1412808770:  return addAnswer(); 
        case 3242771:  return addItem(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1102667083: /*linkId*/ return new String[] {"string"};
        case -1014418093: /*definition*/ return new String[] {"uri"};
        case 3556653: /*text*/ return new String[] {"string"};
        case -1412808770: /*answer*/ return new String[] {};
        case 3242771: /*item*/ return new String[] {"@QuestionnaireResponse.item"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("linkId")) {
          throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.item.linkId");
        }
        else if (name.equals("definition")) {
          throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.item.definition");
        }
        else if (name.equals("text")) {
          throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.item.text");
        }
        else if (name.equals("answer")) {
          return addAnswer();
        }
        else if (name.equals("item")) {
          return addItem();
        }
        else
          return super.addChild(name);
      }

      public QuestionnaireResponseItemComponent copy() {
        QuestionnaireResponseItemComponent dst = new QuestionnaireResponseItemComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(QuestionnaireResponseItemComponent dst) {
        super.copyValues(dst);
        dst.linkId = linkId == null ? null : linkId.copy();
        dst.definition = definition == null ? null : definition.copy();
        dst.text = text == null ? null : text.copy();
        if (answer != null) {
          dst.answer = new ArrayList<QuestionnaireResponseItemAnswerComponent>();
          for (QuestionnaireResponseItemAnswerComponent i : answer)
            dst.answer.add(i.copy());
        };
        if (item != null) {
          dst.item = new ArrayList<QuestionnaireResponseItemComponent>();
          for (QuestionnaireResponseItemComponent i : item)
            dst.item.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof QuestionnaireResponseItemComponent))
          return false;
        QuestionnaireResponseItemComponent o = (QuestionnaireResponseItemComponent) other_;
        return compareDeep(linkId, o.linkId, true) && compareDeep(definition, o.definition, true) && compareDeep(text, o.text, true)
           && compareDeep(answer, o.answer, true) && compareDeep(item, o.item, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof QuestionnaireResponseItemComponent))
          return false;
        QuestionnaireResponseItemComponent o = (QuestionnaireResponseItemComponent) other_;
        return compareValues(linkId, o.linkId, true) && compareValues(definition, o.definition, true) && compareValues(text, o.text, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(linkId, definition, text
          , answer, item);
      }

  public String fhirType() {
    return "QuestionnaireResponse.item";

  }

  }

    @Block()
    public static class QuestionnaireResponseItemAnswerComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The answer (or one of the answers) provided by the respondent to the question.
         */
        @Child(name = "value", type = {BooleanType.class, DecimalType.class, IntegerType.class, DateType.class, DateTimeType.class, TimeType.class, StringType.class, UriType.class, Attachment.class, Coding.class, Quantity.class, Reference.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Single-valued answer to the question", formalDefinition="The answer (or one of the answers) provided by the respondent to the question." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/questionnaire-answers")
        protected DataType value;

        /**
         * Nested groups and/or questions found within this particular answer.
         */
        @Child(name = "item", type = {QuestionnaireResponseItemComponent.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Child items of question", formalDefinition="Nested groups and/or questions found within this particular answer." )
        protected List<QuestionnaireResponseItemComponent> item;

        private static final long serialVersionUID = 1790747618L;

    /**
     * Constructor
     */
      public QuestionnaireResponseItemAnswerComponent() {
        super();
      }

    /**
     * Constructor
     */
      public QuestionnaireResponseItemAnswerComponent(DataType value) {
        super();
        this.setValue(value);
      }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public DataType getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public BooleanType getValueBooleanType() throws FHIRException { 
          if (this.value == null)
            this.value = new BooleanType();
          if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (BooleanType) this.value;
        }

        public boolean hasValueBooleanType() { 
          return this != null && this.value instanceof BooleanType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public DecimalType getValueDecimalType() throws FHIRException { 
          if (this.value == null)
            this.value = new DecimalType();
          if (!(this.value instanceof DecimalType))
            throw new FHIRException("Type mismatch: the type DecimalType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DecimalType) this.value;
        }

        public boolean hasValueDecimalType() { 
          return this != null && this.value instanceof DecimalType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public IntegerType getValueIntegerType() throws FHIRException { 
          if (this.value == null)
            this.value = new IntegerType();
          if (!(this.value instanceof IntegerType))
            throw new FHIRException("Type mismatch: the type IntegerType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (IntegerType) this.value;
        }

        public boolean hasValueIntegerType() { 
          return this != null && this.value instanceof IntegerType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public DateType getValueDateType() throws FHIRException { 
          if (this.value == null)
            this.value = new DateType();
          if (!(this.value instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateType) this.value;
        }

        public boolean hasValueDateType() { 
          return this != null && this.value instanceof DateType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public DateTimeType getValueDateTimeType() throws FHIRException { 
          if (this.value == null)
            this.value = new DateTimeType();
          if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateTimeType) this.value;
        }

        public boolean hasValueDateTimeType() { 
          return this != null && this.value instanceof DateTimeType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public TimeType getValueTimeType() throws FHIRException { 
          if (this.value == null)
            this.value = new TimeType();
          if (!(this.value instanceof TimeType))
            throw new FHIRException("Type mismatch: the type TimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (TimeType) this.value;
        }

        public boolean hasValueTimeType() { 
          return this != null && this.value instanceof TimeType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public StringType getValueStringType() throws FHIRException { 
          if (this.value == null)
            this.value = new StringType();
          if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (StringType) this.value;
        }

        public boolean hasValueStringType() { 
          return this != null && this.value instanceof StringType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public UriType getValueUriType() throws FHIRException { 
          if (this.value == null)
            this.value = new UriType();
          if (!(this.value instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (UriType) this.value;
        }

        public boolean hasValueUriType() { 
          return this != null && this.value instanceof UriType;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public Attachment getValueAttachment() throws FHIRException { 
          if (this.value == null)
            this.value = new Attachment();
          if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Attachment) this.value;
        }

        public boolean hasValueAttachment() { 
          return this != null && this.value instanceof Attachment;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public Coding getValueCoding() throws FHIRException { 
          if (this.value == null)
            this.value = new Coding();
          if (!(this.value instanceof Coding))
            throw new FHIRException("Type mismatch: the type Coding was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Coding) this.value;
        }

        public boolean hasValueCoding() { 
          return this != null && this.value instanceof Coding;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public Quantity getValueQuantity() throws FHIRException { 
          if (this.value == null)
            this.value = new Quantity();
          if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Quantity) this.value;
        }

        public boolean hasValueQuantity() { 
          return this != null && this.value instanceof Quantity;
        }

        /**
         * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public Reference getValueReference() throws FHIRException { 
          if (this.value == null)
            this.value = new Reference();
          if (!(this.value instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Reference) this.value;
        }

        public boolean hasValueReference() { 
          return this != null && this.value instanceof Reference;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
         */
        public QuestionnaireResponseItemAnswerComponent setValue(DataType value) { 
          if (value != null && !(value instanceof BooleanType || value instanceof DecimalType || value instanceof IntegerType || value instanceof DateType || value instanceof DateTimeType || value instanceof TimeType || value instanceof StringType || value instanceof UriType || value instanceof Attachment || value instanceof Coding || value instanceof Quantity || value instanceof Reference))
            throw new Error("Not the right type for QuestionnaireResponse.item.answer.value[x]: "+value.fhirType());
          this.value = value;
          return this;
        }

        /**
         * @return {@link #item} (Nested groups and/or questions found within this particular answer.)
         */
        public List<QuestionnaireResponseItemComponent> getItem() { 
          if (this.item == null)
            this.item = new ArrayList<QuestionnaireResponseItemComponent>();
          return this.item;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public QuestionnaireResponseItemAnswerComponent setItem(List<QuestionnaireResponseItemComponent> theItem) { 
          this.item = theItem;
          return this;
        }

        public boolean hasItem() { 
          if (this.item == null)
            return false;
          for (QuestionnaireResponseItemComponent item : this.item)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public QuestionnaireResponseItemComponent addItem() { //3
          QuestionnaireResponseItemComponent t = new QuestionnaireResponseItemComponent();
          if (this.item == null)
            this.item = new ArrayList<QuestionnaireResponseItemComponent>();
          this.item.add(t);
          return t;
        }

        public QuestionnaireResponseItemAnswerComponent addItem(QuestionnaireResponseItemComponent t) { //3
          if (t == null)
            return this;
          if (this.item == null)
            this.item = new ArrayList<QuestionnaireResponseItemComponent>();
          this.item.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #item}, creating it if it does not already exist {3}
         */
        public QuestionnaireResponseItemComponent getItemFirstRep() { 
          if (getItem().isEmpty()) {
            addItem();
          }
          return getItem().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("value[x]", "boolean|decimal|integer|date|dateTime|time|string|uri|Attachment|Coding|Quantity|Reference(Any)", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value));
          children.add(new Property("item", "@QuestionnaireResponse.item", "Nested groups and/or questions found within this particular answer.", 0, java.lang.Integer.MAX_VALUE, item));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1410166417: /*value[x]*/  return new Property("value[x]", "boolean|decimal|integer|date|dateTime|time|string|uri|Attachment|Coding|Quantity|Reference(Any)", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case 111972721: /*value*/  return new Property("value[x]", "boolean|decimal|integer|date|dateTime|time|string|uri|Attachment|Coding|Quantity|Reference(Any)", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case 733421943: /*valueBoolean*/  return new Property("value[x]", "boolean", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -2083993440: /*valueDecimal*/  return new Property("value[x]", "decimal", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -1668204915: /*valueInteger*/  return new Property("value[x]", "integer", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -766192449: /*valueDate*/  return new Property("value[x]", "date", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case 1047929900: /*valueDateTime*/  return new Property("value[x]", "dateTime", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -765708322: /*valueTime*/  return new Property("value[x]", "time", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -1424603934: /*valueString*/  return new Property("value[x]", "string", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -1410172357: /*valueUri*/  return new Property("value[x]", "uri", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -475566732: /*valueAttachment*/  return new Property("value[x]", "Attachment", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -1887705029: /*valueCoding*/  return new Property("value[x]", "Coding", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case -2029823716: /*valueQuantity*/  return new Property("value[x]", "Quantity", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case 1755241690: /*valueReference*/  return new Property("value[x]", "Reference(Any)", "The answer (or one of the answers) provided by the respondent to the question.", 0, 1, value);
          case 3242771: /*item*/  return new Property("item", "@QuestionnaireResponse.item", "Nested groups and/or questions found within this particular answer.", 0, java.lang.Integer.MAX_VALUE, item);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DataType
        case 3242771: /*item*/ return this.item == null ? new Base[0] : this.item.toArray(new Base[this.item.size()]); // QuestionnaireResponseItemComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 111972721: // value
          this.value = TypeConvertor.castToType(value); // DataType
          return value;
        case 3242771: // item
          this.getItem().add((QuestionnaireResponseItemComponent) value); // QuestionnaireResponseItemComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("value[x]")) {
          this.value = TypeConvertor.castToType(value); // DataType
        } else if (name.equals("item")) {
          this.getItem().add((QuestionnaireResponseItemComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1410166417:  return getValue();
        case 111972721:  return getValue();
        case 3242771:  return addItem(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111972721: /*value*/ return new String[] {"boolean", "decimal", "integer", "date", "dateTime", "time", "string", "uri", "Attachment", "Coding", "Quantity", "Reference"};
        case 3242771: /*item*/ return new String[] {"@QuestionnaireResponse.item"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("valueBoolean")) {
          this.value = new BooleanType();
          return this.value;
        }
        else if (name.equals("valueDecimal")) {
          this.value = new DecimalType();
          return this.value;
        }
        else if (name.equals("valueInteger")) {
          this.value = new IntegerType();
          return this.value;
        }
        else if (name.equals("valueDate")) {
          this.value = new DateType();
          return this.value;
        }
        else if (name.equals("valueDateTime")) {
          this.value = new DateTimeType();
          return this.value;
        }
        else if (name.equals("valueTime")) {
          this.value = new TimeType();
          return this.value;
        }
        else if (name.equals("valueString")) {
          this.value = new StringType();
          return this.value;
        }
        else if (name.equals("valueUri")) {
          this.value = new UriType();
          return this.value;
        }
        else if (name.equals("valueAttachment")) {
          this.value = new Attachment();
          return this.value;
        }
        else if (name.equals("valueCoding")) {
          this.value = new Coding();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("valueReference")) {
          this.value = new Reference();
          return this.value;
        }
        else if (name.equals("item")) {
          return addItem();
        }
        else
          return super.addChild(name);
      }

      public QuestionnaireResponseItemAnswerComponent copy() {
        QuestionnaireResponseItemAnswerComponent dst = new QuestionnaireResponseItemAnswerComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(QuestionnaireResponseItemAnswerComponent dst) {
        super.copyValues(dst);
        dst.value = value == null ? null : value.copy();
        if (item != null) {
          dst.item = new ArrayList<QuestionnaireResponseItemComponent>();
          for (QuestionnaireResponseItemComponent i : item)
            dst.item.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof QuestionnaireResponseItemAnswerComponent))
          return false;
        QuestionnaireResponseItemAnswerComponent o = (QuestionnaireResponseItemAnswerComponent) other_;
        return compareDeep(value, o.value, true) && compareDeep(item, o.item, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof QuestionnaireResponseItemAnswerComponent))
          return false;
        QuestionnaireResponseItemAnswerComponent o = (QuestionnaireResponseItemAnswerComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(value, item);
      }

  public String fhirType() {
    return "QuestionnaireResponse.item.answer";

  }

  }

    /**
     * A business identifier assigned to a particular completed (or partially completed) questionnaire.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Unique id for this set of answers", formalDefinition="A business identifier assigned to a particular completed (or partially completed) questionnaire." )
    protected List<Identifier> identifier;

    /**
     * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
     */
    @Child(name = "basedOn", type = {CarePlan.class, ServiceRequest.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Request fulfilled by this QuestionnaireResponse", formalDefinition="The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression." )
    protected List<Reference> basedOn;

    /**
     * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
     */
    @Child(name = "partOf", type = {Observation.class, Procedure.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Part of this action", formalDefinition="A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of." )
    protected List<Reference> partOf;

    /**
     * The Questionnaire that defines and organizes the questions for which answers are being provided.
     */
    @Child(name = "questionnaire", type = {CanonicalType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Form being answered", formalDefinition="The Questionnaire that defines and organizes the questions for which answers are being provided." )
    protected CanonicalType questionnaire;

    /**
     * The position of the questionnaire response within its overall lifecycle.
     */
    @Child(name = "status", type = {CodeType.class}, order=4, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="in-progress | completed | amended | entered-in-error | stopped", formalDefinition="The position of the questionnaire response within its overall lifecycle." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/questionnaire-answers-status")
    protected Enumeration<QuestionnaireResponseStatus> status;

    /**
     * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
     */
    @Child(name = "subject", type = {Reference.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The subject of the questions", formalDefinition="The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information." )
    protected Reference subject;

    /**
     * The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.
     */
    @Child(name = "encounter", type = {Encounter.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Encounter created as part of", formalDefinition="The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated." )
    protected Reference encounter;

    /**
     * The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.
     */
    @Child(name = "authored", type = {DateTimeType.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Date the answers were gathered", formalDefinition="The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status." )
    protected DateTimeType authored;

    /**
     * The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
     */
    @Child(name = "author", type = {Device.class, Practitioner.class, PractitionerRole.class, Patient.class, RelatedPerson.class, Organization.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The individual or device that received and recorded the answers", formalDefinition="The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system." )
    protected Reference author;

    /**
     * The individual or device that answered the questions about the subject.
     */
    @Child(name = "source", type = {Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The individual or device that answered the questions", formalDefinition="The individual or device that answered the questions about the subject." )
    protected Reference source;

    /**
     * A group or question item from the original questionnaire for which answers are provided.
     */
    @Child(name = "item", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Groups and questions", formalDefinition="A group or question item from the original questionnaire for which answers are provided." )
    protected List<QuestionnaireResponseItemComponent> item;

    private static final long serialVersionUID = 1660467089L;

  /**
   * Constructor
   */
    public QuestionnaireResponse() {
      super();
    }

  /**
   * Constructor
   */
    public QuestionnaireResponse(QuestionnaireResponseStatus status) {
      super();
      this.setStatus(status);
    }

    /**
     * @return {@link #identifier} (A business identifier assigned to a particular completed (or partially completed) questionnaire.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public QuestionnaireResponse setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public QuestionnaireResponse addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #basedOn} (The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.)
     */
    public List<Reference> getBasedOn() { 
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      return this.basedOn;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public QuestionnaireResponse setBasedOn(List<Reference> theBasedOn) { 
      this.basedOn = theBasedOn;
      return this;
    }

    public boolean hasBasedOn() { 
      if (this.basedOn == null)
        return false;
      for (Reference item : this.basedOn)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addBasedOn() { //3
      Reference t = new Reference();
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return t;
    }

    public QuestionnaireResponse addBasedOn(Reference t) { //3
      if (t == null)
        return this;
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #basedOn}, creating it if it does not already exist {3}
     */
    public Reference getBasedOnFirstRep() { 
      if (getBasedOn().isEmpty()) {
        addBasedOn();
      }
      return getBasedOn().get(0);
    }

    /**
     * @return {@link #partOf} (A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.)
     */
    public List<Reference> getPartOf() { 
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      return this.partOf;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public QuestionnaireResponse setPartOf(List<Reference> thePartOf) { 
      this.partOf = thePartOf;
      return this;
    }

    public boolean hasPartOf() { 
      if (this.partOf == null)
        return false;
      for (Reference item : this.partOf)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPartOf() { //3
      Reference t = new Reference();
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return t;
    }

    public QuestionnaireResponse addPartOf(Reference t) { //3
      if (t == null)
        return this;
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #partOf}, creating it if it does not already exist {3}
     */
    public Reference getPartOfFirstRep() { 
      if (getPartOf().isEmpty()) {
        addPartOf();
      }
      return getPartOf().get(0);
    }

    /**
     * @return {@link #questionnaire} (The Questionnaire that defines and organizes the questions for which answers are being provided.). This is the underlying object with id, value and extensions. The accessor "getQuestionnaire" gives direct access to the value
     */
    public CanonicalType getQuestionnaireElement() { 
      if (this.questionnaire == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.questionnaire");
        else if (Configuration.doAutoCreate())
          this.questionnaire = new CanonicalType(); // bb
      return this.questionnaire;
    }

    public boolean hasQuestionnaireElement() { 
      return this.questionnaire != null && !this.questionnaire.isEmpty();
    }

    public boolean hasQuestionnaire() { 
      return this.questionnaire != null && !this.questionnaire.isEmpty();
    }

    /**
     * @param value {@link #questionnaire} (The Questionnaire that defines and organizes the questions for which answers are being provided.). This is the underlying object with id, value and extensions. The accessor "getQuestionnaire" gives direct access to the value
     */
    public QuestionnaireResponse setQuestionnaireElement(CanonicalType value) { 
      this.questionnaire = value;
      return this;
    }

    /**
     * @return The Questionnaire that defines and organizes the questions for which answers are being provided.
     */
    public String getQuestionnaire() { 
      return this.questionnaire == null ? null : this.questionnaire.getValue();
    }

    /**
     * @param value The Questionnaire that defines and organizes the questions for which answers are being provided.
     */
    public QuestionnaireResponse setQuestionnaire(String value) { 
      if (Utilities.noString(value))
        this.questionnaire = null;
      else {
        if (this.questionnaire == null)
          this.questionnaire = new CanonicalType();
        this.questionnaire.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The position of the questionnaire response within its overall lifecycle.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<QuestionnaireResponseStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<QuestionnaireResponseStatus>(new QuestionnaireResponseStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The position of the questionnaire response within its overall lifecycle.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public QuestionnaireResponse setStatusElement(Enumeration<QuestionnaireResponseStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The position of the questionnaire response within its overall lifecycle.
     */
    public QuestionnaireResponseStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The position of the questionnaire response within its overall lifecycle.
     */
    public QuestionnaireResponse setStatus(QuestionnaireResponseStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<QuestionnaireResponseStatus>(new QuestionnaireResponseStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #subject} (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference(); // cc
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    public QuestionnaireResponse setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #encounter} (The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.)
     */
    public Reference getEncounter() { 
      if (this.encounter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.encounter");
        else if (Configuration.doAutoCreate())
          this.encounter = new Reference(); // cc
      return this.encounter;
    }

    public boolean hasEncounter() { 
      return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.)
     */
    public QuestionnaireResponse setEncounter(Reference value) { 
      this.encounter = value;
      return this;
    }

    /**
     * @return {@link #authored} (The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.). This is the underlying object with id, value and extensions. The accessor "getAuthored" gives direct access to the value
     */
    public DateTimeType getAuthoredElement() { 
      if (this.authored == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.authored");
        else if (Configuration.doAutoCreate())
          this.authored = new DateTimeType(); // bb
      return this.authored;
    }

    public boolean hasAuthoredElement() { 
      return this.authored != null && !this.authored.isEmpty();
    }

    public boolean hasAuthored() { 
      return this.authored != null && !this.authored.isEmpty();
    }

    /**
     * @param value {@link #authored} (The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.). This is the underlying object with id, value and extensions. The accessor "getAuthored" gives direct access to the value
     */
    public QuestionnaireResponse setAuthoredElement(DateTimeType value) { 
      this.authored = value;
      return this;
    }

    /**
     * @return The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.
     */
    public Date getAuthored() { 
      return this.authored == null ? null : this.authored.getValue();
    }

    /**
     * @param value The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.
     */
    public QuestionnaireResponse setAuthored(Date value) { 
      if (value == null)
        this.authored = null;
      else {
        if (this.authored == null)
          this.authored = new DateTimeType();
        this.authored.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #author} (The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    public Reference getAuthor() { 
      if (this.author == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.author");
        else if (Configuration.doAutoCreate())
          this.author = new Reference(); // cc
      return this.author;
    }

    public boolean hasAuthor() { 
      return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    public QuestionnaireResponse setAuthor(Reference value) { 
      this.author = value;
      return this;
    }

    /**
     * @return {@link #source} (The individual or device that answered the questions about the subject.)
     */
    public Reference getSource() { 
      if (this.source == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create QuestionnaireResponse.source");
        else if (Configuration.doAutoCreate())
          this.source = new Reference(); // cc
      return this.source;
    }

    public boolean hasSource() { 
      return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The individual or device that answered the questions about the subject.)
     */
    public QuestionnaireResponse setSource(Reference value) { 
      this.source = value;
      return this;
    }

    /**
     * @return {@link #item} (A group or question item from the original questionnaire for which answers are provided.)
     */
    public List<QuestionnaireResponseItemComponent> getItem() { 
      if (this.item == null)
        this.item = new ArrayList<QuestionnaireResponseItemComponent>();
      return this.item;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public QuestionnaireResponse setItem(List<QuestionnaireResponseItemComponent> theItem) { 
      this.item = theItem;
      return this;
    }

    public boolean hasItem() { 
      if (this.item == null)
        return false;
      for (QuestionnaireResponseItemComponent item : this.item)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public QuestionnaireResponseItemComponent addItem() { //3
      QuestionnaireResponseItemComponent t = new QuestionnaireResponseItemComponent();
      if (this.item == null)
        this.item = new ArrayList<QuestionnaireResponseItemComponent>();
      this.item.add(t);
      return t;
    }

    public QuestionnaireResponse addItem(QuestionnaireResponseItemComponent t) { //3
      if (t == null)
        return this;
      if (this.item == null)
        this.item = new ArrayList<QuestionnaireResponseItemComponent>();
      this.item.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #item}, creating it if it does not already exist {3}
     */
    public QuestionnaireResponseItemComponent getItemFirstRep() { 
      if (getItem().isEmpty()) {
        addItem();
      }
      return getItem().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A business identifier assigned to a particular completed (or partially completed) questionnaire.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("basedOn", "Reference(CarePlan|ServiceRequest)", "The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.", 0, java.lang.Integer.MAX_VALUE, basedOn));
        children.add(new Property("partOf", "Reference(Observation|Procedure)", "A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.", 0, java.lang.Integer.MAX_VALUE, partOf));
        children.add(new Property("questionnaire", "canonical(Questionnaire)", "The Questionnaire that defines and organizes the questions for which answers are being provided.", 0, 1, questionnaire));
        children.add(new Property("status", "code", "The position of the questionnaire response within its overall lifecycle.", 0, 1, status));
        children.add(new Property("subject", "Reference(Any)", "The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.", 0, 1, subject));
        children.add(new Property("encounter", "Reference(Encounter)", "The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.", 0, 1, encounter));
        children.add(new Property("authored", "dateTime", "The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.", 0, 1, authored));
        children.add(new Property("author", "Reference(Device|Practitioner|PractitionerRole|Patient|RelatedPerson|Organization)", "The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system.", 0, 1, author));
        children.add(new Property("source", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson)", "The individual or device that answered the questions about the subject.", 0, 1, source));
        children.add(new Property("item", "", "A group or question item from the original questionnaire for which answers are provided.", 0, java.lang.Integer.MAX_VALUE, item));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A business identifier assigned to a particular completed (or partially completed) questionnaire.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -332612366: /*basedOn*/  return new Property("basedOn", "Reference(CarePlan|ServiceRequest)", "The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.", 0, java.lang.Integer.MAX_VALUE, basedOn);
        case -995410646: /*partOf*/  return new Property("partOf", "Reference(Observation|Procedure)", "A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.", 0, java.lang.Integer.MAX_VALUE, partOf);
        case -1017049693: /*questionnaire*/  return new Property("questionnaire", "canonical(Questionnaire)", "The Questionnaire that defines and organizes the questions for which answers are being provided.", 0, 1, questionnaire);
        case -892481550: /*status*/  return new Property("status", "code", "The position of the questionnaire response within its overall lifecycle.", 0, 1, status);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(Any)", "The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.", 0, 1, subject);
        case 1524132147: /*encounter*/  return new Property("encounter", "Reference(Encounter)", "The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.", 0, 1, encounter);
        case 1433073514: /*authored*/  return new Property("authored", "dateTime", "The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.", 0, 1, authored);
        case -1406328437: /*author*/  return new Property("author", "Reference(Device|Practitioner|PractitionerRole|Patient|RelatedPerson|Organization)", "The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system.", 0, 1, author);
        case -896505829: /*source*/  return new Property("source", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson)", "The individual or device that answered the questions about the subject.", 0, 1, source);
        case 3242771: /*item*/  return new Property("item", "", "A group or question item from the original questionnaire for which answers are provided.", 0, java.lang.Integer.MAX_VALUE, item);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -332612366: /*basedOn*/ return this.basedOn == null ? new Base[0] : this.basedOn.toArray(new Base[this.basedOn.size()]); // Reference
        case -995410646: /*partOf*/ return this.partOf == null ? new Base[0] : this.partOf.toArray(new Base[this.partOf.size()]); // Reference
        case -1017049693: /*questionnaire*/ return this.questionnaire == null ? new Base[0] : new Base[] {this.questionnaire}; // CanonicalType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<QuestionnaireResponseStatus>
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : new Base[] {this.subject}; // Reference
        case 1524132147: /*encounter*/ return this.encounter == null ? new Base[0] : new Base[] {this.encounter}; // Reference
        case 1433073514: /*authored*/ return this.authored == null ? new Base[0] : new Base[] {this.authored}; // DateTimeType
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : new Base[] {this.author}; // Reference
        case -896505829: /*source*/ return this.source == null ? new Base[0] : new Base[] {this.source}; // Reference
        case 3242771: /*item*/ return this.item == null ? new Base[0] : this.item.toArray(new Base[this.item.size()]); // QuestionnaireResponseItemComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -332612366: // basedOn
          this.getBasedOn().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -995410646: // partOf
          this.getPartOf().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -1017049693: // questionnaire
          this.questionnaire = TypeConvertor.castToCanonical(value); // CanonicalType
          return value;
        case -892481550: // status
          value = new QuestionnaireResponseStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<QuestionnaireResponseStatus>
          return value;
        case -1867885268: // subject
          this.subject = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1524132147: // encounter
          this.encounter = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1433073514: // authored
          this.authored = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -1406328437: // author
          this.author = TypeConvertor.castToReference(value); // Reference
          return value;
        case -896505829: // source
          this.source = TypeConvertor.castToReference(value); // Reference
          return value;
        case 3242771: // item
          this.getItem().add((QuestionnaireResponseItemComponent) value); // QuestionnaireResponseItemComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("basedOn")) {
          this.getBasedOn().add(TypeConvertor.castToReference(value));
        } else if (name.equals("partOf")) {
          this.getPartOf().add(TypeConvertor.castToReference(value));
        } else if (name.equals("questionnaire")) {
          this.questionnaire = TypeConvertor.castToCanonical(value); // CanonicalType
        } else if (name.equals("status")) {
          value = new QuestionnaireResponseStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<QuestionnaireResponseStatus>
        } else if (name.equals("subject")) {
          this.subject = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("encounter")) {
          this.encounter = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("authored")) {
          this.authored = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("author")) {
          this.author = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("source")) {
          this.source = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("item")) {
          this.getItem().add((QuestionnaireResponseItemComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -332612366:  return addBasedOn(); 
        case -995410646:  return addPartOf(); 
        case -1017049693:  return getQuestionnaireElement();
        case -892481550:  return getStatusElement();
        case -1867885268:  return getSubject();
        case 1524132147:  return getEncounter();
        case 1433073514:  return getAuthoredElement();
        case -1406328437:  return getAuthor();
        case -896505829:  return getSource();
        case 3242771:  return addItem(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -332612366: /*basedOn*/ return new String[] {"Reference"};
        case -995410646: /*partOf*/ return new String[] {"Reference"};
        case -1017049693: /*questionnaire*/ return new String[] {"canonical"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 1524132147: /*encounter*/ return new String[] {"Reference"};
        case 1433073514: /*authored*/ return new String[] {"dateTime"};
        case -1406328437: /*author*/ return new String[] {"Reference"};
        case -896505829: /*source*/ return new String[] {"Reference"};
        case 3242771: /*item*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("basedOn")) {
          return addBasedOn();
        }
        else if (name.equals("partOf")) {
          return addPartOf();
        }
        else if (name.equals("questionnaire")) {
          throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.questionnaire");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.status");
        }
        else if (name.equals("subject")) {
          this.subject = new Reference();
          return this.subject;
        }
        else if (name.equals("encounter")) {
          this.encounter = new Reference();
          return this.encounter;
        }
        else if (name.equals("authored")) {
          throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.authored");
        }
        else if (name.equals("author")) {
          this.author = new Reference();
          return this.author;
        }
        else if (name.equals("source")) {
          this.source = new Reference();
          return this.source;
        }
        else if (name.equals("item")) {
          return addItem();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "QuestionnaireResponse";

  }

      public QuestionnaireResponse copy() {
        QuestionnaireResponse dst = new QuestionnaireResponse();
        copyValues(dst);
        return dst;
      }

      public void copyValues(QuestionnaireResponse dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        if (basedOn != null) {
          dst.basedOn = new ArrayList<Reference>();
          for (Reference i : basedOn)
            dst.basedOn.add(i.copy());
        };
        if (partOf != null) {
          dst.partOf = new ArrayList<Reference>();
          for (Reference i : partOf)
            dst.partOf.add(i.copy());
        };
        dst.questionnaire = questionnaire == null ? null : questionnaire.copy();
        dst.status = status == null ? null : status.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.authored = authored == null ? null : authored.copy();
        dst.author = author == null ? null : author.copy();
        dst.source = source == null ? null : source.copy();
        if (item != null) {
          dst.item = new ArrayList<QuestionnaireResponseItemComponent>();
          for (QuestionnaireResponseItemComponent i : item)
            dst.item.add(i.copy());
        };
      }

      protected QuestionnaireResponse typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof QuestionnaireResponse))
          return false;
        QuestionnaireResponse o = (QuestionnaireResponse) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(basedOn, o.basedOn, true) && compareDeep(partOf, o.partOf, true)
           && compareDeep(questionnaire, o.questionnaire, true) && compareDeep(status, o.status, true) && compareDeep(subject, o.subject, true)
           && compareDeep(encounter, o.encounter, true) && compareDeep(authored, o.authored, true) && compareDeep(author, o.author, true)
           && compareDeep(source, o.source, true) && compareDeep(item, o.item, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof QuestionnaireResponse))
          return false;
        QuestionnaireResponse o = (QuestionnaireResponse) other_;
        return compareValues(questionnaire, o.questionnaire, true) && compareValues(status, o.status, true)
           && compareValues(authored, o.authored, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, basedOn, partOf
          , questionnaire, status, subject, encounter, authored, author, source, item
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.QuestionnaireResponse;
   }


}


package org.hl7.fhir.dstu3.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Wed, Aug 3, 2016 09:39-0400 for FHIR v1.5.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.dstu3.model.Enumerations.*;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.dstu3.exceptions.FHIRException;
/**
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
@ResourceDef(name="EligibilityResponse", profile="http://hl7.org/fhir/Profile/EligibilityResponse")
public class EligibilityResponse extends DomainResource {

    public enum EligibilityResponseStatus {
        /**
         * The resource instance is currently in-force.
         */
        ACTIVE, 
        /**
         * The resource instance is withdrawn, rescinded or reversed.
         */
        CANCELLED, 
        /**
         * A new resource instance the contents of which is not complete.
         */
        DRAFT, 
        /**
         * The resource instance was entered in error.
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static EligibilityResponseStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown EligibilityResponseStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case CANCELLED: return "cancelled";
            case DRAFT: return "draft";
            case ENTEREDINERROR: return "entered-in-error";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACTIVE: return "http://hl7.org/fhir/eligibilityresponse-status";
            case CANCELLED: return "http://hl7.org/fhir/eligibilityresponse-status";
            case DRAFT: return "http://hl7.org/fhir/eligibilityresponse-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/eligibilityresponse-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "The resource instance is currently in-force.";
            case CANCELLED: return "The resource instance is withdrawn, rescinded or reversed.";
            case DRAFT: return "A new resource instance the contents of which is not complete.";
            case ENTEREDINERROR: return "The resource instance was entered in error.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case CANCELLED: return "Cancelled";
            case DRAFT: return "Draft";
            case ENTEREDINERROR: return "Entered In Error";
            default: return "?";
          }
        }
    }

  public static class EligibilityResponseStatusEnumFactory implements EnumFactory<EligibilityResponseStatus> {
    public EligibilityResponseStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return EligibilityResponseStatus.ACTIVE;
        if ("cancelled".equals(codeString))
          return EligibilityResponseStatus.CANCELLED;
        if ("draft".equals(codeString))
          return EligibilityResponseStatus.DRAFT;
        if ("entered-in-error".equals(codeString))
          return EligibilityResponseStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown EligibilityResponseStatus code '"+codeString+"'");
        }
        public Enumeration<EligibilityResponseStatus> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
          return new Enumeration<EligibilityResponseStatus>(this, EligibilityResponseStatus.ACTIVE);
        if ("cancelled".equals(codeString))
          return new Enumeration<EligibilityResponseStatus>(this, EligibilityResponseStatus.CANCELLED);
        if ("draft".equals(codeString))
          return new Enumeration<EligibilityResponseStatus>(this, EligibilityResponseStatus.DRAFT);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<EligibilityResponseStatus>(this, EligibilityResponseStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown EligibilityResponseStatus code '"+codeString+"'");
        }
    public String toCode(EligibilityResponseStatus code) {
      if (code == EligibilityResponseStatus.ACTIVE)
        return "active";
      if (code == EligibilityResponseStatus.CANCELLED)
        return "cancelled";
      if (code == EligibilityResponseStatus.DRAFT)
        return "draft";
      if (code == EligibilityResponseStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    public String toSystem(EligibilityResponseStatus code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class BenefitsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Dental, Vision, Medical, Pharmacy, Rehab etc.
         */
        @Child(name = "category", type = {Coding.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Benefit Category", formalDefinition="Dental, Vision, Medical, Pharmacy, Rehab etc." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-category")
        protected Coding category;

        /**
         * Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
         */
        @Child(name = "subCategory", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Benefit SubCategory", formalDefinition="Dental: basic, major, ortho; Vision exam, glasses, contacts; etc." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-subcategory")
        protected Coding subCategory;

        /**
         * A short name or tag for the benefit, for example MED01, or DENT2.
         */
        @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Short name for the benefit", formalDefinition="A short name or tag for the benefit, for example MED01, or DENT2." )
        protected StringType name;

        /**
         * A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
         */
        @Child(name = "description", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the benefit", formalDefinition="A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'." )
        protected StringType description;

        /**
         * Network designation.
         */
        @Child(name = "network", type = {Coding.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="In or out of network", formalDefinition="Network designation." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-network")
        protected Coding network;

        /**
         * Unit designation: individual or family.
         */
        @Child(name = "unit", type = {Coding.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Individual or family", formalDefinition="Unit designation: individual or family." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-unit")
        protected Coding unit;

        /**
         * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.
         */
        @Child(name = "term", type = {Coding.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Annual or lifetime", formalDefinition="The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-term")
        protected Coding term;

        /**
         * Benefits Used to date.
         */
        @Child(name = "financial", type = {}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Benefit Summary", formalDefinition="Benefits Used to date." )
        protected List<BenefitComponent> financial;

        private static final long serialVersionUID = -1090359286L;

    /**
     * Constructor
     */
      public BenefitsComponent() {
        super();
      }

    /**
     * Constructor
     */
      public BenefitsComponent(Coding category) {
        super();
        this.category = category;
      }

        /**
         * @return {@link #category} (Dental, Vision, Medical, Pharmacy, Rehab etc.)
         */
        public Coding getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new Coding(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Dental, Vision, Medical, Pharmacy, Rehab etc.)
         */
        public BenefitsComponent setCategory(Coding value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #subCategory} (Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.)
         */
        public Coding getSubCategory() { 
          if (this.subCategory == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.subCategory");
            else if (Configuration.doAutoCreate())
              this.subCategory = new Coding(); // cc
          return this.subCategory;
        }

        public boolean hasSubCategory() { 
          return this.subCategory != null && !this.subCategory.isEmpty();
        }

        /**
         * @param value {@link #subCategory} (Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.)
         */
        public BenefitsComponent setSubCategory(Coding value) { 
          this.subCategory = value;
          return this;
        }

        /**
         * @return {@link #name} (A short name or tag for the benefit, for example MED01, or DENT2.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (A short name or tag for the benefit, for example MED01, or DENT2.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public BenefitsComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return A short name or tag for the benefit, for example MED01, or DENT2.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value A short name or tag for the benefit, for example MED01, or DENT2.
         */
        public BenefitsComponent setName(String value) { 
          if (Utilities.noString(value))
            this.name = null;
          else {
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #description} (A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public BenefitsComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
         */
        public BenefitsComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #network} (Network designation.)
         */
        public Coding getNetwork() { 
          if (this.network == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.network");
            else if (Configuration.doAutoCreate())
              this.network = new Coding(); // cc
          return this.network;
        }

        public boolean hasNetwork() { 
          return this.network != null && !this.network.isEmpty();
        }

        /**
         * @param value {@link #network} (Network designation.)
         */
        public BenefitsComponent setNetwork(Coding value) { 
          this.network = value;
          return this;
        }

        /**
         * @return {@link #unit} (Unit designation: individual or family.)
         */
        public Coding getUnit() { 
          if (this.unit == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.unit");
            else if (Configuration.doAutoCreate())
              this.unit = new Coding(); // cc
          return this.unit;
        }

        public boolean hasUnit() { 
          return this.unit != null && !this.unit.isEmpty();
        }

        /**
         * @param value {@link #unit} (Unit designation: individual or family.)
         */
        public BenefitsComponent setUnit(Coding value) { 
          this.unit = value;
          return this;
        }

        /**
         * @return {@link #term} (The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.)
         */
        public Coding getTerm() { 
          if (this.term == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitsComponent.term");
            else if (Configuration.doAutoCreate())
              this.term = new Coding(); // cc
          return this.term;
        }

        public boolean hasTerm() { 
          return this.term != null && !this.term.isEmpty();
        }

        /**
         * @param value {@link #term} (The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.)
         */
        public BenefitsComponent setTerm(Coding value) { 
          this.term = value;
          return this;
        }

        /**
         * @return {@link #financial} (Benefits Used to date.)
         */
        public List<BenefitComponent> getFinancial() { 
          if (this.financial == null)
            this.financial = new ArrayList<BenefitComponent>();
          return this.financial;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public BenefitsComponent setFinancial(List<BenefitComponent> theFinancial) { 
          this.financial = theFinancial;
          return this;
        }

        public boolean hasFinancial() { 
          if (this.financial == null)
            return false;
          for (BenefitComponent item : this.financial)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public BenefitComponent addFinancial() { //3
          BenefitComponent t = new BenefitComponent();
          if (this.financial == null)
            this.financial = new ArrayList<BenefitComponent>();
          this.financial.add(t);
          return t;
        }

        public BenefitsComponent addFinancial(BenefitComponent t) { //3
          if (t == null)
            return this;
          if (this.financial == null)
            this.financial = new ArrayList<BenefitComponent>();
          this.financial.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #financial}, creating it if it does not already exist
         */
        public BenefitComponent getFinancialFirstRep() { 
          if (getFinancial().isEmpty()) {
            addFinancial();
          }
          return getFinancial().get(0);
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("category", "Coding", "Dental, Vision, Medical, Pharmacy, Rehab etc.", 0, java.lang.Integer.MAX_VALUE, category));
          childrenList.add(new Property("subCategory", "Coding", "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.", 0, java.lang.Integer.MAX_VALUE, subCategory));
          childrenList.add(new Property("name", "string", "A short name or tag for the benefit, for example MED01, or DENT2.", 0, java.lang.Integer.MAX_VALUE, name));
          childrenList.add(new Property("description", "string", "A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.", 0, java.lang.Integer.MAX_VALUE, description));
          childrenList.add(new Property("network", "Coding", "Network designation.", 0, java.lang.Integer.MAX_VALUE, network));
          childrenList.add(new Property("unit", "Coding", "Unit designation: individual or family.", 0, java.lang.Integer.MAX_VALUE, unit));
          childrenList.add(new Property("term", "Coding", "The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.", 0, java.lang.Integer.MAX_VALUE, term));
          childrenList.add(new Property("financial", "", "Benefits Used to date.", 0, java.lang.Integer.MAX_VALUE, financial));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // Coding
        case 1365024606: /*subCategory*/ return this.subCategory == null ? new Base[0] : new Base[] {this.subCategory}; // Coding
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 1843485230: /*network*/ return this.network == null ? new Base[0] : new Base[] {this.network}; // Coding
        case 3594628: /*unit*/ return this.unit == null ? new Base[0] : new Base[] {this.unit}; // Coding
        case 3556460: /*term*/ return this.term == null ? new Base[0] : new Base[] {this.term}; // Coding
        case 357555337: /*financial*/ return this.financial == null ? new Base[0] : this.financial.toArray(new Base[this.financial.size()]); // BenefitComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 50511102: // category
          this.category = castToCoding(value); // Coding
          break;
        case 1365024606: // subCategory
          this.subCategory = castToCoding(value); // Coding
          break;
        case 3373707: // name
          this.name = castToString(value); // StringType
          break;
        case -1724546052: // description
          this.description = castToString(value); // StringType
          break;
        case 1843485230: // network
          this.network = castToCoding(value); // Coding
          break;
        case 3594628: // unit
          this.unit = castToCoding(value); // Coding
          break;
        case 3556460: // term
          this.term = castToCoding(value); // Coding
          break;
        case 357555337: // financial
          this.getFinancial().add((BenefitComponent) value); // BenefitComponent
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("category"))
          this.category = castToCoding(value); // Coding
        else if (name.equals("subCategory"))
          this.subCategory = castToCoding(value); // Coding
        else if (name.equals("name"))
          this.name = castToString(value); // StringType
        else if (name.equals("description"))
          this.description = castToString(value); // StringType
        else if (name.equals("network"))
          this.network = castToCoding(value); // Coding
        else if (name.equals("unit"))
          this.unit = castToCoding(value); // Coding
        else if (name.equals("term"))
          this.term = castToCoding(value); // Coding
        else if (name.equals("financial"))
          this.getFinancial().add((BenefitComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102:  return getCategory(); // Coding
        case 1365024606:  return getSubCategory(); // Coding
        case 3373707: throw new FHIRException("Cannot make property name as it is not a complex type"); // StringType
        case -1724546052: throw new FHIRException("Cannot make property description as it is not a complex type"); // StringType
        case 1843485230:  return getNetwork(); // Coding
        case 3594628:  return getUnit(); // Coding
        case 3556460:  return getTerm(); // Coding
        case 357555337:  return addFinancial(); // BenefitComponent
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("category")) {
          this.category = new Coding();
          return this.category;
        }
        else if (name.equals("subCategory")) {
          this.subCategory = new Coding();
          return this.subCategory;
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.name");
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.description");
        }
        else if (name.equals("network")) {
          this.network = new Coding();
          return this.network;
        }
        else if (name.equals("unit")) {
          this.unit = new Coding();
          return this.unit;
        }
        else if (name.equals("term")) {
          this.term = new Coding();
          return this.term;
        }
        else if (name.equals("financial")) {
          return addFinancial();
        }
        else
          return super.addChild(name);
      }

      public BenefitsComponent copy() {
        BenefitsComponent dst = new BenefitsComponent();
        copyValues(dst);
        dst.category = category == null ? null : category.copy();
        dst.subCategory = subCategory == null ? null : subCategory.copy();
        dst.name = name == null ? null : name.copy();
        dst.description = description == null ? null : description.copy();
        dst.network = network == null ? null : network.copy();
        dst.unit = unit == null ? null : unit.copy();
        dst.term = term == null ? null : term.copy();
        if (financial != null) {
          dst.financial = new ArrayList<BenefitComponent>();
          for (BenefitComponent i : financial)
            dst.financial.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof BenefitsComponent))
          return false;
        BenefitsComponent o = (BenefitsComponent) other;
        return compareDeep(category, o.category, true) && compareDeep(subCategory, o.subCategory, true)
           && compareDeep(name, o.name, true) && compareDeep(description, o.description, true) && compareDeep(network, o.network, true)
           && compareDeep(unit, o.unit, true) && compareDeep(term, o.term, true) && compareDeep(financial, o.financial, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof BenefitsComponent))
          return false;
        BenefitsComponent o = (BenefitsComponent) other;
        return compareValues(name, o.name, true) && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(category, subCategory, name
          , description, network, unit, term, financial);
      }

  public String fhirType() {
    return "EligibilityResponse.benefitBalance";

  }

  }

    @Block()
    public static class BenefitComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Deductable, visits, benefit amount.
         */
        @Child(name = "type", type = {Coding.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Deductable, visits, benefit amount", formalDefinition="Deductable, visits, benefit amount." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-type")
        protected Coding type;

        /**
         * Benefits allowed.
         */
        @Child(name = "benefit", type = {UnsignedIntType.class, StringType.class, Money.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Benefits allowed", formalDefinition="Benefits allowed." )
        protected Type benefit;

        /**
         * Benefits used.
         */
        @Child(name = "benefitUsed", type = {UnsignedIntType.class, Money.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Benefits used", formalDefinition="Benefits used." )
        protected Type benefitUsed;

        private static final long serialVersionUID = 1742418909L;

    /**
     * Constructor
     */
      public BenefitComponent() {
        super();
      }

    /**
     * Constructor
     */
      public BenefitComponent(Coding type) {
        super();
        this.type = type;
      }

        /**
         * @return {@link #type} (Deductable, visits, benefit amount.)
         */
        public Coding getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BenefitComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Coding(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Deductable, visits, benefit amount.)
         */
        public BenefitComponent setType(Coding value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #benefit} (Benefits allowed.)
         */
        public Type getBenefit() { 
          return this.benefit;
        }

        /**
         * @return {@link #benefit} (Benefits allowed.)
         */
        public UnsignedIntType getBenefitUnsignedIntType() throws FHIRException { 
          if (!(this.benefit instanceof UnsignedIntType))
            throw new FHIRException("Type mismatch: the type UnsignedIntType was expected, but "+this.benefit.getClass().getName()+" was encountered");
          return (UnsignedIntType) this.benefit;
        }

        public boolean hasBenefitUnsignedIntType() { 
          return this.benefit instanceof UnsignedIntType;
        }

        /**
         * @return {@link #benefit} (Benefits allowed.)
         */
        public StringType getBenefitStringType() throws FHIRException { 
          if (!(this.benefit instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.benefit.getClass().getName()+" was encountered");
          return (StringType) this.benefit;
        }

        public boolean hasBenefitStringType() { 
          return this.benefit instanceof StringType;
        }

        /**
         * @return {@link #benefit} (Benefits allowed.)
         */
        public Money getBenefitMoney() throws FHIRException { 
          if (!(this.benefit instanceof Money))
            throw new FHIRException("Type mismatch: the type Money was expected, but "+this.benefit.getClass().getName()+" was encountered");
          return (Money) this.benefit;
        }

        public boolean hasBenefitMoney() { 
          return this.benefit instanceof Money;
        }

        public boolean hasBenefit() { 
          return this.benefit != null && !this.benefit.isEmpty();
        }

        /**
         * @param value {@link #benefit} (Benefits allowed.)
         */
        public BenefitComponent setBenefit(Type value) { 
          this.benefit = value;
          return this;
        }

        /**
         * @return {@link #benefitUsed} (Benefits used.)
         */
        public Type getBenefitUsed() { 
          return this.benefitUsed;
        }

        /**
         * @return {@link #benefitUsed} (Benefits used.)
         */
        public UnsignedIntType getBenefitUsedUnsignedIntType() throws FHIRException { 
          if (!(this.benefitUsed instanceof UnsignedIntType))
            throw new FHIRException("Type mismatch: the type UnsignedIntType was expected, but "+this.benefitUsed.getClass().getName()+" was encountered");
          return (UnsignedIntType) this.benefitUsed;
        }

        public boolean hasBenefitUsedUnsignedIntType() { 
          return this.benefitUsed instanceof UnsignedIntType;
        }

        /**
         * @return {@link #benefitUsed} (Benefits used.)
         */
        public Money getBenefitUsedMoney() throws FHIRException { 
          if (!(this.benefitUsed instanceof Money))
            throw new FHIRException("Type mismatch: the type Money was expected, but "+this.benefitUsed.getClass().getName()+" was encountered");
          return (Money) this.benefitUsed;
        }

        public boolean hasBenefitUsedMoney() { 
          return this.benefitUsed instanceof Money;
        }

        public boolean hasBenefitUsed() { 
          return this.benefitUsed != null && !this.benefitUsed.isEmpty();
        }

        /**
         * @param value {@link #benefitUsed} (Benefits used.)
         */
        public BenefitComponent setBenefitUsed(Type value) { 
          this.benefitUsed = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "Coding", "Deductable, visits, benefit amount.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("benefit[x]", "unsignedInt|string|Money", "Benefits allowed.", 0, java.lang.Integer.MAX_VALUE, benefit));
          childrenList.add(new Property("benefitUsed[x]", "unsignedInt|Money", "Benefits used.", 0, java.lang.Integer.MAX_VALUE, benefitUsed));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Coding
        case -222710633: /*benefit*/ return this.benefit == null ? new Base[0] : new Base[] {this.benefit}; // Type
        case -549981964: /*benefitUsed*/ return this.benefitUsed == null ? new Base[0] : new Base[] {this.benefitUsed}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = castToCoding(value); // Coding
          break;
        case -222710633: // benefit
          this.benefit = (Type) value; // Type
          break;
        case -549981964: // benefitUsed
          this.benefitUsed = (Type) value; // Type
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
          this.type = castToCoding(value); // Coding
        else if (name.equals("benefit[x]"))
          this.benefit = (Type) value; // Type
        else if (name.equals("benefitUsed[x]"))
          this.benefitUsed = (Type) value; // Type
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType(); // Coding
        case 952095881:  return getBenefit(); // Type
        case 787635980:  return getBenefitUsed(); // Type
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new Coding();
          return this.type;
        }
        else if (name.equals("benefitUnsignedInt")) {
          this.benefit = new UnsignedIntType();
          return this.benefit;
        }
        else if (name.equals("benefitString")) {
          this.benefit = new StringType();
          return this.benefit;
        }
        else if (name.equals("benefitMoney")) {
          this.benefit = new Money();
          return this.benefit;
        }
        else if (name.equals("benefitUsedUnsignedInt")) {
          this.benefitUsed = new UnsignedIntType();
          return this.benefitUsed;
        }
        else if (name.equals("benefitUsedMoney")) {
          this.benefitUsed = new Money();
          return this.benefitUsed;
        }
        else
          return super.addChild(name);
      }

      public BenefitComponent copy() {
        BenefitComponent dst = new BenefitComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.benefit = benefit == null ? null : benefit.copy();
        dst.benefitUsed = benefitUsed == null ? null : benefitUsed.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof BenefitComponent))
          return false;
        BenefitComponent o = (BenefitComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(benefit, o.benefit, true) && compareDeep(benefitUsed, o.benefitUsed, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof BenefitComponent))
          return false;
        BenefitComponent o = (BenefitComponent) other;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, benefit, benefitUsed
          );
      }

  public String fhirType() {
    return "EligibilityResponse.benefitBalance.financial";

  }

  }

    @Block()
    public static class ErrorsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * An error code,from a specified code system, which details why the eligibility check could not be performed.
         */
        @Child(name = "code", type = {Coding.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Error code detailing processing issues", formalDefinition="An error code,from a specified code system, which details why the eligibility check could not be performed." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/adjudication-error")
        protected Coding code;

        private static final long serialVersionUID = -739538393L;

    /**
     * Constructor
     */
      public ErrorsComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ErrorsComponent(Coding code) {
        super();
        this.code = code;
      }

        /**
         * @return {@link #code} (An error code,from a specified code system, which details why the eligibility check could not be performed.)
         */
        public Coding getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ErrorsComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Coding(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (An error code,from a specified code system, which details why the eligibility check could not be performed.)
         */
        public ErrorsComponent setCode(Coding value) { 
          this.code = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "Coding", "An error code,from a specified code system, which details why the eligibility check could not be performed.", 0, java.lang.Integer.MAX_VALUE, code));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // Coding
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = castToCoding(value); // Coding
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
          this.code = castToCoding(value); // Coding
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode(); // Coding
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new Coding();
          return this.code;
        }
        else
          return super.addChild(name);
      }

      public ErrorsComponent copy() {
        ErrorsComponent dst = new ErrorsComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ErrorsComponent))
          return false;
        ErrorsComponent o = (ErrorsComponent) other;
        return compareDeep(code, o.code, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ErrorsComponent))
          return false;
        ErrorsComponent o = (ErrorsComponent) other;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code);
      }

  public String fhirType() {
    return "EligibilityResponse.error";

  }

  }

    /**
     * The Response business identifier.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Business Identifier", formalDefinition="The Response business identifier." )
    protected List<Identifier> identifier;

    /**
     * The status of the resource instance.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | cancelled | draft | entered-in-error", formalDefinition="The status of the resource instance." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/eligibilityresponse-status")
    protected Enumeration<EligibilityResponseStatus> status;

    /**
     * Original request resource reference.
     */
    @Child(name = "request", type = {Identifier.class, EligibilityRequest.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Claim reference", formalDefinition="Original request resource reference." )
    protected Type request;

    /**
     * Transaction status: error, complete.
     */
    @Child(name = "outcome", type = {CodeType.class}, order=3, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="complete | error | partial", formalDefinition="Transaction status: error, complete." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/remittance-outcome")
    protected Enumeration<RemittanceOutcome> outcome;

    /**
     * A description of the status of the adjudication.
     */
    @Child(name = "disposition", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Disposition Message", formalDefinition="A description of the status of the adjudication." )
    protected StringType disposition;

    /**
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     */
    @Child(name = "ruleset", type = {Coding.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Resource version", formalDefinition="The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ruleset")
    protected Coding ruleset;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    @Child(name = "originalRuleset", type = {Coding.class}, order=6, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Original version", formalDefinition="The style (standard) and version of the original material which was converted into this resource." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ruleset")
    protected Coding originalRuleset;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    @Child(name = "created", type = {DateTimeType.class}, order=7, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Creation date", formalDefinition="The date when the enclosed suite of services were performed or completed." )
    protected DateTimeType created;

    /**
     * The Insurer who produced this adjudicated response.
     */
    @Child(name = "organization", type = {Identifier.class, Organization.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Insurer", formalDefinition="The Insurer who produced this adjudicated response." )
    protected Type organization;

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    @Child(name = "requestProvider", type = {Identifier.class, Practitioner.class}, order=9, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Responsible practitioner", formalDefinition="The practitioner who is responsible for the services rendered to the patient." )
    protected Type requestProvider;

    /**
     * The organization which is responsible for the services rendered to the patient.
     */
    @Child(name = "requestOrganization", type = {Identifier.class, Organization.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Responsible organization", formalDefinition="The organization which is responsible for the services rendered to the patient." )
    protected Type requestOrganization;

    /**
     * Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.
     */
    @Child(name = "inforce", type = {BooleanType.class}, order=11, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Coverage inforce", formalDefinition="Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates." )
    protected BooleanType inforce;

    /**
     * The contract resource which may provide more detailed information.
     */
    @Child(name = "contract", type = {Contract.class}, order=12, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Contract details", formalDefinition="The contract resource which may provide more detailed information." )
    protected Reference contract;

    /**
     * The actual object that is the target of the reference (The contract resource which may provide more detailed information.)
     */
    protected Contract contractTarget;

    /**
     * The form to be used for printing the content.
     */
    @Child(name = "form", type = {Coding.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Printed Form Identifier", formalDefinition="The form to be used for printing the content." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/forms")
    protected Coding form;

    /**
     * Benefits and optionally current balances by Category.
     */
    @Child(name = "benefitBalance", type = {}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Benefits by Category", formalDefinition="Benefits and optionally current balances by Category." )
    protected List<BenefitsComponent> benefitBalance;

    /**
     * Mutually exclusive with Services Provided (Item).
     */
    @Child(name = "error", type = {}, order=15, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Processing errors", formalDefinition="Mutually exclusive with Services Provided (Item)." )
    protected List<ErrorsComponent> error;

    private static final long serialVersionUID = 371295340L;

  /**
   * Constructor
   */
    public EligibilityResponse() {
      super();
    }

  /**
   * Constructor
   */
    public EligibilityResponse(Enumeration<EligibilityResponseStatus> status) {
      super();
      this.status = status;
    }

    /**
     * @return {@link #identifier} (The Response business identifier.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EligibilityResponse setIdentifier(List<Identifier> theIdentifier) { 
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

    public EligibilityResponse addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EligibilityResponseStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<EligibilityResponseStatus>(new EligibilityResponseStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EligibilityResponse setStatusElement(Enumeration<EligibilityResponseStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the resource instance.
     */
    public EligibilityResponseStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the resource instance.
     */
    public EligibilityResponse setStatus(EligibilityResponseStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<EligibilityResponseStatus>(new EligibilityResponseStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #request} (Original request resource reference.)
     */
    public Type getRequest() { 
      return this.request;
    }

    /**
     * @return {@link #request} (Original request resource reference.)
     */
    public Identifier getRequestIdentifier() throws FHIRException { 
      if (!(this.request instanceof Identifier))
        throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.request.getClass().getName()+" was encountered");
      return (Identifier) this.request;
    }

    public boolean hasRequestIdentifier() { 
      return this.request instanceof Identifier;
    }

    /**
     * @return {@link #request} (Original request resource reference.)
     */
    public Reference getRequestReference() throws FHIRException { 
      if (!(this.request instanceof Reference))
        throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.request.getClass().getName()+" was encountered");
      return (Reference) this.request;
    }

    public boolean hasRequestReference() { 
      return this.request instanceof Reference;
    }

    public boolean hasRequest() { 
      return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Original request resource reference.)
     */
    public EligibilityResponse setRequest(Type value) { 
      this.request = value;
      return this;
    }

    /**
     * @return {@link #outcome} (Transaction status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public Enumeration<RemittanceOutcome> getOutcomeElement() { 
      if (this.outcome == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.outcome");
        else if (Configuration.doAutoCreate())
          this.outcome = new Enumeration<RemittanceOutcome>(new RemittanceOutcomeEnumFactory()); // bb
      return this.outcome;
    }

    public boolean hasOutcomeElement() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    public boolean hasOutcome() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Transaction status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public EligibilityResponse setOutcomeElement(Enumeration<RemittanceOutcome> value) { 
      this.outcome = value;
      return this;
    }

    /**
     * @return Transaction status: error, complete.
     */
    public RemittanceOutcome getOutcome() { 
      return this.outcome == null ? null : this.outcome.getValue();
    }

    /**
     * @param value Transaction status: error, complete.
     */
    public EligibilityResponse setOutcome(RemittanceOutcome value) { 
      if (value == null)
        this.outcome = null;
      else {
        if (this.outcome == null)
          this.outcome = new Enumeration<RemittanceOutcome>(new RemittanceOutcomeEnumFactory());
        this.outcome.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public StringType getDispositionElement() { 
      if (this.disposition == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.disposition");
        else if (Configuration.doAutoCreate())
          this.disposition = new StringType(); // bb
      return this.disposition;
    }

    public boolean hasDispositionElement() { 
      return this.disposition != null && !this.disposition.isEmpty();
    }

    public boolean hasDisposition() { 
      return this.disposition != null && !this.disposition.isEmpty();
    }

    /**
     * @param value {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public EligibilityResponse setDispositionElement(StringType value) { 
      this.disposition = value;
      return this;
    }

    /**
     * @return A description of the status of the adjudication.
     */
    public String getDisposition() { 
      return this.disposition == null ? null : this.disposition.getValue();
    }

    /**
     * @param value A description of the status of the adjudication.
     */
    public EligibilityResponse setDisposition(String value) { 
      if (Utilities.noString(value))
        this.disposition = null;
      else {
        if (this.disposition == null)
          this.disposition = new StringType();
        this.disposition.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public Coding getRuleset() { 
      if (this.ruleset == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.ruleset");
        else if (Configuration.doAutoCreate())
          this.ruleset = new Coding(); // cc
      return this.ruleset;
    }

    public boolean hasRuleset() { 
      return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public EligibilityResponse setRuleset(Coding value) { 
      this.ruleset = value;
      return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() { 
      if (this.originalRuleset == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.originalRuleset");
        else if (Configuration.doAutoCreate())
          this.originalRuleset = new Coding(); // cc
      return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() { 
      return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public EligibilityResponse setOriginalRuleset(Coding value) { 
      this.originalRuleset = value;
      return this;
    }

    /**
     * @return {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() { 
      if (this.created == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.created");
        else if (Configuration.doAutoCreate())
          this.created = new DateTimeType(); // bb
      return this.created;
    }

    public boolean hasCreatedElement() { 
      return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() { 
      return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public EligibilityResponse setCreatedElement(DateTimeType value) { 
      this.created = value;
      return this;
    }

    /**
     * @return The date when the enclosed suite of services were performed or completed.
     */
    public Date getCreated() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when the enclosed suite of services were performed or completed.
     */
    public EligibilityResponse setCreated(Date value) { 
      if (value == null)
        this.created = null;
      else {
        if (this.created == null)
          this.created = new DateTimeType();
        this.created.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public Type getOrganization() { 
      return this.organization;
    }

    /**
     * @return {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public Identifier getOrganizationIdentifier() throws FHIRException { 
      if (!(this.organization instanceof Identifier))
        throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.organization.getClass().getName()+" was encountered");
      return (Identifier) this.organization;
    }

    public boolean hasOrganizationIdentifier() { 
      return this.organization instanceof Identifier;
    }

    /**
     * @return {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public Reference getOrganizationReference() throws FHIRException { 
      if (!(this.organization instanceof Reference))
        throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.organization.getClass().getName()+" was encountered");
      return (Reference) this.organization;
    }

    public boolean hasOrganizationReference() { 
      return this.organization instanceof Reference;
    }

    public boolean hasOrganization() { 
      return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public EligibilityResponse setOrganization(Type value) { 
      this.organization = value;
      return this;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Type getRequestProvider() { 
      return this.requestProvider;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Identifier getRequestProviderIdentifier() throws FHIRException { 
      if (!(this.requestProvider instanceof Identifier))
        throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.requestProvider.getClass().getName()+" was encountered");
      return (Identifier) this.requestProvider;
    }

    public boolean hasRequestProviderIdentifier() { 
      return this.requestProvider instanceof Identifier;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Reference getRequestProviderReference() throws FHIRException { 
      if (!(this.requestProvider instanceof Reference))
        throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.requestProvider.getClass().getName()+" was encountered");
      return (Reference) this.requestProvider;
    }

    public boolean hasRequestProviderReference() { 
      return this.requestProvider instanceof Reference;
    }

    public boolean hasRequestProvider() { 
      return this.requestProvider != null && !this.requestProvider.isEmpty();
    }

    /**
     * @param value {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public EligibilityResponse setRequestProvider(Type value) { 
      this.requestProvider = value;
      return this;
    }

    /**
     * @return {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Type getRequestOrganization() { 
      return this.requestOrganization;
    }

    /**
     * @return {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Identifier getRequestOrganizationIdentifier() throws FHIRException { 
      if (!(this.requestOrganization instanceof Identifier))
        throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.requestOrganization.getClass().getName()+" was encountered");
      return (Identifier) this.requestOrganization;
    }

    public boolean hasRequestOrganizationIdentifier() { 
      return this.requestOrganization instanceof Identifier;
    }

    /**
     * @return {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Reference getRequestOrganizationReference() throws FHIRException { 
      if (!(this.requestOrganization instanceof Reference))
        throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.requestOrganization.getClass().getName()+" was encountered");
      return (Reference) this.requestOrganization;
    }

    public boolean hasRequestOrganizationReference() { 
      return this.requestOrganization instanceof Reference;
    }

    public boolean hasRequestOrganization() { 
      return this.requestOrganization != null && !this.requestOrganization.isEmpty();
    }

    /**
     * @param value {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public EligibilityResponse setRequestOrganization(Type value) { 
      this.requestOrganization = value;
      return this;
    }

    /**
     * @return {@link #inforce} (Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.). This is the underlying object with id, value and extensions. The accessor "getInforce" gives direct access to the value
     */
    public BooleanType getInforceElement() { 
      if (this.inforce == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.inforce");
        else if (Configuration.doAutoCreate())
          this.inforce = new BooleanType(); // bb
      return this.inforce;
    }

    public boolean hasInforceElement() { 
      return this.inforce != null && !this.inforce.isEmpty();
    }

    public boolean hasInforce() { 
      return this.inforce != null && !this.inforce.isEmpty();
    }

    /**
     * @param value {@link #inforce} (Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.). This is the underlying object with id, value and extensions. The accessor "getInforce" gives direct access to the value
     */
    public EligibilityResponse setInforceElement(BooleanType value) { 
      this.inforce = value;
      return this;
    }

    /**
     * @return Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.
     */
    public boolean getInforce() { 
      return this.inforce == null || this.inforce.isEmpty() ? false : this.inforce.getValue();
    }

    /**
     * @param value Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.
     */
    public EligibilityResponse setInforce(boolean value) { 
        if (this.inforce == null)
          this.inforce = new BooleanType();
        this.inforce.setValue(value);
      return this;
    }

    /**
     * @return {@link #contract} (The contract resource which may provide more detailed information.)
     */
    public Reference getContract() { 
      if (this.contract == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.contract");
        else if (Configuration.doAutoCreate())
          this.contract = new Reference(); // cc
      return this.contract;
    }

    public boolean hasContract() { 
      return this.contract != null && !this.contract.isEmpty();
    }

    /**
     * @param value {@link #contract} (The contract resource which may provide more detailed information.)
     */
    public EligibilityResponse setContract(Reference value) { 
      this.contract = value;
      return this;
    }

    /**
     * @return {@link #contract} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The contract resource which may provide more detailed information.)
     */
    public Contract getContractTarget() { 
      if (this.contractTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.contract");
        else if (Configuration.doAutoCreate())
          this.contractTarget = new Contract(); // aa
      return this.contractTarget;
    }

    /**
     * @param value {@link #contract} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The contract resource which may provide more detailed information.)
     */
    public EligibilityResponse setContractTarget(Contract value) { 
      this.contractTarget = value;
      return this;
    }

    /**
     * @return {@link #form} (The form to be used for printing the content.)
     */
    public Coding getForm() { 
      if (this.form == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EligibilityResponse.form");
        else if (Configuration.doAutoCreate())
          this.form = new Coding(); // cc
      return this.form;
    }

    public boolean hasForm() { 
      return this.form != null && !this.form.isEmpty();
    }

    /**
     * @param value {@link #form} (The form to be used for printing the content.)
     */
    public EligibilityResponse setForm(Coding value) { 
      this.form = value;
      return this;
    }

    /**
     * @return {@link #benefitBalance} (Benefits and optionally current balances by Category.)
     */
    public List<BenefitsComponent> getBenefitBalance() { 
      if (this.benefitBalance == null)
        this.benefitBalance = new ArrayList<BenefitsComponent>();
      return this.benefitBalance;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EligibilityResponse setBenefitBalance(List<BenefitsComponent> theBenefitBalance) { 
      this.benefitBalance = theBenefitBalance;
      return this;
    }

    public boolean hasBenefitBalance() { 
      if (this.benefitBalance == null)
        return false;
      for (BenefitsComponent item : this.benefitBalance)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public BenefitsComponent addBenefitBalance() { //3
      BenefitsComponent t = new BenefitsComponent();
      if (this.benefitBalance == null)
        this.benefitBalance = new ArrayList<BenefitsComponent>();
      this.benefitBalance.add(t);
      return t;
    }

    public EligibilityResponse addBenefitBalance(BenefitsComponent t) { //3
      if (t == null)
        return this;
      if (this.benefitBalance == null)
        this.benefitBalance = new ArrayList<BenefitsComponent>();
      this.benefitBalance.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #benefitBalance}, creating it if it does not already exist
     */
    public BenefitsComponent getBenefitBalanceFirstRep() { 
      if (getBenefitBalance().isEmpty()) {
        addBenefitBalance();
      }
      return getBenefitBalance().get(0);
    }

    /**
     * @return {@link #error} (Mutually exclusive with Services Provided (Item).)
     */
    public List<ErrorsComponent> getError() { 
      if (this.error == null)
        this.error = new ArrayList<ErrorsComponent>();
      return this.error;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EligibilityResponse setError(List<ErrorsComponent> theError) { 
      this.error = theError;
      return this;
    }

    public boolean hasError() { 
      if (this.error == null)
        return false;
      for (ErrorsComponent item : this.error)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ErrorsComponent addError() { //3
      ErrorsComponent t = new ErrorsComponent();
      if (this.error == null)
        this.error = new ArrayList<ErrorsComponent>();
      this.error.add(t);
      return t;
    }

    public EligibilityResponse addError(ErrorsComponent t) { //3
      if (t == null)
        return this;
      if (this.error == null)
        this.error = new ArrayList<ErrorsComponent>();
      this.error.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #error}, creating it if it does not already exist
     */
    public ErrorsComponent getErrorFirstRep() { 
      if (getError().isEmpty()) {
        addError();
      }
      return getError().get(0);
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The Response business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "The status of the resource instance.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("request[x]", "Identifier|Reference(EligibilityRequest)", "Original request resource reference.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("outcome", "code", "Transaction status: error, complete.", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("disposition", "string", "A description of the status of the adjudication.", 0, java.lang.Integer.MAX_VALUE, disposition));
        childrenList.add(new Property("ruleset", "Coding", "The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("organization[x]", "Identifier|Reference(Organization)", "The Insurer who produced this adjudicated response.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("requestProvider[x]", "Identifier|Reference(Practitioner)", "The practitioner who is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestProvider));
        childrenList.add(new Property("requestOrganization[x]", "Identifier|Reference(Organization)", "The organization which is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestOrganization));
        childrenList.add(new Property("inforce", "boolean", "Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.", 0, java.lang.Integer.MAX_VALUE, inforce));
        childrenList.add(new Property("contract", "Reference(Contract)", "The contract resource which may provide more detailed information.", 0, java.lang.Integer.MAX_VALUE, contract));
        childrenList.add(new Property("form", "Coding", "The form to be used for printing the content.", 0, java.lang.Integer.MAX_VALUE, form));
        childrenList.add(new Property("benefitBalance", "", "Benefits and optionally current balances by Category.", 0, java.lang.Integer.MAX_VALUE, benefitBalance));
        childrenList.add(new Property("error", "", "Mutually exclusive with Services Provided (Item).", 0, java.lang.Integer.MAX_VALUE, error));
      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<EligibilityResponseStatus>
        case 1095692943: /*request*/ return this.request == null ? new Base[0] : new Base[] {this.request}; // Type
        case -1106507950: /*outcome*/ return this.outcome == null ? new Base[0] : new Base[] {this.outcome}; // Enumeration<RemittanceOutcome>
        case 583380919: /*disposition*/ return this.disposition == null ? new Base[0] : new Base[] {this.disposition}; // StringType
        case 1548678118: /*ruleset*/ return this.ruleset == null ? new Base[0] : new Base[] {this.ruleset}; // Coding
        case 1089373397: /*originalRuleset*/ return this.originalRuleset == null ? new Base[0] : new Base[] {this.originalRuleset}; // Coding
        case 1028554472: /*created*/ return this.created == null ? new Base[0] : new Base[] {this.created}; // DateTimeType
        case 1178922291: /*organization*/ return this.organization == null ? new Base[0] : new Base[] {this.organization}; // Type
        case 1601527200: /*requestProvider*/ return this.requestProvider == null ? new Base[0] : new Base[] {this.requestProvider}; // Type
        case 599053666: /*requestOrganization*/ return this.requestOrganization == null ? new Base[0] : new Base[] {this.requestOrganization}; // Type
        case 1945431270: /*inforce*/ return this.inforce == null ? new Base[0] : new Base[] {this.inforce}; // BooleanType
        case -566947566: /*contract*/ return this.contract == null ? new Base[0] : new Base[] {this.contract}; // Reference
        case 3148996: /*form*/ return this.form == null ? new Base[0] : new Base[] {this.form}; // Coding
        case 596003397: /*benefitBalance*/ return this.benefitBalance == null ? new Base[0] : this.benefitBalance.toArray(new Base[this.benefitBalance.size()]); // BenefitsComponent
        case 96784904: /*error*/ return this.error == null ? new Base[0] : this.error.toArray(new Base[this.error.size()]); // ErrorsComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          break;
        case -892481550: // status
          this.status = new EligibilityResponseStatusEnumFactory().fromType(value); // Enumeration<EligibilityResponseStatus>
          break;
        case 1095692943: // request
          this.request = (Type) value; // Type
          break;
        case -1106507950: // outcome
          this.outcome = new RemittanceOutcomeEnumFactory().fromType(value); // Enumeration<RemittanceOutcome>
          break;
        case 583380919: // disposition
          this.disposition = castToString(value); // StringType
          break;
        case 1548678118: // ruleset
          this.ruleset = castToCoding(value); // Coding
          break;
        case 1089373397: // originalRuleset
          this.originalRuleset = castToCoding(value); // Coding
          break;
        case 1028554472: // created
          this.created = castToDateTime(value); // DateTimeType
          break;
        case 1178922291: // organization
          this.organization = (Type) value; // Type
          break;
        case 1601527200: // requestProvider
          this.requestProvider = (Type) value; // Type
          break;
        case 599053666: // requestOrganization
          this.requestOrganization = (Type) value; // Type
          break;
        case 1945431270: // inforce
          this.inforce = castToBoolean(value); // BooleanType
          break;
        case -566947566: // contract
          this.contract = castToReference(value); // Reference
          break;
        case 3148996: // form
          this.form = castToCoding(value); // Coding
          break;
        case 596003397: // benefitBalance
          this.getBenefitBalance().add((BenefitsComponent) value); // BenefitsComponent
          break;
        case 96784904: // error
          this.getError().add((ErrorsComponent) value); // ErrorsComponent
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
          this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
          this.status = new EligibilityResponseStatusEnumFactory().fromType(value); // Enumeration<EligibilityResponseStatus>
        else if (name.equals("request[x]"))
          this.request = (Type) value; // Type
        else if (name.equals("outcome"))
          this.outcome = new RemittanceOutcomeEnumFactory().fromType(value); // Enumeration<RemittanceOutcome>
        else if (name.equals("disposition"))
          this.disposition = castToString(value); // StringType
        else if (name.equals("ruleset"))
          this.ruleset = castToCoding(value); // Coding
        else if (name.equals("originalRuleset"))
          this.originalRuleset = castToCoding(value); // Coding
        else if (name.equals("created"))
          this.created = castToDateTime(value); // DateTimeType
        else if (name.equals("organization[x]"))
          this.organization = (Type) value; // Type
        else if (name.equals("requestProvider[x]"))
          this.requestProvider = (Type) value; // Type
        else if (name.equals("requestOrganization[x]"))
          this.requestOrganization = (Type) value; // Type
        else if (name.equals("inforce"))
          this.inforce = castToBoolean(value); // BooleanType
        else if (name.equals("contract"))
          this.contract = castToReference(value); // Reference
        else if (name.equals("form"))
          this.form = castToCoding(value); // Coding
        else if (name.equals("benefitBalance"))
          this.getBenefitBalance().add((BenefitsComponent) value);
        else if (name.equals("error"))
          this.getError().add((ErrorsComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); // Identifier
        case -892481550: throw new FHIRException("Cannot make property status as it is not a complex type"); // Enumeration<EligibilityResponseStatus>
        case 37106577:  return getRequest(); // Type
        case -1106507950: throw new FHIRException("Cannot make property outcome as it is not a complex type"); // Enumeration<RemittanceOutcome>
        case 583380919: throw new FHIRException("Cannot make property disposition as it is not a complex type"); // StringType
        case 1548678118:  return getRuleset(); // Coding
        case 1089373397:  return getOriginalRuleset(); // Coding
        case 1028554472: throw new FHIRException("Cannot make property created as it is not a complex type"); // DateTimeType
        case 1326483053:  return getOrganization(); // Type
        case -1694784800:  return getRequestProvider(); // Type
        case 818740190:  return getRequestOrganization(); // Type
        case 1945431270: throw new FHIRException("Cannot make property inforce as it is not a complex type"); // BooleanType
        case -566947566:  return getContract(); // Reference
        case 3148996:  return getForm(); // Coding
        case 596003397:  return addBenefitBalance(); // BenefitsComponent
        case 96784904:  return addError(); // ErrorsComponent
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.status");
        }
        else if (name.equals("requestIdentifier")) {
          this.request = new Identifier();
          return this.request;
        }
        else if (name.equals("requestReference")) {
          this.request = new Reference();
          return this.request;
        }
        else if (name.equals("outcome")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.outcome");
        }
        else if (name.equals("disposition")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.disposition");
        }
        else if (name.equals("ruleset")) {
          this.ruleset = new Coding();
          return this.ruleset;
        }
        else if (name.equals("originalRuleset")) {
          this.originalRuleset = new Coding();
          return this.originalRuleset;
        }
        else if (name.equals("created")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.created");
        }
        else if (name.equals("organizationIdentifier")) {
          this.organization = new Identifier();
          return this.organization;
        }
        else if (name.equals("organizationReference")) {
          this.organization = new Reference();
          return this.organization;
        }
        else if (name.equals("requestProviderIdentifier")) {
          this.requestProvider = new Identifier();
          return this.requestProvider;
        }
        else if (name.equals("requestProviderReference")) {
          this.requestProvider = new Reference();
          return this.requestProvider;
        }
        else if (name.equals("requestOrganizationIdentifier")) {
          this.requestOrganization = new Identifier();
          return this.requestOrganization;
        }
        else if (name.equals("requestOrganizationReference")) {
          this.requestOrganization = new Reference();
          return this.requestOrganization;
        }
        else if (name.equals("inforce")) {
          throw new FHIRException("Cannot call addChild on a primitive type EligibilityResponse.inforce");
        }
        else if (name.equals("contract")) {
          this.contract = new Reference();
          return this.contract;
        }
        else if (name.equals("form")) {
          this.form = new Coding();
          return this.form;
        }
        else if (name.equals("benefitBalance")) {
          return addBenefitBalance();
        }
        else if (name.equals("error")) {
          return addError();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "EligibilityResponse";

  }

      public EligibilityResponse copy() {
        EligibilityResponse dst = new EligibilityResponse();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.request = request == null ? null : request.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.disposition = disposition == null ? null : disposition.copy();
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.requestProvider = requestProvider == null ? null : requestProvider.copy();
        dst.requestOrganization = requestOrganization == null ? null : requestOrganization.copy();
        dst.inforce = inforce == null ? null : inforce.copy();
        dst.contract = contract == null ? null : contract.copy();
        dst.form = form == null ? null : form.copy();
        if (benefitBalance != null) {
          dst.benefitBalance = new ArrayList<BenefitsComponent>();
          for (BenefitsComponent i : benefitBalance)
            dst.benefitBalance.add(i.copy());
        };
        if (error != null) {
          dst.error = new ArrayList<ErrorsComponent>();
          for (ErrorsComponent i : error)
            dst.error.add(i.copy());
        };
        return dst;
      }

      protected EligibilityResponse typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof EligibilityResponse))
          return false;
        EligibilityResponse o = (EligibilityResponse) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(request, o.request, true)
           && compareDeep(outcome, o.outcome, true) && compareDeep(disposition, o.disposition, true) && compareDeep(ruleset, o.ruleset, true)
           && compareDeep(originalRuleset, o.originalRuleset, true) && compareDeep(created, o.created, true)
           && compareDeep(organization, o.organization, true) && compareDeep(requestProvider, o.requestProvider, true)
           && compareDeep(requestOrganization, o.requestOrganization, true) && compareDeep(inforce, o.inforce, true)
           && compareDeep(contract, o.contract, true) && compareDeep(form, o.form, true) && compareDeep(benefitBalance, o.benefitBalance, true)
           && compareDeep(error, o.error, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof EligibilityResponse))
          return false;
        EligibilityResponse o = (EligibilityResponse) other;
        return compareValues(status, o.status, true) && compareValues(outcome, o.outcome, true) && compareValues(disposition, o.disposition, true)
           && compareValues(created, o.created, true) && compareValues(inforce, o.inforce, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, request
          , outcome, disposition, ruleset, originalRuleset, created, organization, requestProvider
          , requestOrganization, inforce, contract, form, benefitBalance, error);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EligibilityResponse;
   }

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The business identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="EligibilityResponse.identifier", description="The business identifier", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The business identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>request-reference</b>
   * <p>
   * Description: <b>The EligibilityRequest reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.requestReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request-reference", path="EligibilityResponse.request.as(Reference)", description="The EligibilityRequest reference", type="reference", target={EligibilityRequest.class } )
  public static final String SP_REQUEST_REFERENCE = "request-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request-reference</b>
   * <p>
   * Description: <b>The EligibilityRequest reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.requestReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUEST_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUEST_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EligibilityResponse:request-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUEST_REFERENCE = new ca.uhn.fhir.model.api.Include("EligibilityResponse:request-reference").toLocked();

 /**
   * Search parameter: <b>disposition</b>
   * <p>
   * Description: <b>The contents of the disposition message</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EligibilityResponse.disposition</b><br>
   * </p>
   */
  @SearchParamDefinition(name="disposition", path="EligibilityResponse.disposition", description="The contents of the disposition message", type="string" )
  public static final String SP_DISPOSITION = "disposition";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>disposition</b>
   * <p>
   * Description: <b>The contents of the disposition message</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EligibilityResponse.disposition</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DISPOSITION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DISPOSITION);

 /**
   * Search parameter: <b>request-provider-identifier</b>
   * <p>
   * Description: <b>The EligibilityRequest provider</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.requestProviderIdentifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request-provider-identifier", path="EligibilityResponse.requestProvider.as(Identifier)", description="The EligibilityRequest provider", type="token" )
  public static final String SP_REQUEST_PROVIDER_IDENTIFIER = "request-provider-identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request-provider-identifier</b>
   * <p>
   * Description: <b>The EligibilityRequest provider</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.requestProviderIdentifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REQUEST_PROVIDER_IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_REQUEST_PROVIDER_IDENTIFIER);

 /**
   * Search parameter: <b>request-organization-reference</b>
   * <p>
   * Description: <b>The EligibilityRequest organization</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.requestOrganizationReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request-organization-reference", path="EligibilityResponse.requestOrganization.as(Reference)", description="The EligibilityRequest organization", type="reference", target={Organization.class } )
  public static final String SP_REQUEST_ORGANIZATION_REFERENCE = "request-organization-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request-organization-reference</b>
   * <p>
   * Description: <b>The EligibilityRequest organization</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.requestOrganizationReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUEST_ORGANIZATION_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUEST_ORGANIZATION_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EligibilityResponse:request-organization-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUEST_ORGANIZATION_REFERENCE = new ca.uhn.fhir.model.api.Include("EligibilityResponse:request-organization-reference").toLocked();

 /**
   * Search parameter: <b>organization-reference</b>
   * <p>
   * Description: <b>The organization which generated this resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.organizationReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="organization-reference", path="EligibilityResponse.organization.as(Reference)", description="The organization which generated this resource", type="reference", target={Organization.class } )
  public static final String SP_ORGANIZATION_REFERENCE = "organization-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>organization-reference</b>
   * <p>
   * Description: <b>The organization which generated this resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.organizationReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ORGANIZATION_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ORGANIZATION_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EligibilityResponse:organization-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ORGANIZATION_REFERENCE = new ca.uhn.fhir.model.api.Include("EligibilityResponse:organization-reference").toLocked();

 /**
   * Search parameter: <b>created</b>
   * <p>
   * Description: <b>The creation date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EligibilityResponse.created</b><br>
   * </p>
   */
  @SearchParamDefinition(name="created", path="EligibilityResponse.created", description="The creation date", type="date" )
  public static final String SP_CREATED = "created";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>created</b>
   * <p>
   * Description: <b>The creation date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EligibilityResponse.created</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam CREATED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_CREATED);

 /**
   * Search parameter: <b>organization-identifier</b>
   * <p>
   * Description: <b>The organization which generated this resource</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.organizationIdentifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="organization-identifier", path="EligibilityResponse.organization.as(Identifier)", description="The organization which generated this resource", type="token" )
  public static final String SP_ORGANIZATION_IDENTIFIER = "organization-identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>organization-identifier</b>
   * <p>
   * Description: <b>The organization which generated this resource</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.organizationIdentifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ORGANIZATION_IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ORGANIZATION_IDENTIFIER);

 /**
   * Search parameter: <b>request-identifier</b>
   * <p>
   * Description: <b>The EligibilityRequest reference</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.requestIdentifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request-identifier", path="EligibilityResponse.request.as(Identifier)", description="The EligibilityRequest reference", type="token" )
  public static final String SP_REQUEST_IDENTIFIER = "request-identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request-identifier</b>
   * <p>
   * Description: <b>The EligibilityRequest reference</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.requestIdentifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REQUEST_IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_REQUEST_IDENTIFIER);

 /**
   * Search parameter: <b>request-organization-identifier</b>
   * <p>
   * Description: <b>The EligibilityRequest organization</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.requestOrganizationIdentifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request-organization-identifier", path="EligibilityResponse.requestOrganization.as(Identifier)", description="The EligibilityRequest organization", type="token" )
  public static final String SP_REQUEST_ORGANIZATION_IDENTIFIER = "request-organization-identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request-organization-identifier</b>
   * <p>
   * Description: <b>The EligibilityRequest organization</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.requestOrganizationIdentifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REQUEST_ORGANIZATION_IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_REQUEST_ORGANIZATION_IDENTIFIER);

 /**
   * Search parameter: <b>outcome</b>
   * <p>
   * Description: <b>The processing outcome</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.outcome</b><br>
   * </p>
   */
  @SearchParamDefinition(name="outcome", path="EligibilityResponse.outcome", description="The processing outcome", type="token" )
  public static final String SP_OUTCOME = "outcome";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>outcome</b>
   * <p>
   * Description: <b>The processing outcome</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EligibilityResponse.outcome</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam OUTCOME = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_OUTCOME);

 /**
   * Search parameter: <b>request-provider-reference</b>
   * <p>
   * Description: <b>The EligibilityRequest provider</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.requestProviderReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request-provider-reference", path="EligibilityResponse.requestProvider.as(Reference)", description="The EligibilityRequest provider", type="reference", target={Practitioner.class } )
  public static final String SP_REQUEST_PROVIDER_REFERENCE = "request-provider-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request-provider-reference</b>
   * <p>
   * Description: <b>The EligibilityRequest provider</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EligibilityResponse.requestProviderReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUEST_PROVIDER_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUEST_PROVIDER_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EligibilityResponse:request-provider-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUEST_PROVIDER_REFERENCE = new ca.uhn.fhir.model.api.Include("EligibilityResponse:request-provider-reference").toLocked();


}


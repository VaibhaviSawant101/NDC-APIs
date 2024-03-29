//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Select a value from the enumerated list or enter a string value.
 *  =enumerated values=
 * N = NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
 * Y = SUBJECT TO US DOT RESERVATION AND DISCLOSURE
 * D = SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
 * 
 * <p>Java class for ListOfBagDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ListOfBagDisclosureType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BagDisclosure" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="BagRule" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDiscloseRuleSimpleType"/>
 *                   <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
 *                   <element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
 *                 <attribute name="CheckInTFC_ApplicableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBagDisclosureType", propOrder = {
    "bagDisclosure"
})
public class ListOfBagDisclosureType {

    @XmlElement(name = "BagDisclosure", required = true)
    protected List<ListOfBagDisclosureType.BagDisclosure> bagDisclosure;

    /**
     * Gets the value of the bagDisclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bagDisclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfBagDisclosureType.BagDisclosure }
     * 
     * 
     * @return
     *     The value of the bagDisclosure property.
     */
    public List<ListOfBagDisclosureType.BagDisclosure> getBagDisclosure() {
        if (bagDisclosure == null) {
            bagDisclosure = new ArrayList<>();
        }
        return this.bagDisclosure;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="BagRule" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDiscloseRuleSimpleType"/>
     *         <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
     *         <element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
     *       <attribute name="CheckInTFC_ApplicableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bagRule",
        "descriptions",
        "baggageDeterminingCarrier"
    })
    public static class BagDisclosure {

        @XmlElement(name = "BagRule", required = true)
        protected String bagRule;
        @XmlElement(name = "Descriptions")
        protected Descriptions descriptions;
        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlAttribute(name = "CheckInTFC_ApplicableInd")
        protected Boolean checkInTFCApplicableInd;
        @XmlAttribute(name = "DeferralInd")
        protected Boolean deferralInd;
        @XmlAttribute(name = "CommercialAgreementID")
        protected String commercialAgreementID;
        @XmlAttribute(name = "FixedPrePaidInd")
        protected Boolean fixedPrePaidInd;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the bagRule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBagRule() {
            return bagRule;
        }

        /**
         * Sets the value of the bagRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBagRule(String value) {
            this.bagRule = value;
        }

        /**
         * Gets the value of the descriptions property.
         * 
         * @return
         *     possible object is
         *     {@link Descriptions }
         *     
         */
        public Descriptions getDescriptions() {
            return descriptions;
        }

        /**
         * Sets the value of the descriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Descriptions }
         *     
         */
        public void setDescriptions(Descriptions value) {
            this.descriptions = value;
        }

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the checkInTFCApplicableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckInTFCApplicableInd() {
            return checkInTFCApplicableInd;
        }

        /**
         * Sets the value of the checkInTFCApplicableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckInTFCApplicableInd(Boolean value) {
            this.checkInTFCApplicableInd = value;
        }

        /**
         * Gets the value of the deferralInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeferralInd() {
            return deferralInd;
        }

        /**
         * Sets the value of the deferralInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDeferralInd(Boolean value) {
            this.deferralInd = value;
        }

        /**
         * Gets the value of the commercialAgreementID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommercialAgreementID() {
            return commercialAgreementID;
        }

        /**
         * Sets the value of the commercialAgreementID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommercialAgreementID(String value) {
            this.commercialAgreementID = value;
        }

        /**
         * Gets the value of the fixedPrePaidInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFixedPrePaidInd() {
            return fixedPrePaidInd;
        }

        /**
         * Sets the value of the fixedPrePaidInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFixedPrePaidInd(Boolean value) {
            this.fixedPrePaidInd = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         * @return
         *     The value of the refs property.
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<>();
            }
            return this.refs;
        }

        /**
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

    }

}
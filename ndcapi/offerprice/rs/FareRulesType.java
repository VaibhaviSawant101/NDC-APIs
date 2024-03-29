//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: FARE - FARE DETAIL- FARE RULES
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Penalty information
 * • Corporate Fare information
 * • Advance Ticketing, Purchase, Minimum and Maximum Stay Requirements
 * • Ticketing Instructions
 * • Fare Rule Remarks
 * 
 *  ============
 * Metadata
 *  ============
 * • FareRuleMetadata
 * 
 * <p>Java class for FareRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FareRulesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Penalty" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CorporateFare" minOccurs="0"/>
 *         <element name="AdvanceStay" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AdvancePurchase" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AdvanceTicketing" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MinimumStay" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MaximumStay" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Ticketing" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TicketlessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InstantPurchase" minOccurs="0"/>
 *                   <element name="Endorsements" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Endorsement" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Remarks" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRulesType", propOrder = {
    "penalty",
    "corporateFare",
    "advanceStay",
    "ticketing",
    "remarks"
})
public class FareRulesType {

    @XmlElement(name = "Penalty")
    protected PenaltyDetailType penalty;
    @XmlElement(name = "CorporateFare")
    protected CorporateFare corporateFare;
    @XmlElement(name = "AdvanceStay")
    protected FareRulesType.AdvanceStay advanceStay;
    @XmlElement(name = "Ticketing")
    protected FareRulesType.Ticketing ticketing;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyDetailType }
     *     
     */
    public PenaltyDetailType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyDetailType }
     *     
     */
    public void setPenalty(PenaltyDetailType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the corporateFare property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFare }
     *     
     */
    public CorporateFare getCorporateFare() {
        return corporateFare;
    }

    /**
     * Sets the value of the corporateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFare }
     *     
     */
    public void setCorporateFare(CorporateFare value) {
        this.corporateFare = value;
    }

    /**
     * Gets the value of the advanceStay property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType.AdvanceStay }
     *     
     */
    public FareRulesType.AdvanceStay getAdvanceStay() {
        return advanceStay;
    }

    /**
     * Sets the value of the advanceStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType.AdvanceStay }
     *     
     */
    public void setAdvanceStay(FareRulesType.AdvanceStay value) {
        this.advanceStay = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType.Ticketing }
     *     
     */
    public FareRulesType.Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType.Ticketing }
     *     
     */
    public void setTicketing(FareRulesType.Ticketing value) {
        this.ticketing = value;
    }

    /**
     * Fare Remark(s).
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AdvancePurchase" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AdvanceTicketing" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MinimumStay" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MaximumStay" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advancePurchase",
        "advanceTicketing",
        "minimumStay",
        "maximumStay"
    })
    public static class AdvanceStay {

        @XmlElement(name = "AdvancePurchase")
        protected AdvancePurchase advancePurchase;
        @XmlElement(name = "AdvanceTicketing")
        protected AdvanceTicketing advanceTicketing;
        @XmlElement(name = "MinimumStay")
        protected MinimumStay minimumStay;
        @XmlElement(name = "MaximumStay")
        protected MaximumStay maximumStay;

        /**
         * Gets the value of the advancePurchase property.
         * 
         * @return
         *     possible object is
         *     {@link AdvancePurchase }
         *     
         */
        public AdvancePurchase getAdvancePurchase() {
            return advancePurchase;
        }

        /**
         * Sets the value of the advancePurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvancePurchase }
         *     
         */
        public void setAdvancePurchase(AdvancePurchase value) {
            this.advancePurchase = value;
        }

        /**
         * Gets the value of the advanceTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvanceTicketing }
         *     
         */
        public AdvanceTicketing getAdvanceTicketing() {
            return advanceTicketing;
        }

        /**
         * Sets the value of the advanceTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvanceTicketing }
         *     
         */
        public void setAdvanceTicketing(AdvanceTicketing value) {
            this.advanceTicketing = value;
        }

        /**
         * Gets the value of the minimumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MinimumStay }
         *     
         */
        public MinimumStay getMinimumStay() {
            return minimumStay;
        }

        /**
         * Sets the value of the minimumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinimumStay }
         *     
         */
        public void setMinimumStay(MinimumStay value) {
            this.minimumStay = value;
        }

        /**
         * Gets the value of the maximumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MaximumStay }
         *     
         */
        public MaximumStay getMaximumStay() {
            return maximumStay;
        }

        /**
         * Sets the value of the maximumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaximumStay }
         *     
         */
        public void setMaximumStay(MaximumStay value) {
            this.maximumStay = value;
        }

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
     *         <element name="TicketlessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InstantPurchase" minOccurs="0"/>
     *         <element name="Endorsements" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Endorsement" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" maxOccurs="unbounded"/>
     *                 </sequence>
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
    @XmlType(name = "", propOrder = {
        "ticketlessInd",
        "instantPurchase",
        "endorsements"
    })
    public static class Ticketing {

        @XmlElement(name = "TicketlessInd")
        protected Boolean ticketlessInd;
        @XmlElement(name = "InstantPurchase")
        protected String instantPurchase;
        @XmlElement(name = "Endorsements")
        protected FareRulesType.Ticketing.Endorsements endorsements;

        /**
         * Gets the value of the ticketlessInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTicketlessInd() {
            return ticketlessInd;
        }

        /**
         * Sets the value of the ticketlessInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTicketlessInd(Boolean value) {
            this.ticketlessInd = value;
        }

        /**
         * Gets the value of the instantPurchase property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstantPurchase() {
            return instantPurchase;
        }

        /**
         * Sets the value of the instantPurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstantPurchase(String value) {
            this.instantPurchase = value;
        }

        /**
         * Gets the value of the endorsements property.
         * 
         * @return
         *     possible object is
         *     {@link FareRulesType.Ticketing.Endorsements }
         *     
         */
        public FareRulesType.Ticketing.Endorsements getEndorsements() {
            return endorsements;
        }

        /**
         * Sets the value of the endorsements property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRulesType.Ticketing.Endorsements }
         *     
         */
        public void setEndorsements(FareRulesType.Ticketing.Endorsements value) {
            this.endorsements = value;
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
         *         <element name="Endorsement" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" maxOccurs="unbounded"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "endorsement"
        })
        public static class Endorsements {

            @XmlElement(name = "Endorsement", required = true)
            protected List<String> endorsement;

            /**
             * Gets the value of the endorsement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the endorsement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEndorsement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             * @return
             *     The value of the endorsement property.
             */
            public List<String> getEndorsement() {
                if (endorsement == null) {
                    endorsement = new ArrayList<>();
                }
                return this.endorsement;
            }

        }

    }

}
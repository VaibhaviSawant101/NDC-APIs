//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Inventory Discrepency Alert definition.
 * 
 * Note: This processing condition occurs when there is a discrepency between offered inventory and available inventory. It may include references to Alternate Offers.
 * 
 * <p>Java class for InvDiscrepencyAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvDiscrepencyAlertType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *         <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}MultiAssociationType" minOccurs="0"/>
 *         <element name="AlternateOffers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   <element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID_Type"/>
 *                   <element name="AlternateOffer" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OfferType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltBaggageOffer"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltOtherOffer"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltPricedFlightOffer"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltSeatOffer"/>
 *                           </sequence>
 *                         </extension>
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
 *       <attribute name="NoInventoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvDiscrepencyAlertType", propOrder = {
    "code",
    "associations",
    "alternateOffers",
    "remarks"
})
public class InvDiscrepencyAlertType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Associations")
    protected MultiAssociationType associations;
    @XmlElement(name = "AlternateOffers")
    protected InvDiscrepencyAlertType.AlternateOffers alternateOffers;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;
    @XmlAttribute(name = "NoInventoryInd")
    protected Boolean noInventoryInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the alternateOffers property.
     * 
     * @return
     *     possible object is
     *     {@link InvDiscrepencyAlertType.AlternateOffers }
     *     
     */
    public InvDiscrepencyAlertType.AlternateOffers getAlternateOffers() {
        return alternateOffers;
    }

    /**
     * Sets the value of the alternateOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvDiscrepencyAlertType.AlternateOffers }
     *     
     */
    public void setAlternateOffers(InvDiscrepencyAlertType.AlternateOffers value) {
        this.alternateOffers = value;
    }

    /**
     * Gets the value of the remarks property.
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
     * Gets the value of the noInventoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoInventoryInd() {
        return noInventoryInd;
    }

    /**
     * Sets the value of the noInventoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoInventoryInd(Boolean value) {
        this.noInventoryInd = value;
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
     *         <element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         <element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID_Type"/>
     *         <element name="AlternateOffer" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OfferType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltBaggageOffer"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltOtherOffer"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltPricedFlightOffer"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltSeatOffer"/>
     *                 </sequence>
     *               </extension>
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
        "totalOfferQuantity",
        "owner",
        "alternateOffer"
    })
    public static class AlternateOffers {

        @XmlElement(name = "TotalOfferQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger totalOfferQuantity;
        @XmlElement(name = "Owner", required = true)
        protected AirlineIDType owner;
        @XmlElement(name = "AlternateOffer", required = true)
        protected List<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer> alternateOffer;

        /**
         * Gets the value of the totalOfferQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalOfferQuantity() {
            return totalOfferQuantity;
        }

        /**
         * Sets the value of the totalOfferQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalOfferQuantity(BigInteger value) {
            this.totalOfferQuantity = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineIDType }
         *     
         */
        public AirlineIDType getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineIDType }
         *     
         */
        public void setOwner(AirlineIDType value) {
            this.owner = value;
        }

        /**
         * Gets the value of the alternateOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the alternateOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvDiscrepencyAlertType.AlternateOffers.AlternateOffer }
         * 
         * 
         * @return
         *     The value of the alternateOffer property.
         */
        public List<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer> getAlternateOffer() {
            if (alternateOffer == null) {
                alternateOffer = new ArrayList<>();
            }
            return this.alternateOffer;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OfferType">
         *       <sequence>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltBaggageOffer"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltOtherOffer"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltPricedFlightOffer"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AltSeatOffer"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "altBaggageOffer",
            "altOtherOffer",
            "altPricedFlightOffer",
            "altSeatOffer"
        })
        public static class AlternateOffer
            extends OfferType
        {

            @XmlElement(name = "AltBaggageOffer", required = true)
            protected AltBaggageOfferType altBaggageOffer;
            @XmlElement(name = "AltOtherOffer", required = true)
            protected AltOtherOfferType altOtherOffer;
            @XmlElement(name = "AltPricedFlightOffer", required = true)
            protected AltPricedFlightOfferType altPricedFlightOffer;
            @XmlElement(name = "AltSeatOffer", required = true)
            protected AltSeatOfferType altSeatOffer;

            /**
             * Gets the value of the altBaggageOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltBaggageOfferType }
             *     
             */
            public AltBaggageOfferType getAltBaggageOffer() {
                return altBaggageOffer;
            }

            /**
             * Sets the value of the altBaggageOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltBaggageOfferType }
             *     
             */
            public void setAltBaggageOffer(AltBaggageOfferType value) {
                this.altBaggageOffer = value;
            }

            /**
             * Gets the value of the altOtherOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltOtherOfferType }
             *     
             */
            public AltOtherOfferType getAltOtherOffer() {
                return altOtherOffer;
            }

            /**
             * Sets the value of the altOtherOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltOtherOfferType }
             *     
             */
            public void setAltOtherOffer(AltOtherOfferType value) {
                this.altOtherOffer = value;
            }

            /**
             * Gets the value of the altPricedFlightOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltPricedFlightOfferType }
             *     
             */
            public AltPricedFlightOfferType getAltPricedFlightOffer() {
                return altPricedFlightOffer;
            }

            /**
             * Sets the value of the altPricedFlightOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltPricedFlightOfferType }
             *     
             */
            public void setAltPricedFlightOffer(AltPricedFlightOfferType value) {
                this.altPricedFlightOffer = value;
            }

            /**
             * Gets the value of the altSeatOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltSeatOfferType }
             *     
             */
            public AltSeatOfferType getAltSeatOffer() {
                return altSeatOffer;
            }

            /**
             * Sets the value of the altSeatOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltSeatOfferType }
             *     
             */
            public void setAltSeatOffer(AltSeatOfferType value) {
                this.altSeatOffer = value;
            }

        }

    }

}

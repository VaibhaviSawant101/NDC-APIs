//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

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
 * OFFER TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfferTimeLimitSetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferExpiration" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Payment" type="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType" minOccurs="0"/>
 *         <element name="OtherLimits" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OtherLimit" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimit"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/>
 *                           </sequence>
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "OfferTimeLimitSetType", propOrder = {
    "offerExpiration",
    "payment",
    "otherLimits"
})
public class OfferTimeLimitSetType {

    @XmlElement(name = "OfferExpiration")
    protected OfferTimeLimitSetType.OfferExpiration offerExpiration;
    @XmlElement(name = "Payment")
    protected CoreDateGrpType payment;
    @XmlElement(name = "OtherLimits")
    protected OfferTimeLimitSetType.OtherLimits otherLimits;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public OfferTimeLimitSetType.OfferExpiration getOfferExpiration() {
        return offerExpiration;
    }

    /**
     * Sets the value of the offerExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public void setOfferExpiration(OfferTimeLimitSetType.OfferExpiration value) {
        this.offerExpiration = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link CoreDateGrpType }
     *     
     */
    public CoreDateGrpType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreDateGrpType }
     *     
     */
    public void setPayment(CoreDateGrpType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the otherLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OtherLimits }
     *     
     */
    public OfferTimeLimitSetType.OtherLimits getOtherLimits() {
        return otherLimits;
    }

    /**
     * Sets the value of the otherLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OtherLimits }
     *     
     */
    public void setOtherLimits(OfferTimeLimitSetType.OtherLimits value) {
        this.otherLimits = value;
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
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferExpiration
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String objectKey;

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
         * Gets the value of the objectKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectKey() {
            return objectKey;
        }

        /**
         * Sets the value of the objectKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectKey(String value) {
            this.objectKey = value;
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
     *         <element name="OtherLimit" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimit"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/>
     *                 </sequence>
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/>
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
        "otherLimit"
    })
    public static class OtherLimits {

        @XmlElement(name = "OtherLimit", required = true)
        protected List<OfferTimeLimitSetType.OtherLimits.OtherLimit> otherLimit;

        /**
         * Gets the value of the otherLimit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the otherLimit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherLimit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferTimeLimitSetType.OtherLimits.OtherLimit }
         * 
         * 
         * @return
         *     The value of the otherLimit property.
         */
        public List<OfferTimeLimitSetType.OtherLimits.OtherLimit> getOtherLimit() {
            if (otherLimit == null) {
                otherLimit = new ArrayList<>();
            }
            return this.otherLimit;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimit"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/>
         *       </sequence>
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceGuaranteeTimeLimit",
            "ticketByTimeLimit"
        })
        public static class OtherLimit {

            @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
            protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
            @XmlElement(name = "TicketByTimeLimit", required = true)
            protected TicketByTimeLimitType ticketByTimeLimit;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ObjectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String objectKey;

            /**
             * Gets the value of the priceGuaranteeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link PriceGuaranteeTimeLimit }
             *     
             */
            public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
                return priceGuaranteeTimeLimit;
            }

            /**
             * Sets the value of the priceGuaranteeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceGuaranteeTimeLimit }
             *     
             */
            public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
                this.priceGuaranteeTimeLimit = value;
            }

            /**
             * Gets the value of the ticketByTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link TicketByTimeLimitType }
             *     
             */
            public TicketByTimeLimitType getTicketByTimeLimit() {
                return ticketByTimeLimit;
            }

            /**
             * Sets the value of the ticketByTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketByTimeLimitType }
             *     
             */
            public void setTicketByTimeLimit(TicketByTimeLimitType value) {
                this.ticketByTimeLimit = value;
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
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
            }

        }

    }

}

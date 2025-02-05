//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for a Fee/ Surcharge.
 * 
 * <p>Java class for FeeSurchargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FeeSurchargeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Total">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
 *                 <attribute name="refundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Breakdown" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Fee" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
 *                             <element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
 *                             <element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *                             <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
 *                             <element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *                           </sequence>
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                           <attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           <attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "FeeSurchargeType", propOrder = {
    "total",
    "breakdown"
})
@XmlSeeAlso({
    seatavailability.rq.DetailCurrencyPriceType.Fees.class,
    seatavailability.rq.SettlementType.Fees.class,
    seatavailability.rq.GenericPriceType.Fees.class,
    seatavailability.rq.OfferPriceLeadDetailType.PriceDetail.Fees.class,
    seatavailability.rq.OrderItemType.OrderItem.PriceDetail.Fees.class,
    seatavailability.rq.NameChangeOfferItemType.TotalPriceDetail.Fees.class,
    seatavailability.rq.ALaCarteOfferItemType.UnitPriceDetail.Fees.class,
    seatavailability.rq.OfferItemType.TotalPriceDetail.Fees.class
})
public class FeeSurchargeType {

    @XmlElement(name = "Total", required = true)
    protected FeeSurchargeType.Total total;
    @XmlElement(name = "Breakdown")
    protected FeeSurchargeType.Breakdown breakdown;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link FeeSurchargeType.Total }
     *     
     */
    public FeeSurchargeType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeSurchargeType.Total }
     *     
     */
    public void setTotal(FeeSurchargeType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the breakdown property.
     * 
     * @return
     *     possible object is
     *     {@link FeeSurchargeType.Breakdown }
     *     
     */
    public FeeSurchargeType.Breakdown getBreakdown() {
        return breakdown;
    }

    /**
     * Sets the value of the breakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeSurchargeType.Breakdown }
     *     
     */
    public void setBreakdown(FeeSurchargeType.Breakdown value) {
        this.breakdown = value;
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
     *         <element name="Fee" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
     *                   <element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
     *                   <element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
     *                   <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
     *                   <element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
     *                 </sequence>
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                 <attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 <attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "fee"
    })
    public static class Breakdown {

        @XmlElement(name = "Fee", required = true)
        protected List<FeeSurchargeType.Breakdown.Fee> fee;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeSurchargeType.Breakdown.Fee }
         * 
         * 
         * @return
         *     The value of the fee property.
         */
        public List<FeeSurchargeType.Breakdown.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<>();
            }
            return this.fee;
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
         *         <element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
         *         <element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
         *         <element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
         *         <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
         *         <element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
         *       </sequence>
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *       <attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       <attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount",
            "localAmount",
            "designator",
            "description",
            "nature"
        })
        public static class Fee {

            @XmlElement(name = "Amount", required = true)
            protected CurrencyAmountOptType amount;
            @XmlElement(name = "LocalAmount")
            protected CurrencyAmountOptType localAmount;
            @XmlElement(name = "Designator")
            protected String designator;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Nature")
            protected String nature;
            @XmlAttribute(name = "ApproxInd")
            protected Boolean approxInd;
            @XmlAttribute(name = "RefundInd")
            protected Boolean refundInd;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setAmount(CurrencyAmountOptType value) {
                this.amount = value;
            }

            /**
             * Gets the value of the localAmount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getLocalAmount() {
                return localAmount;
            }

            /**
             * Sets the value of the localAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setLocalAmount(CurrencyAmountOptType value) {
                this.localAmount = value;
            }

            /**
             * Gets the value of the designator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesignator() {
                return designator;
            }

            /**
             * Sets the value of the designator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesignator(String value) {
                this.designator = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the nature property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNature() {
                return nature;
            }

            /**
             * Sets the value of the nature property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNature(String value) {
                this.nature = value;
            }

            /**
             * Gets the value of the approxInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isApproxInd() {
                return approxInd;
            }

            /**
             * Sets the value of the approxInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setApproxInd(Boolean value) {
                this.approxInd = value;
            }

            /**
             * Gets the value of the refundInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRefundInd() {
                return refundInd;
            }

            /**
             * Sets the value of the refundInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRefundInd(Boolean value) {
                this.refundInd = value;
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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
     *       <attribute name="refundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Total
        extends CurrencyAmountOptType
    {

        @XmlAttribute(name = "refundInd")
        protected Boolean refundInd;

        /**
         * Gets the value of the refundInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundInd() {
            return refundInd;
        }

        /**
         * Sets the value of the refundInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundInd(Boolean value) {
            this.refundInd = value;
        }

    }

}

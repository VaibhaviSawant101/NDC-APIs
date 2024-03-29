//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Core Baggage Offer definition.
 * 
 * <p>Java class for BaggageOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BaggageOfferCoreType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalPrice">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AwardPricing"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPricing"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPrice"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyPrice"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType" minOccurs="0"/>
 *         <element name="BagDetails" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="BagDetail" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType"/>
 *                             <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}BagOfferAssocType" minOccurs="0"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CheckedBags" minOccurs="0"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CarryOnBags" minOccurs="0"/>
 *                             <element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDisclosureType" minOccurs="0"/>
 *                             <element name="Price" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <choice>
 *                                       <element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardPriceUnitType"/>
 *                                       <element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPriceType"/>
 *                                       <element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPriceType"/>
 *                                       <element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}EncodedPriceType"/>
 *                                       <element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPriceType"/>
 *                                     </choice>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageOfferCoreType", propOrder = {
    "totalPrice",
    "validatingCarrier",
    "bagDetails"
})
@XmlSeeAlso({
    AltBaggageOfferType.class
})
public class BaggageOfferCoreType {

    @XmlElement(name = "TotalPrice", required = true)
    protected BaggageOfferCoreType.TotalPrice totalPrice;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "BagDetails")
    protected BaggageOfferCoreType.BagDetails bagDetails;

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferCoreType.TotalPrice }
     *     
     */
    public BaggageOfferCoreType.TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferCoreType.TotalPrice }
     *     
     */
    public void setTotalPrice(BaggageOfferCoreType.TotalPrice value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrier(String value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the bagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferCoreType.BagDetails }
     *     
     */
    public BaggageOfferCoreType.BagDetails getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferCoreType.BagDetails }
     *     
     */
    public void setBagDetails(BaggageOfferCoreType.BagDetails value) {
        this.bagDetails = value;
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
     *         <element name="BagDetail" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType"/>
     *                   <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}BagOfferAssocType" minOccurs="0"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CheckedBags" minOccurs="0"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CarryOnBags" minOccurs="0"/>
     *                   <element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDisclosureType" minOccurs="0"/>
     *                   <element name="Price" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardPriceUnitType"/>
     *                             <element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPriceType"/>
     *                             <element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPriceType"/>
     *                             <element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}EncodedPriceType"/>
     *                             <element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPriceType"/>
     *                           </choice>
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
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bagDetail"
    })
    public static class BagDetails {

        @XmlElement(name = "BagDetail", required = true)
        protected List<BaggageOfferCoreType.BagDetails.BagDetail> bagDetail;

        /**
         * Gets the value of the bagDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the bagDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBagDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageOfferCoreType.BagDetails.BagDetail }
         * 
         * 
         * @return
         *     The value of the bagDetail property.
         */
        public List<BaggageOfferCoreType.BagDetails.BagDetail> getBagDetail() {
            if (bagDetail == null) {
                bagDetail = new ArrayList<>();
            }
            return this.bagDetail;
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
         *         <element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType"/>
         *         <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}BagOfferAssocType" minOccurs="0"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CheckedBags" minOccurs="0"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CarryOnBags" minOccurs="0"/>
         *         <element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDisclosureType" minOccurs="0"/>
         *         <element name="Price" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardPriceUnitType"/>
         *                   <element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPriceType"/>
         *                   <element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPriceType"/>
         *                   <element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}EncodedPriceType"/>
         *                   <element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPriceType"/>
         *                 </choice>
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
            "validatingCarrier",
            "associations",
            "checkedBags",
            "carryOnBags",
            "disclosure",
            "price"
        })
        public static class BagDetail {

            @XmlElement(name = "ValidatingCarrier", required = true)
            protected String validatingCarrier;
            @XmlElement(name = "Associations")
            protected BagOfferAssocType associations;
            @XmlElement(name = "CheckedBags")
            protected CheckedBags checkedBags;
            @XmlElement(name = "CarryOnBags")
            protected CarryOnBags carryOnBags;
            @XmlElement(name = "Disclosure")
            protected BagDisclosureType disclosure;
            @XmlElement(name = "Price")
            protected BaggageOfferCoreType.BagDetails.BagDetail.Price price;

            /**
             * Gets the value of the validatingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidatingCarrier() {
                return validatingCarrier;
            }

            /**
             * Sets the value of the validatingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidatingCarrier(String value) {
                this.validatingCarrier = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link BagOfferAssocType }
             *     
             */
            public BagOfferAssocType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagOfferAssocType }
             *     
             */
            public void setAssociations(BagOfferAssocType value) {
                this.associations = value;
            }

            /**
             * Gets the value of the checkedBags property.
             * 
             * @return
             *     possible object is
             *     {@link CheckedBags }
             *     
             */
            public CheckedBags getCheckedBags() {
                return checkedBags;
            }

            /**
             * Sets the value of the checkedBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CheckedBags }
             *     
             */
            public void setCheckedBags(CheckedBags value) {
                this.checkedBags = value;
            }

            /**
             * Gets the value of the carryOnBags property.
             * 
             * @return
             *     possible object is
             *     {@link CarryOnBags }
             *     
             */
            public CarryOnBags getCarryOnBags() {
                return carryOnBags;
            }

            /**
             * Sets the value of the carryOnBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarryOnBags }
             *     
             */
            public void setCarryOnBags(CarryOnBags value) {
                this.carryOnBags = value;
            }

            /**
             * Gets the value of the disclosure property.
             * 
             * @return
             *     possible object is
             *     {@link BagDisclosureType }
             *     
             */
            public BagDisclosureType getDisclosure() {
                return disclosure;
            }

            /**
             * Sets the value of the disclosure property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagDisclosureType }
             *     
             */
            public void setDisclosure(BagDisclosureType value) {
                this.disclosure = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageOfferCoreType.BagDetails.BagDetail.Price }
             *     
             */
            public BaggageOfferCoreType.BagDetails.BagDetail.Price getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageOfferCoreType.BagDetails.BagDetail.Price }
             *     
             */
            public void setPrice(BaggageOfferCoreType.BagDetails.BagDetail.Price value) {
                this.price = value;
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
             *       <choice>
             *         <element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardPriceUnitType"/>
             *         <element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPriceType"/>
             *         <element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPriceType"/>
             *         <element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}EncodedPriceType"/>
             *         <element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPriceType"/>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "awardPricing",
                "combinationPricing",
                "detailCurrencyPrice",
                "encodedCurrencyPrice",
                "simpleCurrencyPrice"
            })
            public static class Price {

                @XmlElement(name = "AwardPricing")
                protected AwardPriceUnitType awardPricing;
                @XmlElement(name = "CombinationPricing")
                protected CombinationPriceType combinationPricing;
                @XmlElement(name = "DetailCurrencyPrice")
                protected DetailCurrencyPriceType detailCurrencyPrice;
                @XmlElement(name = "EncodedCurrencyPrice")
                protected EncodedPriceType encodedCurrencyPrice;
                @XmlElement(name = "SimpleCurrencyPrice")
                protected SimpleCurrencyPriceType simpleCurrencyPrice;

                /**
                 * Gets the value of the awardPricing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AwardPriceUnitType }
                 *     
                 */
                public AwardPriceUnitType getAwardPricing() {
                    return awardPricing;
                }

                /**
                 * Sets the value of the awardPricing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AwardPriceUnitType }
                 *     
                 */
                public void setAwardPricing(AwardPriceUnitType value) {
                    this.awardPricing = value;
                }

                /**
                 * Gets the value of the combinationPricing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CombinationPriceType }
                 *     
                 */
                public CombinationPriceType getCombinationPricing() {
                    return combinationPricing;
                }

                /**
                 * Sets the value of the combinationPricing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CombinationPriceType }
                 *     
                 */
                public void setCombinationPricing(CombinationPriceType value) {
                    this.combinationPricing = value;
                }

                /**
                 * Gets the value of the detailCurrencyPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DetailCurrencyPriceType }
                 *     
                 */
                public DetailCurrencyPriceType getDetailCurrencyPrice() {
                    return detailCurrencyPrice;
                }

                /**
                 * Sets the value of the detailCurrencyPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DetailCurrencyPriceType }
                 *     
                 */
                public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
                    this.detailCurrencyPrice = value;
                }

                /**
                 * Gets the value of the encodedCurrencyPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public EncodedPriceType getEncodedCurrencyPrice() {
                    return encodedCurrencyPrice;
                }

                /**
                 * Sets the value of the encodedCurrencyPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public void setEncodedCurrencyPrice(EncodedPriceType value) {
                    this.encodedCurrencyPrice = value;
                }

                /**
                 * Gets the value of the simpleCurrencyPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SimpleCurrencyPriceType }
                 *     
                 */
                public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
                    return simpleCurrencyPrice;
                }

                /**
                 * Sets the value of the simpleCurrencyPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SimpleCurrencyPriceType }
                 *     
                 */
                public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
                    this.simpleCurrencyPrice = value;
                }

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
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AwardPricing"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPricing"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPrice"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyPrice"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "awardPricing",
        "combinationPricing",
        "simpleCurrencyPrice",
        "detailCurrencyPrice",
        "encodedCurrencyPrice"
    })
    public static class TotalPrice {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType }
         *     
         */
        public CombinationPriceType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType }
         *     
         */
        public void setCombinationPricing(CombinationPriceType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

        /**
         * Gets the value of the detailCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public DetailCurrencyPriceType getDetailCurrencyPrice() {
            return detailCurrencyPrice;
        }

        /**
         * Sets the value of the detailCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
            this.detailCurrencyPrice = value;
        }

        /**
         * Gets the value of the encodedCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link EncodedPriceType }
         *     
         */
        public EncodedPriceType getEncodedCurrencyPrice() {
            return encodedCurrencyPrice;
        }

        /**
         * Sets the value of the encodedCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link EncodedPriceType }
         *     
         */
        public void setEncodedCurrencyPrice(EncodedPriceType value) {
            this.encodedCurrencyPrice = value;
        }

    }

}

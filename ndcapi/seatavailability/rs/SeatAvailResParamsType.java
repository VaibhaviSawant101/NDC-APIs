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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Seat Availability Response Message Parameters.
 * 
 * <p>Java class for SeatAvailResParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SeatAvailResParamsType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MessageParamsBaseType">
 *       <sequence>
 *         <element name="Pricing" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OverrideCurrency" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencySimpleType" minOccurs="0"/>
 *                   <element name="FeeExemption" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedObjectBaseType">
 *                           <sequence>
 *                             <element name="Fee" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Code">
 *                                         <complexType>
 *                                           <simpleContent>
 *                                             <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                                               <attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             </extension>
 *                                           </simpleContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     </sequence>
 *                                     <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *                             <element name="ProvinceCode" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *                             <element name="GovernmentBody" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InventoryGuarantee" minOccurs="0"/>
 *         <element name="Group" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PrimaryContact" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAvailResParamsType", propOrder = {
    "pricing",
    "inventoryGuarantee",
    "group"
})
public class SeatAvailResParamsType
    extends MessageParamsBaseType
{

    @XmlElement(name = "Pricing")
    protected SeatAvailResParamsType.Pricing pricing;
    @XmlElement(name = "InventoryGuarantee")
    protected InvGuaranteeType inventoryGuarantee;
    @XmlElement(name = "Group")
    protected SeatAvailResParamsType.Group group;

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailResParamsType.Pricing }
     *     
     */
    public SeatAvailResParamsType.Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailResParamsType.Pricing }
     *     
     */
    public void setPricing(SeatAvailResParamsType.Pricing value) {
        this.pricing = value;
    }

    /**
     * Inventory Guarantee information, including Inventory Guarantee Time Limit, Unique ID and Offer/ Offer Item association(s).
     * 
     * Notes:
     *  1. This is the time that inventory for a specified product offer is guaranteed as available. The inventory held must be converted into a completed order before the time limit expires otherwise the guarantee is lost.
     *  2. If specified, an association to one or more Offers or Offer Items may be specified in the Associations node. If no associations are specified, the inventory guarantee is assumed to apply to the entire Offer.
     *  3. This capability may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only. If supported, the technical implementation of this capability is not dictated by this specification.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeType }
     *     
     */
    public InvGuaranteeType getInventoryGuarantee() {
        return inventoryGuarantee;
    }

    /**
     * Sets the value of the inventoryGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeType }
     *     
     */
    public void setInventoryGuarantee(InvGuaranteeType value) {
        this.inventoryGuarantee = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailResParamsType.Group }
     *     
     */
    public SeatAvailResParamsType.Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailResParamsType.Group }
     *     
     */
    public void setGroup(SeatAvailResParamsType.Group value) {
        this.group = value;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PrimaryContact" minOccurs="0"/>
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
        "primaryContact"
    })
    public static class Group {

        @XmlElement(name = "PrimaryContact")
        protected PrimaryContact primaryContact;

        /**
         * Gets the value of the primaryContact property.
         * 
         * @return
         *     possible object is
         *     {@link PrimaryContact }
         *     
         */
        public PrimaryContact getPrimaryContact() {
            return primaryContact;
        }

        /**
         * Sets the value of the primaryContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrimaryContact }
         *     
         */
        public void setPrimaryContact(PrimaryContact value) {
            this.primaryContact = value;
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
     *         <element name="OverrideCurrency" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencySimpleType" minOccurs="0"/>
     *         <element name="FeeExemption" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedObjectBaseType">
     *                 <sequence>
     *                   <element name="Fee" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Code">
     *                               <complexType>
     *                                 <simpleContent>
     *                                   <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *                                     <attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   </extension>
     *                                 </simpleContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           </sequence>
     *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="ProvinceCode" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="GovernmentBody" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overrideCurrency",
        "feeExemption"
    })
    public static class Pricing {

        @XmlElement(name = "OverrideCurrency")
        protected String overrideCurrency;
        @XmlElement(name = "FeeExemption")
        protected SeatAvailResParamsType.Pricing.FeeExemption feeExemption;
        @XmlAttribute(name = "AutoExchangeInd")
        protected Boolean autoExchangeInd;
        @XmlAttribute(name = "AwardIncludedInd")
        protected Boolean awardIncludedInd;
        @XmlAttribute(name = "AwardOnlyInd")
        protected Boolean awardOnlyInd;
        @XmlAttribute(name = "SimpleInd")
        protected Boolean simpleInd;

        /**
         * Gets the value of the overrideCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverrideCurrency() {
            return overrideCurrency;
        }

        /**
         * Sets the value of the overrideCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverrideCurrency(String value) {
            this.overrideCurrency = value;
        }

        /**
         * Gets the value of the feeExemption property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAvailResParamsType.Pricing.FeeExemption }
         *     
         */
        public SeatAvailResParamsType.Pricing.FeeExemption getFeeExemption() {
            return feeExemption;
        }

        /**
         * Sets the value of the feeExemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAvailResParamsType.Pricing.FeeExemption }
         *     
         */
        public void setFeeExemption(SeatAvailResParamsType.Pricing.FeeExemption value) {
            this.feeExemption = value;
        }

        /**
         * Gets the value of the autoExchangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoExchangeInd() {
            return autoExchangeInd;
        }

        /**
         * Sets the value of the autoExchangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoExchangeInd(Boolean value) {
            this.autoExchangeInd = value;
        }

        /**
         * Gets the value of the awardIncludedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardIncludedInd() {
            return awardIncludedInd;
        }

        /**
         * Sets the value of the awardIncludedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardIncludedInd(Boolean value) {
            this.awardIncludedInd = value;
        }

        /**
         * Gets the value of the awardOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardOnlyInd() {
            return awardOnlyInd;
        }

        /**
         * Sets the value of the awardOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardOnlyInd(Boolean value) {
            this.awardOnlyInd = value;
        }

        /**
         * Gets the value of the simpleInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSimpleInd() {
            return simpleInd;
        }

        /**
         * Sets the value of the simpleInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSimpleInd(Boolean value) {
            this.simpleInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedObjectBaseType">
         *       <sequence>
         *         <element name="Fee" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Code">
         *                     <complexType>
         *                       <simpleContent>
         *                         <extension base="<http://www.w3.org/2001/XMLSchema>string">
         *                           <attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         </extension>
         *                       </simpleContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 </sequence>
         *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="ProvinceCode" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="GovernmentBody" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
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
            "fee",
            "countryCode",
            "provinceCode",
            "governmentBody"
        })
        public static class FeeExemption
            extends AssociatedObjectBaseType
        {

            @XmlElement(name = "Fee")
            protected List<SeatAvailResParamsType.Pricing.FeeExemption.Fee> fee;
            @XmlElement(name = "CountryCode")
            protected List<CountryCode> countryCode;
            @XmlElement(name = "ProvinceCode")
            protected List<String> provinceCode;
            @XmlElement(name = "GovernmentBody")
            protected String governmentBody;

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
             * {@link SeatAvailResParamsType.Pricing.FeeExemption.Fee }
             * 
             * 
             * @return
             *     The value of the fee property.
             */
            public List<SeatAvailResParamsType.Pricing.FeeExemption.Fee> getFee() {
                if (fee == null) {
                    fee = new ArrayList<>();
                }
                return this.fee;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the countryCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCountryCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CountryCode }
             * 
             * 
             * @return
             *     The value of the countryCode property.
             */
            public List<CountryCode> getCountryCode() {
                if (countryCode == null) {
                    countryCode = new ArrayList<>();
                }
                return this.countryCode;
            }

            /**
             * Gets the value of the provinceCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the provinceCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProvinceCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             * @return
             *     The value of the provinceCode property.
             */
            public List<String> getProvinceCode() {
                if (provinceCode == null) {
                    provinceCode = new ArrayList<>();
                }
                return this.provinceCode;
            }

            /**
             * Gets the value of the governmentBody property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGovernmentBody() {
                return governmentBody;
            }

            /**
             * Sets the value of the governmentBody property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGovernmentBody(String value) {
                this.governmentBody = value;
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
             *         <element name="Code">
             *           <complexType>
             *             <simpleContent>
             *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
             *                 <attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               </extension>
             *             </simpleContent>
             *           </complexType>
             *         </element>
             *         <element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "code",
                "taxType"
            })
            public static class Fee {

                @XmlElement(name = "Code", required = true)
                protected SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code code;
                @XmlElement(name = "TaxType")
                protected List<String> taxType;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code }
                 *     
                 */
                public SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code }
                 *     
                 */
                public void setCode(SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the taxType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the taxType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTaxType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 * @return
                 *     The value of the taxType property.
                 */
                public List<String> getTaxType() {
                    if (taxType == null) {
                        taxType = new ArrayList<>();
                    }
                    return this.taxType;
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
                 *   <simpleContent>
                 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
                 *       <attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     </extension>
                 *   </simpleContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Code {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "CollectionPoint")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String collectionPoint;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the collectionPoint property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCollectionPoint() {
                        return collectionPoint;
                    }

                    /**
                     * Sets the value of the collectionPoint property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCollectionPoint(String value) {
                        this.collectionPoint = value;
                    }

                }

            }

        }

    }

}

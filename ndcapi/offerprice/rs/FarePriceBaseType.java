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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * FARE BASE PRICE definition.
 * 
 * <p>Java class for FarePriceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FarePriceBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalAmount" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AwardPricing"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPricing"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPrice"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyPrice"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareFiledIn" minOccurs="0"/>
 *         <element name="Surcharges" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.2}FeeSurchargeType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardPriceUnitType" minOccurs="0"/>
 *           <element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.2}CombinationPriceType" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePriceBaseType", propOrder = {
    "totalAmount",
    "baseAmount",
    "fareFiledIn",
    "surcharges",
    "awardPricing",
    "combinationPricing"
})
@XmlSeeAlso({
    FarePriceDetailType.class
})
public class FarePriceBaseType {

    @XmlElement(name = "TotalAmount")
    protected FarePriceBaseType.TotalAmount totalAmount;
    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "FareFiledIn")
    protected FareFilingType fareFiledIn;
    @XmlElement(name = "Surcharges")
    protected FarePriceBaseType.Surcharges surcharges;
    @XmlElement(name = "AwardPricing")
    protected AwardPriceUnitType awardPricing;
    @XmlElement(name = "CombinationPricing")
    protected CombinationPriceType combinationPricing;

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FarePriceBaseType.TotalAmount }
     *     
     */
    public FarePriceBaseType.TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePriceBaseType.TotalAmount }
     *     
     */
    public void setTotalAmount(FarePriceBaseType.TotalAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setBaseAmount(CurrencyAmountOptType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the fareFiledIn property.
     * 
     * @return
     *     possible object is
     *     {@link FareFilingType }
     *     
     */
    public FareFilingType getFareFiledIn() {
        return fareFiledIn;
    }

    /**
     * Sets the value of the fareFiledIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFilingType }
     *     
     */
    public void setFareFiledIn(FareFilingType value) {
        this.fareFiledIn = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link FarePriceBaseType.Surcharges }
     *     
     */
    public FarePriceBaseType.Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePriceBaseType.Surcharges }
     *     
     */
    public void setSurcharges(FarePriceBaseType.Surcharges value) {
        this.surcharges = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.2}FeeSurchargeType" maxOccurs="unbounded"/>
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
        "surcharge"
    })
    public static class Surcharges {

        @XmlElement(name = "Surcharge", required = true)
        protected List<FeeSurchargeType> surcharge;

        /**
         * Gets the value of the surcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the surcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurcharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeSurchargeType }
         * 
         * 
         * @return
         *     The value of the surcharge property.
         */
        public List<FeeSurchargeType> getSurcharge() {
            if (surcharge == null) {
                surcharge = new ArrayList<>();
            }
            return this.surcharge;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPrice"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyPrice"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
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
    public static class TotalAmount {

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

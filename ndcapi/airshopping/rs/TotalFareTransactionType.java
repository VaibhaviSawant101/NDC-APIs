//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * TOTAL FARE TRANSACTION definition.
 * 
 * <p>Java class for TotalFareTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalFareTransactionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="AmountType" type="{http://www.iata.org/IATA/EDIST/2017.2}FareAmountType" minOccurs="0"/>
 *         <element name="Purpose" type="{http://www.iata.org/IATA/EDIST/2017.2}CouponPurposeListType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="EquivRate">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ReissueSeqNbr">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <pattern value="[0-9]{1,3}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalFareTransactionType", propOrder = {
    "amount",
    "amountType",
    "purpose"
})
public class TotalFareTransactionType {

    @XmlElement(name = "Amount")
    protected TotalFareTransactionType.Amount amount;
    @XmlElement(name = "AmountType")
    @XmlSchemaType(name = "string")
    protected FareAmountType amountType;
    @XmlElement(name = "Purpose")
    @XmlSchemaType(name = "string")
    protected CouponPurposeListType purpose;
    @XmlAttribute(name = "EquivRate")
    protected BigDecimal equivRate;
    @XmlAttribute(name = "ReissueSeqNbr")
    protected String reissueSeqNbr;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFareTransactionType.Amount }
     *     
     */
    public TotalFareTransactionType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFareTransactionType.Amount }
     *     
     */
    public void setAmount(TotalFareTransactionType.Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link FareAmountType }
     *     
     */
    public FareAmountType getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAmountType }
     *     
     */
    public void setAmountType(FareAmountType value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CouponPurposeListType }
     *     
     */
    public CouponPurposeListType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponPurposeListType }
     *     
     */
    public void setPurpose(CouponPurposeListType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the equivRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquivRate() {
        return equivRate;
    }

    /**
     * Sets the value of the equivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquivRate(BigDecimal value) {
        this.equivRate = value;
    }

    /**
     * Gets the value of the reissueSeqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueSeqNbr() {
        return reissueSeqNbr;
    }

    /**
     * Sets the value of the reissueSeqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueSeqNbr(String value) {
        this.reissueSeqNbr = value;
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
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amount
        extends CurrencyAmountOptType
    {


    }

}

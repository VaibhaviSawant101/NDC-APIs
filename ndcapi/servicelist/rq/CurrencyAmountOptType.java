//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * AMOUNT with OPTIONAL CURRENCY ENCODING representation.
 * 
 * <p>Java class for CurrencyAmountOptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyAmountOptType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}AmountCurrencyOptGroup"/>
 *       <attribute name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmountOptType", propOrder = {
    "value"
})
@XmlSeeAlso({
    SimpleCurrencyPriceType.class,
    servicelist.rq.TaxExemptionType.Total.class,
    servicelist.rq.BaseFareTransactionType.Amount.class,
    servicelist.rq.EquivFareTransactionType.Amount.class,
    servicelist.rq.TotalFareTransactionType.Amount.class,
    servicelist.rq.GroupBudgetType.Amount.class,
    servicelist.rq.PersonBudgetType.Amount.class,
    servicelist.rq.TaxDetailType.Total.class,
    servicelist.rq.FeeSurchargeType.Total.class
})
public class CurrencyAmountOptType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Taxable")
    protected Boolean taxable;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTaxable() {
        if (taxable == null) {
            return true;
        } else {
            return taxable;
        }
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

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

}

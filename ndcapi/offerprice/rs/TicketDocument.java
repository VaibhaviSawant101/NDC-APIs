//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CouponTicketDocType">
 *       <attribute name="PresentCreditCardInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PenaltyRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonCommissionableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonInterlineableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonReissuableNonExchangInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ExchTicketNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PrimaryDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TicketDocument")
public class TicketDocument
    extends CouponTicketDocType
{

    @XmlAttribute(name = "PresentCreditCardInd")
    protected Boolean presentCreditCardInd;
    @XmlAttribute(name = "PenaltyRestrictionInd")
    protected Boolean penaltyRestrictionInd;
    @XmlAttribute(name = "NonCommissionableInd")
    protected Boolean nonCommissionableInd;
    @XmlAttribute(name = "NonInterlineableInd")
    protected Boolean nonInterlineableInd;
    @XmlAttribute(name = "NonReissuableNonExchangInd")
    protected Boolean nonReissuableNonExchangInd;
    @XmlAttribute(name = "NonRefundableInd")
    protected Boolean nonRefundableInd;
    @XmlAttribute(name = "TaxOnEMD_Ind")
    protected Boolean taxOnEMDInd;
    @XmlAttribute(name = "ExchTicketNbrInd")
    protected Boolean exchTicketNbrInd;
    @XmlAttribute(name = "PrimaryDocInd")
    protected Boolean primaryDocInd;

    /**
     * Gets the value of the presentCreditCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresentCreditCardInd() {
        return presentCreditCardInd;
    }

    /**
     * Sets the value of the presentCreditCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresentCreditCardInd(Boolean value) {
        this.presentCreditCardInd = value;
    }

    /**
     * Gets the value of the penaltyRestrictionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenaltyRestrictionInd() {
        return penaltyRestrictionInd;
    }

    /**
     * Sets the value of the penaltyRestrictionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenaltyRestrictionInd(Boolean value) {
        this.penaltyRestrictionInd = value;
    }

    /**
     * Gets the value of the nonCommissionableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonCommissionableInd() {
        return nonCommissionableInd;
    }

    /**
     * Sets the value of the nonCommissionableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonCommissionableInd(Boolean value) {
        this.nonCommissionableInd = value;
    }

    /**
     * Gets the value of the nonInterlineableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonInterlineableInd() {
        return nonInterlineableInd;
    }

    /**
     * Sets the value of the nonInterlineableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonInterlineableInd(Boolean value) {
        this.nonInterlineableInd = value;
    }

    /**
     * Gets the value of the nonReissuableNonExchangInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonReissuableNonExchangInd() {
        return nonReissuableNonExchangInd;
    }

    /**
     * Sets the value of the nonReissuableNonExchangInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonReissuableNonExchangInd(Boolean value) {
        this.nonReissuableNonExchangInd = value;
    }

    /**
     * Gets the value of the nonRefundableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundableInd() {
        return nonRefundableInd;
    }

    /**
     * Sets the value of the nonRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundableInd(Boolean value) {
        this.nonRefundableInd = value;
    }

    /**
     * Gets the value of the taxOnEMDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnEMDInd() {
        return taxOnEMDInd;
    }

    /**
     * Sets the value of the taxOnEMDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxOnEMDInd(Boolean value) {
        this.taxOnEMDInd = value;
    }

    /**
     * Gets the value of the exchTicketNbrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchTicketNbrInd() {
        return exchTicketNbrInd;
    }

    /**
     * Sets the value of the exchTicketNbrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchTicketNbrInd(Boolean value) {
        this.exchTicketNbrInd = value;
    }

    /**
     * Gets the value of the primaryDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryDocInd() {
        return primaryDocInd;
    }

    /**
     * Sets the value of the primaryDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryDocInd(Boolean value) {
        this.primaryDocInd = value;
    }

}

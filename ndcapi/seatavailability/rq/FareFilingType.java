//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * FARE FILING definition.
 * 
 * <p>Java class for FareFilingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FareFilingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
 *         <element name="NUC_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ExchangeRate" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" minOccurs="0"/>
 *         <element name="TicketBulkMask" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FiledFare" minOccurs="0"/>
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
@XmlType(name = "FareFilingType", propOrder = {
    "baseAmount",
    "nucAmount",
    "exchangeRate",
    "ticketBulkMask",
    "filedFare"
})
public class FareFilingType {

    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "NUC_Amount")
    protected BigDecimal nucAmount;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "TicketBulkMask")
    protected String ticketBulkMask;
    @XmlElement(name = "FiledFare")
    protected FiledFare filedFare;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the nucAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUCAmount() {
        return nucAmount;
    }

    /**
     * Sets the value of the nucAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUCAmount(BigDecimal value) {
        this.nucAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the ticketBulkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketBulkMask() {
        return ticketBulkMask;
    }

    /**
     * Sets the value of the ticketBulkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketBulkMask(String value) {
        this.ticketBulkMask = value;
    }

    /**
     * Filed fare information that may contain specific indicators applicable to the use of filed fares scenarios.
     * 
     * @return
     *     possible object is
     *     {@link FiledFare }
     *     
     */
    public FiledFare getFiledFare() {
        return filedFare;
    }

    /**
     * Sets the value of the filedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiledFare }
     *     
     */
    public void setFiledFare(FiledFare value) {
        this.filedFare = value;
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

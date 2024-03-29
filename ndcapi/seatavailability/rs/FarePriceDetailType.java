//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * FARE PRICE DETAIL definition.
 * 
 * <p>Java class for FarePriceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FarePriceDetailType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}FarePriceBaseType">
 *       <sequence>
 *         <element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.2}TaxDetailType" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TaxExemption" minOccurs="0"/>
 *         <element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Alignment" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePriceDetailType", propOrder = {
    "taxes",
    "taxExemption",
    "requestedDate",
    "alignment"
})
public class FarePriceDetailType
    extends FarePriceBaseType
{

    @XmlElement(name = "Taxes")
    protected TaxDetailType taxes;
    @XmlElement(name = "TaxExemption")
    protected TaxExemptionType taxExemption;
    @XmlElement(name = "RequestedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDate;
    @XmlElement(name = "Alignment")
    protected String alignment;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxes(TaxDetailType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType }
     *     
     */
    public TaxExemptionType getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType }
     *     
     */
    public void setTaxExemption(TaxExemptionType value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDate(XMLGregorianCalendar value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

}

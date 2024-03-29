//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Effective/ Expiration Time Period Representation.
 * 
 * <p>Java class for TimePeriodRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TimePeriodRepType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Effective" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" minOccurs="0"/>
 *         <element name="Expiration" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodRepType", propOrder = {
    "effective",
    "expiration"
})
public class TimePeriodRepType {

    @XmlElement(name = "Effective")
    protected String effective;
    @XmlElement(name = "Expiration")
    protected String expiration;

    /**
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffective(String value) {
        this.effective = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

}
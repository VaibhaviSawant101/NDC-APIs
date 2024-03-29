//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * PASSENGER TYPE CODE/ QUANTITY definition.
 * 
 * Passenger type code and Traveler quantity.  Example: ADT
 * Encoding scheme:  IATA (three character) Passenger Type Code
 * 
 * <p>Java class for PTC_QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PTC_QuantityType">
 *   <simpleContent>
 *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>PaxSimpleType">
 *       <attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_QuantityType", propOrder = {
    "value"
})
public class PTCQuantityType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;

    /**
     * A data type for Passenger Type Code (PTC) encoding constraint: IATA (three character) Passenger Type Codes
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

}

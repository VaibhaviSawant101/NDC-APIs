//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * MINIMUM/ MAXIMUM Offer Ordering Quantity definition.
 * 
 * <p>Java class for OfferOrderQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfferOrderQuantityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         <element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferOrderQuantityType", propOrder = {
    "minimum",
    "maximum"
})
public class OfferOrderQuantityType {

    @XmlElement(name = "Minimum")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimum;
    @XmlElement(name = "Maximum")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximum;

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimum(BigInteger value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximum(BigInteger value) {
        this.maximum = value;
    }

}

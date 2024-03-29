//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * MINIMUM/ MAXIMUM Service Ordering Quantity definition.
 * 
 * <p>Java class for ServiceItemQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceItemQuantityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemQuantityType", propOrder = {
    "minimumQuantity",
    "maximumQuantity"
})
public class ServiceItemQuantityType {

    @XmlElement(name = "MinimumQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimumQuantity;
    @XmlElement(name = "MaximumQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumQuantity;

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumQuantity(BigInteger value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumQuantity(BigInteger value) {
        this.maximumQuantity = value;
    }

}

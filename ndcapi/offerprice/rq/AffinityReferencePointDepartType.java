//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Reference Point Flight Departure (Origin) information.
 * 
 * <p>Java class for AffinityReferencePointDepartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AffinityReferencePointDepartType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Departure" type="{http://www.iata.org/IATA/EDIST/2017.2}ReferencePointQueryType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityReferencePointDepartType", propOrder = {
    "departure"
})
public class AffinityReferencePointDepartType {

    @XmlElement(name = "Departure", required = true)
    protected ReferencePointQueryType departure;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointQueryType }
     *     
     */
    public ReferencePointQueryType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointQueryType }
     *     
     */
    public void setDeparture(ReferencePointQueryType value) {
        this.departure = value;
    }

}

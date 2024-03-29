//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AIRLINE means: an enterprise operating aircraft for commercial purposes which (i) performs scheduled or  non-scheduled air transport services, or both, which are available to the public for carriage of passengers, mail and/or cargo and (ii) is certified for such purposes by the civil aviation authority of the state in which it is established.
 * 
 * <p>Java class for AirlineTypeAIDM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AirlineTypeAIDM">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AirlineName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameType" minOccurs="0"/>
 *         <element name="AirlineDesignator" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesignatorCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineTypeAIDM", propOrder = {
    "airlineName",
    "airlineDesignator"
})
public class AirlineTypeAIDM {

    @XmlElement(name = "AirlineName")
    protected String airlineName;
    @XmlElement(name = "AirlineDesignator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airlineDesignator;

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value) {
        this.airlineDesignator = value;
    }

}

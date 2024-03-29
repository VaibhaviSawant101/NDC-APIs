//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OriginDestinationType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TotalJourney" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightReferences" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalJourney",
    "flightReferences"
})
@XmlRootElement(name = "OriginDestination")
public class OriginDestination
    extends OriginDestinationType
{

    @XmlElement(name = "TotalJourney")
    protected TotalJourneyType totalJourney;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;

    /**
     * Gets the value of the totalJourney property.
     * 
     * @return
     *     possible object is
     *     {@link TotalJourneyType }
     *     
     */
    public TotalJourneyType getTotalJourney() {
        return totalJourney;
    }

    /**
     * Sets the value of the totalJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalJourneyType }
     *     
     */
    public void setTotalJourney(TotalJourneyType value) {
        this.totalJourney = value;
    }

    /**
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

}
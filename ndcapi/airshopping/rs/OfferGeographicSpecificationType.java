//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Offer Geographic Specification information
 * 
 * <p>Java class for OfferGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfferGeographicSpecificationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <element name="DirectionalIndicator" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <enumeration value="From LOC1 to LOC2"/>
 *                 <enumeration value="To LOC1 from LOC2"/>
 *                 <enumeration value="Both"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="OfferOriginPoint" type="{http://www.iata.org/IATA/EDIST/2017.2}GeographicSpecificationType" minOccurs="0"/>
 *           <element name="OfferDestinationPoint" type="{http://www.iata.org/IATA/EDIST/2017.2}GeographicSpecificationType" minOccurs="0"/>
 *         </sequence>
 *         <sequence>
 *           <element name="TravelWithin" type="{http://www.iata.org/IATA/EDIST/2017.2}GeographicSpecificationType" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGeographicSpecificationType", propOrder = {
    "directionalIndicator",
    "offerOriginPoint",
    "offerDestinationPoint",
    "travelWithin"
})
public class OfferGeographicSpecificationType {

    @XmlElement(name = "DirectionalIndicator")
    protected String directionalIndicator;
    @XmlElement(name = "OfferOriginPoint")
    protected GeographicSpecificationType offerOriginPoint;
    @XmlElement(name = "OfferDestinationPoint")
    protected GeographicSpecificationType offerDestinationPoint;
    @XmlElement(name = "TravelWithin")
    protected GeographicSpecificationType travelWithin;

    /**
     * Gets the value of the directionalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalIndicator() {
        return directionalIndicator;
    }

    /**
     * Sets the value of the directionalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalIndicator(String value) {
        this.directionalIndicator = value;
    }

    /**
     * Gets the value of the offerOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferOriginPoint() {
        return offerOriginPoint;
    }

    /**
     * Sets the value of the offerOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferOriginPoint(GeographicSpecificationType value) {
        this.offerOriginPoint = value;
    }

    /**
     * Gets the value of the offerDestinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferDestinationPoint() {
        return offerDestinationPoint;
    }

    /**
     * Sets the value of the offerDestinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferDestinationPoint(GeographicSpecificationType value) {
        this.offerDestinationPoint = value;
    }

    /**
     * Gets the value of the travelWithin property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getTravelWithin() {
        return travelWithin;
    }

    /**
     * Sets the value of the travelWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setTravelWithin(GeographicSpecificationType value) {
        this.travelWithin = value;
    }

}

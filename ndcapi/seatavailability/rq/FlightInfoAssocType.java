//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Flight that the offer applies to.
 * 
 * <p>Java class for FlightInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FlightInfoAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightSegmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *         <choice>
 *           <element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OriginDestinationReferences" minOccurs="0"/>
 *         </choice>
 *         <choice>
 *           <element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightReferences" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoAssocType", propOrder = {
    "allSegmentInd",
    "flightSegmentReference",
    "allOriginDestinationInd",
    "originDestinationReferences",
    "allFlightInd",
    "flightReferences"
})
@XmlSeeAlso({
    ApplicableFlight.class
})
public class FlightInfoAssocType {

    @XmlElement(name = "AllSegmentInd")
    protected Boolean allSegmentInd;
    @XmlElement(name = "FlightSegmentReference")
    protected List<FlightSegmentReference> flightSegmentReference;
    @XmlElement(name = "AllOriginDestinationInd")
    protected Boolean allOriginDestinationInd;
    @XmlList
    @XmlElement(name = "OriginDestinationReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> originDestinationReferences;
    @XmlElement(name = "AllFlightInd")
    protected Boolean allFlightInd;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;

    /**
     * Gets the value of the allSegmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllSegmentInd() {
        return allSegmentInd;
    }

    /**
     * Sets the value of the allSegmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllSegmentInd(Boolean value) {
        this.allSegmentInd = value;
    }

    /**
     * Association to to single Flight  segment instance(s). Example: segment1 Gets the value of the flightSegmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the flightSegmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentReference }
     * 
     * 
     * @return
     *     The value of the flightSegmentReference property.
     */
    public List<FlightSegmentReference> getFlightSegmentReference() {
        if (flightSegmentReference == null) {
            flightSegmentReference = new ArrayList<>();
        }
        return this.flightSegmentReference;
    }

    /**
     * Gets the value of the allOriginDestinationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOriginDestinationInd() {
        return allOriginDestinationInd;
    }

    /**
     * Sets the value of the allOriginDestinationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllOriginDestinationInd(Boolean value) {
        this.allOriginDestinationInd = value;
    }

    /**
     * Gets the value of the originDestinationReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the originDestinationReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the originDestinationReferences property.
     */
    public List<Object> getOriginDestinationReferences() {
        if (originDestinationReferences == null) {
            originDestinationReferences = new ArrayList<>();
        }
        return this.originDestinationReferences;
    }

    /**
     * Gets the value of the allFlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFlightInd() {
        return allFlightInd;
    }

    /**
     * Sets the value of the allFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFlightInd(Boolean value) {
        this.allFlightInd = value;
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

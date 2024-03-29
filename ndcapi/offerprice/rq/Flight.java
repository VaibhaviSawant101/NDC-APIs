//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ItineraryMetadata"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightMetadatasOrItineraryMetadata"
})
@XmlRootElement(name = "Flight")
public class Flight {

    @XmlElements({
        @XmlElement(name = "FlightMetadatas", type = FlightMetadatas.class),
        @XmlElement(name = "ItineraryMetadata", type = ItineraryMetadataType.class)
    })
    protected List<Object> flightMetadatasOrItineraryMetadata;

    /**
     * Gets the value of the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightMetadatasOrItineraryMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightMetadatas }
     * {@link ItineraryMetadataType }
     * 
     * 
     * @return
     *     The value of the flightMetadatasOrItineraryMetadata property.
     */
    public List<Object> getFlightMetadatasOrItineraryMetadata() {
        if (flightMetadatasOrItineraryMetadata == null) {
            flightMetadatasOrItineraryMetadata = new ArrayList<>();
        }
        return this.flightMetadatasOrItineraryMetadata;
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegmentReferences"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReference"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segmentReferences",
    "passengerReference"
})
@XmlRootElement(name = "SeatAssociation")
public class SeatAssociation {

    @XmlElement(name = "SegmentReferences", required = true)
    protected SegmentReferences segmentReferences;
    @XmlList
    @XmlElement(name = "PassengerReference", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReference;

    /**
     * Gets the value of the segmentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReferences }
     *     
     */
    public SegmentReferences getSegmentReferences() {
        return segmentReferences;
    }

    /**
     * Sets the value of the segmentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReferences }
     *     
     */
    public void setSegmentReferences(SegmentReferences value) {
        this.segmentReferences = value;
    }

    /**
     * Gets the value of the passengerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the passengerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the passengerReference property.
     */
    public List<Object> getPassengerReference() {
        if (passengerReference == null) {
            passengerReference = new ArrayList<>();
        }
        return this.passengerReference;
    }

}

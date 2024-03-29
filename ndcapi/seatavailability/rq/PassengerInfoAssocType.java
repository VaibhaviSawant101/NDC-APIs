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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Associated Passenger(s) definition.
 * 
 * <p>Java class for PassengerInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PassengerInfoAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AllPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReferences"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfoAssocType", propOrder = {
    "allPassengerInd",
    "passengerReferences"
})
public class PassengerInfoAssocType {

    @XmlElement(name = "AllPassengerInd")
    protected Boolean allPassengerInd;
    @XmlList
    @XmlElement(name = "PassengerReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReferences;

    /**
     * Gets the value of the allPassengerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPassengerInd() {
        return allPassengerInd;
    }

    /**
     * Sets the value of the allPassengerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllPassengerInd(Boolean value) {
        this.allPassengerInd = value;
    }

    /**
     * Association to multiple Passenger instance(s). Example: Passenger1 Passenger2
     * 
     * Note: May be Passenger (by PTC) instance(s).Gets the value of the passengerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the passengerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the passengerReferences property.
     */
    public List<Object> getPassengerReferences() {
        if (passengerReferences == null) {
            passengerReferences = new ArrayList<>();
        }
        return this.passengerReferences;
    }

}

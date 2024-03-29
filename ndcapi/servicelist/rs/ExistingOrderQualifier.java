//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

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
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OrderQualiferType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReferences"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BookingReference" minOccurs="0"/>
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
    "passengerReferences",
    "bookingReference"
})
@XmlRootElement(name = "ExistingOrderQualifier")
public class ExistingOrderQualifier
    extends OrderQualiferType
{

    @XmlList
    @XmlElement(name = "PassengerReferences", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReferences;
    @XmlElement(name = "BookingReference")
    protected BookingReference bookingReference;

    /**
     * Gets the value of the passengerReferences property.
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

    /**
     * Existing Booking Reference (e.g. PNR Record Locator). Example: R1A3SK
     * 
     * @return
     *     possible object is
     *     {@link BookingReference }
     *     
     */
    public BookingReference getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReference }
     *     
     */
    public void setBookingReference(BookingReference value) {
        this.bookingReference = value;
    }

}

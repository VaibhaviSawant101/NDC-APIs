//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AIRLINE FLIGHT COUPON definition.
 * 
 * <p>Java class for CouponSoldAirlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CouponSoldAirlineType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DepartureDateTime" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ArrivalDateTime" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Stops" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}StopLocations" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="InfoSource" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" minOccurs="0"/>
 *         <element name="TourOperatorFlightID" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Departure" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Arrival" minOccurs="0"/>
 *         <element name="OperatingCarrier" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OperatingCarrierFlightType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Disclosures" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}MarketingCarrierFlightType" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Equipment" maxOccurs="2" minOccurs="0"/>
 *         <element name="Status" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *         <element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TicketedBaggageAllowance" type="{http://www.iata.org/IATA/EDIST/2017.2}AddlBaggageInfoType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/>
 *       <attribute name="MetadataToken" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponSoldAirlineType", propOrder = {
    "departureDateTime",
    "arrivalDateTime",
    "stops",
    "infoSource",
    "tourOperatorFlightID",
    "departure",
    "arrival",
    "operatingCarrier",
    "marketingCarrier",
    "equipment",
    "status",
    "seatNumber",
    "ticketedBaggageAllowance"
})
@XmlSeeAlso({
    ordercreate.rq.CouponInfoType.SoldAirlineInfo.class,
    ordercreate.rq.HistoryCouponInfoType.SoldAirlineInfo.class
})
public class CouponSoldAirlineType {

    @XmlElement(name = "DepartureDateTime")
    protected CouponSoldAirlineType.DepartureDateTime departureDateTime;
    @XmlElement(name = "ArrivalDateTime")
    protected CouponSoldAirlineType.ArrivalDateTime arrivalDateTime;
    @XmlElement(name = "Stops")
    protected CouponSoldAirlineType.Stops stops;
    @XmlElement(name = "InfoSource")
    protected String infoSource;
    @XmlElement(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;
    @XmlElement(name = "Departure")
    protected Departure departure;
    @XmlElement(name = "Arrival")
    protected FlightArrivalType arrival;
    @XmlElement(name = "OperatingCarrier")
    protected CouponSoldAirlineType.OperatingCarrier operatingCarrier;
    @XmlElement(name = "MarketingCarrier")
    protected MarketingCarrierFlightType marketingCarrier;
    @XmlElement(name = "Equipment")
    protected List<AircraftSummaryType> equipment;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    @XmlElement(name = "TicketedBaggageAllowance")
    protected AddlBaggageInfoType ticketedBaggageAllowance;
    @XmlAttribute(name = "MetadataToken")
    protected String metadataToken;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.DepartureDateTime }
     *     
     */
    public CouponSoldAirlineType.DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.DepartureDateTime }
     *     
     */
    public void setDepartureDateTime(CouponSoldAirlineType.DepartureDateTime value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.ArrivalDateTime }
     *     
     */
    public CouponSoldAirlineType.ArrivalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.ArrivalDateTime }
     *     
     */
    public void setArrivalDateTime(CouponSoldAirlineType.ArrivalDateTime value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.Stops }
     *     
     */
    public CouponSoldAirlineType.Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.Stops }
     *     
     */
    public void setStops(CouponSoldAirlineType.Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link Departure }
     *     
     */
    public Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departure }
     *     
     */
    public void setDeparture(Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType }
     *     
     */
    public FlightArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType }
     *     
     */
    public void setArrival(FlightArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.OperatingCarrier }
     *     
     */
    public CouponSoldAirlineType.OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.OperatingCarrier }
     *     
     */
    public void setOperatingCarrier(CouponSoldAirlineType.OperatingCarrier value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public MarketingCarrierFlightType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public void setMarketingCarrier(MarketingCarrierFlightType value) {
        this.marketingCarrier = value;
    }

    /**
     * Aircraft Equipment.
     * 
     * Note: Two instances of aircraft equipment may be specified if there is a change of gauge.Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftSummaryType }
     * 
     * 
     * @return
     *     The value of the equipment property.
     */
    public List<AircraftSummaryType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the ticketedBaggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public AddlBaggageInfoType getTicketedBaggageAllowance() {
        return ticketedBaggageAllowance;
    }

    /**
     * Sets the value of the ticketedBaggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public void setTicketedBaggageAllowance(AddlBaggageInfoType value) {
        this.ticketedBaggageAllowance = value;
    }

    /**
     * Gets the value of the metadataToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataToken() {
        return metadataToken;
    }

    /**
     * Sets the value of the metadataToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataToken(String value) {
        this.metadataToken = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalDateTime
        extends CoreDateGrpType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureDateTime
        extends CoreDateGrpType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OperatingCarrierFlightType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Disclosures" minOccurs="0"/>
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
        "disclosures"
    })
    public static class OperatingCarrier
        extends OperatingCarrierFlightType
    {

        @XmlElement(name = "Disclosures")
        protected Disclosures disclosures;

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
        }

    }


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
     *         <element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}StopLocations" minOccurs="0"/>
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
        "stopQuantity",
        "stopLocations"
    })
    public static class Stops {

        @XmlElement(name = "StopQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger stopQuantity;
        @XmlElement(name = "StopLocations")
        protected StopLocationType stopLocations;

        /**
         * Gets the value of the stopQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStopQuantity() {
            return stopQuantity;
        }

        /**
         * Sets the value of the stopQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStopQuantity(BigInteger value) {
            this.stopQuantity = value;
        }

        /**
         * Gets the value of the stopLocations property.
         * 
         * @return
         *     possible object is
         *     {@link StopLocationType }
         *     
         */
        public StopLocationType getStopLocations() {
            return stopLocations;
        }

        /**
         * Sets the value of the stopLocations property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopLocationType }
         *     
         */
        public void setStopLocations(StopLocationType value) {
            this.stopLocations = value;
        }

    }

}

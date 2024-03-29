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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * NDC Capability Model: FARE - FARE DETAIL
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Fare Component information
 * • Fare Rules information
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Code Indicator to represent pricing method (IATA PADIS Code List for data element 5387 - Price Type Qualifier)
 * • Price Class association
 * • Associated Flight Mileage
 * • Fare Remarks
 * • Tour Code support (A special code arranged between the travel agency and the sales representative for a particular airline. When the agent enters the tour code into the reservation and ticketing system, it will input certain information onto the ticket. For example, agent commisions, specific fare fules that supercede the published fare rules etc.)
 * 
 *  ============
 * Metadata
 *  ============
 * • FareMetadata
 * 
 * <p>Java class for FareDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FareDetailType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FareIndicatorCode" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>IATA_CodeType">
 *                 <attribute name="FiledFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="PassengerRefs" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>IDREFS">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.2}FarePriceDetailType"/>
 *         <element name="FareComponent" type="{http://www.iata.org/IATA/EDIST/2017.2}FareComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightMileage" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TourCode" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Remarks" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailType", propOrder = {
    "fareIndicatorCode",
    "passengerRefs",
    "price",
    "fareComponent",
    "flightMileage",
    "tourCode",
    "remarks"
})
public class FareDetailType {

    @XmlElement(name = "FareIndicatorCode")
    protected FareDetailType.FareIndicatorCode fareIndicatorCode;
    @XmlElement(name = "PassengerRefs")
    protected FareDetailType.PassengerRefs passengerRefs;
    @XmlElement(name = "Price", required = true)
    protected FarePriceDetailType price;
    @XmlElement(name = "FareComponent")
    protected List<FareComponentType> fareComponent;
    @XmlElement(name = "FlightMileage")
    protected FlightMileageType flightMileage;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the fareIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType.FareIndicatorCode }
     *     
     */
    public FareDetailType.FareIndicatorCode getFareIndicatorCode() {
        return fareIndicatorCode;
    }

    /**
     * Sets the value of the fareIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType.FareIndicatorCode }
     *     
     */
    public void setFareIndicatorCode(FareDetailType.FareIndicatorCode value) {
        this.fareIndicatorCode = value;
    }

    /**
     * Gets the value of the passengerRefs property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType.PassengerRefs }
     *     
     */
    public FareDetailType.PassengerRefs getPassengerRefs() {
        return passengerRefs;
    }

    /**
     * Sets the value of the passengerRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType.PassengerRefs }
     *     
     */
    public void setPassengerRefs(FareDetailType.PassengerRefs value) {
        this.passengerRefs = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link FarePriceDetailType }
     *     
     */
    public FarePriceDetailType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePriceDetailType }
     *     
     */
    public void setPrice(FarePriceDetailType value) {
        this.price = value;
    }

    /**
     * Gets the value of the fareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType }
     * 
     * 
     * @return
     *     The value of the fareComponent property.
     */
    public List<FareComponentType> getFareComponent() {
        if (fareComponent == null) {
            fareComponent = new ArrayList<>();
        }
        return this.fareComponent;
    }

    /**
     * Gets the value of the flightMileage property.
     * 
     * @return
     *     possible object is
     *     {@link FlightMileageType }
     *     
     */
    public FlightMileageType getFlightMileage() {
        return flightMileage;
    }

    /**
     * Sets the value of the flightMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMileageType }
     *     
     */
    public void setFlightMileage(FlightMileageType value) {
        this.flightMileage = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>IATA_CodeType">
     *       <attribute name="FiledFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FareIndicatorCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FiledFareInd")
        protected Boolean filedFareInd;

        /**
         * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, EQP
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the filedFareInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFiledFareInd() {
            return filedFareInd;
        }

        /**
         * Sets the value of the filedFareInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFiledFareInd(Boolean value) {
            this.filedFareInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>IDREFS">
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PassengerRefs {

        @XmlValue
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         * @return
         *     The value of the value property.
         */
        public List<Object> getValue() {
            if (value == null) {
                value = new ArrayList<>();
            }
            return this.value;
        }

    }

}
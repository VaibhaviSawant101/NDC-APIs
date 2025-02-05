//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE FULFILLMENT representation, including Date/ Time Period, Location, Fulfillment Company.
 * 
 * <p>Java class for ServiceFulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceFulfillmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferValidDates" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Start" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="End" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Provider" type="{http://www.iata.org/IATA/EDIST/2017.2}FulfillmentPartnerType" minOccurs="0"/>
 *         <element name="Location" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportFulfillmentLocation"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherFulfillmentLocation"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFulfillmentType", propOrder = {
    "offerValidDates",
    "provider",
    "location"
})
public class ServiceFulfillmentType {

    @XmlElement(name = "OfferValidDates")
    protected ServiceFulfillmentType.OfferValidDates offerValidDates;
    @XmlElement(name = "Provider")
    protected FulfillmentPartnerType provider;
    @XmlElement(name = "Location")
    protected ServiceFulfillmentType.Location location;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerValidDates property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFulfillmentType.OfferValidDates }
     *     
     */
    public ServiceFulfillmentType.OfferValidDates getOfferValidDates() {
        return offerValidDates;
    }

    /**
     * Sets the value of the offerValidDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFulfillmentType.OfferValidDates }
     *     
     */
    public void setOfferValidDates(ServiceFulfillmentType.OfferValidDates value) {
        this.offerValidDates = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentPartnerType }
     *     
     */
    public FulfillmentPartnerType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentPartnerType }
     *     
     */
    public void setProvider(FulfillmentPartnerType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFulfillmentType.Location }
     *     
     */
    public ServiceFulfillmentType.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFulfillmentType.Location }
     *     
     */
    public void setLocation(ServiceFulfillmentType.Location value) {
        this.location = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportFulfillmentLocation"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherFulfillmentLocation"/>
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
        "airportFulfillmentLocation",
        "otherFulfillmentLocation"
    })
    public static class Location {

        @XmlElement(name = "AirportFulfillmentLocation", required = true)
        protected SrvcLocationAirportType airportFulfillmentLocation;
        @XmlElement(name = "OtherFulfillmentLocation", required = true)
        protected SrvcLocationAddressType otherFulfillmentLocation;

        /**
         * Gets the value of the airportFulfillmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link SrvcLocationAirportType }
         *     
         */
        public SrvcLocationAirportType getAirportFulfillmentLocation() {
            return airportFulfillmentLocation;
        }

        /**
         * Sets the value of the airportFulfillmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SrvcLocationAirportType }
         *     
         */
        public void setAirportFulfillmentLocation(SrvcLocationAirportType value) {
            this.airportFulfillmentLocation = value;
        }

        /**
         * Gets the value of the otherFulfillmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link SrvcLocationAddressType }
         *     
         */
        public SrvcLocationAddressType getOtherFulfillmentLocation() {
            return otherFulfillmentLocation;
        }

        /**
         * Sets the value of the otherFulfillmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SrvcLocationAddressType }
         *     
         */
        public void setOtherFulfillmentLocation(SrvcLocationAddressType value) {
            this.otherFulfillmentLocation = value;
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
     *         <element name="Start" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="End" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "start",
        "end"
    })
    public static class OfferValidDates {

        @XmlElement(name = "Start")
        protected ServiceFulfillmentType.OfferValidDates.Start start;
        @XmlElement(name = "End")
        protected ServiceFulfillmentType.OfferValidDates.End end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType.OfferValidDates.Start }
         *     
         */
        public ServiceFulfillmentType.OfferValidDates.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType.OfferValidDates.Start }
         *     
         */
        public void setStart(ServiceFulfillmentType.OfferValidDates.Start value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType.OfferValidDates.End }
         *     
         */
        public ServiceFulfillmentType.OfferValidDates.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType.OfferValidDates.End }
         *     
         */
        public void setEnd(ServiceFulfillmentType.OfferValidDates.End value) {
            this.end = value;
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
        public static class End
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
        public static class Start
            extends CoreDateGrpType
        {


        }

    }

}

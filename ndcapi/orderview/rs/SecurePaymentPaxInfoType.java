//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * SECURE PAYMENT AIRLINE RESERVATION definition.
 * 
 * 
 * <p>Java class for SecurePaymentPaxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurePaymentPaxInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Carriers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Carrier" maxOccurs="4">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>AirlineID_Type">
 *                           <attribute name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DateTimes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DateTime" maxOccurs="4">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           <attribute name="Time" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" />
 *                           <attribute name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassesOfService" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ClassOfService" maxOccurs="4"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="StopLocations" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StopLocation" maxOccurs="4">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FareBasisCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCode" maxOccurs="4"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FlightNumbers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightNumber" maxOccurs="4"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PassengerName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *         <element name="ResidenceCode" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CountrySimpleType">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="PassengerTktNbr" type="{http://www.iata.org/IATA/EDIST/2017.2}TicketNumberSimpleType" minOccurs="0"/>
 *         <element name="AgencyInfo" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
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
@XmlType(name = "SecurePaymentPaxInfoType", propOrder = {
    "carriers",
    "dateTimes",
    "classesOfService",
    "stopLocations",
    "fareBasisCodes",
    "flightNumbers",
    "passengerName",
    "residenceCode",
    "passengerTktNbr",
    "agencyInfo"
})
@XmlSeeAlso({
    ReservationInfo.class
})
public class SecurePaymentPaxInfoType {

    @XmlElement(name = "Carriers")
    protected SecurePaymentPaxInfoType.Carriers carriers;
    @XmlElement(name = "DateTimes")
    protected SecurePaymentPaxInfoType.DateTimes dateTimes;
    @XmlElement(name = "ClassesOfService")
    protected SecurePaymentPaxInfoType.ClassesOfService classesOfService;
    @XmlElement(name = "StopLocations")
    protected SecurePaymentPaxInfoType.StopLocations stopLocations;
    @XmlElement(name = "FareBasisCodes")
    protected SecurePaymentPaxInfoType.FareBasisCodes fareBasisCodes;
    @XmlElement(name = "FlightNumbers")
    protected SecurePaymentPaxInfoType.FlightNumbers flightNumbers;
    @XmlElement(name = "PassengerName")
    protected String passengerName;
    @XmlElement(name = "ResidenceCode")
    protected SecurePaymentPaxInfoType.ResidenceCode residenceCode;
    @XmlElement(name = "PassengerTktNbr")
    protected String passengerTktNbr;
    @XmlElement(name = "AgencyInfo")
    protected String agencyInfo;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the carriers property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.Carriers }
     *     
     */
    public SecurePaymentPaxInfoType.Carriers getCarriers() {
        return carriers;
    }

    /**
     * Sets the value of the carriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.Carriers }
     *     
     */
    public void setCarriers(SecurePaymentPaxInfoType.Carriers value) {
        this.carriers = value;
    }

    /**
     * Gets the value of the dateTimes property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.DateTimes }
     *     
     */
    public SecurePaymentPaxInfoType.DateTimes getDateTimes() {
        return dateTimes;
    }

    /**
     * Sets the value of the dateTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.DateTimes }
     *     
     */
    public void setDateTimes(SecurePaymentPaxInfoType.DateTimes value) {
        this.dateTimes = value;
    }

    /**
     * Gets the value of the classesOfService property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.ClassesOfService }
     *     
     */
    public SecurePaymentPaxInfoType.ClassesOfService getClassesOfService() {
        return classesOfService;
    }

    /**
     * Sets the value of the classesOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.ClassesOfService }
     *     
     */
    public void setClassesOfService(SecurePaymentPaxInfoType.ClassesOfService value) {
        this.classesOfService = value;
    }

    /**
     * Gets the value of the stopLocations property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.StopLocations }
     *     
     */
    public SecurePaymentPaxInfoType.StopLocations getStopLocations() {
        return stopLocations;
    }

    /**
     * Sets the value of the stopLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.StopLocations }
     *     
     */
    public void setStopLocations(SecurePaymentPaxInfoType.StopLocations value) {
        this.stopLocations = value;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.FareBasisCodes }
     *     
     */
    public SecurePaymentPaxInfoType.FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * Sets the value of the fareBasisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.FareBasisCodes }
     *     
     */
    public void setFareBasisCodes(SecurePaymentPaxInfoType.FareBasisCodes value) {
        this.fareBasisCodes = value;
    }

    /**
     * Gets the value of the flightNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.FlightNumbers }
     *     
     */
    public SecurePaymentPaxInfoType.FlightNumbers getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * Sets the value of the flightNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.FlightNumbers }
     *     
     */
    public void setFlightNumbers(SecurePaymentPaxInfoType.FlightNumbers value) {
        this.flightNumbers = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the residenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.ResidenceCode }
     *     
     */
    public SecurePaymentPaxInfoType.ResidenceCode getResidenceCode() {
        return residenceCode;
    }

    /**
     * Sets the value of the residenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.ResidenceCode }
     *     
     */
    public void setResidenceCode(SecurePaymentPaxInfoType.ResidenceCode value) {
        this.residenceCode = value;
    }

    /**
     * Gets the value of the passengerTktNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTktNbr() {
        return passengerTktNbr;
    }

    /**
     * Sets the value of the passengerTktNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTktNbr(String value) {
        this.passengerTktNbr = value;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyInfo(String value) {
        this.agencyInfo = value;
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
     *         <element name="Carrier" maxOccurs="4">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>AirlineID_Type">
     *                 <attribute name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *               </extension>
     *             </simpleContent>
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
        "carrier"
    })
    public static class Carriers {

        @XmlElement(name = "Carrier", required = true)
        protected List<SecurePaymentPaxInfoType.Carriers.Carrier> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecurePaymentPaxInfoType.Carriers.Carrier }
         * 
         * 
         * @return
         *     The value of the carrier property.
         */
        public List<SecurePaymentPaxInfoType.Carriers.Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<>();
            }
            return this.carrier;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>AirlineID_Type">
         *       <attribute name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Carrier
            extends AirlineIDType
        {

            @XmlAttribute(name = "Application")
            protected String application;

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ClassOfService" maxOccurs="4"/>
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
        "classOfService"
    })
    public static class ClassesOfService {

        @XmlElement(name = "ClassOfService", required = true)
        protected List<FlightCOSCoreType> classOfService;

        /**
         * Gets the value of the classOfService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the classOfService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassOfService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightCOSCoreType }
         * 
         * 
         * @return
         *     The value of the classOfService property.
         */
        public List<FlightCOSCoreType> getClassOfService() {
            if (classOfService == null) {
                classOfService = new ArrayList<>();
            }
            return this.classOfService;
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
     *         <element name="DateTime" maxOccurs="4">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 <attribute name="Time" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" />
     *                 <attribute name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *               </restriction>
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
        "dateTime"
    })
    public static class DateTimes {

        @XmlElement(name = "DateTime", required = true)
        protected List<SecurePaymentPaxInfoType.DateTimes.DateTime> dateTime;

        /**
         * Gets the value of the dateTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the dateTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecurePaymentPaxInfoType.DateTimes.DateTime }
         * 
         * 
         * @return
         *     The value of the dateTime property.
         */
        public List<SecurePaymentPaxInfoType.DateTimes.DateTime> getDateTime() {
            if (dateTime == null) {
                dateTime = new ArrayList<>();
            }
            return this.dateTime;
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
         *       <attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       <attribute name="Time" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" />
         *       <attribute name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DateTime {

            @XmlAttribute(name = "Date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "Time")
            protected String time;
            @XmlAttribute(name = "Application")
            protected String application;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
            }

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCode" maxOccurs="4"/>
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
        "fareBasisCode"
    })
    public static class FareBasisCodes {

        @XmlElement(name = "FareBasisCode", required = true)
        protected List<FareBasisCodeType> fareBasisCode;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fareBasisCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasisCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareBasisCodeType }
         * 
         * 
         * @return
         *     The value of the fareBasisCode property.
         */
        public List<FareBasisCodeType> getFareBasisCode() {
            if (fareBasisCode == null) {
                fareBasisCode = new ArrayList<>();
            }
            return this.fareBasisCode;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FlightNumber" maxOccurs="4"/>
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
        "flightNumber"
    })
    public static class FlightNumbers {

        @XmlElement(name = "FlightNumber", required = true)
        protected List<FlightNumber> flightNumber;

        /**
         * Gets the value of the flightNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the flightNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightNumber }
         * 
         * 
         * @return
         *     The value of the flightNumber property.
         */
        public List<FlightNumber> getFlightNumber() {
            if (flightNumber == null) {
                flightNumber = new ArrayList<>();
            }
            return this.flightNumber;
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
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CountrySimpleType">
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
    public static class ResidenceCode {

        @XmlValue
        protected String value;

        /**
         * A data type for Country Code encoding constraint: ISO 3166-1 (two character) Country Code
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
     *         <element name="StopLocation" maxOccurs="4">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
     *                 </sequence>
     *               </restriction>
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
        "stopLocation"
    })
    public static class StopLocations {

        @XmlElement(name = "StopLocation", required = true)
        protected List<SecurePaymentPaxInfoType.StopLocations.StopLocation> stopLocation;

        /**
         * Gets the value of the stopLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the stopLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStopLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecurePaymentPaxInfoType.StopLocations.StopLocation }
         * 
         * 
         * @return
         *     The value of the stopLocation property.
         */
        public List<SecurePaymentPaxInfoType.StopLocations.StopLocation> getStopLocation() {
            if (stopLocation == null) {
                stopLocation = new ArrayList<>();
            }
            return this.stopLocation;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirportCode"/>
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
            "airportCode"
        })
        public static class StopLocation {

            @XmlElement(name = "AirportCode", required = true)
            protected AirportCode airportCode;

            /**
             * Gets the value of the airportCode property.
             * 
             * @return
             *     possible object is
             *     {@link AirportCode }
             *     
             */
            public AirportCode getAirportCode() {
                return airportCode;
            }

            /**
             * Sets the value of the airportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirportCode }
             *     
             */
            public void setAirportCode(AirportCode value) {
                this.airportCode = value;
            }

        }

    }

}
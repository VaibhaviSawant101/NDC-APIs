//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Point of Sale.
 * 
 * <p>Java class for PointOfSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfSaleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Location" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CityCode" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RequestTime" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>dateTime">
 *                 <attribute name="Zone" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="TouchPoint" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Device" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CodesetType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Position" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Event" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
 *       <attribute name="AgentDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleType", propOrder = {
    "location",
    "requestTime",
    "touchPoint"
})
public class PointOfSaleType {

    @XmlElement(name = "Location")
    protected PointOfSaleType.Location location;
    @XmlElement(name = "RequestTime")
    protected PointOfSaleType.RequestTime requestTime;
    @XmlElement(name = "TouchPoint")
    protected PointOfSaleType.TouchPoint touchPoint;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType.Location }
     *     
     */
    public PointOfSaleType.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType.Location }
     *     
     */
    public void setLocation(PointOfSaleType.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType.RequestTime }
     *     
     */
    public PointOfSaleType.RequestTime getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType.RequestTime }
     *     
     */
    public void setRequestTime(PointOfSaleType.RequestTime value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the touchPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType.TouchPoint }
     *     
     */
    public PointOfSaleType.TouchPoint getTouchPoint() {
        return touchPoint;
    }

    /**
     * Sets the value of the touchPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType.TouchPoint }
     *     
     */
    public void setTouchPoint(PointOfSaleType.TouchPoint value) {
        this.touchPoint = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the agentDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * Sets the value of the agentDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CityCode" minOccurs="0"/>
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
        "countryCode",
        "cityCode"
    })
    public static class Location {

        @XmlElement(name = "CountryCode")
        protected CountryCode countryCode;
        @XmlElement(name = "CityCode")
        protected CityCode cityCode;

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link CountryCode }
         *     
         */
        public CountryCode getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryCode }
         *     
         */
        public void setCountryCode(CountryCode value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the cityCode property.
         * 
         * @return
         *     possible object is
         *     {@link CityCode }
         *     
         */
        public CityCode getCityCode() {
            return cityCode;
        }

        /**
         * Sets the value of the cityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CityCode }
         *     
         */
        public void setCityCode(CityCode value) {
            this.cityCode = value;
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
     *     <extension base="<http://www.w3.org/2001/XMLSchema>dateTime">
     *       <attribute name="Zone" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
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
    public static class RequestTime {

        @XmlValue
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "Zone")
        protected String zone;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the zone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZone() {
            return zone;
        }

        /**
         * Sets the value of the zone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZone(String value) {
            this.zone = value;
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
     *         <element name="Device" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CodesetType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Position" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Event" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
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
        "device",
        "event"
    })
    public static class TouchPoint {

        @XmlElement(name = "Device")
        protected PointOfSaleType.TouchPoint.Device device;
        @XmlElement(name = "Event")
        protected String event;

        /**
         * Gets the value of the device property.
         * 
         * @return
         *     possible object is
         *     {@link PointOfSaleType.TouchPoint.Device }
         *     
         */
        public PointOfSaleType.TouchPoint.Device getDevice() {
            return device;
        }

        /**
         * Sets the value of the device property.
         * 
         * @param value
         *     allowed object is
         *     {@link PointOfSaleType.TouchPoint.Device }
         *     
         */
        public void setDevice(PointOfSaleType.TouchPoint.Device value) {
            this.device = value;
        }

        /**
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEvent() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEvent(String value) {
            this.event = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CodesetType">
         *       <sequence>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Position" minOccurs="0"/>
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
            "position"
        })
        public static class Device
            extends CodesetType
        {

            @XmlElement(name = "Position")
            protected Position position;

            /**
             * Device position and geocoding coordinates.
             * 
             * @return
             *     possible object is
             *     {@link Position }
             *     
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link Position }
             *     
             */
            public void setPosition(Position value) {
                this.position = value;
            }

        }

    }

}

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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * POSITION AND GEOCODING helper object.
 * 
 * <p>Java class for PositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Latitude" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attribute name="Sign">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <enumeration value="SOUTH"/>
 *                       <enumeration value="NORTH"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Minute" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *                 <attribute name="Second" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Longitude" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attribute name="Sign">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <enumeration value="EAST"/>
 *                       <enumeration value="WEST"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Minute" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *                 <attribute name="Second" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Altitude" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attribute name="Unit" type="{http://www.iata.org/IATA/EDIST/2017.2}DistanceUnitSimpleType" />
 *                 <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="NAC" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
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
@XmlType(name = "PositionType", propOrder = {
    "latitude",
    "longitude",
    "altitude",
    "nac"
})
@XmlSeeAlso({
    seatavailability.rq.GeographicSpecificationType.Coordinates.class,
    Position.class
})
public class PositionType {

    @XmlElement(name = "Latitude")
    protected PositionType.Latitude latitude;
    @XmlElement(name = "Longitude")
    protected PositionType.Longitude longitude;
    @XmlElement(name = "Altitude")
    protected PositionType.Altitude altitude;
    @XmlElement(name = "NAC")
    protected String nac;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType.Latitude }
     *     
     */
    public PositionType.Latitude getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType.Latitude }
     *     
     */
    public void setLatitude(PositionType.Latitude value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType.Longitude }
     *     
     */
    public PositionType.Longitude getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType.Longitude }
     *     
     */
    public void setLongitude(PositionType.Longitude value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType.Altitude }
     *     
     */
    public PositionType.Altitude getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType.Altitude }
     *     
     */
    public void setAltitude(PositionType.Altitude value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the nac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAC() {
        return nac;
    }

    /**
     * Sets the value of the nac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAC(String value) {
        this.nac = value;
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
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *       <attribute name="Unit" type="{http://www.iata.org/IATA/EDIST/2017.2}DistanceUnitSimpleType" />
     *       <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
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
    public static class Altitude {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Unit")
        protected String unit;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
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
     *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *       <attribute name="Sign">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <enumeration value="SOUTH"/>
     *             <enumeration value="NORTH"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Minute" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *       <attribute name="Second" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
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
    public static class Latitude {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Sign")
        protected String sign;
        @XmlAttribute(name = "Minute")
        protected String minute;
        @XmlAttribute(name = "Second")
        protected String second;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the sign property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSign() {
            return sign;
        }

        /**
         * Sets the value of the sign property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSign(String value) {
            this.sign = value;
        }

        /**
         * Gets the value of the minute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinute() {
            return minute;
        }

        /**
         * Sets the value of the minute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinute(String value) {
            this.minute = value;
        }

        /**
         * Gets the value of the second property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecond() {
            return second;
        }

        /**
         * Sets the value of the second property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecond(String value) {
            this.second = value;
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
     *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *       <attribute name="Sign">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <enumeration value="EAST"/>
     *             <enumeration value="WEST"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Minute" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *       <attribute name="Second" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
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
    public static class Longitude {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Sign")
        protected String sign;
        @XmlAttribute(name = "Minute")
        protected String minute;
        @XmlAttribute(name = "Second")
        protected String second;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the sign property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSign() {
            return sign;
        }

        /**
         * Sets the value of the sign property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSign(String value) {
            this.sign = value;
        }

        /**
         * Gets the value of the minute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinute() {
            return minute;
        }

        /**
         * Sets the value of the minute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinute(String value) {
            this.minute = value;
        }

        /**
         * Gets the value of the second property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecond() {
            return second;
        }

        /**
         * Sets the value of the second property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecond(String value) {
            this.second = value;
        }

    }

}

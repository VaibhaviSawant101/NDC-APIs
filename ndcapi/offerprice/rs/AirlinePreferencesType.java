//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AIRLINE SUPPLIER Preferences.
 * 
 * <p>Java class for AirlinePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AirlinePreferencesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Airline" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
 *                   <element name="GeoIndicatorType" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *                   <element name="FlightHaulLength" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
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
@XmlType(name = "AirlinePreferencesType", propOrder = {
    "airline"
})
public class AirlinePreferencesType {

    @XmlElement(name = "Airline", required = true)
    protected List<AirlinePreferencesType.Airline> airline;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the airline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the airline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePreferencesType.Airline }
     * 
     * 
     * @return
     *     The value of the airline property.
     */
    public List<AirlinePreferencesType.Airline> getAirline() {
        if (airline == null) {
            airline = new ArrayList<>();
        }
        return this.airline;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
     *         <element name="GeoIndicatorType" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
     *         <element name="FlightHaulLength" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airlineID",
        "geoIndicatorType",
        "flightHaulLength"
    })
    public static class Airline {

        @XmlElement(name = "AirlineID", required = true)
        protected AirlineID airlineID;
        @XmlElement(name = "GeoIndicatorType")
        protected String geoIndicatorType;
        @XmlElement(name = "FlightHaulLength")
        protected String flightHaulLength;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Gets the value of the airlineID property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineID }
         *     
         */
        public AirlineID getAirlineID() {
            return airlineID;
        }

        /**
         * Sets the value of the airlineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineID }
         *     
         */
        public void setAirlineID(AirlineID value) {
            this.airlineID = value;
        }

        /**
         * Gets the value of the geoIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeoIndicatorType() {
            return geoIndicatorType;
        }

        /**
         * Sets the value of the geoIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeoIndicatorType(String value) {
            this.geoIndicatorType = value;
        }

        /**
         * Gets the value of the flightHaulLength property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightHaulLength() {
            return flightHaulLength;
        }

        /**
         * Sets the value of the flightHaulLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightHaulLength(String value) {
            this.flightHaulLength = value;
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
         * Gets the value of the preferencesLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesLevel() {
            return preferencesLevel;
        }

        /**
         * Sets the value of the preferencesLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesLevel(String value) {
            this.preferencesLevel = value;
        }

        /**
         * Gets the value of the preferencesContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesContext() {
            return preferencesContext;
        }

        /**
         * Sets the value of the preferencesContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesContext(String value) {
            this.preferencesContext = value;
        }

    }

}

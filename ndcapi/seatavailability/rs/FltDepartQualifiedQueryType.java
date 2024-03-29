//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for Flight Origin with Additional Location Preference and Date/Time Qualifiers.
 * 
 * <p>Java class for FltDepartQualifiedQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FltDepartQualifiedQueryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocationCode" maxOccurs="unbounded">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>AirportCitySimpleType">
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}RadiusAttrGroup"/>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Time" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" minOccurs="0"/>
 *         <element name="LeadPricing" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice maxOccurs="2">
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LeadDatePeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LeadTimePeriod"/>
 *                 </choice>
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
@XmlType(name = "FltDepartQualifiedQueryType", propOrder = {
    "locationCode",
    "date",
    "time",
    "leadPricing"
})
public class FltDepartQualifiedQueryType {

    @XmlElement(name = "LocationCode", required = true)
    protected List<FltDepartQualifiedQueryType.LocationCode> locationCode;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "LeadPricing")
    protected FltDepartQualifiedQueryType.LeadPricing leadPricing;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the locationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the locationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FltDepartQualifiedQueryType.LocationCode }
     * 
     * 
     * @return
     *     The value of the locationCode property.
     */
    public List<FltDepartQualifiedQueryType.LocationCode> getLocationCode() {
        if (locationCode == null) {
            locationCode = new ArrayList<>();
        }
        return this.locationCode;
    }

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
     * Gets the value of the leadPricing property.
     * 
     * @return
     *     possible object is
     *     {@link FltDepartQualifiedQueryType.LeadPricing }
     *     
     */
    public FltDepartQualifiedQueryType.LeadPricing getLeadPricing() {
        return leadPricing;
    }

    /**
     * Sets the value of the leadPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltDepartQualifiedQueryType.LeadPricing }
     *     
     */
    public void setLeadPricing(FltDepartQualifiedQueryType.LeadPricing value) {
        this.leadPricing = value;
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
     *       <choice maxOccurs="2">
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LeadDatePeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LeadTimePeriod"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "leadDatePeriodOrLeadTimePeriod"
    })
    public static class LeadPricing {

        @XmlElements({
            @XmlElement(name = "LeadDatePeriod", type = LeadDatePeriodType.class),
            @XmlElement(name = "LeadTimePeriod", type = LeadTimePeriodType.class)
        })
        protected List<Object> leadDatePeriodOrLeadTimePeriod;

        /**
         * Gets the value of the leadDatePeriodOrLeadTimePeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the leadDatePeriodOrLeadTimePeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeadDatePeriodOrLeadTimePeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LeadDatePeriodType }
         * {@link LeadTimePeriodType }
         * 
         * 
         * @return
         *     The value of the leadDatePeriodOrLeadTimePeriod property.
         */
        public List<Object> getLeadDatePeriodOrLeadTimePeriod() {
            if (leadDatePeriodOrLeadTimePeriod == null) {
                leadDatePeriodOrLeadTimePeriod = new ArrayList<>();
            }
            return this.leadDatePeriodOrLeadTimePeriod;
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
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>AirportCitySimpleType">
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}RadiusAttrGroup"/>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
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
    public static class LocationCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "Area")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger area;
        @XmlAttribute(name = "UOM")
        protected DistanceUnitListType uom;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Examples: JFK, NYC
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

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArea(BigInteger value) {
            this.area = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitListType }
         *     
         */
        public DistanceUnitListType getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitListType }
         *     
         */
        public void setUOM(DistanceUnitListType value) {
            this.uom = value;
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

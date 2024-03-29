//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type definition for Commonly Used Effective (start) and Expiration (end) Period.
 * 
 * <p>Java class for CorePeriodGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorePeriodGrpType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Date" type="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriodType" minOccurs="0"/>
 *         <element name="DateTime" type="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriodType" minOccurs="0"/>
 *         <element name="TimeStamp" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Effective" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 <attribute name="Expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "CorePeriodGrpType", propOrder = {
    "date",
    "dateTime",
    "timeStamp"
})
@XmlSeeAlso({
    airshopping.rs.PolicyType.Metadata.ValidPeriod.class
})
public class CorePeriodGrpType {

    @XmlElement(name = "Date")
    protected DatePeriodType date;
    @XmlElement(name = "DateTime")
    protected DateTimePeriodType dateTime;
    @XmlElement(name = "TimeStamp")
    protected CorePeriodGrpType.TimeStamp timeStamp;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setDate(DatePeriodType value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setDateTime(DateTimePeriodType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link CorePeriodGrpType.TimeStamp }
     *     
     */
    public CorePeriodGrpType.TimeStamp getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePeriodGrpType.TimeStamp }
     *     
     */
    public void setTimeStamp(CorePeriodGrpType.TimeStamp value) {
        this.timeStamp = value;
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
     *       <attribute name="Effective" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       <attribute name="Expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeStamp {

        @XmlAttribute(name = "Effective")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar effective;
        @XmlAttribute(name = "Expiration")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expiration;

        /**
         * Gets the value of the effective property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffective() {
            return effective;
        }

        /**
         * Sets the value of the effective property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffective(XMLGregorianCalendar value) {
            this.effective = value;
        }

        /**
         * Gets the value of the expiration property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpiration() {
            return expiration;
        }

        /**
         * Sets the value of the expiration property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpiration(XMLGregorianCalendar value) {
            this.expiration = value;
        }

    }

}

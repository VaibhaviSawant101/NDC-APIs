//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * COUPON EFFECTIVE PERIOD definition.
 * 
 * <p>Java class for CouponEffectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CouponEffectiveType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="EffectiveDatePeriod" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriodRepType">
 *                 <sequence>
 *                   <element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="EffectiveDateTimePeriod" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriodRepType">
 *                 <sequence>
 *                   <element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponEffectiveType", propOrder = {
    "effectiveDatePeriod",
    "effectiveDateTimePeriod"
})
public class CouponEffectiveType {

    @XmlElement(name = "EffectiveDatePeriod")
    protected CouponEffectiveType.EffectiveDatePeriod effectiveDatePeriod;
    @XmlElement(name = "EffectiveDateTimePeriod")
    protected CouponEffectiveType.EffectiveDateTimePeriod effectiveDateTimePeriod;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the effectiveDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType.EffectiveDatePeriod }
     *     
     */
    public CouponEffectiveType.EffectiveDatePeriod getEffectiveDatePeriod() {
        return effectiveDatePeriod;
    }

    /**
     * Sets the value of the effectiveDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType.EffectiveDatePeriod }
     *     
     */
    public void setEffectiveDatePeriod(CouponEffectiveType.EffectiveDatePeriod value) {
        this.effectiveDatePeriod = value;
    }

    /**
     * Gets the value of the effectiveDateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType.EffectiveDateTimePeriod }
     *     
     */
    public CouponEffectiveType.EffectiveDateTimePeriod getEffectiveDateTimePeriod() {
        return effectiveDateTimePeriod;
    }

    /**
     * Sets the value of the effectiveDateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType.EffectiveDateTimePeriod }
     *     
     */
    public void setEffectiveDateTimePeriod(CouponEffectiveType.EffectiveDateTimePeriod value) {
        this.effectiveDateTimePeriod = value;
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
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriodRepType">
     *       <sequence>
     *         <element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
        "duration"
    })
    public static class EffectiveDatePeriod
        extends DatePeriodRepType
    {

        @XmlElement(name = "Duration")
        protected Duration duration;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
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
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriodRepType">
     *       <sequence>
     *         <element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
        "duration"
    })
    public static class EffectiveDateTimePeriod
        extends DateTimePeriodRepType
    {

        @XmlElement(name = "Duration")
        protected Duration duration;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import java.util.ArrayList;
import java.util.List;
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
 * RULE definition.
 * 
 * <p>Java class for RuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RuleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RuleID" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType"/>
 *         <element name="Value">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AugmentationPoint" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Name" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" minOccurs="0"/>
 *         <element name="EffectivePeriod" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearPeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearMonthPeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimePeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}QuarterPeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MonthPeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DayPeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriod"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = {
    "ruleID",
    "value",
    "name",
    "owner",
    "effectivePeriod"
})
public class RuleType {

    @XmlElement(name = "RuleID", required = true)
    protected String ruleID;
    @XmlElement(name = "Value", required = true)
    protected RuleType.Value value;
    @XmlElement(name = "Name")
    protected RuleType.Name name;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "EffectivePeriod")
    protected RuleType.EffectivePeriod effectivePeriod;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link RuleType.Value }
     *     
     */
    public RuleType.Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType.Value }
     *     
     */
    public void setValue(RuleType.Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link RuleType.Name }
     *     
     */
    public RuleType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType.Name }
     *     
     */
    public void setName(RuleType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RuleType.EffectivePeriod }
     *     
     */
    public RuleType.EffectivePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType.EffectivePeriod }
     *     
     */
    public void setEffectivePeriod(RuleType.EffectivePeriod value) {
        this.effectivePeriod = value;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearPeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearMonthPeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimePeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}QuarterPeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MonthPeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DayPeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriod"/>
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
        "yearPeriod",
        "yearMonthPeriod",
        "timePeriod",
        "quarterPeriod",
        "monthPeriod",
        "dayPeriod",
        "dateTimePeriod",
        "datePeriod"
    })
    public static class EffectivePeriod {

        @XmlElement(name = "YearPeriod", required = true)
        protected YearPeriodRepType yearPeriod;
        @XmlElement(name = "YearMonthPeriod", required = true)
        protected YearMonthPeriodRepType yearMonthPeriod;
        @XmlElement(name = "TimePeriod", required = true)
        protected TimePeriodRepType timePeriod;
        @XmlElement(name = "QuarterPeriod", required = true)
        protected QuarterPeriodRepType quarterPeriod;
        @XmlElement(name = "MonthPeriod", required = true)
        protected MonthPeriodRepType monthPeriod;
        @XmlElement(name = "DayPeriod", required = true)
        protected DayPeriodRepType dayPeriod;
        @XmlElement(name = "DateTimePeriod", required = true)
        protected DateTimePeriodRepType dateTimePeriod;
        @XmlElement(name = "DatePeriod", required = true)
        protected DatePeriodRepType datePeriod;

        /**
         * Gets the value of the yearPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearPeriodRepType }
         *     
         */
        public YearPeriodRepType getYearPeriod() {
            return yearPeriod;
        }

        /**
         * Sets the value of the yearPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearPeriodRepType }
         *     
         */
        public void setYearPeriod(YearPeriodRepType value) {
            this.yearPeriod = value;
        }

        /**
         * Gets the value of the yearMonthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public YearMonthPeriodRepType getYearMonthPeriod() {
            return yearMonthPeriod;
        }

        /**
         * Sets the value of the yearMonthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public void setYearMonthPeriod(YearMonthPeriodRepType value) {
            this.yearMonthPeriod = value;
        }

        /**
         * Gets the value of the timePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link TimePeriodRepType }
         *     
         */
        public TimePeriodRepType getTimePeriod() {
            return timePeriod;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodRepType }
         *     
         */
        public void setTimePeriod(TimePeriodRepType value) {
            this.timePeriod = value;
        }

        /**
         * Gets the value of the quarterPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public QuarterPeriodRepType getQuarterPeriod() {
            return quarterPeriod;
        }

        /**
         * Sets the value of the quarterPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public void setQuarterPeriod(QuarterPeriodRepType value) {
            this.quarterPeriod = value;
        }

        /**
         * Gets the value of the monthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public MonthPeriodRepType getMonthPeriod() {
            return monthPeriod;
        }

        /**
         * Sets the value of the monthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public void setMonthPeriod(MonthPeriodRepType value) {
            this.monthPeriod = value;
        }

        /**
         * Gets the value of the dayPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DayPeriodRepType }
         *     
         */
        public DayPeriodRepType getDayPeriod() {
            return dayPeriod;
        }

        /**
         * Sets the value of the dayPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayPeriodRepType }
         *     
         */
        public void setDayPeriod(DayPeriodRepType value) {
            this.dayPeriod = value;
        }

        /**
         * Gets the value of the dateTimePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public DateTimePeriodRepType getDateTimePeriod() {
            return dateTimePeriod;
        }

        /**
         * Sets the value of the dateTimePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public void setDateTimePeriod(DateTimePeriodRepType value) {
            this.dateTimePeriod = value;
        }

        /**
         * Gets the value of the datePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DatePeriodRepType }
         *     
         */
        public DatePeriodRepType getDatePeriod() {
            return datePeriod;
        }

        /**
         * Sets the value of the datePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatePeriodRepType }
         *     
         */
        public void setDatePeriod(DatePeriodRepType value) {
            this.datePeriod = value;
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
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
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
    public static class Name {

        @XmlValue
        protected String value;

        /**
         * A data type for Proper Name size constraint.
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
     *         <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AugmentationPoint" minOccurs="0"/>
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
        "text",
        "augmentationPoint"
    })
    public static class Value {

        @XmlElement(name = "Text")
        protected String text;
        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Implementer-defined rule values.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
        }

    }

}

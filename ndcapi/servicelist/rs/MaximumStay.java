//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DayQuantity">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                 <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}AdvPurchaseSimpleType" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="DayOfWeek">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               <minInclusive value="1"/>
 *               <maxInclusive value="7"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
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
    "dayQuantity",
    "dayOfWeek"
})
@XmlRootElement(name = "MaximumStay")
public class MaximumStay {

    @XmlElement(name = "DayQuantity")
    protected MaximumStay.DayQuantity dayQuantity;
    @XmlElement(name = "DayOfWeek")
    protected Integer dayOfWeek;

    /**
     * Gets the value of the dayQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumStay.DayQuantity }
     *     
     */
    public MaximumStay.DayQuantity getDayQuantity() {
        return dayQuantity;
    }

    /**
     * Sets the value of the dayQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumStay.DayQuantity }
     *     
     */
    public void setDayQuantity(MaximumStay.DayQuantity value) {
        this.dayQuantity = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayOfWeek(Integer value) {
        this.dayOfWeek = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>positiveInteger">
     *       <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}AdvPurchaseSimpleType" />
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
    public static class DayQuantity {

        @XmlValue
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
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

}

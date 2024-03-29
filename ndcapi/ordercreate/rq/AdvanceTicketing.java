//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <sequence>
 *         <element name="AdvanceReservation">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>duration">
 *                 <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}AdvPurchaseSimpleType" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="AdvanceDeparture">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>duration">
 *                 <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}AdvPurchaseSimpleType" />
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
    "advanceReservation",
    "advanceDeparture"
})
@XmlRootElement(name = "AdvanceTicketing")
public class AdvanceTicketing {

    @XmlElement(name = "AdvanceReservation", required = true)
    protected AdvanceTicketing.AdvanceReservation advanceReservation;
    @XmlElement(name = "AdvanceDeparture", required = true)
    protected AdvanceTicketing.AdvanceDeparture advanceDeparture;

    /**
     * Gets the value of the advanceReservation property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceTicketing.AdvanceReservation }
     *     
     */
    public AdvanceTicketing.AdvanceReservation getAdvanceReservation() {
        return advanceReservation;
    }

    /**
     * Sets the value of the advanceReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceTicketing.AdvanceReservation }
     *     
     */
    public void setAdvanceReservation(AdvanceTicketing.AdvanceReservation value) {
        this.advanceReservation = value;
    }

    /**
     * Gets the value of the advanceDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceTicketing.AdvanceDeparture }
     *     
     */
    public AdvanceTicketing.AdvanceDeparture getAdvanceDeparture() {
        return advanceDeparture;
    }

    /**
     * Sets the value of the advanceDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceTicketing.AdvanceDeparture }
     *     
     */
    public void setAdvanceDeparture(AdvanceTicketing.AdvanceDeparture value) {
        this.advanceDeparture = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>duration">
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
    public static class AdvanceDeparture {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>duration">
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
    public static class AdvanceReservation {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
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

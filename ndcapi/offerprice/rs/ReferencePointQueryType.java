//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * REFERENCE POINT RADIUS QUERY representation.
 * 
 * <p>Java class for ReferencePointQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReferencePointQueryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReferencePoints" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ReferencePoint" maxOccurs="unbounded">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ContextSimpleType">
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Proximity" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ReferencePoint">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ContextSimpleType">
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ProximityAppSimpleType"/>
 *                   <element name="AreaValue">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *                           <attribute name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.2}DistanceUnitSimpleType" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePointQueryType", propOrder = {
    "referencePoints",
    "proximity"
})
public class ReferencePointQueryType {

    @XmlElement(name = "ReferencePoints")
    protected ReferencePointQueryType.ReferencePoints referencePoints;
    @XmlElement(name = "Proximity")
    protected List<ReferencePointQueryType.Proximity> proximity;
    @XmlAttribute(name = "PreferencesLevel")
    protected String preferencesLevel;
    @XmlAttribute(name = "PreferencesContext")
    protected String preferencesContext;

    /**
     * Gets the value of the referencePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointQueryType.ReferencePoints }
     *     
     */
    public ReferencePointQueryType.ReferencePoints getReferencePoints() {
        return referencePoints;
    }

    /**
     * Sets the value of the referencePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointQueryType.ReferencePoints }
     *     
     */
    public void setReferencePoints(ReferencePointQueryType.ReferencePoints value) {
        this.referencePoints = value;
    }

    /**
     * Gets the value of the proximity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the proximity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProximity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencePointQueryType.Proximity }
     * 
     * 
     * @return
     *     The value of the proximity property.
     */
    public List<ReferencePointQueryType.Proximity> getProximity() {
        if (proximity == null) {
            proximity = new ArrayList<>();
        }
        return this.proximity;
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
     *         <element name="ReferencePoint">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ContextSimpleType">
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *         <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ProximityAppSimpleType"/>
     *         <element name="AreaValue">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
     *                 <attribute name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.2}DistanceUnitSimpleType" />
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
        "referencePoint",
        "application",
        "areaValue"
    })
    public static class Proximity {

        @XmlElement(name = "ReferencePoint", required = true)
        protected ReferencePointQueryType.Proximity.ReferencePoint referencePoint;
        @XmlElement(name = "Application", required = true)
        protected String application;
        @XmlElement(name = "AreaValue", required = true)
        protected ReferencePointQueryType.Proximity.AreaValue areaValue;

        /**
         * Gets the value of the referencePoint property.
         * 
         * @return
         *     possible object is
         *     {@link ReferencePointQueryType.Proximity.ReferencePoint }
         *     
         */
        public ReferencePointQueryType.Proximity.ReferencePoint getReferencePoint() {
            return referencePoint;
        }

        /**
         * Sets the value of the referencePoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferencePointQueryType.Proximity.ReferencePoint }
         *     
         */
        public void setReferencePoint(ReferencePointQueryType.Proximity.ReferencePoint value) {
            this.referencePoint = value;
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
         * Gets the value of the areaValue property.
         * 
         * @return
         *     possible object is
         *     {@link ReferencePointQueryType.Proximity.AreaValue }
         *     
         */
        public ReferencePointQueryType.Proximity.AreaValue getAreaValue() {
            return areaValue;
        }

        /**
         * Sets the value of the areaValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferencePointQueryType.Proximity.AreaValue }
         *     
         */
        public void setAreaValue(ReferencePointQueryType.Proximity.AreaValue value) {
            this.areaValue = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
         *       <attribute name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.2}DistanceUnitSimpleType" />
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
        public static class AreaValue {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "UOM")
            protected String uom;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the uom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUOM() {
                return uom;
            }

            /**
             * Sets the value of the uom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUOM(String value) {
                this.uom = value;
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
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ContextSimpleType">
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
        public static class ReferencePoint {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Examples: Provider, tablename.field
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
     *         <element name="ReferencePoint" maxOccurs="unbounded">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ContextSimpleType">
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
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
        "referencePoint"
    })
    public static class ReferencePoints {

        @XmlElement(name = "ReferencePoint", required = true)
        protected List<ReferencePointQueryType.ReferencePoints.ReferencePoint> referencePoint;

        /**
         * Gets the value of the referencePoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the referencePoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferencePoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferencePointQueryType.ReferencePoints.ReferencePoint }
         * 
         * 
         * @return
         *     The value of the referencePoint property.
         */
        public List<ReferencePointQueryType.ReferencePoints.ReferencePoint> getReferencePoint() {
            if (referencePoint == null) {
                referencePoint = new ArrayList<>();
            }
            return this.referencePoint;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ContextSimpleType">
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
        public static class ReferencePoint {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Examples: Provider, tablename.field
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

}

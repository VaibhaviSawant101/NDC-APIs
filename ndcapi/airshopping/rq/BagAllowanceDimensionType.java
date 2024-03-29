//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for Baggage Allowance by Dimensions.
 * 
 * <p>Java class for BagAllowanceDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BagAllowanceDimensionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicableParty" type="{http://www.iata.org/IATA/EDIST/2017.2}BagAppSimpleType" minOccurs="0"/>
 *         <element name="DimensionUOM" type="{http://www.iata.org/IATA/EDIST/2017.2}SizeUnitSimpleType"/>
 *         <choice>
 *           <sequence>
 *             <element name="MaxLinear">
 *               <complexType>
 *                 <simpleContent>
 *                   <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                     <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                   </extension>
 *                 </simpleContent>
 *               </complexType>
 *             </element>
 *             <element name="MinLinear">
 *               <complexType>
 *                 <simpleContent>
 *                   <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                     <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                   </extension>
 *                 </simpleContent>
 *               </complexType>
 *             </element>
 *           </sequence>
 *           <element name="Dimensions" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDimensionSimpleType"/>
 *                     <element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                     <element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   </sequence>
 *                   <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="ApplicableBag" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *         <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
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
@XmlType(name = "BagAllowanceDimensionType", propOrder = {
    "applicableParty",
    "dimensionUOM",
    "maxLinear",
    "minLinear",
    "dimensions",
    "applicableBag",
    "descriptions"
})
public class BagAllowanceDimensionType {

    @XmlElement(name = "ApplicableParty")
    protected String applicableParty;
    @XmlElement(name = "DimensionUOM", required = true)
    @XmlSchemaType(name = "string")
    protected SizeUnitSimpleType dimensionUOM;
    @XmlElement(name = "MaxLinear")
    protected BagAllowanceDimensionType.MaxLinear maxLinear;
    @XmlElement(name = "MinLinear")
    protected BagAllowanceDimensionType.MinLinear minLinear;
    @XmlElement(name = "Dimensions")
    protected List<BagAllowanceDimensionType.Dimensions> dimensions;
    @XmlElement(name = "ApplicableBag")
    protected String applicableBag;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the applicableParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableParty() {
        return applicableParty;
    }

    /**
     * Sets the value of the applicableParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableParty(String value) {
        this.applicableParty = value;
    }

    /**
     * Gets the value of the dimensionUOM property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public SizeUnitSimpleType getDimensionUOM() {
        return dimensionUOM;
    }

    /**
     * Sets the value of the dimensionUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public void setDimensionUOM(SizeUnitSimpleType value) {
        this.dimensionUOM = value;
    }

    /**
     * Gets the value of the maxLinear property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceDimensionType.MaxLinear }
     *     
     */
    public BagAllowanceDimensionType.MaxLinear getMaxLinear() {
        return maxLinear;
    }

    /**
     * Sets the value of the maxLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceDimensionType.MaxLinear }
     *     
     */
    public void setMaxLinear(BagAllowanceDimensionType.MaxLinear value) {
        this.maxLinear = value;
    }

    /**
     * Gets the value of the minLinear property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceDimensionType.MinLinear }
     *     
     */
    public BagAllowanceDimensionType.MinLinear getMinLinear() {
        return minLinear;
    }

    /**
     * Sets the value of the minLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceDimensionType.MinLinear }
     *     
     */
    public void setMinLinear(BagAllowanceDimensionType.MinLinear value) {
        this.minLinear = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowanceDimensionType.Dimensions }
     * 
     * 
     * @return
     *     The value of the dimensions property.
     */
    public List<BagAllowanceDimensionType.Dimensions> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the applicableBag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBag() {
        return applicableBag;
    }

    /**
     * Sets the value of the applicableBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBag(String value) {
        this.applicableBag = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
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
     *         <element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDimensionSimpleType"/>
     *         <element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         <element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "category",
        "maxValue",
        "minValue"
    })
    public static class Dimensions {

        @XmlElement(name = "Category", required = true)
        protected String category;
        @XmlElement(name = "MaxValue", required = true)
        protected BigDecimal maxValue;
        @XmlElement(name = "MinValue")
        protected Object minValue;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the maxValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxValue() {
            return maxValue;
        }

        /**
         * Sets the value of the maxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxValue(BigDecimal value) {
            this.maxValue = value;
        }

        /**
         * Gets the value of the minValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMinValue() {
            return minValue;
        }

        /**
         * Sets the value of the minValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMinValue(Object value) {
            this.minValue = value;
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
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
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
    public static class MaxLinear {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
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
    public static class MinLinear {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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

    }

}

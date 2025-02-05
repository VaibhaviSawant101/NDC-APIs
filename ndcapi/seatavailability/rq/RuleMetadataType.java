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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for RULE Metadata.
 * 
 * <p>Java class for RuleMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RuleMetadataType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetadataObjectBaseType">
 *       <sequence>
 *         <element name="RuleID">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *         <element name="Status" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>RuleStatusSimpleType">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Values" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Value" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}NodePath" maxOccurs="unbounded" minOccurs="0"/>
 *                             <element name="Instruction">
 *                               <complexType>
 *                                 <simpleContent>
 *                                   <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                                   </extension>
 *                                 </simpleContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Remarks" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleMetadataType", propOrder = {
    "ruleID",
    "name",
    "status",
    "values",
    "remarks"
})
public class RuleMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "RuleID", required = true)
    protected RuleMetadataType.RuleID ruleID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Status")
    protected RuleMetadataType.Status status;
    @XmlElement(name = "Values")
    protected RuleMetadataType.Values values;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link RuleMetadataType.RuleID }
     *     
     */
    public RuleMetadataType.RuleID getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleMetadataType.RuleID }
     *     
     */
    public void setRuleID(RuleMetadataType.RuleID value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RuleMetadataType.Status }
     *     
     */
    public RuleMetadataType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleMetadataType.Status }
     *     
     */
    public void setStatus(RuleMetadataType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link RuleMetadataType.Values }
     *     
     */
    public RuleMetadataType.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleMetadataType.Values }
     *     
     */
    public void setValues(RuleMetadataType.Values value) {
        this.values = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
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
    public static class RuleID {

        @XmlValue
        protected String value;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>RuleStatusSimpleType">
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
    public static class Status {

        @XmlValue
        protected String value;

        /**
         * A data type for Language Code Application.
         * 
         * Examples: Display, Requested, Spoken, Written, Other
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
     *         <element name="Value" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}NodePath" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="Instruction">
     *                     <complexType>
     *                       <simpleContent>
     *                         <extension base="<http://www.w3.org/2001/XMLSchema>string">
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
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Values {

        @XmlElement(name = "Value", required = true)
        protected List<RuleMetadataType.Values.Value> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RuleMetadataType.Values.Value }
         * 
         * 
         * @return
         *     The value of the value property.
         */
        public List<RuleMetadataType.Values.Value> getValue() {
            if (value == null) {
                value = new ArrayList<>();
            }
            return this.value;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}NodePath" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="Instruction">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
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
            "nodePath",
            "instruction"
        })
        public static class Value {

            @XmlElement(name = "NodePath")
            protected List<NodePathType> nodePath;
            @XmlElement(name = "Instruction", required = true)
            protected RuleMetadataType.Values.Value.Instruction instruction;

            /**
             * Gets the value of the nodePath property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the nodePath property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNodePath().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NodePathType }
             * 
             * 
             * @return
             *     The value of the nodePath property.
             */
            public List<NodePathType> getNodePath() {
                if (nodePath == null) {
                    nodePath = new ArrayList<>();
                }
                return this.nodePath;
            }

            /**
             * Gets the value of the instruction property.
             * 
             * @return
             *     possible object is
             *     {@link RuleMetadataType.Values.Value.Instruction }
             *     
             */
            public RuleMetadataType.Values.Value.Instruction getInstruction() {
                return instruction;
            }

            /**
             * Sets the value of the instruction property.
             * 
             * @param value
             *     allowed object is
             *     {@link RuleMetadataType.Values.Value.Instruction }
             *     
             */
            public void setInstruction(RuleMetadataType.Values.Value.Instruction value) {
                this.instruction = value;
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
            public static class Instruction {

                @XmlValue
                protected String value;

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

            }

        }

    }

}

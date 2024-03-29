//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * COUPON BOOKING/ SERVICING AGENT definition.
 * 
 * <p>Java class for CouponAgentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CouponAgentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType"/>
 *         <element name="ID">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueStringID_SimpleType">
 *                 <attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
 *                 <attribute name="ObjectMetaReferences" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
 *                 <attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
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
@XmlType(name = "CouponAgentType", propOrder = {
    "type",
    "id"
})
@XmlSeeAlso({
    AgentID.class
})
public class CouponAgentType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "ID", required = true)
    protected CouponAgentType.ID id;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CouponAgentType.ID }
     *     
     */
    public CouponAgentType.ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponAgentType.ID }
     *     
     */
    public void setID(CouponAgentType.ID value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueStringID_SimpleType">
     *       <attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
     *       <attribute name="ObjectMetaReferences" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
     *       <attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
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
    public static class ID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlIDREF
        protected List<Object> objectMetaReferences;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * A data type for a Unique String Identifier constraint.
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

        /**
         * Gets the value of the objectMetaReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the objectMetaReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObjectMetaReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         * @return
         *     The value of the objectMetaReferences property.
         */
        public List<Object> getObjectMetaReferences() {
            if (objectMetaReferences == null) {
                objectMetaReferences = new ArrayList<>();
            }
            return this.objectMetaReferences;
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

    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ENCODING: Note, Attributes on the Services Record S5 that can be used as filter criteria for a service.
 * 
 * <p>Java class for AttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AttributesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Group">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
 *                   <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SubGroup" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
 *                   <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Desc1" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
 *                   <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Desc2" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
 *                   <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
 *                 </sequence>
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
@XmlType(name = "AttributesType", propOrder = {
    "group",
    "subGroup",
    "desc1",
    "desc2"
})
public class AttributesType {

    @XmlElement(name = "Group", required = true)
    protected AttributesType.Group group;
    @XmlElement(name = "SubGroup")
    protected AttributesType.SubGroup subGroup;
    @XmlElement(name = "Desc1")
    protected AttributesType.Desc1 desc1;
    @XmlElement(name = "Desc2")
    protected AttributesType.Desc2 desc2;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType.Group }
     *     
     */
    public AttributesType.Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType.Group }
     *     
     */
    public void setGroup(AttributesType.Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the subGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType.SubGroup }
     *     
     */
    public AttributesType.SubGroup getSubGroup() {
        return subGroup;
    }

    /**
     * Sets the value of the subGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType.SubGroup }
     *     
     */
    public void setSubGroup(AttributesType.SubGroup value) {
        this.subGroup = value;
    }

    /**
     * Gets the value of the desc1 property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType.Desc1 }
     *     
     */
    public AttributesType.Desc1 getDesc1() {
        return desc1;
    }

    /**
     * Sets the value of the desc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType.Desc1 }
     *     
     */
    public void setDesc1(AttributesType.Desc1 value) {
        this.desc1 = value;
    }

    /**
     * Gets the value of the desc2 property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType.Desc2 }
     *     
     */
    public AttributesType.Desc2 getDesc2() {
        return desc2;
    }

    /**
     * Sets the value of the desc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType.Desc2 }
     *     
     */
    public void setDesc2(AttributesType.Desc2 value) {
        this.desc2 = value;
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
     *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
     *         <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
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
        "code",
        "text"
    })
    public static class Desc1 {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "Text")
        protected String text;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

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
     *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
     *         <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
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
        "code",
        "text"
    })
    public static class Desc2 {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "Text")
        protected String text;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

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
     *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
     *         <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
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
        "code",
        "text"
    })
    public static class Group {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "Text")
        protected String text;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

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
     *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
     *         <element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
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
        "code",
        "text"
    })
    public static class SubGroup {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "Text")
        protected String text;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

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

    }

}

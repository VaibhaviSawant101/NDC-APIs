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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * CONTENT SOURCE data list definition.
 * 
 * <p>Java class for ListOfContentSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ListOfContentSourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContentSource" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NodePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <choice>
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
 *                     <element name="OtherID">
 *                       <complexType>
 *                         <simpleContent>
 *                           <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                             <attribute name="name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
 *                           </extension>
 *                         </simpleContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
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
@XmlType(name = "ListOfContentSourceType", propOrder = {
    "contentSource"
})
public class ListOfContentSourceType {

    @XmlElement(name = "ContentSource", required = true)
    protected List<ListOfContentSourceType.ContentSource> contentSource;

    /**
     * Gets the value of the contentSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the contentSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfContentSourceType.ContentSource }
     * 
     * 
     * @return
     *     The value of the contentSource property.
     */
    public List<ListOfContentSourceType.ContentSource> getContentSource() {
        if (contentSource == null) {
            contentSource = new ArrayList<>();
        }
        return this.contentSource;
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
     *         <element name="NodePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <choice>
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
     *           <element name="OtherID">
     *             <complexType>
     *               <simpleContent>
     *                 <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *                   <attribute name="name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
     *                 </extension>
     *               </simpleContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
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
        "airlineID",
        "otherID"
    })
    public static class ContentSource {

        @XmlElement(name = "NodePath", required = true)
        protected String nodePath;
        @XmlElement(name = "AirlineID")
        protected AirlineID airlineID;
        @XmlElement(name = "OtherID")
        protected ListOfContentSourceType.ContentSource.OtherID otherID;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the nodePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodePath() {
            return nodePath;
        }

        /**
         * Sets the value of the nodePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodePath(String value) {
            this.nodePath = value;
        }

        /**
         * Gets the value of the airlineID property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineID }
         *     
         */
        public AirlineID getAirlineID() {
            return airlineID;
        }

        /**
         * Sets the value of the airlineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineID }
         *     
         */
        public void setAirlineID(AirlineID value) {
            this.airlineID = value;
        }

        /**
         * Gets the value of the otherID property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfContentSourceType.ContentSource.OtherID }
         *     
         */
        public ListOfContentSourceType.ContentSource.OtherID getOtherID() {
            return otherID;
        }

        /**
         * Sets the value of the otherID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfContentSourceType.ContentSource.OtherID }
         *     
         */
        public void setOtherID(ListOfContentSourceType.ContentSource.OtherID value) {
            this.otherID = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
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
         *       <attribute name="name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
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
        public static class OtherID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;

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

}

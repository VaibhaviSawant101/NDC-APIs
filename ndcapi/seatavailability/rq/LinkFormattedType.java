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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type definition for URI with Formatting.
 * 
 * <p>Java class for LinkFormattedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LinkFormattedType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreBaseType">
 *       <sequence>
 *         <element name="Link" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreBaseType">
 *                 <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *                 <attribute name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" />
 *                 <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkFormattedType", propOrder = {
    "link"
})
public class LinkFormattedType
    extends CoreBaseType
{

    @XmlElement(name = "Link", required = true)
    protected List<LinkFormattedType.Link> link;

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkFormattedType.Link }
     * 
     * 
     * @return
     *     The value of the link property.
     */
    public List<LinkFormattedType.Link> getLink() {
        if (link == null) {
            link = new ArrayList<>();
        }
        return this.link;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreBaseType">
     *       <attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *       <attribute name="Text" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" />
     *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Link
        extends CoreBaseType
    {

        @XmlAttribute(name = "Context")
        protected String context;
        @XmlAttribute(name = "Text")
        protected String text;
        @XmlAttribute(name = "Value", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String value;

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

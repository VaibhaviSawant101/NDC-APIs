//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * DISCLOSURE data list definition.
 * 
 * <p>Java class for ListOfDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ListOfDisclosureType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Disclosures" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionType" maxOccurs="unbounded"/>
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
@XmlType(name = "ListOfDisclosureType", propOrder = {
    "disclosures"
})
public class ListOfDisclosureType {

    @XmlElement(name = "Disclosures", required = true)
    protected List<ListOfDisclosureType.Disclosures> disclosures;

    /**
     * Gets the value of the disclosures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the disclosures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfDisclosureType.Disclosures }
     * 
     * 
     * @return
     *     The value of the disclosures property.
     */
    public List<ListOfDisclosureType.Disclosures> getDisclosures() {
        if (disclosures == null) {
            disclosures = new ArrayList<>();
        }
        return this.disclosures;
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
     *         <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionType" maxOccurs="unbounded"/>
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
        "description"
    })
    public static class Disclosures {

        @XmlElement(name = "Description", required = true)
        protected List<DescriptionType> description;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DescriptionType }
         * 
         * 
         * @return
         *     The value of the description property.
         */
        public List<DescriptionType> getDescription() {
            if (description == null) {
                description = new ArrayList<>();
            }
            return this.description;
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

    }

}

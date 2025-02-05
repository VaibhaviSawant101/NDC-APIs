//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Shopping Request Qualifiers.
 * 
 * <p>Java class for QualifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QualifiersType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qualifier" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SeatQualifier" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceQualifier" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
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
@XmlType(name = "QualifiersType", propOrder = {
    "qualifier"
})
public class QualifiersType {

    @XmlElement(name = "Qualifier", required = true)
    protected List<QualifiersType.Qualifier> qualifier;

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiersType.Qualifier }
     * 
     * 
     * @return
     *     The value of the qualifier property.
     */
    public List<QualifiersType.Qualifier> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<>();
        }
        return this.qualifier;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SeatQualifier" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceQualifier" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations" minOccurs="0"/>
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
        "seatQualifier",
        "serviceQualifier",
        "associations"
    })
    public static class Qualifier {

        @XmlElement(name = "SeatQualifier")
        protected SeatQualifier seatQualifier;
        @XmlElement(name = "ServiceQualifier")
        protected ServiceQualifierPriceType serviceQualifier;
        @XmlElement(name = "Associations")
        protected OrderItemAssociationType associations;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the seatQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link SeatQualifier }
         *     
         */
        public SeatQualifier getSeatQualifier() {
            return seatQualifier;
        }

        /**
         * Sets the value of the seatQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatQualifier }
         *     
         */
        public void setSeatQualifier(SeatQualifier value) {
            this.seatQualifier = value;
        }

        /**
         * Gets the value of the serviceQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceQualifierPriceType }
         *     
         */
        public ServiceQualifierPriceType getServiceQualifier() {
            return serviceQualifier;
        }

        /**
         * Sets the value of the serviceQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceQualifierPriceType }
         *     
         */
        public void setServiceQualifier(ServiceQualifierPriceType value) {
            this.serviceQualifier = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public OrderItemAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public void setAssociations(OrderItemAssociationType value) {
            this.associations = value;
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

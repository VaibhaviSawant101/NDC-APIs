//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Other, Implementer-specified, Offer Associations.
 * 
 * <p>Java class for OtherOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherOfferAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OtherAssociation" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}OtherAssocListType"/>
 *                   <element name="ReferenceValue" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
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
@XmlType(name = "OtherOfferAssocType", propOrder = {
    "otherAssociation"
})
public class OtherOfferAssocType {

    @XmlElement(name = "OtherAssociation", required = true)
    protected List<OtherOfferAssocType.OtherAssociation> otherAssociation;

    /**
     * Gets the value of the otherAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the otherAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherOfferAssocType.OtherAssociation }
     * 
     * 
     * @return
     *     The value of the otherAssociation property.
     */
    public List<OtherOfferAssocType.OtherAssociation> getOtherAssociation() {
        if (otherAssociation == null) {
            otherAssociation = new ArrayList<>();
        }
        return this.otherAssociation;
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
     *         <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}OtherAssocListType"/>
     *         <element name="ReferenceValue" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
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
        "type",
        "referenceValue"
    })
    public static class OtherAssociation {

        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "ReferenceValue", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object referenceValue;

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
         * Gets the value of the referenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getReferenceValue() {
            return referenceValue;
        }

        /**
         * Sets the value of the referenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setReferenceValue(Object value) {
            this.referenceValue = value;
        }

    }

}

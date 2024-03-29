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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Associated Offer Detail definition.
 * 
 * <p>Java class for OfferDetailInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfferDetailInfoAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferInstructionReferences" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferPenaltyReferences" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferTermReferences" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDetailInfoAssocType", propOrder = {
    "offerInstructionReferences",
    "offerPenaltyReferences",
    "offerTermReferences"
})
public class OfferDetailInfoAssocType {

    @XmlElement(name = "OfferInstructionReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object offerInstructionReferences;
    @XmlElement(name = "OfferPenaltyReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object offerPenaltyReferences;
    @XmlList
    @XmlElement(name = "OfferTermReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> offerTermReferences;

    /**
     * Gets the value of the offerInstructionReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferInstructionReferences() {
        return offerInstructionReferences;
    }

    /**
     * Sets the value of the offerInstructionReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferInstructionReferences(Object value) {
        this.offerInstructionReferences = value;
    }

    /**
     * Gets the value of the offerPenaltyReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferPenaltyReferences() {
        return offerPenaltyReferences;
    }

    /**
     * Sets the value of the offerPenaltyReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferPenaltyReferences(Object value) {
        this.offerPenaltyReferences = value;
    }

    /**
     * Gets the value of the offerTermReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offerTermReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTermReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the offerTermReferences property.
     */
    public List<Object> getOfferTermReferences() {
        if (offerTermReferences == null) {
            offerTermReferences = new ArrayList<>();
        }
        return this.offerTermReferences;
    }

}

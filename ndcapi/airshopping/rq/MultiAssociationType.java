//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Shopping and Order Multiple Association definition.
 * 
 * <p>Java class for MultiAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MultiAssociationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferAssociations"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderAssociations"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiAssociationType", propOrder = {
    "offerAssociations",
    "orderAssociations"
})
public class MultiAssociationType {

    @XmlElement(name = "OfferAssociations")
    protected OfferAssociations offerAssociations;
    @XmlElement(name = "OrderAssociations")
    protected OrderItemAssociationType orderAssociations;

    /**
     * Gets the value of the offerAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociations }
     *     
     */
    public OfferAssociations getOfferAssociations() {
        return offerAssociations;
    }

    /**
     * Sets the value of the offerAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociations }
     *     
     */
    public void setOfferAssociations(OfferAssociations value) {
        this.offerAssociations = value;
    }

    /**
     * Gets the value of the orderAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getOrderAssociations() {
        return orderAssociations;
    }

    /**
     * Sets the value of the orderAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setOrderAssociations(OrderItemAssociationType value) {
        this.orderAssociations = value;
    }

}
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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Core Priced Flight Offer definition.
 * 
 * <p>Java class for PricedFlightOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PricedFlightOfferCoreType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferPrice">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OfferPriceLeadType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareDetail" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *       <attribute name="LeadPricedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LeadPricingIncInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferCoreType", propOrder = {
    "offerPrice",
    "fareDetail"
})
@XmlSeeAlso({
    AltPricedFlightOfferType.class
})
public class PricedFlightOfferCoreType {

    @XmlElement(name = "OfferPrice", required = true)
    protected PricedFlightOfferCoreType.OfferPrice offerPrice;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlAttribute(name = "LeadPricedInd")
    protected Boolean leadPricedInd;
    @XmlAttribute(name = "LeadPricingIncInd")
    protected Boolean leadPricingIncInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOfferCoreType.OfferPrice }
     *     
     */
    public PricedFlightOfferCoreType.OfferPrice getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOfferCoreType.OfferPrice }
     *     
     */
    public void setOfferPrice(PricedFlightOfferCoreType.OfferPrice value) {
        this.offerPrice = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the leadPricedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricedInd() {
        return leadPricedInd;
    }

    /**
     * Sets the value of the leadPricedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricedInd(Boolean value) {
        this.leadPricedInd = value;
    }

    /**
     * Gets the value of the leadPricingIncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricingIncInd() {
        return leadPricingIncInd;
    }

    /**
     * Sets the value of the leadPricingIncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricingIncInd(Boolean value) {
        this.leadPricingIncInd = value;
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
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OfferPriceLeadType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferPrice
        extends OfferPriceLeadType
    {


    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Priced Flight Offer Association definition.
 * 
 * <p>Java class for PricedFlightOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PricedFlightOfferAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedPassenger" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ApplicableFlight" minOccurs="0"/>
 *         <element name="PriceClass" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceClassReference"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferDetailAssociation" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}IncludedService" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedService" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherAssociation" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferAssocType", propOrder = {
    "associatedPassenger",
    "applicableFlight",
    "priceClass",
    "offerDetailAssociation",
    "includedService",
    "associatedService",
    "otherAssociation"
})
public class PricedFlightOfferAssocType {

    @XmlElement(name = "AssociatedPassenger")
    protected PassengerInfoAssocType associatedPassenger;
    @XmlElement(name = "ApplicableFlight")
    protected ApplicableFlight applicableFlight;
    @XmlElement(name = "PriceClass")
    protected PricedFlightOfferAssocType.PriceClass priceClass;
    @XmlElement(name = "OfferDetailAssociation")
    protected OfferDetailInfoAssocType offerDetailAssociation;
    @XmlElement(name = "IncludedService")
    protected ServiceInfoAssocType includedService;
    @XmlElement(name = "AssociatedService")
    protected ServiceInfoAssocType associatedService;
    @XmlElement(name = "OtherAssociation")
    protected OtherOfferAssocType otherAssociation;

    /**
     * Gets the value of the associatedPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public PassengerInfoAssocType getAssociatedPassenger() {
        return associatedPassenger;
    }

    /**
     * Sets the value of the associatedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public void setAssociatedPassenger(PassengerInfoAssocType value) {
        this.associatedPassenger = value;
    }

    /**
     * Gets the value of the applicableFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableFlight }
     *     
     */
    public ApplicableFlight getApplicableFlight() {
        return applicableFlight;
    }

    /**
     * Sets the value of the applicableFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableFlight }
     *     
     */
    public void setApplicableFlight(ApplicableFlight value) {
        this.applicableFlight = value;
    }

    /**
     * Gets the value of the priceClass property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOfferAssocType.PriceClass }
     *     
     */
    public PricedFlightOfferAssocType.PriceClass getPriceClass() {
        return priceClass;
    }

    /**
     * Sets the value of the priceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOfferAssocType.PriceClass }
     *     
     */
    public void setPriceClass(PricedFlightOfferAssocType.PriceClass value) {
        this.priceClass = value;
    }

    /**
     * Gets the value of the offerDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetailAssociation() {
        return offerDetailAssociation;
    }

    /**
     * Sets the value of the offerDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetailAssociation(OfferDetailInfoAssocType value) {
        this.offerDetailAssociation = value;
    }

    /**
     * Included Optional Service(s).
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getIncludedService() {
        return includedService;
    }

    /**
     * Sets the value of the includedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setIncludedService(ServiceInfoAssocType value) {
        this.includedService = value;
    }

    /**
     * Gets the value of the associatedService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getAssociatedService() {
        return associatedService;
    }

    /**
     * Sets the value of the associatedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setAssociatedService(ServiceInfoAssocType value) {
        this.associatedService = value;
    }

    /**
     * Gets the value of the otherAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public OtherOfferAssocType getOtherAssociation() {
        return otherAssociation;
    }

    /**
     * Sets the value of the otherAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public void setOtherAssociation(OtherOfferAssocType value) {
        this.otherAssociation = value;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceClassReference"/>
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
        "priceClassReference"
    })
    public static class PriceClass {

        @XmlElement(name = "PriceClassReference", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object priceClassReference;

        /**
         * Gets the value of the priceClassReference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPriceClassReference() {
            return priceClassReference;
        }

        /**
         * Sets the value of the priceClassReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPriceClassReference(Object value) {
            this.priceClassReference = value;
        }

    }

}

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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Base type for NDC Metadata Representation.
 * 
 * Notes: Within NDC, metadata is defined as data about data. This may include information such as the security of a piece of data or the source of the data. These pieces of metadata may be composed into a metadata type. The types of data to which metadata may be applied may be constrained.
 * 
 * <p>Java class for MetadataObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MetadataObjectBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AugmentationPoint" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
 *       <attribute name="MetadataKey" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataObjectBaseType", propOrder = {
    "augmentationPoint"
})
@XmlSeeAlso({
    AddressMetadataType.class,
    AircraftMetadataType.class,
    AirportMetadataType.class,
    CityMetadataType.class,
    CodesetMetadataType.class,
    ContactMetadataType.class,
    ContentMetadataType.class,
    CountryMetadataType.class,
    DescriptionMetadataType.class,
    EquivalentIDMetadataType.class,
    LanguageMetadataType.class,
    MediaMetadataType.class,
    PaymentFormMetadataType.class,
    PriceMetadataType.class,
    RuleMetadataType.class,
    StateProvMetadataType.class,
    ZoneMetadataType.class,
    BaggageCheckedMetadataType.class,
    BaggageCarryOnMetadataType.class,
    BaggageDisclosureMetadataType.class,
    BaggageDetailMetadataType.class,
    BaggageQueryMetadataType.class,
    ItineraryMetadataType.class,
    DirectionsMetadataType.class,
    DisclosureMetadataType.class,
    OfferItemMetadataType.class,
    OfferInstructionMetadataType.class,
    PenaltyMetadataType.class,
    OfferTermsMetadataType.class,
    SeatMetadataType.class,
    SeatMapMetadataType.class,
    PassengerMetadataType.class,
    FlightMetadataType.class,
    CurrencyMetadataType.class
})
public class MetadataObjectBaseType {

    @XmlElement(name = "AugmentationPoint")
    protected AugPointInfoType augmentationPoint;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "MetadataKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String metadataKey;

    /**
     * Augmentation Point for this Metadata Structure.
     * 
     * @return
     *     possible object is
     *     {@link AugPointInfoType }
     *     
     */
    public AugPointInfoType getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointInfoType }
     *     
     */
    public void setAugmentationPoint(AugPointInfoType value) {
        this.augmentationPoint = value;
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
     * Gets the value of the metadataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataKey() {
        return metadataKey;
    }

    /**
     * Sets the value of the metadataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataKey(String value) {
        this.metadataKey = value;
    }

}
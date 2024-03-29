//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherOfferAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OtherOfferAssocSimpleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AircraftEquipment"/>
 *     <enumeration value="BaggageDisclosure"/>
 *     <enumeration value="CarryOnAllowance"/>
 *     <enumeration value="CheckedBagAllowance"/>
 *     <enumeration value="MediaGroup"/>
 *     <enumeration value="MediaItem"/>
 *     <enumeration value="OfferDisclosure"/>
 *     <enumeration value="OfferInstructions"/>
 *     <enumeration value="OfferTerms"/>
 *     <enumeration value="Penalty"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OtherOfferAssocSimpleType")
@XmlEnum
public enum OtherOfferAssocSimpleType {

    @XmlEnumValue("AircraftEquipment")
    AIRCRAFT_EQUIPMENT("AircraftEquipment"),
    @XmlEnumValue("BaggageDisclosure")
    BAGGAGE_DISCLOSURE("BaggageDisclosure"),
    @XmlEnumValue("CarryOnAllowance")
    CARRY_ON_ALLOWANCE("CarryOnAllowance"),
    @XmlEnumValue("CheckedBagAllowance")
    CHECKED_BAG_ALLOWANCE("CheckedBagAllowance"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("OfferDisclosure")
    OFFER_DISCLOSURE("OfferDisclosure"),
    @XmlEnumValue("OfferInstructions")
    OFFER_INSTRUCTIONS("OfferInstructions"),
    @XmlEnumValue("OfferTerms")
    OFFER_TERMS("OfferTerms"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    OtherOfferAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherOfferAssocSimpleType fromValue(String v) {
        for (OtherOfferAssocSimpleType c: OtherOfferAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

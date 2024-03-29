//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceAssocListItemType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Airport"/>
 *     <enumeration value="Disclosure"/>
 *     <enumeration value="MediaGroup"/>
 *     <enumeration value="MediaItem"/>
 *     <enumeration value="Offer"/>
 *     <enumeration value="OfferItem"/>
 *     <enumeration value="Penalty"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceAssocListItemType")
@XmlEnum
public enum ServiceAssocListItemType {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Disclosure")
    DISCLOSURE("Disclosure"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("OfferItem")
    OFFER_ITEM("OfferItem"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    ServiceAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAssocListItemType fromValue(String v) {
        for (ServiceAssocListItemType c: ServiceAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

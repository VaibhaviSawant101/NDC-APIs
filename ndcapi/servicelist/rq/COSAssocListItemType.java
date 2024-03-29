//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COS_AssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="COS_AssocListItemType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Equipment"/>
 *     <enumeration value="FlightGroup"/>
 *     <enumeration value="FlightOriginDestination"/>
 *     <enumeration value="FlightSegment"/>
 *     <enumeration value="MediaGroup"/>
 *     <enumeration value="MediaItem"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "COS_AssocListItemType")
@XmlEnum
public enum COSAssocListItemType {

    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("FlightGroup")
    FLIGHT_GROUP("FlightGroup"),
    @XmlEnumValue("FlightOriginDestination")
    FLIGHT_ORIGIN_DESTINATION("FlightOriginDestination"),
    @XmlEnumValue("FlightSegment")
    FLIGHT_SEGMENT("FlightSegment"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem");
    private final String value;

    COSAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COSAssocListItemType fromValue(String v) {
        for (COSAssocListItemType c: COSAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProximityAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProximityAppListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ActualProximity"/>
 *     <enumeration value="SearchRadius"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProximityAppListType")
@XmlEnum
public enum ProximityAppListType {

    @XmlEnumValue("ActualProximity")
    ACTUAL_PROXIMITY("ActualProximity"),
    @XmlEnumValue("SearchRadius")
    SEARCH_RADIUS("SearchRadius"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ProximityAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProximityAppListType fromValue(String v) {
        for (ProximityAppListType c: ProximityAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for ConnectMethodListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConnectMethodListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DirectWithAirline"/>
 *     <enumeration value="DirectWithOther"/>
 *     <enumeration value="Gateway"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConnectMethodListType")
@XmlEnum
public enum ConnectMethodListType {

    @XmlEnumValue("DirectWithAirline")
    DIRECT_WITH_AIRLINE("DirectWithAirline"),
    @XmlEnumValue("DirectWithOther")
    DIRECT_WITH_OTHER("DirectWithOther"),
    @XmlEnumValue("Gateway")
    GATEWAY("Gateway");
    private final String value;

    ConnectMethodListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectMethodListType fromValue(String v) {
        for (ConnectMethodListType c: ConnectMethodListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

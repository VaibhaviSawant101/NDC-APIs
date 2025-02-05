//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BagAppListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Party"/>
 *     <enumeration value="Traveler"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BagAppListType")
@XmlEnum
public enum BagAppListType {

    @XmlEnumValue("Party")
    PARTY("Party"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BagAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagAppListType fromValue(String v) {
        for (BagAppListType c: BagAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for GenderCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GenderCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Female"/>
 *     <enumeration value="Male"/>
 *     <enumeration value="Unspecified"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GenderCodeContentType")
@XmlEnum
public enum GenderCodeContentType {

    @XmlEnumValue("Female")
    FEMALE("Female"),
    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified");
    private final String value;

    GenderCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderCodeContentType fromValue(String v) {
        for (GenderCodeContentType c: GenderCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

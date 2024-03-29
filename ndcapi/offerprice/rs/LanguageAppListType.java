//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LanguageAppListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Actual"/>
 *     <enumeration value="Requested"/>
 *     <enumeration value="Spoken"/>
 *     <enumeration value="Written"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LanguageAppListType")
@XmlEnum
public enum LanguageAppListType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Spoken")
    SPOKEN("Spoken"),
    @XmlEnumValue("Written")
    WRITTEN("Written"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LanguageAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageAppListType fromValue(String v) {
        for (LanguageAppListType c: LanguageAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

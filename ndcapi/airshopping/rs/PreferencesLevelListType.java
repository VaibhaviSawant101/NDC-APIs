//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferencesLevelListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PreferencesLevelListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Preferred"/>
 *     <enumeration value="Required"/>
 *     <enumeration value="Exclude"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreferencesLevelListType")
@XmlEnum
public enum PreferencesLevelListType {

    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude");
    private final String value;

    PreferencesLevelListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferencesLevelListType fromValue(String v) {
        for (PreferencesLevelListType c: PreferencesLevelListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

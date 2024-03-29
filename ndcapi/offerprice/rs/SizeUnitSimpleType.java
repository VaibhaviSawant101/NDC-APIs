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
 * <p>Java class for SizeUnitSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SizeUnitSimpleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Centimeter"/>
 *     <enumeration value="Inch"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SizeUnitSimpleType")
@XmlEnum
public enum SizeUnitSimpleType {

    @XmlEnumValue("Centimeter")
    CENTIMETER("Centimeter"),
    @XmlEnumValue("Inch")
    INCH("Inch");
    private final String value;

    SizeUnitSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SizeUnitSimpleType fromValue(String v) {
        for (SizeUnitSimpleType c: SizeUnitSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

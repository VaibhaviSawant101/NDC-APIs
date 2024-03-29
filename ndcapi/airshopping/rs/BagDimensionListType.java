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
 * <p>Java class for BagDimensionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BagDimensionListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Length"/>
 *     <enumeration value="Height"/>
 *     <enumeration value="Width"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BagDimensionListType")
@XmlEnum
public enum BagDimensionListType {

    @XmlEnumValue("Length")
    LENGTH("Length"),
    @XmlEnumValue("Height")
    HEIGHT("Height"),
    @XmlEnumValue("Width")
    WIDTH("Width");
    private final String value;

    BagDimensionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagDimensionListType fromValue(String v) {
        for (BagDimensionListType c: BagDimensionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

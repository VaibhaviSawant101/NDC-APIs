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
 * <p>Java class for ImageUnitListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ImageUnitListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Inch"/>
 *     <enumeration value="Millimeter"/>
 *     <enumeration value="Pixel"/>
 *     <enumeration value="Point"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ImageUnitListType")
@XmlEnum
public enum ImageUnitListType {

    @XmlEnumValue("Inch")
    INCH("Inch"),
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),
    @XmlEnumValue("Pixel")
    PIXEL("Pixel"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ImageUnitListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageUnitListType fromValue(String v) {
        for (ImageUnitListType c: ImageUnitListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

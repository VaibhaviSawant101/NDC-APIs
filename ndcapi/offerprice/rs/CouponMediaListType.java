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
 * <p>Java class for CouponMediaListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CouponMediaListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Electronic"/>
 *     <enumeration value="Paper"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CouponMediaListType")
@XmlEnum
public enum CouponMediaListType {

    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CouponMediaListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponMediaListType fromValue(String v) {
        for (CouponMediaListType c: CouponMediaListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

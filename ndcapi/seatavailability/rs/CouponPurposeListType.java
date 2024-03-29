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
 * <p>Java class for CouponPurposeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CouponPurposeListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Additional"/>
 *     <enumeration value="Base"/>
 *     <enumeration value="Net"/>
 *     <enumeration value="Refund"/>
 *     <enumeration value="Sell"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CouponPurposeListType")
@XmlEnum
public enum CouponPurposeListType {

    @XmlEnumValue("Additional")
    ADDITIONAL("Additional"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Sell")
    SELL("Sell");
    private final String value;

    CouponPurposeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponPurposeListType fromValue(String v) {
        for (CouponPurposeListType c: CouponPurposeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

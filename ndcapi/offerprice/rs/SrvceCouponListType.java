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
 * <p>Java class for SrvceCouponListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SrvceCouponListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="E-Ticket"/>
 *     <enumeration value="Flight"/>
 *     <enumeration value="No_EMD"/>
 *     <enumeration value="Standalone"/>
 *     <enumeration value="Ticket"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SrvceCouponListType")
@XmlEnum
public enum SrvceCouponListType {

    @XmlEnumValue("E-Ticket")
    E_TICKET("E-Ticket"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("No_EMD")
    NO_EMD("No_EMD"),
    @XmlEnumValue("Standalone")
    STANDALONE("Standalone"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SrvceCouponListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrvceCouponListType fromValue(String v) {
        for (SrvceCouponListType c: SrvceCouponListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

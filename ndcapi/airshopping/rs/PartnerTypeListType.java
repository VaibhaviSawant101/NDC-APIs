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
 * <p>Java class for PartnerTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartnerTypeListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AirPassProgramHolder"/>
 *     <enumeration value="Merchandise"/>
 *     <enumeration value="ServiceFulfillment"/>
 *     <enumeration value="ServiceProvider"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartnerTypeListType")
@XmlEnum
public enum PartnerTypeListType {

    @XmlEnumValue("AirPassProgramHolder")
    AIR_PASS_PROGRAM_HOLDER("AirPassProgramHolder"),
    @XmlEnumValue("Merchandise")
    MERCHANDISE("Merchandise"),
    @XmlEnumValue("ServiceFulfillment")
    SERVICE_FULFILLMENT("ServiceFulfillment"),
    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PartnerTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerTypeListType fromValue(String v) {
        for (PartnerTypeListType c: PartnerTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

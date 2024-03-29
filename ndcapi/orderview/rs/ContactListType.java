//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ContactListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Billing"/>
 *     <enumeration value="Business"/>
 *     <enumeration value="Home"/>
 *     <enumeration value="ServiceLocation"/>
 *     <enumeration value="StayLocation"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ContactListType")
@XmlEnum
public enum ContactListType {

    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation"),
    @XmlEnumValue("StayLocation")
    STAY_LOCATION("StayLocation");
    private final String value;

    ContactListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactListType fromValue(String v) {
        for (ContactListType c: ContactListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

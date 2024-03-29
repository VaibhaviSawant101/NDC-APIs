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
 * <p>Java class for EmailListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EmailListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Account"/>
 *     <enumeration value="Business"/>
 *     <enumeration value="Personal"/>
 *     <enumeration value="SMS"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmailListType")
@XmlEnum
public enum EmailListType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    SMS("SMS"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EmailListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailListType fromValue(String v) {
        for (EmailListType c: EmailListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

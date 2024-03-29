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
 * <p>Java class for RuleStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RuleStatusListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ActionRequired"/>
 *     <enumeration value="RuleExecuted"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RuleStatusListType")
@XmlEnum
public enum RuleStatusListType {

    @XmlEnumValue("ActionRequired")
    ACTION_REQUIRED("ActionRequired"),
    @XmlEnumValue("RuleExecuted")
    RULE_EXECUTED("RuleExecuted");
    private final String value;

    RuleStatusListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleStatusListType fromValue(String v) {
        for (RuleStatusListType c: RuleStatusListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

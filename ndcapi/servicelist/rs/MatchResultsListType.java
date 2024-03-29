//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchResultsListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MatchResultsListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Full"/>
 *     <enumeration value="None"/>
 *     <enumeration value="Partial"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MatchResultsListType")
@XmlEnum
public enum MatchResultsListType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MatchResultsListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchResultsListType fromValue(String v) {
        for (MatchResultsListType c: MatchResultsListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MatchAppListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATTRIBUTE"/>
 *     <enumeration value="AFFINITY"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MatchAppListType")
@XmlEnum
public enum MatchAppListType {

    ATTRIBUTE("ATTRIBUTE"),
    AFFINITY("AFFINITY"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MatchAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchAppListType fromValue(String v) {
        for (MatchAppListType c: MatchAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

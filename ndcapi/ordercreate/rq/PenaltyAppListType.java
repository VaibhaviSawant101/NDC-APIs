//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyAppListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MaximumPenaltyAmount"/>
 *     <enumeration value="MinimumPenaltyAmount"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyAppListType")
@XmlEnum
public enum PenaltyAppListType {

    @XmlEnumValue("MaximumPenaltyAmount")
    MAXIMUM_PENALTY_AMOUNT("MaximumPenaltyAmount"),
    @XmlEnumValue("MinimumPenaltyAmount")
    MINIMUM_PENALTY_AMOUNT("MinimumPenaltyAmount"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PenaltyAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyAppListType fromValue(String v) {
        for (PenaltyAppListType c: PenaltyAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for TicketDesigAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TicketDesigAppListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Requested"/>
 *     <enumeration value="Ticketed"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TicketDesigAppListType")
@XmlEnum
public enum TicketDesigAppListType {

    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TicketDesigAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketDesigAppListType fromValue(String v) {
        for (TicketDesigAppListType c: TicketDesigAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

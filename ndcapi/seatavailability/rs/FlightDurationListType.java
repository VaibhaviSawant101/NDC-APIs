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
 * <p>Java class for FlightDurationListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FlightDurationListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ConnectionTime"/>
 *     <enumeration value="FlightTime"/>
 *     <enumeration value="StopTime"/>
 *     <enumeration value="TotalJourneyTime"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FlightDurationListType")
@XmlEnum
public enum FlightDurationListType {

    @XmlEnumValue("ConnectionTime")
    CONNECTION_TIME("ConnectionTime"),
    @XmlEnumValue("FlightTime")
    FLIGHT_TIME("FlightTime"),
    @XmlEnumValue("StopTime")
    STOP_TIME("StopTime"),
    @XmlEnumValue("TotalJourneyTime")
    TOTAL_JOURNEY_TIME("TotalJourneyTime"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FlightDurationListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightDurationListType fromValue(String v) {
        for (FlightDurationListType c: FlightDurationListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

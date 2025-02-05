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
 * <p>Java class for FareAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FareAmountType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADC"/>
 *     <enumeration value="Bulk"/>
 *     <enumeration value="IT"/>
 *     <enumeration value="NOADC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FareAmountType")
@XmlEnum
public enum FareAmountType {


    /**
     * Additional collection
     * 
     */
    ADC("ADC"),
    @XmlEnumValue("Bulk")
    BULK("Bulk"),
    IT("IT"),
    NOADC("NOADC");
    private final String value;

    FareAmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAmountType fromValue(String v) {
        for (FareAmountType c: FareAmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

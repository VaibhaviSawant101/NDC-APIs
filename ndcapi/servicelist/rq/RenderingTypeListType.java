//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderingTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RenderingTypeListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Narrative"/>
 *     <enumeration value="XSLT"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RenderingTypeListType")
@XmlEnum
public enum RenderingTypeListType {

    @XmlEnumValue("Narrative")
    NARRATIVE("Narrative"),
    XSLT("XSLT"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RenderingTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RenderingTypeListType fromValue(String v) {
        for (RenderingTypeListType c: RenderingTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

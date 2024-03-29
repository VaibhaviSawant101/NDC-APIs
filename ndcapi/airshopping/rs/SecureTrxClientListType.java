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
 * <p>Java class for SecureTrxClientListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecureTrxClientListType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="InteractiveVoiceResponse"/>
 *     <enumeration value="Internet"/>
 *     <enumeration value="MailOrTelephoneOrder"/>
 *     <enumeration value="Recurring"/>
 *     <enumeration value="Unattended"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecureTrxClientListType")
@XmlEnum
public enum SecureTrxClientListType {


    /**
     * IVR
     * 
     */
    @XmlEnumValue("InteractiveVoiceResponse")
    INTERACTIVE_VOICE_RESPONSE("InteractiveVoiceResponse"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),

    /**
     * MOTO
     * 
     */
    @XmlEnumValue("MailOrTelephoneOrder")
    MAIL_OR_TELEPHONE_ORDER("MailOrTelephoneOrder"),
    @XmlEnumValue("Recurring")
    RECURRING("Recurring"),
    @XmlEnumValue("Unattended")
    UNATTENDED("Unattended");
    private final String value;

    SecureTrxClientListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureTrxClientListType fromValue(String v) {
        for (SecureTrxClientListType c: SecureTrxClientListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for NDC-ENABLED SYSTEM Message Party Representation.
 * 
 * Notes:
 *  1. Derived from EnabledSystemType.
 * 
 * <p>Java class for EnabledSysMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnabledSysMsgPartyCoreType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}EnabledSystemType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnabledSysMsgPartyCoreType")
@XmlSeeAlso({
    EnabledSysSenderType.class,
    EnabledSysRecipientType.class,
    EnabledSysParticipantType.class
})
public class EnabledSysMsgPartyCoreType
    extends EnabledSystemType
{


}

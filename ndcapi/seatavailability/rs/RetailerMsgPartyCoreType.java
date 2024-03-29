//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for RETAILER Message Party Representation.
 * 
 * Notes:
 *  1. Derived from RetailerType.
 * 
 * <p>Java class for RetailerMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetailerMsgPartyCoreType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}RetailerType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AgentUser" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerMsgPartyCoreType", propOrder = {
    "agentUser"
})
@XmlSeeAlso({
    RetailSupplierSenderType.class,
    RetailSupplierRecipientType.class,
    RetailSupplierParticipantType.class
})
public class RetailerMsgPartyCoreType
    extends RetailerType
{

    @XmlElement(name = "AgentUser")
    protected AgentUserType agentUser;

    /**
     * Retail Supplier Agent User information.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserType }
     *     
     */
    public AgentUserType getAgentUser() {
        return agentUser;
    }

    /**
     * Sets the value of the agentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserType }
     *     
     */
    public void setAgentUser(AgentUserType value) {
        this.agentUser = value;
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for (AGENCY) AGENT USER Seller Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from AgencyCoreRepType.
 * 
 * <p>Java class for AgentUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentUserType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}AgencyCoreRepType">
 *       <sequence>
 *         <element name="AgentUserID">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueIDContextType">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="UserRole" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentUserType", propOrder = {
    "agentUserID",
    "userRole"
})
@XmlSeeAlso({
    AgentUserMsgPartyCoreType.class
})
public class AgentUserType
    extends AgencyCoreRepType
{

    @XmlElement(name = "AgentUserID", required = true)
    protected AgentUserType.AgentUserID agentUserID;
    @XmlElement(name = "UserRole")
    protected String userRole;

    /**
     * Gets the value of the agentUserID property.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserType.AgentUserID }
     *     
     */
    public AgentUserType.AgentUserID getAgentUserID() {
        return agentUserID;
    }

    /**
     * Sets the value of the agentUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserType.AgentUserID }
     *     
     */
    public void setAgentUserID(AgentUserType.AgentUserID value) {
        this.agentUserID = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueIDContextType">
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AgentUserID
        extends UniqueIDContextType
    {


    }

}

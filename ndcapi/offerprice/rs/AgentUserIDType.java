//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Agent User (e.g. Travel Agent) ID.
 * 
 * User ID.
 * Example: ksmith212
 * 
 * <p>Java class for AgentUserID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentUserID_Type">
 *   <simpleContent>
 *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueIDContextType">
 *       <attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentUserID_Type")
public class AgentUserIDType
    extends UniqueIDContextType
{

    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}

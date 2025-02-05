//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PARTNER ACTOR, common properties.
 * 
 * <p>Java class for PartnerCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartnerCoreRepType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}ActorObjectType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PartnerID"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *         <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}PartnerTypeSimpleType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerCoreRepType", propOrder = {
    "partnerID",
    "name",
    "type"
})
@XmlSeeAlso({
    FulfillmentPartnerType.class
})
public class PartnerCoreRepType
    extends ActorObjectType
{

    @XmlElement(name = "PartnerID", required = true)
    protected PartnerCompanyIDType partnerID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerCompanyIDType }
     *     
     */
    public PartnerCompanyIDType getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerCompanyIDType }
     *     
     */
    public void setPartnerID(PartnerCompanyIDType value) {
        this.partnerID = value;
    }

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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}

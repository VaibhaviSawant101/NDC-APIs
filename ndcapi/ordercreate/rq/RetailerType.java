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
 * A data type for MERCHANDISE RETAILER Supplier Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from SupplierCoreRepType.
 * 
 * <p>Java class for RetailerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetailerType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}SupplierCoreRepType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}RetailerID"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Contacts" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerType", propOrder = {
    "retailerID",
    "contacts"
})
@XmlSeeAlso({
    RetailerMsgPartyCoreType.class
})
public class RetailerType
    extends SupplierCoreRepType
{

    @XmlElement(name = "RetailerID", required = true)
    protected RetailerIDType retailerID;
    @XmlElement(name = "Contacts")
    protected Contacts contacts;

    /**
     * Gets the value of the retailerID property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerIDType }
     *     
     */
    public RetailerIDType getRetailerID() {
        return retailerID;
    }

    /**
     * Sets the value of the retailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerIDType }
     *     
     */
    public void setRetailerID(RetailerIDType value) {
        this.retailerID = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }

}

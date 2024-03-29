//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AddressCore"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AddressDetail"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressCore",
    "addressDetail"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "AddressCore")
    protected AddressCoreType addressCore;
    @XmlElement(name = "AddressDetail")
    protected AddressDetailType addressDetail;

    /**
     * Gets the value of the addressCore property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCoreType }
     *     
     */
    public AddressCoreType getAddressCore() {
        return addressCore;
    }

    /**
     * Sets the value of the addressCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCoreType }
     *     
     */
    public void setAddressCore(AddressCoreType value) {
        this.addressCore = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailType }
     *     
     */
    public AddressDetailType getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailType }
     *     
     */
    public void setAddressDetail(AddressDetailType value) {
        this.addressDetail = value;
    }

}

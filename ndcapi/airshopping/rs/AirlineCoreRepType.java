//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Core Airline Representation.
 * 
 * Notes:
 *  1. This type contains the common properties for all defined Airline Supplier Role definitions, e.g. POA, Operating Carrier.
 *  2. This type is derived from SupplierCoreRepType.
 * 
 * <p>Java class for AirlineCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AirlineCoreRepType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}SupplierCoreRepType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}CarrierNameType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineCoreRepType", propOrder = {
    "airlineID",
    "name"
})
@XmlSeeAlso({
    MarketingCarrierType.class,
    AirlineMsgPartyCoreType.class
})
public class AirlineCoreRepType
    extends SupplierCoreRepType
{

    @XmlElement(name = "AirlineID", required = true)
    protected AirlineID airlineID;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineID }
     *     
     */
    public AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineID }
     *     
     */
    public void setAirlineID(AirlineID value) {
        this.airlineID = value;
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

}

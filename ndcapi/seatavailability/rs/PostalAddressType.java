//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The address used for postal service. Examples are post office boxes address, postal physical address, postal code
 * 
 * <p>Java class for PostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostalAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="Street" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" maxOccurs="2" minOccurs="0"/>
 *         <element name="BuildingRoom" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="POBox" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCodeType" minOccurs="0"/>
 *         <element name="PostalCode" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCodeType" minOccurs="0"/>
 *         <element name="CityName" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleNameType" minOccurs="0"/>
 *         <element name="CountrySubdivisionName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameType" minOccurs="0"/>
 *         <element name="CountryName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameType" minOccurs="0"/>
 *         <element name="CountryCode" type="{http://www.iata.org/IATA/EDIST/2017.2}ISO_3166CountryCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = {
    "label",
    "street",
    "buildingRoom",
    "poBox",
    "postalCode",
    "cityName",
    "countrySubdivisionName",
    "countryName",
    "countryCode"
})
public class PostalAddressType {

    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Street")
    protected List<String> street;
    @XmlElement(name = "BuildingRoom")
    protected String buildingRoom;
    @XmlElement(name = "POBox")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBox;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    @XmlElement(name = "CountrySubdivisionName")
    protected String countrySubdivisionName;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "CountryCode")
    protected String countryCode;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the street property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the street property.
     */
    public List<String> getStreet() {
        if (street == null) {
            street = new ArrayList<>();
        }
        return this.street;
    }

    /**
     * Gets the value of the buildingRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingRoom() {
        return buildingRoom;
    }

    /**
     * Sets the value of the buildingRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingRoom(String value) {
        this.buildingRoom = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countrySubdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionName() {
        return countrySubdivisionName;
    }

    /**
     * Sets the value of the countrySubdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionName(String value) {
        this.countrySubdivisionName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
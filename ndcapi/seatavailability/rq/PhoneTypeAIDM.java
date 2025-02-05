//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
 * 
 * <p>Java class for PhoneTypeAIDM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PhoneTypeAIDM">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="CountryDialingCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CountryDialiingCodeType" minOccurs="0"/>
 *         <element name="AreaCode" type="{http://www.iata.org/IATA/EDIST/2017.2}NumberType" minOccurs="0"/>
 *         <element name="PhoneNumber" type="{http://www.iata.org/IATA/EDIST/2017.2}NumberType" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.iata.org/IATA/EDIST/2017.2}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneTypeAIDM", propOrder = {
    "label",
    "countryDialingCode",
    "areaCode",
    "phoneNumber",
    "extension"
})
public class PhoneTypeAIDM {

    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "CountryDialingCode")
    protected String countryDialingCode;
    @XmlElement(name = "AreaCode")
    protected BigDecimal areaCode;
    @XmlElement(name = "PhoneNumber")
    protected BigDecimal phoneNumber;
    @XmlElement(name = "Extension")
    protected BigDecimal extension;

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
     * Gets the value of the countryDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDialingCode(String value) {
        this.countryDialingCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaCode(BigDecimal value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhoneNumber(BigDecimal value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtension(BigDecimal value) {
        this.extension = value;
    }

}

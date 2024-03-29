//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
 * 
 * <p>Java class for LoyaltyProgramAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyProgramAccountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Alliance" type="{http://www.iata.org/IATA/EDIST/2017.2}AllianceType" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="Airline" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineTypeAIDM" minOccurs="0"/>
 *           <element name="ProviderName" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleNameType" minOccurs="0"/>
 *         </choice>
 *         <element name="ProgramName" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleNameType" minOccurs="0"/>
 *         <element name="ProgramCode" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCodeType" minOccurs="0"/>
 *         <element name="AccountNumber" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCodeType" minOccurs="0"/>
 *         <element name="URL" type="{http://www.iata.org/IATA/EDIST/2017.2}URI_Type" minOccurs="0"/>
 *         <element name="SignInID" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="TierCode" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCodeType" minOccurs="0"/>
 *         <element name="TierName" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="TierPriority" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramAccountType", propOrder = {
    "alliance",
    "airline",
    "providerName",
    "programName",
    "programCode",
    "accountNumber",
    "url",
    "signInID",
    "tierCode",
    "tierName",
    "tierPriority"
})
public class LoyaltyProgramAccountType {

    @XmlElement(name = "Alliance")
    protected AllianceType alliance;
    @XmlElement(name = "Airline")
    protected AirlineTypeAIDM airline;
    @XmlElement(name = "ProviderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providerName;
    @XmlElement(name = "ProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    @XmlElement(name = "ProgramCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programCode;
    @XmlElement(name = "AccountNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountNumber;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "SignInID")
    protected String signInID;
    @XmlElement(name = "TierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tierCode;
    @XmlElement(name = "TierName")
    protected String tierName;
    @XmlElement(name = "TierPriority")
    protected String tierPriority;

    /**
     * Gets the value of the alliance property.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineTypeAIDM }
     *     
     */
    public AirlineTypeAIDM getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineTypeAIDM }
     *     
     */
    public void setAirline(AirlineTypeAIDM value) {
        this.airline = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the signInID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignInID() {
        return signInID;
    }

    /**
     * Sets the value of the signInID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignInID(String value) {
        this.signInID = value;
    }

    /**
     * Gets the value of the tierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierCode() {
        return tierCode;
    }

    /**
     * Sets the value of the tierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierCode(String value) {
        this.tierCode = value;
    }

    /**
     * Gets the value of the tierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierName() {
        return tierName;
    }

    /**
     * Sets the value of the tierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierName(String value) {
        this.tierName = value;
    }

    /**
     * Gets the value of the tierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierPriority() {
        return tierPriority;
    }

    /**
     * Sets the value of the tierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierPriority(String value) {
        this.tierPriority = value;
    }

}

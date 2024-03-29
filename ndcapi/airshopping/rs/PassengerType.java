//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship.  Holds the attributes specific to a one booking, from shopping to fulfilment.
 * 
 * <p>Java class for PassengerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PassengerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PTC" type="{http://www.iata.org/IATA/EDIST/2017.2}PassengerTypeCodeType" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="Age" type="{http://www.iata.org/IATA/EDIST/2017.2}MeasureType" minOccurs="0"/>
 *           <element name="Birthdate" type="{http://www.iata.org/IATA/EDIST/2017.2}DateType" minOccurs="0"/>
 *         </choice>
 *         <element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.2}ISO_3166CountryCodeType" minOccurs="0"/>
 *         <element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.2}ISO_3166CountryCodeType" minOccurs="0"/>
 *         <element name="Individual" type="{http://www.iata.org/IATA/EDIST/2017.2}IndividualType" minOccurs="0"/>
 *         <element name="ProfileID" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/EDIST/2017.2}LoyaltyProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FOID" type="{http://www.iata.org/IATA/EDIST/2017.2}FOID" minOccurs="0"/>
 *         <element name="IdentityDocument" type="{http://www.iata.org/IATA/EDIST/2017.2}IdentityDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ContactInfoRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="InfantRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Language" type="{http://www.iata.org/IATA/EDIST/2017.2}LanguageUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Remark" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}RemarkTypeAIDM">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="PassengerID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="ProfileConsentIndicator" type="{http://www.iata.org/IATA/EDIST/2017.2}IndicatorType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerType", propOrder = {
    "ptc",
    "age",
    "birthdate",
    "residenceCountryCode",
    "citizenshipCountryCode",
    "individual",
    "profileID",
    "loyaltyProgramAccount",
    "foid",
    "identityDocument",
    "contactInfoRef",
    "infantRef",
    "language",
    "remark"
})
public class PassengerType {

    @XmlElement(name = "PTC")
    protected String ptc;
    @XmlElement(name = "Age")
    protected MeasureType age;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "ResidenceCountryCode")
    protected String residenceCountryCode;
    @XmlElement(name = "CitizenshipCountryCode")
    protected String citizenshipCountryCode;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlElement(name = "ProfileID")
    protected String profileID;
    @XmlElement(name = "LoyaltyProgramAccount")
    protected List<LoyaltyProgramAccountType> loyaltyProgramAccount;
    @XmlElement(name = "FOID")
    protected FOID foid;
    @XmlElement(name = "IdentityDocument")
    protected List<IdentityDocumentType> identityDocument;
    @XmlElement(name = "ContactInfoRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contactInfoRef;
    @XmlElement(name = "InfantRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object infantRef;
    @XmlElement(name = "Language")
    protected List<LanguageUsageType> language;
    @XmlElement(name = "Remark")
    protected List<PassengerType.Remark> remark;
    @XmlAttribute(name = "PassengerID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String passengerID;
    @XmlAttribute(name = "ProfileConsentIndicator")
    protected Boolean profileConsentIndicator;

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAge(MeasureType value) {
        this.age = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the loyaltyProgramAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramAccountType }
     * 
     * 
     * @return
     *     The value of the loyaltyProgramAccount property.
     */
    public List<LoyaltyProgramAccountType> getLoyaltyProgramAccount() {
        if (loyaltyProgramAccount == null) {
            loyaltyProgramAccount = new ArrayList<>();
        }
        return this.loyaltyProgramAccount;
    }

    /**
     * Gets the value of the foid property.
     * 
     * @return
     *     possible object is
     *     {@link FOID }
     *     
     */
    public FOID getFOID() {
        return foid;
    }

    /**
     * Sets the value of the foid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOID }
     *     
     */
    public void setFOID(FOID value) {
        this.foid = value;
    }

    /**
     * Gets the value of the identityDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the identityDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocumentType }
     * 
     * 
     * @return
     *     The value of the identityDocument property.
     */
    public List<IdentityDocumentType> getIdentityDocument() {
        if (identityDocument == null) {
            identityDocument = new ArrayList<>();
        }
        return this.identityDocument;
    }

    /**
     * Gets the value of the contactInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactInfoRef() {
        return contactInfoRef;
    }

    /**
     * Sets the value of the contactInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactInfoRef(Object value) {
        this.contactInfoRef = value;
    }

    /**
     * Gets the value of the infantRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInfantRef() {
        return infantRef;
    }

    /**
     * Sets the value of the infantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInfantRef(Object value) {
        this.infantRef = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageUsageType }
     * 
     * 
     * @return
     *     The value of the language property.
     */
    public List<LanguageUsageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<>();
        }
        return this.language;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerType.Remark }
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<PassengerType.Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerID(String value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the profileConsentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfileConsentIndicator() {
        return profileConsentIndicator;
    }

    /**
     * Sets the value of the profileConsentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfileConsentIndicator(Boolean value) {
        this.profileConsentIndicator = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}RemarkTypeAIDM">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Remark
        extends RemarkTypeAIDM
    {


    }

}

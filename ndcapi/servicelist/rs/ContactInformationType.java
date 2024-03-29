//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import java.util.ArrayList;
import java.util.List;
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
 * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
 * 
 * <p>Java class for ContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContactInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactType" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType" minOccurs="0"/>
 *         <element name="PostalAddress" type="{http://www.iata.org/IATA/EDIST/2017.2}PostalAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="ContactProvided" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="EmailAddress" type="{http://www.iata.org/IATA/EDIST/2017.2}EmailAddressType" maxOccurs="unbounded"/>
 *                     <element name="Phone" type="{http://www.iata.org/IATA/EDIST/2017.2}PhoneTypeAIDM" maxOccurs="unbounded"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ContactNotProvided" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         </choice>
 *         <element name="OtherAddress" type="{http://www.iata.org/IATA/EDIST/2017.2}OtherAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="IndividualRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *           <element name="Individual" type="{http://www.iata.org/IATA/EDIST/2017.2}IndividualType" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="ContactID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationType", propOrder = {
    "contactType",
    "postalAddress",
    "contactProvided",
    "contactNotProvided",
    "otherAddress",
    "individualRef",
    "individual"
})
public class ContactInformationType {

    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "PostalAddress")
    protected List<PostalAddressType> postalAddress;
    @XmlElement(name = "ContactProvided")
    protected List<ContactInformationType.ContactProvided> contactProvided;
    @XmlElement(name = "ContactNotProvided")
    protected String contactNotProvided;
    @XmlElement(name = "OtherAddress")
    protected List<OtherAddressType> otherAddress;
    @XmlElement(name = "IndividualRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object individualRef;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlAttribute(name = "ContactID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String contactID;

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressType }
     * 
     * 
     * @return
     *     The value of the postalAddress property.
     */
    public List<PostalAddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the contactProvided property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the contactProvided property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactProvided().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType.ContactProvided }
     * 
     * 
     * @return
     *     The value of the contactProvided property.
     */
    public List<ContactInformationType.ContactProvided> getContactProvided() {
        if (contactProvided == null) {
            contactProvided = new ArrayList<>();
        }
        return this.contactProvided;
    }

    /**
     * Gets the value of the contactNotProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNotProvided() {
        return contactNotProvided;
    }

    /**
     * Sets the value of the contactNotProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNotProvided(String value) {
        this.contactNotProvided = value;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the otherAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAddressType }
     * 
     * 
     * @return
     *     The value of the otherAddress property.
     */
    public List<OtherAddressType> getOtherAddress() {
        if (otherAddress == null) {
            otherAddress = new ArrayList<>();
        }
        return this.otherAddress;
    }

    /**
     * Gets the value of the individualRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndividualRef() {
        return individualRef;
    }

    /**
     * Sets the value of the individualRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndividualRef(Object value) {
        this.individualRef = value;
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
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactID(String value) {
        this.contactID = value;
    }


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
     *         <element name="EmailAddress" type="{http://www.iata.org/IATA/EDIST/2017.2}EmailAddressType" maxOccurs="unbounded"/>
     *         <element name="Phone" type="{http://www.iata.org/IATA/EDIST/2017.2}PhoneTypeAIDM" maxOccurs="unbounded"/>
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
        "emailAddress",
        "phone"
    })
    public static class ContactProvided {

        @XmlElement(name = "EmailAddress")
        protected List<EmailAddressType> emailAddress;
        @XmlElement(name = "Phone")
        protected List<PhoneTypeAIDM> phone;

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmailAddressType }
         * 
         * 
         * @return
         *     The value of the emailAddress property.
         */
        public List<EmailAddressType> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<>();
            }
            return this.emailAddress;
        }

        /**
         * Gets the value of the phone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the phone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneTypeAIDM }
         * 
         * 
         * @return
         *     The value of the phone property.
         */
        public List<PhoneTypeAIDM> getPhone() {
            if (phone == null) {
                phone = new ArrayList<>();
            }
            return this.phone;
        }

    }

}

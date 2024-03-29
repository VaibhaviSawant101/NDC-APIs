//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for INTERMEDIARY GROUP, Core Representation.
 * 
 * <p>Java class for IntermediaryCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntermediaryCoreRepType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}ActorObjectType">
 *       <sequence>
 *         <element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *         <element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *         <element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AddressContact"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EmailContact"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherContactMethod"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PhoneContact"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntermediaryCoreRepType", propOrder = {
    "name",
    "category",
    "contact"
})
@XmlSeeAlso({
    AggregatorType.class,
    EnabledSystemType.class
})
public class IntermediaryCoreRepType
    extends ActorObjectType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Contact")
    protected List<IntermediaryCoreRepType.Contact> contact;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediaryCoreRepType.Contact }
     * 
     * 
     * @return
     *     The value of the contact property.
     */
    public List<IntermediaryCoreRepType.Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AddressContact"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EmailContact"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherContactMethod"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PhoneContact"/>
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
        "addressContact",
        "emailContact",
        "otherContactMethod",
        "phoneContact"
    })
    public static class Contact {

        @XmlElement(name = "AddressContact")
        protected AddressContactType addressContact;
        @XmlElement(name = "EmailContact")
        protected EmailType emailContact;
        @XmlElement(name = "OtherContactMethod")
        protected OtherContactMethodType otherContactMethod;
        @XmlElement(name = "PhoneContact")
        protected PhoneContactType phoneContact;

        /**
         * Gets the value of the addressContact property.
         * 
         * @return
         *     possible object is
         *     {@link AddressContactType }
         *     
         */
        public AddressContactType getAddressContact() {
            return addressContact;
        }

        /**
         * Sets the value of the addressContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressContactType }
         *     
         */
        public void setAddressContact(AddressContactType value) {
            this.addressContact = value;
        }

        /**
         * Email address details, including application (I.e. home, business, etc.).
         * 
         * @return
         *     possible object is
         *     {@link EmailType }
         *     
         */
        public EmailType getEmailContact() {
            return emailContact;
        }

        /**
         * Sets the value of the emailContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailType }
         *     
         */
        public void setEmailContact(EmailType value) {
            this.emailContact = value;
        }

        /**
         * Gets the value of the otherContactMethod property.
         * 
         * @return
         *     possible object is
         *     {@link OtherContactMethodType }
         *     
         */
        public OtherContactMethodType getOtherContactMethod() {
            return otherContactMethod;
        }

        /**
         * Sets the value of the otherContactMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherContactMethodType }
         *     
         */
        public void setOtherContactMethod(OtherContactMethodType value) {
            this.otherContactMethod = value;
        }

        /**
         * Gets the value of the phoneContact property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneContactType }
         *     
         */
        public PhoneContactType getPhoneContact() {
            return phoneContact;
        }

        /**
         * Sets the value of the phoneContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneContactType }
         *     
         */
        public void setPhoneContact(PhoneContactType value) {
            this.phoneContact = value;
        }

    }

}

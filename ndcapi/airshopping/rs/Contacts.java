//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Contact" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AddressContact" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EmailContact" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherContactMethod" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PhoneContact" minOccurs="0"/>
 *                   <element name="Name" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Surname">
 *                               <complexType>
 *                                 <simpleContent>
 *                                   <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
 *                                     <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                                   </extension>
 *                                 </simpleContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Given" maxOccurs="5" minOccurs="0">
 *                               <complexType>
 *                                 <simpleContent>
 *                                   <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
 *                                     <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                                   </extension>
 *                                 </simpleContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             <element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             <element name="Middle" maxOccurs="3" minOccurs="0">
 *                               <complexType>
 *                                 <simpleContent>
 *                                   <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                                     <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                                   </extension>
 *                                 </simpleContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectPolicyMetaAttrGroup"/>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contact"
})
@XmlRootElement(name = "Contacts")
public class Contacts {

    @XmlElement(name = "Contact", required = true)
    protected List<Contacts.Contact> contact;

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
     * {@link Contacts.Contact }
     * 
     * 
     * @return
     *     The value of the contact property.
     */
    public List<Contacts.Contact> getContact() {
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
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AddressContact" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}EmailContact" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherContactMethod" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PhoneContact" minOccurs="0"/>
     *         <element name="Name" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Surname">
     *                     <complexType>
     *                       <simpleContent>
     *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
     *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                         </extension>
     *                       </simpleContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Given" maxOccurs="5" minOccurs="0">
     *                     <complexType>
     *                       <simpleContent>
     *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
     *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                         </extension>
     *                       </simpleContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   <element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   <element name="Middle" maxOccurs="3" minOccurs="0">
     *                     <complexType>
     *                       <simpleContent>
     *                         <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                         </extension>
     *                       </simpleContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectPolicyMetaAttrGroup"/>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "phoneContact",
        "name"
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
        @XmlElement(name = "Name")
        protected Contacts.Contact.Name name;
        @XmlAttribute(name = "ContactType")
        @XmlSchemaType(name = "anySimpleType")
        protected String contactType;

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

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link Contacts.Contact.Name }
         *     
         */
        public Contacts.Contact.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contacts.Contact.Name }
         *     
         */
        public void setName(Contacts.Contact.Name value) {
            this.name = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="Surname">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
         *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *               </extension>
         *             </simpleContent>
         *           </complexType>
         *         </element>
         *         <element name="Given" maxOccurs="5" minOccurs="0">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
         *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *               </extension>
         *             </simpleContent>
         *           </complexType>
         *         </element>
         *         <element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         <element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         <element name="Middle" maxOccurs="3" minOccurs="0">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
         *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *               </extension>
         *             </simpleContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectPolicyMetaAttrGroup"/>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "surname",
            "given",
            "title",
            "surnameSuffix",
            "middle"
        })
        public static class Name {

            @XmlElement(name = "Surname", required = true)
            protected Contacts.Contact.Name.Surname surname;
            @XmlElement(name = "Given")
            protected List<Contacts.Contact.Name.Given> given;
            @XmlElement(name = "Title")
            protected String title;
            @XmlElement(name = "SurnameSuffix")
            protected Object surnameSuffix;
            @XmlElement(name = "Middle")
            protected List<Contacts.Contact.Name.Middle> middle;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ObjectMetaReferences")
            @XmlIDREF
            protected List<Object> objectMetaReferences;

            /**
             * Gets the value of the surname property.
             * 
             * @return
             *     possible object is
             *     {@link Contacts.Contact.Name.Surname }
             *     
             */
            public Contacts.Contact.Name.Surname getSurname() {
                return surname;
            }

            /**
             * Sets the value of the surname property.
             * 
             * @param value
             *     allowed object is
             *     {@link Contacts.Contact.Name.Surname }
             *     
             */
            public void setSurname(Contacts.Contact.Name.Surname value) {
                this.surname = value;
            }

            /**
             * Gets the value of the given property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the given property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGiven().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Contacts.Contact.Name.Given }
             * 
             * 
             * @return
             *     The value of the given property.
             */
            public List<Contacts.Contact.Name.Given> getGiven() {
                if (given == null) {
                    given = new ArrayList<>();
                }
                return this.given;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the surnameSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSurnameSuffix() {
                return surnameSuffix;
            }

            /**
             * Sets the value of the surnameSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSurnameSuffix(Object value) {
                this.surnameSuffix = value;
            }

            /**
             * Gets the value of the middle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the middle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMiddle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Contacts.Contact.Name.Middle }
             * 
             * 
             * @return
             *     The value of the middle property.
             */
            public List<Contacts.Contact.Name.Middle> getMiddle() {
                if (middle == null) {
                    middle = new ArrayList<>();
                }
                return this.middle;
            }

            /**
             * Gets the value of the refs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the refs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             * @return
             *     The value of the refs property.
             */
            public List<Object> getRefs() {
                if (refs == null) {
                    refs = new ArrayList<>();
                }
                return this.refs;
            }

            /**
             * Gets the value of the objectMetaReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the objectMetaReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObjectMetaReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             * @return
             *     The value of the objectMetaReferences property.
             */
            public List<Object> getObjectMetaReferences() {
                if (objectMetaReferences == null) {
                    objectMetaReferences = new ArrayList<>();
                }
                return this.objectMetaReferences;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>{@code
             * <complexType>
             *   <simpleContent>
             *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
             *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
             *     </extension>
             *   </simpleContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Given {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the refs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the refs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRefs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 * @return
                 *     The value of the refs property.
                 */
                public List<Object> getRefs() {
                    if (refs == null) {
                        refs = new ArrayList<>();
                    }
                    return this.refs;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>{@code
             * <complexType>
             *   <simpleContent>
             *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
             *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
             *     </extension>
             *   </simpleContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Middle {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the refs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the refs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRefs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 * @return
                 *     The value of the refs property.
                 */
                public List<Object> getRefs() {
                    if (refs == null) {
                        refs = new ArrayList<>();
                    }
                    return this.refs;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>{@code
             * <complexType>
             *   <simpleContent>
             *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
             *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
             *     </extension>
             *   </simpleContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Surname {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the refs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the refs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRefs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 * @return
                 *     The value of the refs property.
                 */
                public List<Object> getRefs() {
                    if (refs == null) {
                        refs = new ArrayList<>();
                    }
                    return this.refs;
                }

            }

        }

    }

}

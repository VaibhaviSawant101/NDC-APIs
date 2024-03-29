//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE BUNDLE Data List definition.
 * 
 * <p>Java class for ListOfServiceBundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ListOfServiceBundleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceBundle" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   <element name="Associations">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceReference" maxOccurs="unbounded"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Selection" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice maxOccurs="2">
 *                             <element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             <element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="BundleID" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueStringID_SimpleType">
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyAttrGroup"/>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.2}ServicePriceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="BundleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
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
@XmlType(name = "ListOfServiceBundleType", propOrder = {
    "serviceBundle"
})
public class ListOfServiceBundleType {

    @XmlElement(name = "ServiceBundle", required = true)
    protected List<ListOfServiceBundleType.ServiceBundle> serviceBundle;

    /**
     * Gets the value of the serviceBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the serviceBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfServiceBundleType.ServiceBundle }
     * 
     * 
     * @return
     *     The value of the serviceBundle property.
     */
    public List<ListOfServiceBundleType.ServiceBundle> getServiceBundle() {
        if (serviceBundle == null) {
            serviceBundle = new ArrayList<>();
        }
        return this.serviceBundle;
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
     *         <element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         <element name="Associations">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceReference" maxOccurs="unbounded"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Selection" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice maxOccurs="2">
     *                   <element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   <element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="BundleID" minOccurs="0">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueStringID_SimpleType">
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyAttrGroup"/>
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *         <element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.2}ServicePriceType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="BundleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemCount",
        "associations",
        "selection",
        "bundleID",
        "price",
        "bundleName"
    })
    public static class ServiceBundle {

        @XmlElement(name = "ItemCount", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger itemCount;
        @XmlElement(name = "Associations", required = true)
        protected ListOfServiceBundleType.ServiceBundle.Associations associations;
        @XmlElement(name = "Selection")
        protected ListOfServiceBundleType.ServiceBundle.Selection selection;
        @XmlElement(name = "BundleID")
        protected ListOfServiceBundleType.ServiceBundle.BundleID bundleID;
        @XmlElement(name = "Price")
        protected List<ServicePriceType> price;
        @XmlElement(name = "BundleName")
        protected String bundleName;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the itemCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getItemCount() {
            return itemCount;
        }

        /**
         * Sets the value of the itemCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setItemCount(BigInteger value) {
            this.itemCount = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Associations }
         *     
         */
        public ListOfServiceBundleType.ServiceBundle.Associations getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Associations }
         *     
         */
        public void setAssociations(ListOfServiceBundleType.ServiceBundle.Associations value) {
            this.associations = value;
        }

        /**
         * Gets the value of the selection property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Selection }
         *     
         */
        public ListOfServiceBundleType.ServiceBundle.Selection getSelection() {
            return selection;
        }

        /**
         * Sets the value of the selection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Selection }
         *     
         */
        public void setSelection(ListOfServiceBundleType.ServiceBundle.Selection value) {
            this.selection = value;
        }

        /**
         * Gets the value of the bundleID property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceBundleType.ServiceBundle.BundleID }
         *     
         */
        public ListOfServiceBundleType.ServiceBundle.BundleID getBundleID() {
            return bundleID;
        }

        /**
         * Sets the value of the bundleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceBundleType.ServiceBundle.BundleID }
         *     
         */
        public void setBundleID(ListOfServiceBundleType.ServiceBundle.BundleID value) {
            this.bundleID = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the price property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePriceType }
         * 
         * 
         * @return
         *     The value of the price property.
         */
        public List<ServicePriceType> getPrice() {
            if (price == null) {
                price = new ArrayList<>();
            }
            return this.price;
        }

        /**
         * Gets the value of the bundleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBundleName() {
            return bundleName;
        }

        /**
         * Sets the value of the bundleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBundleName(String value) {
            this.bundleName = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceReference" maxOccurs="unbounded"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
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
            "serviceReference",
            "serviceID"
        })
        public static class Associations {

            @XmlElementRef(name = "ServiceReference", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false)
            protected List<JAXBElement<Object>> serviceReference;
            @XmlElement(name = "ServiceID")
            protected List<ServiceIDType> serviceID;

            /**
             * Gets the value of the serviceReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the serviceReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link Object }{@code >}
             * 
             * 
             * @return
             *     The value of the serviceReference property.
             */
            public List<JAXBElement<Object>> getServiceReference() {
                if (serviceReference == null) {
                    serviceReference = new ArrayList<>();
                }
                return this.serviceReference;
            }

            /**
             * Gets the value of the serviceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the serviceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceIDType }
             * 
             * 
             * @return
             *     The value of the serviceID property.
             */
            public List<ServiceIDType> getServiceID() {
                if (serviceID == null) {
                    serviceID = new ArrayList<>();
                }
                return this.serviceID;
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
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>UniqueStringID_SimpleType">
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyAttrGroup"/>
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
        public static class BundleID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ObjectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String objectKey;

            /**
             * A data type for a Unique String Identifier constraint.
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

            /**
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
            }

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
         *       <choice maxOccurs="2">
         *         <element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         <element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
            "minimumQuantityOrMaximumQuantity"
        })
        public static class Selection {

            @XmlElementRefs({
                @XmlElementRef(name = "MinimumQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "MaximumQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<BigInteger>> minimumQuantityOrMaximumQuantity;

            /**
             * Gets the value of the minimumQuantityOrMaximumQuantity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the minimumQuantityOrMaximumQuantity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMinimumQuantityOrMaximumQuantity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * 
             * 
             * @return
             *     The value of the minimumQuantityOrMaximumQuantity property.
             */
            public List<JAXBElement<BigInteger>> getMinimumQuantityOrMaximumQuantity() {
                if (minimumQuantityOrMaximumQuantity == null) {
                    minimumQuantityOrMaximumQuantity = new ArrayList<>();
                }
                return this.minimumQuantityOrMaximumQuantity;
            }

        }

    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE CORE definition.
 * 
 * <p>Java class for ServiceCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceCoreType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID"/>
 *         <element name="Name">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Encoding" type="{http://www.iata.org/IATA/EDIST/2017.2}ServiceEncodingType" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimeLimits" minOccurs="0"/>
 *         <element name="FeeMethod" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}ServiceDescriptionType"/>
 *         <element name="Settlement" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType"/>
 *                   <element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.2}ServicePriceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BookingInstructions" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="UpgradeMethod" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                           <attribute name="NewClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ValidatingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Associations" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}ServiceAssocType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
 *         <element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *       <attribute name="ObjectKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCoreType", propOrder = {
    "serviceID",
    "name",
    "encoding",
    "timeLimits",
    "feeMethod",
    "descriptions",
    "settlement",
    "price",
    "bookingInstructions",
    "validatingCarrier",
    "associations",
    "baggageDeterminingCarrier",
    "bdcAnalysisResult"
})
@XmlSeeAlso({
    ServiceDetailType.class
})
public class ServiceCoreType {

    @XmlElement(name = "ServiceID", required = true)
    protected ServiceIDType serviceID;
    @XmlElement(name = "Name", required = true)
    protected ServiceCoreType.Name name;
    @XmlElement(name = "Encoding")
    protected ServiceEncodingType encoding;
    @XmlElement(name = "TimeLimits")
    protected TimeLimits timeLimits;
    @XmlElement(name = "FeeMethod", defaultValue = "OC")
    protected ServiceCoreType.FeeMethod feeMethod;
    @XmlElement(name = "Descriptions", required = true)
    protected ServiceDescriptionType descriptions;
    @XmlElement(name = "Settlement")
    protected ServiceCoreType.Settlement settlement;
    @XmlElement(name = "Price")
    protected List<ServicePriceType> price;
    @XmlElement(name = "BookingInstructions")
    protected ServiceCoreType.BookingInstructions bookingInstructions;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "Associations")
    protected List<ServiceCoreType.Associations> associations;
    @XmlElement(name = "BaggageDeterminingCarrier")
    protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
    @XmlElement(name = "BDC_AnalysisResult")
    protected String bdcAnalysisResult;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIDType }
     *     
     */
    public ServiceIDType getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIDType }
     *     
     */
    public void setServiceID(ServiceIDType value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.Name }
     *     
     */
    public ServiceCoreType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.Name }
     *     
     */
    public void setName(ServiceCoreType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEncodingType }
     *     
     */
    public ServiceEncodingType getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEncodingType }
     *     
     */
    public void setEncoding(ServiceEncodingType value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLimits }
     *     
     */
    public TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLimits }
     *     
     */
    public void setTimeLimits(TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the feeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.FeeMethod }
     *     
     */
    public ServiceCoreType.FeeMethod getFeeMethod() {
        return feeMethod;
    }

    /**
     * Sets the value of the feeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.FeeMethod }
     *     
     */
    public void setFeeMethod(ServiceCoreType.FeeMethod value) {
        this.feeMethod = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionType }
     *     
     */
    public ServiceDescriptionType getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionType }
     *     
     */
    public void setDescriptions(ServiceDescriptionType value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.Settlement }
     *     
     */
    public ServiceCoreType.Settlement getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.Settlement }
     *     
     */
    public void setSettlement(ServiceCoreType.Settlement value) {
        this.settlement = value;
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
     * Gets the value of the bookingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.BookingInstructions }
     *     
     */
    public ServiceCoreType.BookingInstructions getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * Sets the value of the bookingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.BookingInstructions }
     *     
     */
    public void setBookingInstructions(ServiceCoreType.BookingInstructions value) {
        this.bookingInstructions = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrier(String value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the associations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCoreType.Associations }
     * 
     * 
     * @return
     *     The value of the associations property.
     */
    public List<ServiceCoreType.Associations> getAssociations() {
        if (associations == null) {
            associations = new ArrayList<>();
        }
        return this.associations;
    }

    /**
     * Gets the value of the baggageDeterminingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDeterminingCarrierType }
     *     
     */
    public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
        return baggageDeterminingCarrier;
    }

    /**
     * Sets the value of the baggageDeterminingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDeterminingCarrierType }
     *     
     */
    public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
        this.baggageDeterminingCarrier = value;
    }

    /**
     * Gets the value of the bdcAnalysisResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCAnalysisResult() {
        return bdcAnalysisResult;
    }

    /**
     * Sets the value of the bdcAnalysisResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCAnalysisResult(String value) {
        this.bdcAnalysisResult = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}ServiceAssocType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Associations
        extends ServiceAssocType
    {


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
     *         <element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="UpgradeMethod" minOccurs="0">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *                 <attribute name="NewClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ssrCode",
        "osiText",
        "method",
        "upgradeMethod",
        "text",
        "equipment"
    })
    public static class BookingInstructions {

        @XmlElement(name = "SSRCode")
        protected List<String> ssrCode;
        @XmlElement(name = "OSIText")
        protected List<String> osiText;
        @XmlElement(name = "Method")
        protected String method;
        @XmlElement(name = "UpgradeMethod")
        protected ServiceCoreType.BookingInstructions.UpgradeMethod upgradeMethod;
        @XmlElement(name = "Text")
        protected List<String> text;
        @XmlElement(name = "Equipment")
        protected String equipment;

        /**
         * Gets the value of the ssrCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the ssrCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSSRCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the ssrCode property.
         */
        public List<String> getSSRCode() {
            if (ssrCode == null) {
                ssrCode = new ArrayList<>();
            }
            return this.ssrCode;
        }

        /**
         * Gets the value of the osiText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the osiText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOSIText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the osiText property.
         */
        public List<String> getOSIText() {
            if (osiText == null) {
                osiText = new ArrayList<>();
            }
            return this.osiText;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the upgradeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCoreType.BookingInstructions.UpgradeMethod }
         *     
         */
        public ServiceCoreType.BookingInstructions.UpgradeMethod getUpgradeMethod() {
            return upgradeMethod;
        }

        /**
         * Sets the value of the upgradeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCoreType.BookingInstructions.UpgradeMethod }
         *     
         */
        public void setUpgradeMethod(ServiceCoreType.BookingInstructions.UpgradeMethod value) {
            this.upgradeMethod = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the text property.
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipment(String value) {
            this.equipment = value;
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
         *       <attribute name="NewClass" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class UpgradeMethod {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "NewClass")
            protected String newClass;

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
             * Gets the value of the newClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewClass() {
                return newClass;
            }

            /**
             * Sets the value of the newClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewClass(String value) {
                this.newClass = value;
            }

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
    public static class FeeMethod {

        @XmlValue
        protected String value;

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
    public static class Name {

        @XmlValue
        protected String value;

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
     *         <element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType"/>
     *         <element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
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
        "method",
        "interlineSettlementValue"
    })
    public static class Settlement {

        @XmlElement(name = "Method", required = true)
        protected String method;
        @XmlElement(name = "InterlineSettlementValue")
        protected CurrencyAmountOptType interlineSettlementValue;

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the interlineSettlementValue property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getInterlineSettlementValue() {
            return interlineSettlementValue;
        }

        /**
         * Sets the value of the interlineSettlementValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setInterlineSettlementValue(CurrencyAmountOptType value) {
            this.interlineSettlementValue = value;
        }

    }

}

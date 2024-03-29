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
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Business Object Parameters.
 * 
 * <p>Java class for MessageParamsBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageParamsBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Languages" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LanguageCode" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CurrCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FiledInCurrency" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CurrCode"/>
 *                           </sequence>
 *                           <attribute name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}NumericStringLength1to19" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MeasurementSystem" type="{http://www.iata.org/IATA/EDIST/2017.2}MeasurementTypeListType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageParamsBaseType", propOrder = {
    "languages",
    "currCodes",
    "measurementSystem"
})
@XmlSeeAlso({
    SrvListResParamsType.class
})
public class MessageParamsBaseType {

    @XmlElement(name = "Languages")
    protected MessageParamsBaseType.Languages languages;
    @XmlElement(name = "CurrCodes")
    protected MessageParamsBaseType.CurrCodes currCodes;
    @XmlElement(name = "MeasurementSystem")
    @XmlSchemaType(name = "string")
    protected MeasurementTypeListType measurementSystem;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link MessageParamsBaseType.Languages }
     *     
     */
    public MessageParamsBaseType.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageParamsBaseType.Languages }
     *     
     */
    public void setLanguages(MessageParamsBaseType.Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the currCodes property.
     * 
     * @return
     *     possible object is
     *     {@link MessageParamsBaseType.CurrCodes }
     *     
     */
    public MessageParamsBaseType.CurrCodes getCurrCodes() {
        return currCodes;
    }

    /**
     * Sets the value of the currCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageParamsBaseType.CurrCodes }
     *     
     */
    public void setCurrCodes(MessageParamsBaseType.CurrCodes value) {
        this.currCodes = value;
    }

    /**
     * Gets the value of the measurementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementTypeListType }
     *     
     */
    public MeasurementTypeListType getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * Sets the value of the measurementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementTypeListType }
     *     
     */
    public void setMeasurementSystem(MeasurementTypeListType value) {
        this.measurementSystem = value;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="FiledInCurrency" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CurrCode"/>
     *                 </sequence>
     *                 <attribute name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}NumericStringLength1to19" />
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
        "filedInCurrency"
    })
    public static class CurrCodes {

        @XmlElement(name = "FiledInCurrency")
        protected List<MessageParamsBaseType.CurrCodes.FiledInCurrency> filedInCurrency;

        /**
         * Gets the value of the filedInCurrency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the filedInCurrency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFiledInCurrency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MessageParamsBaseType.CurrCodes.FiledInCurrency }
         * 
         * 
         * @return
         *     The value of the filedInCurrency property.
         */
        public List<MessageParamsBaseType.CurrCodes.FiledInCurrency> getFiledInCurrency() {
            if (filedInCurrency == null) {
                filedInCurrency = new ArrayList<>();
            }
            return this.filedInCurrency;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CurrCode"/>
         *       </sequence>
         *       <attribute name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}NumericStringLength1to19" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "currCode"
        })
        public static class FiledInCurrency {

            @XmlElement(name = "CurrCode", required = true)
            protected CurrCode currCode;
            @XmlAttribute(name = "Amount")
            protected String amount;

            /**
             * Gets the value of the currCode property.
             * 
             * @return
             *     possible object is
             *     {@link CurrCode }
             *     
             */
            public CurrCode getCurrCode() {
                return currCode;
            }

            /**
             * Sets the value of the currCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrCode }
             *     
             */
            public void setCurrCode(CurrCode value) {
                this.currCode = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmount(String value) {
                this.amount = value;
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
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LanguageCode" maxOccurs="unbounded"/>
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
        "languageCode"
    })
    public static class Languages {

        @XmlElement(name = "LanguageCode", required = true)
        protected List<LanguageCodeType> languageCode;

        /**
         * Gets the value of the languageCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the languageCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguageCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageCodeType }
         * 
         * 
         * @return
         *     The value of the languageCode property.
         */
        public List<LanguageCodeType> getLanguageCode() {
            if (languageCode == null) {
                languageCode = new ArrayList<>();
            }
            return this.languageCode;
        }

    }

}
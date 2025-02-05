//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for PADIS/ CODESET Metadata.
 * 
 * <p>Java class for CodesetMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CodesetMetadataType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetadataObjectBaseType">
 *       <sequence>
 *         <element name="Source" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OwnerID" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                           <attribute name="Name">
 *                             <simpleType>
 *                               <restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="File" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
 *                   <element name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OtherLanguage" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LanguageCode"/>
 *                   <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
 *                 </sequence>
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
@XmlType(name = "CodesetMetadataType", propOrder = {
    "source",
    "otherLanguage"
})
public class CodesetMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Source")
    protected CodesetMetadataType.Source source;
    @XmlElement(name = "OtherLanguage")
    protected CodesetMetadataType.OtherLanguage otherLanguage;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetMetadataType.Source }
     *     
     */
    public CodesetMetadataType.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetMetadataType.Source }
     *     
     */
    public void setSource(CodesetMetadataType.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the otherLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetMetadataType.OtherLanguage }
     *     
     */
    public CodesetMetadataType.OtherLanguage getOtherLanguage() {
        return otherLanguage;
    }

    /**
     * Sets the value of the otherLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetMetadataType.OtherLanguage }
     *     
     */
    public void setOtherLanguage(CodesetMetadataType.OtherLanguage value) {
        this.otherLanguage = value;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LanguageCode"/>
     *         <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" minOccurs="0"/>
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
        "languageCode",
        "description"
    })
    public static class OtherLanguage {

        @XmlElement(name = "LanguageCode", required = true)
        protected LanguageCodeType languageCode;
        @XmlElement(name = "Description")
        protected String description;

        /**
         * Gets the value of the languageCode property.
         * 
         * @return
         *     possible object is
         *     {@link LanguageCodeType }
         *     
         */
        public LanguageCodeType getLanguageCode() {
            return languageCode;
        }

        /**
         * Sets the value of the languageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link LanguageCodeType }
         *     
         */
        public void setLanguageCode(LanguageCodeType value) {
            this.languageCode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
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
     *         <element name="OwnerID" minOccurs="0">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *                 <attribute name="Name">
     *                   <simpleType>
     *                     <restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *         <element name="File" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
     *         <element name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
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
        "ownerID",
        "file",
        "version"
    })
    public static class Source {

        @XmlElement(name = "OwnerID")
        protected CodesetMetadataType.Source.OwnerID ownerID;
        @XmlElement(name = "File")
        protected String file;
        @XmlElement(name = "Version")
        protected String version;

        /**
         * Gets the value of the ownerID property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetMetadataType.Source.OwnerID }
         *     
         */
        public CodesetMetadataType.Source.OwnerID getOwnerID() {
            return ownerID;
        }

        /**
         * Sets the value of the ownerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetMetadataType.Source.OwnerID }
         *     
         */
        public void setOwnerID(CodesetMetadataType.Source.OwnerID value) {
            this.ownerID = value;
        }

        /**
         * Gets the value of the file property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFile() {
            return file;
        }

        /**
         * Sets the value of the file property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFile(String value) {
            this.file = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
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
         *       <attribute name="Name">
         *         <simpleType>
         *           <restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
         *           </restriction>
         *         </simpleType>
         *       </attribute>
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
        public static class OwnerID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Name")
            protected String name;

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

        }

    }

}

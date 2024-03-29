//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PASSENGER Metadata definition.
 * 
 * <p>Java class for PassengerMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PassengerMetadataType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetadataObjectBaseType">
 *       <sequence>
 *         <element name="NameDetail" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="GivenNamePrefix" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" maxOccurs="3" minOccurs="0"/>
 *                   <element name="TitleSuffix" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" maxOccurs="5" minOccurs="0"/>
 *                   <element name="SurnamePrefix" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *                   <element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" maxOccurs="3" minOccurs="0"/>
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
@XmlType(name = "PassengerMetadataType", propOrder = {
    "nameDetail"
})
public class PassengerMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "NameDetail")
    protected PassengerMetadataType.NameDetail nameDetail;

    /**
     * Gets the value of the nameDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerMetadataType.NameDetail }
     *     
     */
    public PassengerMetadataType.NameDetail getNameDetail() {
        return nameDetail;
    }

    /**
     * Sets the value of the nameDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerMetadataType.NameDetail }
     *     
     */
    public void setNameDetail(PassengerMetadataType.NameDetail value) {
        this.nameDetail = value;
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
     *         <element name="GivenNamePrefix" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" maxOccurs="3" minOccurs="0"/>
     *         <element name="TitleSuffix" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" maxOccurs="5" minOccurs="0"/>
     *         <element name="SurnamePrefix" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
     *         <element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" maxOccurs="3" minOccurs="0"/>
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
        "givenNamePrefix",
        "titleSuffix",
        "surnamePrefix",
        "surnameSuffix"
    })
    public static class NameDetail {

        @XmlElement(name = "GivenNamePrefix")
        protected List<String> givenNamePrefix;
        @XmlElement(name = "TitleSuffix")
        protected List<String> titleSuffix;
        @XmlElement(name = "SurnamePrefix")
        protected String surnamePrefix;
        @XmlElement(name = "SurnameSuffix")
        protected List<String> surnameSuffix;

        /**
         * Gets the value of the givenNamePrefix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the givenNamePrefix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGivenNamePrefix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the givenNamePrefix property.
         */
        public List<String> getGivenNamePrefix() {
            if (givenNamePrefix == null) {
                givenNamePrefix = new ArrayList<>();
            }
            return this.givenNamePrefix;
        }

        /**
         * Gets the value of the titleSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the titleSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTitleSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the titleSuffix property.
         */
        public List<String> getTitleSuffix() {
            if (titleSuffix == null) {
                titleSuffix = new ArrayList<>();
            }
            return this.titleSuffix;
        }

        /**
         * Gets the value of the surnamePrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnamePrefix() {
            return surnamePrefix;
        }

        /**
         * Sets the value of the surnamePrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnamePrefix(String value) {
            this.surnamePrefix = value;
        }

        /**
         * Gets the value of the surnameSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the surnameSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurnameSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the surnameSuffix property.
         */
        public List<String> getSurnameSuffix() {
            if (surnameSuffix == null) {
                surnameSuffix = new ArrayList<>();
            }
            return this.surnameSuffix;
        }

    }

}

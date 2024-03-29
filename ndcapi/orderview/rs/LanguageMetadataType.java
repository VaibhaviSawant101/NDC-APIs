//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for LANGUAGE Metadata.
 * 
 * <p>Java class for LanguageMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LanguageMetadataType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetadataObjectBaseType">
 *       <sequence>
 *         <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}LanguageAppSimpleType" minOccurs="0"/>
 *         <element name="Code_ISO" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *         <element name="Code_NLS" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageMetadataType", propOrder = {
    "application",
    "codeISO",
    "codeNLS",
    "name"
})
public class LanguageMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Application")
    protected String application;
    @XmlElement(name = "Code_ISO")
    protected String codeISO;
    @XmlElement(name = "Code_NLS")
    protected String codeNLS;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the codeISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeISO() {
        return codeISO;
    }

    /**
     * Sets the value of the codeISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeISO(String value) {
        this.codeISO = value;
    }

    /**
     * Gets the value of the codeNLS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeNLS() {
        return codeNLS;
    }

    /**
     * Sets the value of the codeNLS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNLS(String value) {
        this.codeNLS = value;
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

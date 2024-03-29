//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Other Contact Method information.   (i.e. social media handle, website, etc.)
 * 
 * <p>Java class for OtherAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleNameType"/>
 *         <element name="OtherAddressValue" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleTextType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAddressType", propOrder = {
    "label",
    "otherAddressValue"
})
public class OtherAddressType {

    @XmlElement(name = "Label", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String label;
    @XmlElement(name = "OtherAddressValue", required = true)
    protected String otherAddressValue;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the otherAddressValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressValue() {
        return otherAddressValue;
    }

    /**
     * Sets the value of the otherAddressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddressValue(String value) {
        this.otherAddressValue = value;
    }

}

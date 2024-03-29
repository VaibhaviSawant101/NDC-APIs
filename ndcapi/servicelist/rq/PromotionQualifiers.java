//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PromoQualifierType">
 *       <attribute name="CC_IssuingCountryInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PromotionQualifiers")
public class PromotionQualifiers
    extends PromoQualifierType
{

    @XmlAttribute(name = "CC_IssuingCountryInd")
    @XmlSchemaType(name = "anySimpleType")
    protected String ccIssuingCountryInd;

    /**
     * Gets the value of the ccIssuingCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCIssuingCountryInd() {
        return ccIssuingCountryInd;
    }

    /**
     * Sets the value of the ccIssuingCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCIssuingCountryInd(String value) {
        this.ccIssuingCountryInd = value;
    }

}

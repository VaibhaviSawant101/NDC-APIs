//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AWARD/ REDEMPTION PRICE BASIS UNIT definition.
 * 
 * <p>Java class for AwardPriceUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AwardPriceUnitType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardRedemptionType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardPriceUnitType", propOrder = {
    "redemption"
})
public class AwardPriceUnitType {

    @XmlElement(name = "Redemption", required = true)
    protected AwardRedemptionType redemption;

    /**
     * Gets the value of the redemption property.
     * 
     * @return
     *     possible object is
     *     {@link AwardRedemptionType }
     *     
     */
    public AwardRedemptionType getRedemption() {
        return redemption;
    }

    /**
     * Sets the value of the redemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardRedemptionType }
     *     
     */
    public void setRedemption(AwardRedemptionType value) {
        this.redemption = value;
    }

}

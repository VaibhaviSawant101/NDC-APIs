//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Best Pricing Method Preference.
 * 
 * <p>Java class for BestPricingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BestPricingPreferencesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BestPricingOption">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Y"/>
 *               <enumeration value="C"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
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
@XmlType(name = "BestPricingPreferencesType", propOrder = {
    "bestPricingOption"
})
public class BestPricingPreferencesType {

    @XmlElement(name = "BestPricingOption", required = true)
    protected String bestPricingOption;

    /**
     * Gets the value of the bestPricingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestPricingOption() {
        return bestPricingOption;
    }

    /**
     * Sets the value of the bestPricingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestPricingOption(String value) {
        this.bestPricingOption = value;
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Order Item Time Limits definition.
 * 
 * <p>Java class for OrderItemTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderItemTimeLimitsType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}OrderTimeLimitsType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimits" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketingTimeLimits" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemTimeLimitsType", propOrder = {
    "priceGuaranteeTimeLimits",
    "ticketingTimeLimits"
})
public class OrderItemTimeLimitsType
    extends OrderTimeLimitsType
{

    @XmlElement(name = "PriceGuaranteeTimeLimits")
    protected PriceGuaranteeTimeLimitType priceGuaranteeTimeLimits;
    @XmlElement(name = "TicketingTimeLimits")
    protected TicketingTimeLimits ticketingTimeLimits;

    /**
     * Gets the value of the priceGuaranteeTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public PriceGuaranteeTimeLimitType getPriceGuaranteeTimeLimits() {
        return priceGuaranteeTimeLimits;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public void setPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        this.priceGuaranteeTimeLimits = value;
    }

    /**
     * Gets the value of the ticketingTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public TicketingTimeLimits getTicketingTimeLimits() {
        return ticketingTimeLimits;
    }

    /**
     * Sets the value of the ticketingTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public void setTicketingTimeLimits(TicketingTimeLimits value) {
        this.ticketingTimeLimits = value;
    }

}

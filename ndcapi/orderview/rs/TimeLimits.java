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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="PaymentTimeLimit" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimit" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DepositTimeLimit" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketingTimeLimits" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}NamingTimeLimit" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BilateralTimeLimits" minOccurs="0"/>
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
    "paymentTimeLimit",
    "priceGuaranteeTimeLimit",
    "depositTimeLimit",
    "ticketingTimeLimits",
    "namingTimeLimit",
    "bilateralTimeLimits"
})
@XmlRootElement(name = "TimeLimits")
public class TimeLimits {

    @XmlElement(name = "PaymentTimeLimit")
    protected TimeLimits.PaymentTimeLimit paymentTimeLimit;
    @XmlElement(name = "PriceGuaranteeTimeLimit")
    protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
    @XmlElement(name = "DepositTimeLimit")
    protected DepositTimeLimit depositTimeLimit;
    @XmlElement(name = "TicketingTimeLimits")
    protected TicketingTimeLimits ticketingTimeLimits;
    @XmlElement(name = "NamingTimeLimit")
    protected NamingTimeLimit namingTimeLimit;
    @XmlElement(name = "BilateralTimeLimits")
    protected BilateralTimeLimitsType bilateralTimeLimits;

    /**
     * Gets the value of the paymentTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLimits.PaymentTimeLimit }
     *     
     */
    public TimeLimits.PaymentTimeLimit getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * Sets the value of the paymentTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLimits.PaymentTimeLimit }
     *     
     */
    public void setPaymentTimeLimit(TimeLimits.PaymentTimeLimit value) {
        this.paymentTimeLimit = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimit }
     *     
     */
    public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
        return priceGuaranteeTimeLimit;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimit }
     *     
     */
    public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
        this.priceGuaranteeTimeLimit = value;
    }

    /**
     * Gets the value of the depositTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link DepositTimeLimit }
     *     
     */
    public DepositTimeLimit getDepositTimeLimit() {
        return depositTimeLimit;
    }

    /**
     * Sets the value of the depositTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositTimeLimit }
     *     
     */
    public void setDepositTimeLimit(DepositTimeLimit value) {
        this.depositTimeLimit = value;
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

    /**
     * Gets the value of the namingTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link NamingTimeLimit }
     *     
     */
    public NamingTimeLimit getNamingTimeLimit() {
        return namingTimeLimit;
    }

    /**
     * Sets the value of the namingTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingTimeLimit }
     *     
     */
    public void setNamingTimeLimit(NamingTimeLimit value) {
        this.namingTimeLimit = value;
    }

    /**
     * Gets the value of the bilateralTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link BilateralTimeLimitsType }
     *     
     */
    public BilateralTimeLimitsType getBilateralTimeLimits() {
        return bilateralTimeLimits;
    }

    /**
     * Sets the value of the bilateralTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilateralTimeLimitsType }
     *     
     */
    public void setBilateralTimeLimits(BilateralTimeLimitsType value) {
        this.bilateralTimeLimits = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType">
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentTimeLimit
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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

    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ACCEPTED PAYMENT FORM definition.
 * 
 * <p>Java class for AcceptedPaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptedPaymentFormType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType"/>
 *         <element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPriceType" minOccurs="0"/>
 *         <element name="Qualifier" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Voucher" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PaymentCard" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Other" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MiscChargeOrder" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}LoyaltyRedemption" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DirectBill" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Cash" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BankAccount" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations" minOccurs="0"/>
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
@XmlType(name = "AcceptedPaymentFormType", propOrder = {
    "type",
    "amount",
    "qualifier",
    "voucher",
    "paymentCard",
    "other",
    "miscChargeOrder",
    "loyaltyRedemption",
    "directBill",
    "cash",
    "bankAccount",
    "associations"
})
public class AcceptedPaymentFormType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Amount")
    protected SimpleCurrencyPriceType amount;
    @XmlElement(name = "Qualifier")
    protected String qualifier;
    @XmlElement(name = "Voucher")
    protected Voucher voucher;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "Other")
    protected Other other;
    @XmlElement(name = "MiscChargeOrder")
    protected MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "LoyaltyRedemption")
    protected LoyaltyRedemption loyaltyRedemption;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "Cash")
    protected Cash cash;
    @XmlElement(name = "BankAccount")
    protected BankAccountType bankAccount;
    @XmlElement(name = "Associations")
    protected OrderItemAssociationType associations;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public SimpleCurrencyPriceType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public void setAmount(SimpleCurrencyPriceType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Information relating to prepayment vouchers.
     * 
     * @return
     *     possible object is
     *     {@link Voucher }
     *     
     */
    public Voucher getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voucher }
     *     
     */
    public void setVoucher(Voucher value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Other }
     *     
     */
    public Other getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Other }
     *     
     */
    public void setOther(Other value) {
        this.other = value;
    }

    /**
     * Gets the value of the miscChargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MiscChargeOrder }
     *     
     */
    public MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Sets the value of the miscChargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemption }
     *     
     */
    public LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemption }
     *     
     */
    public void setLoyaltyRedemption(LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link Cash }
     *     
     */
    public Cash getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cash }
     *     
     */
    public void setCash(Cash value) {
        this.cash = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccount(BankAccountType value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setAssociations(OrderItemAssociationType value) {
        this.associations = value;
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

}
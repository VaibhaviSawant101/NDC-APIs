//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PROCESSING ALERT definition.
 * 
 * <p>Java class for AlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AlertType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InventoryDiscrepancyAlert"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PIN_AuthenticationAlert"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SecurePaymentAlert"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertType", propOrder = {
    "inventoryDiscrepancyAlert",
    "pinAuthenticationAlert",
    "securePaymentAlert"
})
@XmlSeeAlso({
    orderview.rs.AlertsType.Alert.class
})
public class AlertType {

    @XmlElement(name = "InventoryDiscrepancyAlert")
    protected InvDiscrepencyAlertType inventoryDiscrepancyAlert;
    @XmlElement(name = "PIN_AuthenticationAlert")
    protected PINAuthTravelerType pinAuthenticationAlert;
    @XmlElement(name = "SecurePaymentAlert")
    protected SecurePaymentAlertType securePaymentAlert;

    /**
     * Gets the value of the inventoryDiscrepancyAlert property.
     * 
     * @return
     *     possible object is
     *     {@link InvDiscrepencyAlertType }
     *     
     */
    public InvDiscrepencyAlertType getInventoryDiscrepancyAlert() {
        return inventoryDiscrepancyAlert;
    }

    /**
     * Sets the value of the inventoryDiscrepancyAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvDiscrepencyAlertType }
     *     
     */
    public void setInventoryDiscrepancyAlert(InvDiscrepencyAlertType value) {
        this.inventoryDiscrepancyAlert = value;
    }

    /**
     * Gets the value of the pinAuthenticationAlert property.
     * 
     * @return
     *     possible object is
     *     {@link PINAuthTravelerType }
     *     
     */
    public PINAuthTravelerType getPINAuthenticationAlert() {
        return pinAuthenticationAlert;
    }

    /**
     * Sets the value of the pinAuthenticationAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINAuthTravelerType }
     *     
     */
    public void setPINAuthenticationAlert(PINAuthTravelerType value) {
        this.pinAuthenticationAlert = value;
    }

    /**
     * Gets the value of the securePaymentAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType }
     *     
     */
    public SecurePaymentAlertType getSecurePaymentAlert() {
        return securePaymentAlert;
    }

    /**
     * Sets the value of the securePaymentAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType }
     *     
     */
    public void setSecurePaymentAlert(SecurePaymentAlertType value) {
        this.securePaymentAlert = value;
    }

}
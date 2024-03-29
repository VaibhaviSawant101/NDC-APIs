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
 * COUPON-RELATED ORDER REFERENCE definition.
 * 
 * <p>Java class for CouponOrderKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CouponOrderKeyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderID" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderItemID" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BookingReference" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ShoppingResponseID" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponOrderKeyType", propOrder = {
    "orderID",
    "orderItemID",
    "offerItemID",
    "serviceID",
    "bookingReference",
    "shoppingResponseID"
})
public class CouponOrderKeyType {

    @XmlElement(name = "OrderID")
    protected OrderIDType orderID;
    @XmlElement(name = "OrderItemID")
    protected ItemIDType orderItemID;
    @XmlElement(name = "OfferItemID")
    protected ItemIDType offerItemID;
    @XmlElement(name = "ServiceID")
    protected List<ServiceIDType> serviceID;
    @XmlElement(name = "BookingReference")
    protected BookingReference bookingReference;
    @XmlElement(name = "ShoppingResponseID")
    protected ShoppingResponseIDType shoppingResponseID;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIDType }
     *     
     */
    public OrderIDType getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIDType }
     *     
     */
    public void setOrderID(OrderIDType value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOrderItemID(ItemIDType value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOfferItemID(ItemIDType value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the serviceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIDType }
     * 
     * 
     * @return
     *     The value of the serviceID property.
     */
    public List<ServiceIDType> getServiceID() {
        if (serviceID == null) {
            serviceID = new ArrayList<>();
        }
        return this.serviceID;
    }

    /**
     * Gets the value of the bookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReference }
     *     
     */
    public BookingReference getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReference }
     *     
     */
    public void setBookingReference(BookingReference value) {
        this.bookingReference = value;
    }

    /**
     * Gets the value of the shoppingResponseID property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public ShoppingResponseIDType getShoppingResponseID() {
        return shoppingResponseID;
    }

    /**
     * Sets the value of the shoppingResponseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public void setShoppingResponseID(ShoppingResponseIDType value) {
        this.shoppingResponseID = value;
    }

}

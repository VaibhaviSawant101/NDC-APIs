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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * COUPON TICKET DOCUMENT definition.
 * 
 * <p>Java class for TicketDocHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TicketDocHistoryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TicketDocNbr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="14"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *         <element name="CouponInfo" type="{http://www.iata.org/IATA/EDIST/2017.2}HistoryCouponInfoType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDocHistoryType", propOrder = {
    "ticketDocNbr",
    "type",
    "couponInfo"
})
public class TicketDocHistoryType {

    @XmlElement(name = "TicketDocNbr", required = true)
    protected String ticketDocNbr;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "CouponInfo", required = true)
    protected List<HistoryCouponInfoType> couponInfo;

    /**
     * Gets the value of the ticketDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocNbr() {
        return ticketDocNbr;
    }

    /**
     * Sets the value of the ticketDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocNbr(String value) {
        this.ticketDocNbr = value;
    }

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
     * Gets the value of the couponInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the couponInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryCouponInfoType }
     * 
     * 
     * @return
     *     The value of the couponInfo property.
     */
    public List<HistoryCouponInfoType> getCouponInfo() {
        if (couponInfo == null) {
            couponInfo = new ArrayList<>();
        }
        return this.couponInfo;
    }

}

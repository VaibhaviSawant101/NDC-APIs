//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type definition for Commonly Used Date Representation Formats: Short Date, Date and Time, Timestamp
 * 
 * <p>Java class for CoreDateGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CoreDateGrpType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="ShortDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="Time" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreDateGrpType")
@XmlSeeAlso({
    seatavailability.rq.ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start.class,
    seatavailability.rq.ServiceQualifierPriceType.Fulfillment.OfferValidDates.End.class,
    seatavailability.rq.InvGuaranteeType.InvGuaranteeTimeLimit.class,
    seatavailability.rq.TimeLimits.PaymentTimeLimit.class,
    seatavailability.rq.ServiceFulfillmentType.OfferValidDates.Start.class,
    seatavailability.rq.ServiceFulfillmentType.OfferValidDates.End.class,
    seatavailability.rq.FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start.class,
    seatavailability.rq.FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End.class,
    seatavailability.rq.OfferIncentiveType.Incentive.ExpirationDate.class,
    seatavailability.rq.OfferValidPeriodType.Earliest.class,
    seatavailability.rq.OfferValidPeriodType.Latest.class,
    seatavailability.rq.OfferTimeLimitSetType.OfferExpiration.class,
    seatavailability.rq.OrderType.TimeLimits.PaymentTimeLimit.class,
    seatavailability.rq.CouponSoldAirlineType.DepartureDateTime.class,
    seatavailability.rq.CouponSoldAirlineType.ArrivalDateTime.class,
    seatavailability.rq.CouponFlightSegmentType.DepartureDateTime.class,
    InventoryGuaranteeTimeLimits.class
})
public class CoreDateGrpType {

    @XmlAttribute(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "ShortDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shortDate;
    @XmlAttribute(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "Time")
    protected String time;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the shortDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShortDate() {
        return shortDate;
    }

    /**
     * Sets the value of the shortDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShortDate(XMLGregorianCalendar value) {
        this.shortDate = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}

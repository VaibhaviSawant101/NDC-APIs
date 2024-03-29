//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM IN ORDER definition.
 * 
 * <p>Java class for OrderOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderOfferItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID"/>
 *         <element name="OfferItemType">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BaggageItem" maxOccurs="unbounded"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DetailedFlightItem" maxOccurs="unbounded"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherItem" maxOccurs="unbounded"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SeatItem" maxOccurs="unbounded"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemTimeLimitSetType" minOccurs="0"/>
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
@XmlType(name = "OrderOfferItemType", propOrder = {
    "offerItemID",
    "offerItemType",
    "timeLimits"
})
public class OrderOfferItemType {

    @XmlElement(name = "OfferItemID", required = true)
    protected ItemIDType offerItemID;
    @XmlElement(name = "OfferItemType", required = true)
    protected OrderOfferItemType.OfferItemType offerItemType;
    @XmlElement(name = "TimeLimits")
    protected OfferItemTimeLimitSetType timeLimits;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the offerItemType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOfferItemType.OfferItemType }
     *     
     */
    public OrderOfferItemType.OfferItemType getOfferItemType() {
        return offerItemType;
    }

    /**
     * Sets the value of the offerItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOfferItemType.OfferItemType }
     *     
     */
    public void setOfferItemType(OrderOfferItemType.OfferItemType value) {
        this.offerItemType = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public OfferItemTimeLimitSetType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public void setTimeLimits(OfferItemTimeLimitSetType value) {
        this.timeLimits = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BaggageItem" maxOccurs="unbounded"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DetailedFlightItem" maxOccurs="unbounded"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OtherItem" maxOccurs="unbounded"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SeatItem" maxOccurs="unbounded"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baggageItem",
        "detailedFlightItem",
        "otherItem",
        "seatItem"
    })
    public static class OfferItemType {

        @XmlElement(name = "BaggageItem")
        protected List<BaggageItemType> baggageItem;
        @XmlElement(name = "DetailedFlightItem")
        protected List<FlightItemType> detailedFlightItem;
        @XmlElement(name = "OtherItem")
        protected List<OtherItemType> otherItem;
        @XmlElement(name = "SeatItem")
        protected List<SeatItem> seatItem;

        /**
         * Gets the value of the baggageItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the baggageItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageItemType }
         * 
         * 
         * @return
         *     The value of the baggageItem property.
         */
        public List<BaggageItemType> getBaggageItem() {
            if (baggageItem == null) {
                baggageItem = new ArrayList<>();
            }
            return this.baggageItem;
        }

        /**
         * Flight Offer Item.Gets the value of the detailedFlightItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the detailedFlightItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailedFlightItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightItemType }
         * 
         * 
         * @return
         *     The value of the detailedFlightItem property.
         */
        public List<FlightItemType> getDetailedFlightItem() {
            if (detailedFlightItem == null) {
                detailedFlightItem = new ArrayList<>();
            }
            return this.detailedFlightItem;
        }

        /**
         * Gets the value of the otherItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the otherItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherItemType }
         * 
         * 
         * @return
         *     The value of the otherItem property.
         */
        public List<OtherItemType> getOtherItem() {
            if (otherItem == null) {
                otherItem = new ArrayList<>();
            }
            return this.otherItem;
        }

        /**
         * Gets the value of the seatItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the seatItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatItem }
         * 
         * 
         * @return
         *     The value of the seatItem property.
         */
        public List<SeatItem> getSeatItem() {
            if (seatItem == null) {
                seatItem = new ArrayList<>();
            }
            return this.seatItem;
        }

    }

}
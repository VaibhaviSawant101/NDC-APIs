//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for AirShopReq Business Object: ATTRIBUTE QUERY definition.
 * 
 * <p>Java class for AirShopReqAttributeQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AirShopReqAttributeQueryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OriginDestination" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedObjectBaseType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Departure"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Arrival"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegMaxTimePreferences" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ShoppingResponseID" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MarketingCarrierAirline" minOccurs="0"/>
 *                   <element name="CalendarDates" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           <attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="OriginDestinationKey" type="{http://www.iata.org/IATA/EDIST/2017.2}KeyIdentifier" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "AirShopReqAttributeQueryType", propOrder = {
    "originDestination"
})
public class AirShopReqAttributeQueryType {

    @XmlElement(name = "OriginDestination", required = true)
    protected List<AirShopReqAttributeQueryType.OriginDestination> originDestination;

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirShopReqAttributeQueryType.OriginDestination }
     * 
     * 
     * @return
     *     The value of the originDestination property.
     */
    public List<AirShopReqAttributeQueryType.OriginDestination> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<>();
        }
        return this.originDestination;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}AssociatedObjectBaseType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Departure"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Arrival"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegMaxTimePreferences" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ShoppingResponseID" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MarketingCarrierAirline" minOccurs="0"/>
     *         <element name="CalendarDates" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 <attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="OriginDestinationKey" type="{http://www.iata.org/IATA/EDIST/2017.2}KeyIdentifier" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departure",
        "arrival",
        "segMaxTimePreferences",
        "shoppingResponseID",
        "marketingCarrierAirline",
        "calendarDates"
    })
    public static class OriginDestination
        extends AssociatedObjectBaseType
    {

        @XmlElement(name = "Departure", required = true)
        protected Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected FlightArrivalType arrival;
        @XmlElement(name = "SegMaxTimePreferences")
        protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;
        @XmlElement(name = "ShoppingResponseID")
        protected ShoppingResponseIDType shoppingResponseID;
        @XmlElement(name = "MarketingCarrierAirline")
        protected MarketingCarrierType marketingCarrierAirline;
        @XmlElement(name = "CalendarDates")
        protected AirShopReqAttributeQueryType.OriginDestination.CalendarDates calendarDates;
        @XmlAttribute(name = "OriginDestinationKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String originDestinationKey;

        /**
         * FLIGHT DEPARTURE (ORIGIN).
         * 
         * @return
         *     possible object is
         *     {@link Departure }
         *     
         */
        public Departure getDeparture() {
            return departure;
        }

        /**
         * Sets the value of the departure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Departure }
         *     
         */
        public void setDeparture(Departure value) {
            this.departure = value;
        }

        /**
         * FLIGHT ARRIVAL (DESTINATION).
         * 
         * @return
         *     possible object is
         *     {@link FlightArrivalType }
         *     
         */
        public FlightArrivalType getArrival() {
            return arrival;
        }

        /**
         * Sets the value of the arrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightArrivalType }
         *     
         */
        public void setArrival(FlightArrivalType value) {
            this.arrival = value;
        }

        /**
         * Gets the value of the segMaxTimePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FltSegmentMaxTimePreferencesType }
         *     
         */
        public FltSegmentMaxTimePreferencesType getSegMaxTimePreferences() {
            return segMaxTimePreferences;
        }

        /**
         * Sets the value of the segMaxTimePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltSegmentMaxTimePreferencesType }
         *     
         */
        public void setSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
            this.segMaxTimePreferences = value;
        }

        /**
         * Flight-related shopping response IDs, including the unique (master) Shopping Session ID, Offer IDs, Offer Item IDs and Service IDs.
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

        /**
         * Gets the value of the marketingCarrierAirline property.
         * 
         * @return
         *     possible object is
         *     {@link MarketingCarrierType }
         *     
         */
        public MarketingCarrierType getMarketingCarrierAirline() {
            return marketingCarrierAirline;
        }

        /**
         * Sets the value of the marketingCarrierAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketingCarrierType }
         *     
         */
        public void setMarketingCarrierAirline(MarketingCarrierType value) {
            this.marketingCarrierAirline = value;
        }

        /**
         * Gets the value of the calendarDates property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopReqAttributeQueryType.OriginDestination.CalendarDates }
         *     
         */
        public AirShopReqAttributeQueryType.OriginDestination.CalendarDates getCalendarDates() {
            return calendarDates;
        }

        /**
         * Sets the value of the calendarDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopReqAttributeQueryType.OriginDestination.CalendarDates }
         *     
         */
        public void setCalendarDates(AirShopReqAttributeQueryType.OriginDestination.CalendarDates value) {
            this.calendarDates = value;
        }

        /**
         * Gets the value of the originDestinationKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginDestinationKey() {
            return originDestinationKey;
        }

        /**
         * Sets the value of the originDestinationKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginDestinationKey(String value) {
            this.originDestinationKey = value;
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
         *       <attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       <attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CalendarDates {

            @XmlAttribute(name = "DaysBefore")
            protected Integer daysBefore;
            @XmlAttribute(name = "DaysAfter")
            protected Integer daysAfter;

            /**
             * Gets the value of the daysBefore property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDaysBefore() {
                return daysBefore;
            }

            /**
             * Sets the value of the daysBefore property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDaysBefore(Integer value) {
                this.daysBefore = value;
            }

            /**
             * Gets the value of the daysAfter property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDaysAfter() {
                return daysAfter;
            }

            /**
             * Sets the value of the daysAfter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDaysAfter(Integer value) {
                this.daysAfter = value;
            }

        }

    }

}

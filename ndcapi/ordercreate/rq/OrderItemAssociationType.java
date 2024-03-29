//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Order Item association(s).
 * 
 * <p>Java class for OrderItemAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderItemAssociationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Passengers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReferences"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Group" type="{http://www.iata.org/IATA/EDIST/2017.2}GroupType" minOccurs="0"/>
 *         <element name="Flight" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <choice maxOccurs="2">
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OriginDestinationReferences"/>
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegmentReferences"/>
 *                   </choice>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OrderItems" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderItemID" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OfferItems" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Services" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OtherAssociations" type="{http://www.iata.org/IATA/EDIST/2017.2}OtherOrderAssocType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="AllPassengersInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="WholeItineraryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemAssociationType", propOrder = {
    "passengers",
    "group",
    "flight",
    "orderItems",
    "offerItems",
    "services",
    "otherAssociations"
})
public class OrderItemAssociationType {

    @XmlElement(name = "Passengers")
    protected OrderItemAssociationType.Passengers passengers;
    @XmlElement(name = "Group")
    protected GroupType group;
    @XmlElement(name = "Flight")
    protected OrderItemAssociationType.Flight flight;
    @XmlElement(name = "OrderItems")
    protected OrderItemAssociationType.OrderItems orderItems;
    @XmlElement(name = "OfferItems")
    protected OrderItemAssociationType.OfferItems offerItems;
    @XmlElement(name = "Services")
    protected OrderItemAssociationType.Services services;
    @XmlElement(name = "OtherAssociations")
    protected OtherOrderAssocType otherAssociations;
    @XmlAttribute(name = "AllPassengersInd")
    protected Boolean allPassengersInd;
    @XmlAttribute(name = "WholeItineraryInd")
    protected Boolean wholeItineraryInd;

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Passengers }
     *     
     */
    public OrderItemAssociationType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Passengers }
     *     
     */
    public void setPassengers(OrderItemAssociationType.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setGroup(GroupType value) {
        this.group = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Flight }
     *     
     */
    public OrderItemAssociationType.Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Flight }
     *     
     */
    public void setFlight(OrderItemAssociationType.Flight value) {
        this.flight = value;
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.OrderItems }
     *     
     */
    public OrderItemAssociationType.OrderItems getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.OrderItems }
     *     
     */
    public void setOrderItems(OrderItemAssociationType.OrderItems value) {
        this.orderItems = value;
    }

    /**
     * Gets the value of the offerItems property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.OfferItems }
     *     
     */
    public OrderItemAssociationType.OfferItems getOfferItems() {
        return offerItems;
    }

    /**
     * Sets the value of the offerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.OfferItems }
     *     
     */
    public void setOfferItems(OrderItemAssociationType.OfferItems value) {
        this.offerItems = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Services }
     *     
     */
    public OrderItemAssociationType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Services }
     *     
     */
    public void setServices(OrderItemAssociationType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the otherAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOrderAssocType }
     *     
     */
    public OtherOrderAssocType getOtherAssociations() {
        return otherAssociations;
    }

    /**
     * Sets the value of the otherAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOrderAssocType }
     *     
     */
    public void setOtherAssociations(OtherOrderAssocType value) {
        this.otherAssociations = value;
    }

    /**
     * Gets the value of the allPassengersInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPassengersInd() {
        return allPassengersInd;
    }

    /**
     * Sets the value of the allPassengersInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllPassengersInd(Boolean value) {
        this.allPassengersInd = value;
    }

    /**
     * Gets the value of the wholeItineraryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWholeItineraryInd() {
        return wholeItineraryInd;
    }

    /**
     * Sets the value of the wholeItineraryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWholeItineraryInd(Boolean value) {
        this.wholeItineraryInd = value;
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
     *         <element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <choice maxOccurs="2">
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OriginDestinationReferences"/>
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegmentReferences"/>
     *         </choice>
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
        "allFlightInd",
        "allOriginDestinationInd",
        "allSegmentInd",
        "originDestinationReferencesOrSegmentReferences"
    })
    public static class Flight {

        @XmlElement(name = "AllFlightInd")
        protected Boolean allFlightInd;
        @XmlElement(name = "AllOriginDestinationInd")
        protected Boolean allOriginDestinationInd;
        @XmlElement(name = "AllSegmentInd")
        protected Boolean allSegmentInd;
        @XmlElementRefs({
            @XmlElementRef(name = "OriginDestinationReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = SegmentReferences.class, required = false)
        })
        protected List<Object> originDestinationReferencesOrSegmentReferences;

        /**
         * Gets the value of the allFlightInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllFlightInd() {
            return allFlightInd;
        }

        /**
         * Sets the value of the allFlightInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllFlightInd(Boolean value) {
            this.allFlightInd = value;
        }

        /**
         * Gets the value of the allOriginDestinationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllOriginDestinationInd() {
            return allOriginDestinationInd;
        }

        /**
         * Sets the value of the allOriginDestinationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllOriginDestinationInd(Boolean value) {
            this.allOriginDestinationInd = value;
        }

        /**
         * Gets the value of the allSegmentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllSegmentInd() {
            return allSegmentInd;
        }

        /**
         * Sets the value of the allSegmentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllSegmentInd(Boolean value) {
            this.allSegmentInd = value;
        }

        /**
         * Gets the value of the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationReferencesOrSegmentReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
         * {@link SegmentReferences }
         * 
         * 
         * @return
         *     The value of the originDestinationReferencesOrSegmentReferences property.
         */
        public List<Object> getOriginDestinationReferencesOrSegmentReferences() {
            if (originDestinationReferencesOrSegmentReferences == null) {
                originDestinationReferencesOrSegmentReferences = new ArrayList<>();
            }
            return this.originDestinationReferencesOrSegmentReferences;
        }

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
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID" maxOccurs="unbounded"/>
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
        "offerItemID"
    })
    public static class OfferItems {

        @XmlElement(name = "OfferItemID", required = true)
        protected List<ItemIDType> offerItemID;

        /**
         * Gets the value of the offerItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the offerItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         * @return
         *     The value of the offerItemID property.
         */
        public List<ItemIDType> getOfferItemID() {
            if (offerItemID == null) {
                offerItemID = new ArrayList<>();
            }
            return this.offerItemID;
        }

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
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderItemID" maxOccurs="unbounded"/>
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
        "orderItemID"
    })
    public static class OrderItems {

        @XmlElement(name = "OrderItemID", required = true)
        protected List<ItemIDType> orderItemID;

        /**
         * Gets the value of the orderItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the orderItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         * @return
         *     The value of the orderItemID property.
         */
        public List<ItemIDType> getOrderItemID() {
            if (orderItemID == null) {
                orderItemID = new ArrayList<>();
            }
            return this.orderItemID;
        }

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
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReferences"/>
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
        "passengerReferences"
    })
    public static class Passengers {

        @XmlList
        @XmlElement(name = "PassengerReferences", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> passengerReferences;

        /**
         * 
         *                                   Association to multiple Passenger instance(s). Example: pax1 pax2
         *                                 Gets the value of the passengerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the passengerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         * @return
         *     The value of the passengerReferences property.
         */
        public List<Object> getPassengerReferences() {
            if (passengerReferences == null) {
                passengerReferences = new ArrayList<>();
            }
            return this.passengerReferences;
        }

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
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
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
        "serviceID"
    })
    public static class Services {

        @XmlElement(name = "ServiceID", required = true)
        protected List<ServiceIDType> serviceID;

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

    }

}

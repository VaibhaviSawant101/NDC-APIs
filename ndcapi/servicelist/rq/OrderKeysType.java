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
 * Shopping CR: This fulfills the requirement to allow previously ordered items to be used as a shopping session qualifiers.
 * 
 * <p>Java class for OrderKeysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderKeysType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderID"/>
 *         <element name="AssociatedIDs" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AssociatedID" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderItemID" minOccurs="0"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID" minOccurs="0"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "OrderKeysType", propOrder = {
    "orderID",
    "associatedIDs"
})
public class OrderKeysType {

    @XmlElement(name = "OrderID", required = true)
    protected OrderIDType orderID;
    @XmlElement(name = "AssociatedIDs")
    protected OrderKeysType.AssociatedIDs associatedIDs;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the associatedIDs property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType.AssociatedIDs }
     *     
     */
    public OrderKeysType.AssociatedIDs getAssociatedIDs() {
        return associatedIDs;
    }

    /**
     * Sets the value of the associatedIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType.AssociatedIDs }
     *     
     */
    public void setAssociatedIDs(OrderKeysType.AssociatedIDs value) {
        this.associatedIDs = value;
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
     *       <sequence>
     *         <element name="AssociatedID" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderItemID" minOccurs="0"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID" minOccurs="0"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
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
    @XmlType(name = "", propOrder = {
        "associatedID"
    })
    public static class AssociatedIDs {

        @XmlElement(name = "AssociatedID", required = true)
        protected List<OrderKeysType.AssociatedIDs.AssociatedID> associatedID;

        /**
         * Gets the value of the associatedID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the associatedID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderKeysType.AssociatedIDs.AssociatedID }
         * 
         * 
         * @return
         *     The value of the associatedID property.
         */
        public List<OrderKeysType.AssociatedIDs.AssociatedID> getAssociatedID() {
            if (associatedID == null) {
                associatedID = new ArrayList<>();
            }
            return this.associatedID;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OrderItemID" minOccurs="0"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferItemID" minOccurs="0"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" minOccurs="0"/>
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
            "orderItemID",
            "offerItemID",
            "serviceID"
        })
        public static class AssociatedID {

            @XmlElement(name = "OrderItemID")
            protected ItemIDType orderItemID;
            @XmlElement(name = "OfferItemID")
            protected ItemIDType offerItemID;
            @XmlElement(name = "ServiceID")
            protected ServiceIDType serviceID;

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
             * @return
             *     possible object is
             *     {@link ServiceIDType }
             *     
             */
            public ServiceIDType getServiceID() {
                return serviceID;
            }

            /**
             * Sets the value of the serviceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceIDType }
             *     
             */
            public void setServiceID(ServiceIDType value) {
                this.serviceID = value;
            }

        }

    }

}

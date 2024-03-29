//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferItemTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfferItemTimeLimitSetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TimeLimit" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimit"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
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
@XmlType(name = "OfferItemTimeLimitSetType", propOrder = {
    "timeLimit"
})
public class OfferItemTimeLimitSetType {

    @XmlElement(name = "TimeLimit", required = true)
    protected List<OfferItemTimeLimitSetType.TimeLimit> timeLimit;

    /**
     * Gets the value of the timeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the timeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTimeLimitSetType.TimeLimit }
     * 
     * 
     * @return
     *     The value of the timeLimit property.
     */
    public List<OfferItemTimeLimitSetType.TimeLimit> getTimeLimit() {
        if (timeLimit == null) {
            timeLimit = new ArrayList<>();
        }
        return this.timeLimit;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PriceGuaranteeTimeLimit"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/>
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
    @XmlType(name = "", propOrder = {
        "priceGuaranteeTimeLimit",
        "ticketByTimeLimit"
    })
    public static class TimeLimit {

        @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
        protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
        @XmlElement(name = "TicketByTimeLimit", required = true)
        protected TicketByTimeLimitType ticketByTimeLimit;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
         * Gets the value of the ticketByTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public TicketByTimeLimitType getTicketByTimeLimit() {
            return ticketByTimeLimit;
        }

        /**
         * Sets the value of the ticketByTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public void setTicketByTimeLimit(TicketByTimeLimitType value) {
            this.ticketByTimeLimit = value;
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

}

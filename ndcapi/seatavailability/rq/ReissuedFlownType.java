//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The reissued flown flight coupon information.
 * 
 * <p>Java class for ReissuedFlownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReissuedFlownType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FlightCouponData" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CouponFlightSegmentType">
 *                 <sequence>
 *                   <element name="IntermediateStop" maxOccurs="9" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="AiportCode">
 *                             <simpleType>
 *                               <restriction base="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType">
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="InvoluntaryIndCode" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Number" type="{http://www.iata.org/IATA/EDIST/2017.2}Numeric1to4" />
 *       <attribute name="CouponItinerarySeqNbr" type="{http://www.iata.org/IATA/EDIST/2017.2}Numeric0to99" />
 *       <attribute name="FareBasisCode" type="{http://www.iata.org/IATA/EDIST/2017.2}StringLength1to16" />
 *       <attribute name="TicketDocumentNbr" type="{http://www.iata.org/IATA/EDIST/2017.2}StringLength1to16" />
 *       <attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="WaiverCode" type="{http://www.iata.org/IATA/EDIST/2017.2}AlphaNumericStringLength1to19" />
 *       <attribute name="TicketDesignatorCode" type="{http://www.iata.org/IATA/EDIST/2017.2}StringLength1to16" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReissuedFlownType", propOrder = {
    "flightCouponData"
})
public class ReissuedFlownType {

    @XmlElement(name = "FlightCouponData")
    protected ReissuedFlownType.FlightCouponData flightCouponData;
    @XmlAttribute(name = "Number")
    protected Integer number;
    @XmlAttribute(name = "CouponItinerarySeqNbr")
    protected Integer couponItinerarySeqNbr;
    @XmlAttribute(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlAttribute(name = "TicketDocumentNbr")
    protected String ticketDocumentNbr;
    @XmlAttribute(name = "DateOfIssue")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfIssue;
    @XmlAttribute(name = "WaiverCode")
    protected String waiverCode;
    @XmlAttribute(name = "TicketDesignatorCode")
    protected String ticketDesignatorCode;

    /**
     * Gets the value of the flightCouponData property.
     * 
     * @return
     *     possible object is
     *     {@link ReissuedFlownType.FlightCouponData }
     *     
     */
    public ReissuedFlownType.FlightCouponData getFlightCouponData() {
        return flightCouponData;
    }

    /**
     * Sets the value of the flightCouponData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReissuedFlownType.FlightCouponData }
     *     
     */
    public void setFlightCouponData(ReissuedFlownType.FlightCouponData value) {
        this.flightCouponData = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the couponItinerarySeqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponItinerarySeqNbr() {
        return couponItinerarySeqNbr;
    }

    /**
     * Sets the value of the couponItinerarySeqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponItinerarySeqNbr(Integer value) {
        this.couponItinerarySeqNbr = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the ticketDocumentNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocumentNbr() {
        return ticketDocumentNbr;
    }

    /**
     * Sets the value of the ticketDocumentNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocumentNbr(String value) {
        this.ticketDocumentNbr = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIssue(XMLGregorianCalendar value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

    /**
     * Gets the value of the ticketDesignatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    /**
     * Sets the value of the ticketDesignatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignatorCode(String value) {
        this.ticketDesignatorCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CouponFlightSegmentType">
     *       <sequence>
     *         <element name="IntermediateStop" maxOccurs="9" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="AiportCode">
     *                   <simpleType>
     *                     <restriction base="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType">
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="InvoluntaryIndCode" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intermediateStop"
    })
    public static class FlightCouponData
        extends CouponFlightSegmentType
    {

        @XmlElement(name = "IntermediateStop")
        protected List<ReissuedFlownType.FlightCouponData.IntermediateStop> intermediateStop;
        @XmlAttribute(name = "StopoverInd")
        protected Boolean stopoverInd;
        @XmlAttribute(name = "InvoluntaryIndCode")
        protected String involuntaryIndCode;

        /**
         * Gets the value of the intermediateStop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the intermediateStop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntermediateStop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReissuedFlownType.FlightCouponData.IntermediateStop }
         * 
         * 
         * @return
         *     The value of the intermediateStop property.
         */
        public List<ReissuedFlownType.FlightCouponData.IntermediateStop> getIntermediateStop() {
            if (intermediateStop == null) {
                intermediateStop = new ArrayList<>();
            }
            return this.intermediateStop;
        }

        /**
         * Gets the value of the stopoverInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStopoverInd() {
            return stopoverInd;
        }

        /**
         * Sets the value of the stopoverInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStopoverInd(Boolean value) {
            this.stopoverInd = value;
        }

        /**
         * Gets the value of the involuntaryIndCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoluntaryIndCode() {
            return involuntaryIndCode;
        }

        /**
         * Sets the value of the involuntaryIndCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoluntaryIndCode(String value) {
            this.involuntaryIndCode = value;
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
         *       <attribute name="AiportCode">
         *         <simpleType>
         *           <restriction base="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType">
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IntermediateStop {

            @XmlAttribute(name = "AiportCode")
            protected String aiportCode;

            /**
             * Gets the value of the aiportCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAiportCode() {
                return aiportCode;
            }

            /**
             * Sets the value of the aiportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAiportCode(String value) {
                this.aiportCode = value;
            }

        }

    }

}

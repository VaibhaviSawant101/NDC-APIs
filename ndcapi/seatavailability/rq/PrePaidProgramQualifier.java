//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


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
 *         <element name="PrepaidProgramDetail">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
 *                     <element name="Certificate" maxOccurs="unbounded">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Number">
 *                                 <complexType>
 *                                   <simpleContent>
 *                                     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
 *                                       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                                     </extension>
 *                                   </simpleContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContactAppSimpleType" minOccurs="0"/>
 *                               <element name="EffectivePeriod" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearPeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearMonthPeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimePeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}QuarterPeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MonthPeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DayPeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriod"/>
 *                                         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriod"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                             <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="ProgramName">
 *                       <complexType>
 *                         <simpleContent>
 *                           <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
 *                           </extension>
 *                         </simpleContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ProgramCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *                     <element name="Holder" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <choice>
 *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AgencyID"/>
 *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PartnerID"/>
 *                             </choice>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
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
@XmlType(name = "", propOrder = {
    "prepaidProgramDetail"
})
@XmlRootElement(name = "PrePaidProgramQualifier")
public class PrePaidProgramQualifier {

    @XmlElement(name = "PrepaidProgramDetail", required = true)
    protected PrePaidProgramQualifier.PrepaidProgramDetail prepaidProgramDetail;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the prepaidProgramDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     *     
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail getPrepaidProgramDetail() {
        return prepaidProgramDetail;
    }

    /**
     * Sets the value of the prepaidProgramDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     *     
     */
    public void setPrepaidProgramDetail(PrePaidProgramQualifier.PrepaidProgramDetail value) {
        this.prepaidProgramDetail = value;
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
     *         <sequence>
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AirlineID"/>
     *           <element name="Certificate" maxOccurs="unbounded">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Number">
     *                       <complexType>
     *                         <simpleContent>
     *                           <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
     *                             <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                           </extension>
     *                         </simpleContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContactAppSimpleType" minOccurs="0"/>
     *                     <element name="EffectivePeriod" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearPeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearMonthPeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimePeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}QuarterPeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MonthPeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DayPeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriod"/>
     *                               <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriod"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                   <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </sequence>
     *         <sequence>
     *           <element name="ProgramName">
     *             <complexType>
     *               <simpleContent>
     *                 <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
     *                 </extension>
     *               </simpleContent>
     *             </complexType>
     *           </element>
     *           <element name="ProgramCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
     *           <element name="Holder" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <choice>
     *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AgencyID"/>
     *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PartnerID"/>
     *                   </choice>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </sequence>
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
        "airlineID",
        "certificate",
        "programName",
        "programCode",
        "holder"
    })
    public static class PrepaidProgramDetail {

        @XmlElement(name = "AirlineID", required = true)
        protected AirlineID airlineID;
        @XmlElement(name = "Certificate", required = true)
        protected List<PrePaidProgramQualifier.PrepaidProgramDetail.Certificate> certificate;
        @XmlElement(name = "ProgramName", required = true)
        protected PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName programName;
        @XmlElement(name = "ProgramCode")
        protected String programCode;
        @XmlElement(name = "Holder")
        protected PrePaidProgramQualifier.PrepaidProgramDetail.Holder holder;

        /**
         * Program issuing airline designator code. Example: BA
         * 
         * Encoding Scheme: IATA/ A4A (two to three character) Airline Designator Code
         * 
         * @return
         *     possible object is
         *     {@link AirlineID }
         *     
         */
        public AirlineID getAirlineID() {
            return airlineID;
        }

        /**
         * Sets the value of the airlineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineID }
         *     
         */
        public void setAirlineID(AirlineID value) {
            this.airlineID = value;
        }

        /**
         * Gets the value of the certificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the certificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate }
         * 
         * 
         * @return
         *     The value of the certificate property.
         */
        public List<PrePaidProgramQualifier.PrepaidProgramDetail.Certificate> getCertificate() {
            if (certificate == null) {
                certificate = new ArrayList<>();
            }
            return this.certificate;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
         *     
         */
        public PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
         *     
         */
        public void setProgramName(PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName value) {
            this.programName = value;
        }

        /**
         * Gets the value of the programCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * Sets the value of the programCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * Gets the value of the holder property.
         * 
         * @return
         *     possible object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
         *     
         */
        public PrePaidProgramQualifier.PrepaidProgramDetail.Holder getHolder() {
            return holder;
        }

        /**
         * Sets the value of the holder property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
         *     
         */
        public void setHolder(PrePaidProgramQualifier.PrepaidProgramDetail.Holder value) {
            this.holder = value;
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
         *         <element name="Number">
         *           <complexType>
         *             <simpleContent>
         *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
         *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
         *               </extension>
         *             </simpleContent>
         *           </complexType>
         *         </element>
         *         <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}ContactAppSimpleType" minOccurs="0"/>
         *         <element name="EffectivePeriod" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearPeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearMonthPeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimePeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}QuarterPeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MonthPeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DayPeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriod"/>
         *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriod"/>
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
        @XmlType(name = "", propOrder = {
            "number",
            "application",
            "effectivePeriod"
        })
        public static class Certificate {

            @XmlElement(name = "Number", required = true)
            protected PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number number;
            @XmlElement(name = "Application")
            protected String application;
            @XmlElement(name = "EffectivePeriod")
            protected PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod effectivePeriod;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
             *     
             */
            public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
             *     
             */
            public void setNumber(PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number value) {
                this.number = value;
            }

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

            /**
             * Gets the value of the effectivePeriod property.
             * 
             * @return
             *     possible object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
             *     
             */
            public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod getEffectivePeriod() {
                return effectivePeriod;
            }

            /**
             * Sets the value of the effectivePeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
             *     
             */
            public void setEffectivePeriod(PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod value) {
                this.effectivePeriod = value;
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
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearPeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}YearMonthPeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}TimePeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}QuarterPeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MonthPeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DayPeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DateTimePeriod"/>
             *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DatePeriod"/>
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
                "yearPeriod",
                "yearMonthPeriod",
                "timePeriod",
                "quarterPeriod",
                "monthPeriod",
                "dayPeriod",
                "dateTimePeriod",
                "datePeriod"
            })
            public static class EffectivePeriod {

                @XmlElement(name = "YearPeriod", required = true)
                protected YearPeriodRepType yearPeriod;
                @XmlElement(name = "YearMonthPeriod", required = true)
                protected YearMonthPeriodRepType yearMonthPeriod;
                @XmlElement(name = "TimePeriod", required = true)
                protected TimePeriodRepType timePeriod;
                @XmlElement(name = "QuarterPeriod", required = true)
                protected QuarterPeriodRepType quarterPeriod;
                @XmlElement(name = "MonthPeriod", required = true)
                protected MonthPeriodRepType monthPeriod;
                @XmlElement(name = "DayPeriod", required = true)
                protected DayPeriodRepType dayPeriod;
                @XmlElement(name = "DateTimePeriod", required = true)
                protected DateTimePeriodRepType dateTimePeriod;
                @XmlElement(name = "DatePeriod", required = true)
                protected DatePeriodRepType datePeriod;

                /**
                 * Gets the value of the yearPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public YearPeriodRepType getYearPeriod() {
                    return yearPeriod;
                }

                /**
                 * Sets the value of the yearPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public void setYearPeriod(YearPeriodRepType value) {
                    this.yearPeriod = value;
                }

                /**
                 * Gets the value of the yearMonthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public YearMonthPeriodRepType getYearMonthPeriod() {
                    return yearMonthPeriod;
                }

                /**
                 * Sets the value of the yearMonthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public void setYearMonthPeriod(YearMonthPeriodRepType value) {
                    this.yearMonthPeriod = value;
                }

                /**
                 * Gets the value of the timePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public TimePeriodRepType getTimePeriod() {
                    return timePeriod;
                }

                /**
                 * Sets the value of the timePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public void setTimePeriod(TimePeriodRepType value) {
                    this.timePeriod = value;
                }

                /**
                 * Gets the value of the quarterPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public QuarterPeriodRepType getQuarterPeriod() {
                    return quarterPeriod;
                }

                /**
                 * Sets the value of the quarterPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public void setQuarterPeriod(QuarterPeriodRepType value) {
                    this.quarterPeriod = value;
                }

                /**
                 * Gets the value of the monthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public MonthPeriodRepType getMonthPeriod() {
                    return monthPeriod;
                }

                /**
                 * Sets the value of the monthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public void setMonthPeriod(MonthPeriodRepType value) {
                    this.monthPeriod = value;
                }

                /**
                 * Gets the value of the dayPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public DayPeriodRepType getDayPeriod() {
                    return dayPeriod;
                }

                /**
                 * Sets the value of the dayPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public void setDayPeriod(DayPeriodRepType value) {
                    this.dayPeriod = value;
                }

                /**
                 * Gets the value of the dateTimePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public DateTimePeriodRepType getDateTimePeriod() {
                    return dateTimePeriod;
                }

                /**
                 * Sets the value of the dateTimePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public void setDateTimePeriod(DateTimePeriodRepType value) {
                    this.dateTimePeriod = value;
                }

                /**
                 * Gets the value of the datePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public DatePeriodRepType getDatePeriod() {
                    return datePeriod;
                }

                /**
                 * Sets the value of the datePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public void setDatePeriod(DatePeriodRepType value) {
                    this.datePeriod = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>{@code
             * <complexType>
             *   <simpleContent>
             *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
             *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
             *     </extension>
             *   </simpleContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Number {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AgencyID"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PartnerID"/>
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
            "agencyID",
            "partnerID"
        })
        public static class Holder {

            @XmlElement(name = "AgencyID")
            protected AgencyIDType agencyID;
            @XmlElement(name = "PartnerID")
            protected PartnerCompanyIDType partnerID;

            /**
             * Gets the value of the agencyID property.
             * 
             * @return
             *     possible object is
             *     {@link AgencyIDType }
             *     
             */
            public AgencyIDType getAgencyID() {
                return agencyID;
            }

            /**
             * Sets the value of the agencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AgencyIDType }
             *     
             */
            public void setAgencyID(AgencyIDType value) {
                this.agencyID = value;
            }

            /**
             * Gets the value of the partnerID property.
             * 
             * @return
             *     possible object is
             *     {@link PartnerCompanyIDType }
             *     
             */
            public PartnerCompanyIDType getPartnerID() {
                return partnerID;
            }

            /**
             * Sets the value of the partnerID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PartnerCompanyIDType }
             *     
             */
            public void setPartnerID(PartnerCompanyIDType value) {
                this.partnerID = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>ProperNameSimpleType">
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ProgramName {

            @XmlValue
            protected String value;

            /**
             * A data type for Proper Name size constraint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}

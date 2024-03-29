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
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for Fare Preferences.
 * 
 * <p>Java class for FarePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FarePreferencesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Types" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Type" maxOccurs="unbounded">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>IATA_CodeType">
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FareCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Code" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCodeType">
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TicketDesigs" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TicketDesig" maxOccurs="unbounded">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.iata.org/IATA/EDIST/2017.2>TicketDesignatorType">
 *                           <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Exclusion" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NoMinStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="NoMaxStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="NoAdvPurchaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="NoPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="GroupFare" type="{http://www.iata.org/IATA/EDIST/2017.2}GroupFarePreferencesType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePreferencesType", propOrder = {
    "types",
    "fareCodes",
    "ticketDesigs",
    "exclusion",
    "groupFare"
})
public class FarePreferencesType {

    @XmlElement(name = "Types")
    protected FarePreferencesType.Types types;
    @XmlElement(name = "FareCodes")
    protected FarePreferencesType.FareCodes fareCodes;
    @XmlElement(name = "TicketDesigs")
    protected FarePreferencesType.TicketDesigs ticketDesigs;
    @XmlElement(name = "Exclusion")
    protected FarePreferencesType.Exclusion exclusion;
    @XmlElement(name = "GroupFare")
    protected GroupFarePreferencesType groupFare;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "PreferencesLevel")
    protected String preferencesLevel;
    @XmlAttribute(name = "PreferencesContext")
    protected String preferencesContext;

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link FarePreferencesType.Types }
     *     
     */
    public FarePreferencesType.Types getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePreferencesType.Types }
     *     
     */
    public void setTypes(FarePreferencesType.Types value) {
        this.types = value;
    }

    /**
     * Gets the value of the fareCodes property.
     * 
     * @return
     *     possible object is
     *     {@link FarePreferencesType.FareCodes }
     *     
     */
    public FarePreferencesType.FareCodes getFareCodes() {
        return fareCodes;
    }

    /**
     * Sets the value of the fareCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePreferencesType.FareCodes }
     *     
     */
    public void setFareCodes(FarePreferencesType.FareCodes value) {
        this.fareCodes = value;
    }

    /**
     * Gets the value of the ticketDesigs property.
     * 
     * @return
     *     possible object is
     *     {@link FarePreferencesType.TicketDesigs }
     *     
     */
    public FarePreferencesType.TicketDesigs getTicketDesigs() {
        return ticketDesigs;
    }

    /**
     * Sets the value of the ticketDesigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePreferencesType.TicketDesigs }
     *     
     */
    public void setTicketDesigs(FarePreferencesType.TicketDesigs value) {
        this.ticketDesigs = value;
    }

    /**
     * Gets the value of the exclusion property.
     * 
     * @return
     *     possible object is
     *     {@link FarePreferencesType.Exclusion }
     *     
     */
    public FarePreferencesType.Exclusion getExclusion() {
        return exclusion;
    }

    /**
     * Sets the value of the exclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePreferencesType.Exclusion }
     *     
     */
    public void setExclusion(FarePreferencesType.Exclusion value) {
        this.exclusion = value;
    }

    /**
     * Gets the value of the groupFare property.
     * 
     * @return
     *     possible object is
     *     {@link GroupFarePreferencesType }
     *     
     */
    public GroupFarePreferencesType getGroupFare() {
        return groupFare;
    }

    /**
     * Sets the value of the groupFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupFarePreferencesType }
     *     
     */
    public void setGroupFare(GroupFarePreferencesType value) {
        this.groupFare = value;
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
     * Gets the value of the preferencesLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferencesLevel() {
        return preferencesLevel;
    }

    /**
     * Sets the value of the preferencesLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferencesLevel(String value) {
        this.preferencesLevel = value;
    }

    /**
     * Gets the value of the preferencesContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferencesContext() {
        return preferencesContext;
    }

    /**
     * Sets the value of the preferencesContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferencesContext(String value) {
        this.preferencesContext = value;
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
     *         <element name="NoMinStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="NoMaxStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="NoAdvPurchaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="NoPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "noMinStayInd",
        "noMaxStayInd",
        "noAdvPurchaseInd",
        "noPenaltyInd"
    })
    public static class Exclusion {

        @XmlElement(name = "NoMinStayInd")
        protected Boolean noMinStayInd;
        @XmlElement(name = "NoMaxStayInd")
        protected Boolean noMaxStayInd;
        @XmlElement(name = "NoAdvPurchaseInd")
        protected Boolean noAdvPurchaseInd;
        @XmlElement(name = "NoPenaltyInd")
        protected Boolean noPenaltyInd;

        /**
         * Gets the value of the noMinStayInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoMinStayInd() {
            return noMinStayInd;
        }

        /**
         * Sets the value of the noMinStayInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoMinStayInd(Boolean value) {
            this.noMinStayInd = value;
        }

        /**
         * Gets the value of the noMaxStayInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoMaxStayInd() {
            return noMaxStayInd;
        }

        /**
         * Sets the value of the noMaxStayInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoMaxStayInd(Boolean value) {
            this.noMaxStayInd = value;
        }

        /**
         * Gets the value of the noAdvPurchaseInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoAdvPurchaseInd() {
            return noAdvPurchaseInd;
        }

        /**
         * Sets the value of the noAdvPurchaseInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoAdvPurchaseInd(Boolean value) {
            this.noAdvPurchaseInd = value;
        }

        /**
         * Gets the value of the noPenaltyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoPenaltyInd() {
            return noPenaltyInd;
        }

        /**
         * Sets the value of the noPenaltyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoPenaltyInd(Boolean value) {
            this.noPenaltyInd = value;
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
     *         <element name="Code" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCodeType">
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code"
    })
    public static class FareCodes {

        @XmlElement(name = "Code", required = true)
        protected List<FarePreferencesType.FareCodes.Code> code;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePreferencesType.FareCodes.Code }
         * 
         * 
         * @return
         *     The value of the code property.
         */
        public List<FarePreferencesType.FareCodes.Code> getCode() {
            if (code == null) {
                code = new ArrayList<>();
            }
            return this.code;
        }

        /**
         * Gets the value of the preferencesLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesLevel() {
            return preferencesLevel;
        }

        /**
         * Sets the value of the preferencesLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesLevel(String value) {
            this.preferencesLevel = value;
        }

        /**
         * Gets the value of the preferencesContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesContext() {
            return preferencesContext;
        }

        /**
         * Sets the value of the preferencesContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesContext(String value) {
            this.preferencesContext = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCodeType">
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Code
            extends FareBasisCodeType
        {

            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Gets the value of the preferencesLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesLevel() {
                return preferencesLevel;
            }

            /**
             * Sets the value of the preferencesLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesLevel(String value) {
                this.preferencesLevel = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
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
     *       <sequence>
     *         <element name="TicketDesig" maxOccurs="unbounded">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>TicketDesignatorType">
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticketDesig"
    })
    public static class TicketDesigs {

        @XmlElement(name = "TicketDesig", required = true)
        protected List<FarePreferencesType.TicketDesigs.TicketDesig> ticketDesig;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Gets the value of the ticketDesig property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the ticketDesig property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketDesig().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePreferencesType.TicketDesigs.TicketDesig }
         * 
         * 
         * @return
         *     The value of the ticketDesig property.
         */
        public List<FarePreferencesType.TicketDesigs.TicketDesig> getTicketDesig() {
            if (ticketDesig == null) {
                ticketDesig = new ArrayList<>();
            }
            return this.ticketDesig;
        }

        /**
         * Gets the value of the preferencesLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesLevel() {
            return preferencesLevel;
        }

        /**
         * Sets the value of the preferencesLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesLevel(String value) {
            this.preferencesLevel = value;
        }

        /**
         * Gets the value of the preferencesContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesContext() {
            return preferencesContext;
        }

        /**
         * Sets the value of the preferencesContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesContext(String value) {
            this.preferencesContext = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>TicketDesignatorType">
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TicketDesig
            extends TicketDesignatorType
        {

            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Gets the value of the preferencesLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesLevel() {
                return preferencesLevel;
            }

            /**
             * Sets the value of the preferencesLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesLevel(String value) {
                this.preferencesLevel = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
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
     *       <sequence>
     *         <element name="Type" maxOccurs="unbounded">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>IATA_CodeType">
     *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
     *               </extension>
     *             </simpleContent>
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
        "type"
    })
    public static class Types {

        @XmlElement(name = "Type", required = true)
        protected List<FarePreferencesType.Types.Type> type;

        /**
         * Gets the value of the type property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the type property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePreferencesType.Types.Type }
         * 
         * 
         * @return
         *     The value of the type property.
         */
        public List<FarePreferencesType.Types.Type> getType() {
            if (type == null) {
                type = new ArrayList<>();
            }
            return this.type;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>IATA_CodeType">
         *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}PreferenceAttrGroup"/>
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
        public static class Type {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, EQP
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
             * Gets the value of the preferencesLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesLevel() {
                return preferencesLevel;
            }

            /**
             * Sets the value of the preferencesLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesLevel(String value) {
                this.preferencesLevel = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }

    }

}

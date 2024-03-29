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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="FareGroup" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Fare">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareCode"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareDetail" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="FareBasisCode">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
 *                             <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisAppSimpleType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
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
    "fareGroup"
})
@XmlRootElement(name = "FareList")
public class FareList {

    @XmlElement(name = "FareGroup", required = true)
    protected List<FareList.FareGroup> fareGroup;

    /**
     * Gets the value of the fareGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fareGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareList.FareGroup }
     * 
     * 
     * @return
     *     The value of the fareGroup property.
     */
    public List<FareList.FareGroup> getFareGroup() {
        if (fareGroup == null) {
            fareGroup = new ArrayList<>();
        }
        return this.fareGroup;
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
     *         <element name="Fare">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareCode"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareDetail" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="FareBasisCode">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
     *                   <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisAppSimpleType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fare",
        "fareBasisCode"
    })
    public static class FareGroup {

        @XmlElement(name = "Fare", required = true)
        protected FareList.FareGroup.Fare fare;
        @XmlElement(name = "FareBasisCode", required = true)
        protected FareList.FareGroup.FareBasisCode fareBasisCode;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the fare property.
         * 
         * @return
         *     possible object is
         *     {@link FareList.FareGroup.Fare }
         *     
         */
        public FareList.FareGroup.Fare getFare() {
            return fare;
        }

        /**
         * Sets the value of the fare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareList.FareGroup.Fare }
         *     
         */
        public void setFare(FareList.FareGroup.Fare value) {
            this.fare = value;
        }

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link FareList.FareGroup.FareBasisCode }
         *     
         */
        public FareList.FareGroup.FareBasisCode getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareList.FareGroup.FareBasisCode }
         *     
         */
        public void setFareBasisCode(FareList.FareGroup.FareBasisCode value) {
            this.fareBasisCode = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
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
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareCode"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareDetail" minOccurs="0"/>
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
            "fareCode",
            "fareDetail"
        })
        public static class Fare {

            @XmlElement(name = "FareCode", required = true)
            protected String fareCode;
            @XmlElement(name = "FareDetail")
            protected FareDetailType fareDetail;

            /**
             * Gets the value of the fareCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareCode() {
                return fareCode;
            }

            /**
             * Sets the value of the fareCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareCode(String value) {
                this.fareCode = value;
            }

            /**
             * Gets the value of the fareDetail property.
             * 
             * @return
             *     possible object is
             *     {@link FareDetailType }
             *     
             */
            public FareDetailType getFareDetail() {
                return fareDetail;
            }

            /**
             * Sets the value of the fareDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareDetailType }
             *     
             */
            public void setFareDetail(FareDetailType value) {
                this.fareDetail = value;
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
         *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
         *         <element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisAppSimpleType" minOccurs="0"/>
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
            "code",
            "application"
        })
        public static class FareBasisCode {

            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "Application")
            protected String application;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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

        }

    }

}

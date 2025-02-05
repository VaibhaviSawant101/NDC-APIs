//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Shopping Request Business Object: GROUP FARE Preferences.
 * 
 * <p>Java class for GroupFarePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GroupFarePreferencesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GroupFare" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FareBasis" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCodeType">
 *                           <sequence>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegmentReferences"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="PTC" type="{http://www.iata.org/IATA/EDIST/2017.2}PaxSimpleType"/>
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
@XmlType(name = "GroupFarePreferencesType", propOrder = {
    "groupFare"
})
public class GroupFarePreferencesType {

    @XmlElement(name = "GroupFare", required = true)
    protected List<GroupFarePreferencesType.GroupFare> groupFare;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the groupFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the groupFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupFarePreferencesType.GroupFare }
     * 
     * 
     * @return
     *     The value of the groupFare property.
     */
    public List<GroupFarePreferencesType.GroupFare> getGroupFare() {
        if (groupFare == null) {
            groupFare = new ArrayList<>();
        }
        return this.groupFare;
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
     *         <element name="FareBasis" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCodeType">
     *                 <sequence>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegmentReferences"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="PTC" type="{http://www.iata.org/IATA/EDIST/2017.2}PaxSimpleType"/>
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
        "fareBasis",
        "ptc"
    })
    public static class GroupFare {

        @XmlElement(name = "FareBasis", required = true)
        protected List<GroupFarePreferencesType.GroupFare.FareBasis> fareBasis;
        @XmlElement(name = "PTC", required = true)
        protected String ptc;

        /**
         * Gets the value of the fareBasis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fareBasis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupFarePreferencesType.GroupFare.FareBasis }
         * 
         * 
         * @return
         *     The value of the fareBasis property.
         */
        public List<GroupFarePreferencesType.GroupFare.FareBasis> getFareBasis() {
            if (fareBasis == null) {
                fareBasis = new ArrayList<>();
            }
            return this.fareBasis;
        }

        /**
         * Gets the value of the ptc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTC() {
            return ptc;
        }

        /**
         * Sets the value of the ptc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTC(String value) {
            this.ptc = value;
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
         *       <sequence>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}SegmentReferences"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "segmentReferences"
        })
        public static class FareBasis
            extends FareBasisCodeType
        {

            @XmlElement(name = "SegmentReferences", required = true)
            protected SegmentReferences segmentReferences;

            /**
             * Gets the value of the segmentReferences property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentReferences }
             *     
             */
            public SegmentReferences getSegmentReferences() {
                return segmentReferences;
            }

            /**
             * Sets the value of the segmentReferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentReferences }
             *     
             */
            public void setSegmentReferences(SegmentReferences value) {
                this.segmentReferences = value;
            }

        }

    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Non Geographic Specification information
 * 
 * <p>Java class for NonGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonGeographicSpecificationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TravelAgencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AggregatorID" minOccurs="0"/>
 *         <element name="PointOfSaleCode" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>PointOfSaleCodeType">
 *                 <attribute name="PointOfSaleType" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <length value="1"/>
 *                       <enumeration value="T"/>
 *                       <enumeration value="I"/>
 *                       <enumeration value="H"/>
 *                       <enumeration value="U"/>
 *                       <enumeration value="X"/>
 *                       <enumeration value="V"/>
 *                       <enumeration value="L"/>
 *                       <enumeration value="A"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
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
@XmlType(name = "NonGeographicSpecificationType", propOrder = {
    "travelAgencyInd",
    "aggregatorID",
    "pointOfSaleCode"
})
public class NonGeographicSpecificationType {

    @XmlElement(name = "TravelAgencyInd")
    protected Boolean travelAgencyInd;
    @XmlElement(name = "AggregatorID")
    protected AggregatorIDType aggregatorID;
    @XmlElement(name = "PointOfSaleCode")
    protected List<NonGeographicSpecificationType.PointOfSaleCode> pointOfSaleCode;

    /**
     * Gets the value of the travelAgencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelAgencyInd() {
        return travelAgencyInd;
    }

    /**
     * Sets the value of the travelAgencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelAgencyInd(Boolean value) {
        this.travelAgencyInd = value;
    }

    /**
     * Gets the value of the aggregatorID property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorIDType }
     *     
     */
    public AggregatorIDType getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Sets the value of the aggregatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorIDType }
     *     
     */
    public void setAggregatorID(AggregatorIDType value) {
        this.aggregatorID = value;
    }

    /**
     * Gets the value of the pointOfSaleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pointOfSaleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSaleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonGeographicSpecificationType.PointOfSaleCode }
     * 
     * 
     * @return
     *     The value of the pointOfSaleCode property.
     */
    public List<NonGeographicSpecificationType.PointOfSaleCode> getPointOfSaleCode() {
        if (pointOfSaleCode == null) {
            pointOfSaleCode = new ArrayList<>();
        }
        return this.pointOfSaleCode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>PointOfSaleCodeType">
     *       <attribute name="PointOfSaleType" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <length value="1"/>
     *             <enumeration value="T"/>
     *             <enumeration value="I"/>
     *             <enumeration value="H"/>
     *             <enumeration value="U"/>
     *             <enumeration value="X"/>
     *             <enumeration value="V"/>
     *             <enumeration value="L"/>
     *             <enumeration value="A"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
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
    public static class PointOfSaleCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PointOfSaleType", required = true)
        protected String pointOfSaleType;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the pointOfSaleType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPointOfSaleType() {
            return pointOfSaleType;
        }

        /**
         * Sets the value of the pointOfSaleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointOfSaleType(String value) {
            this.pointOfSaleType = value;
        }

    }

}

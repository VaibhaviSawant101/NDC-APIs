//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Geographic Specification information
 * 
 * <p>Java class for GeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeographicSpecificationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}GeoSpecCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Coordinates" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PositionType">
 *                 <sequence>
 *                   <element name="CoordinateRadius" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *                           <attribute name="UOM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
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
@XmlType(name = "GeographicSpecificationType", propOrder = {
    "geoSpecCode",
    "coordinates"
})
public class GeographicSpecificationType {

    @XmlElement(name = "GeoSpecCode")
    protected List<GeoSpecCode> geoSpecCode;
    @XmlElement(name = "Coordinates")
    protected GeographicSpecificationType.Coordinates coordinates;

    /**
     * Indicates whether a system may or may not send NDC requests based on geographic specifications. Users may enter a location here which is further defined by the @Type.                                                             Valid area values include 1 = Western Hemisphere 2 = Europe, Africa, and the Near East 3 = Far East, Australia, and Pacific                                                                   Valid sub areas are Standard ISO/IATA sub area code                                               Valid airport and city codes are a three letter  location identifier assigned according to the IATA Resolution 763.  Refer to IATA Airline Coding Directory . Example: TPA    
     *     Gets the value of the geoSpecCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoSpecCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoSpecCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoSpecCode }
     * 
     * 
     * @return
     *     The value of the geoSpecCode property.
     */
    public List<GeoSpecCode> getGeoSpecCode() {
        if (geoSpecCode == null) {
            geoSpecCode = new ArrayList<>();
        }
        return this.geoSpecCode;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType.Coordinates }
     *     
     */
    public GeographicSpecificationType.Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType.Coordinates }
     *     
     */
    public void setCoordinates(GeographicSpecificationType.Coordinates value) {
        this.coordinates = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PositionType">
     *       <sequence>
     *         <element name="CoordinateRadius" minOccurs="0">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
     *                 <attribute name="UOM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
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
        "coordinateRadius"
    })
    public static class Coordinates
        extends PositionType
    {

        @XmlElement(name = "CoordinateRadius")
        protected GeographicSpecificationType.Coordinates.CoordinateRadius coordinateRadius;

        /**
         * Gets the value of the coordinateRadius property.
         * 
         * @return
         *     possible object is
         *     {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
         *     
         */
        public GeographicSpecificationType.Coordinates.CoordinateRadius getCoordinateRadius() {
            return coordinateRadius;
        }

        /**
         * Sets the value of the coordinateRadius property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
         *     
         */
        public void setCoordinateRadius(GeographicSpecificationType.Coordinates.CoordinateRadius value) {
            this.coordinateRadius = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
         *       <attribute name="UOM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        public static class CoordinateRadius {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "UOM")
            @XmlSchemaType(name = "anySimpleType")
            protected String uom;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the uom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUOM() {
                return uom;
            }

            /**
             * Sets the value of the uom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUOM(String value) {
                this.uom = value;
            }

        }

    }

}

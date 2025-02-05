//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="Cabin" type="{http://www.iata.org/IATA/EDIST/2017.2}SimpleAircraftCabinType"/>
 *         <sequence>
 *           <element name="ClassOfService" type="{http://www.iata.org/IATA/EDIST/2017.2}FlightCOS_CoreType"/>
 *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BagDetailAssociation" minOccurs="0"/>
 *           <element name="MarriedSegmentGroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabin",
    "classOfService",
    "bagDetailAssociation",
    "marriedSegmentGroup"
})
@XmlRootElement(name = "FlightSegmentReference")
public class FlightSegmentReference {

    @XmlElement(name = "Cabin")
    protected SimpleAircraftCabinType cabin;
    @XmlElement(name = "ClassOfService")
    protected FlightCOSCoreType classOfService;
    @XmlElement(name = "BagDetailAssociation")
    protected BagDetailAssociation bagDetailAssociation;
    @XmlElement(name = "MarriedSegmentGroup")
    protected BigInteger marriedSegmentGroup;
    @XmlAttribute(name = "ref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAircraftCabinType }
     *     
     */
    public SimpleAircraftCabinType getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAircraftCabinType }
     *     
     */
    public void setCabin(SimpleAircraftCabinType value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public FlightCOSCoreType getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public void setClassOfService(FlightCOSCoreType value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the bagDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssociation }
     *     
     */
    public BagDetailAssociation getBagDetailAssociation() {
        return bagDetailAssociation;
    }

    /**
     * Sets the value of the bagDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssociation }
     *     
     */
    public void setBagDetailAssociation(BagDetailAssociation value) {
        this.bagDetailAssociation = value;
    }

    /**
     * Gets the value of the marriedSegmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarriedSegmentGroup() {
        return marriedSegmentGroup;
    }

    /**
     * Sets the value of the marriedSegmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarriedSegmentGroup(BigInteger value) {
        this.marriedSegmentGroup = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

}

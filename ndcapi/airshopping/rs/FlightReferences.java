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
 *   <simpleContent>
 *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>InstanceClassRefSimpleType">
 *       <attribute name="OnPoint" type="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType" />
 *       <attribute name="OffPoint" type="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType" />
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
@XmlRootElement(name = "FlightReferences")
public class FlightReferences {

    @XmlValue
    @XmlIDREF
    protected List<Object> value;
    @XmlAttribute(name = "OnPoint")
    protected String onPoint;
    @XmlAttribute(name = "OffPoint")
    protected String offPoint;

    /**
     * A data type definition for Globally Unique XML Instance or Other Class Reference Association size constraint.Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the value property.
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

    /**
     * Gets the value of the onPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnPoint() {
        return onPoint;
    }

    /**
     * Sets the value of the onPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnPoint(String value) {
        this.onPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

}
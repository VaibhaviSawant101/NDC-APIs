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
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Associated Shopper(s) definition.
 * 
 * <p>Java class for ShopperInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShopperInfoAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReference" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="AllShopperInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopperInfoAssocType", propOrder = {
    "passengerReference"
})
public class ShopperInfoAssocType {

    @XmlList
    @XmlElement(name = "PassengerReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReference;
    @XmlAttribute(name = "AllShopperInd")
    protected Boolean allShopperInd;

    /**
     * Gets the value of the passengerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the passengerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the passengerReference property.
     */
    public List<Object> getPassengerReference() {
        if (passengerReference == null) {
            passengerReference = new ArrayList<>();
        }
        return this.passengerReference;
    }

    /**
     * Gets the value of the allShopperInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllShopperInd() {
        return allShopperInd;
    }

    /**
     * Sets the value of the allShopperInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllShopperInd(Boolean value) {
        this.allShopperInd = value;
    }

}

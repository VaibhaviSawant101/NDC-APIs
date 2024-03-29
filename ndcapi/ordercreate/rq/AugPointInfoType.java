//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type definition for Augmentation Point Definition and List.
 * 
 * <p>Java class for AugPointInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AugPointInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AugPoint" type="{http://www.iata.org/IATA/EDIST/2017.2}AugPointType" maxOccurs="unbounded"/>
 *         <element name="Lists" type="{http://www.iata.org/IATA/EDIST/2017.2}AugPointListType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugPointInfoType", propOrder = {
    "augPoint",
    "lists"
})
public class AugPointInfoType {

    @XmlElement(name = "AugPoint", required = true)
    protected List<AugPointType> augPoint;
    @XmlElement(name = "Lists")
    protected AugPointListType lists;

    /**
     * Gets the value of the augPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the augPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAugPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugPointType }
     * 
     * 
     * @return
     *     The value of the augPoint property.
     */
    public List<AugPointType> getAugPoint() {
        if (augPoint == null) {
            augPoint = new ArrayList<>();
        }
        return this.augPoint;
    }

    /**
     * Gets the value of the lists property.
     * 
     * @return
     *     possible object is
     *     {@link AugPointListType }
     *     
     */
    public AugPointListType getLists() {
        return lists;
    }

    /**
     * Sets the value of the lists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointListType }
     *     
     */
    public void setLists(AugPointListType value) {
        this.lists = value;
    }

}

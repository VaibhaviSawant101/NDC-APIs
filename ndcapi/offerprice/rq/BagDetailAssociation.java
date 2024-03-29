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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlList;
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
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BagDisclosureReferences" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CheckedBagReferences" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CarryOnReferences" minOccurs="0"/>
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
    "bagDisclosureReferences",
    "checkedBagReferences",
    "carryOnReferences"
})
@XmlRootElement(name = "BagDetailAssociation")
public class BagDetailAssociation {

    @XmlList
    @XmlElement(name = "BagDisclosureReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> bagDisclosureReferences;
    @XmlList
    @XmlElement(name = "CheckedBagReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> checkedBagReferences;
    @XmlList
    @XmlElement(name = "CarryOnReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> carryOnReferences;

    /**
     * Gets the value of the bagDisclosureReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bagDisclosureReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosureReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the bagDisclosureReferences property.
     */
    public List<Object> getBagDisclosureReferences() {
        if (bagDisclosureReferences == null) {
            bagDisclosureReferences = new ArrayList<>();
        }
        return this.bagDisclosureReferences;
    }

    /**
     * Gets the value of the checkedBagReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the checkedBagReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the checkedBagReferences property.
     */
    public List<Object> getCheckedBagReferences() {
        if (checkedBagReferences == null) {
            checkedBagReferences = new ArrayList<>();
        }
        return this.checkedBagReferences;
    }

    /**
     * Gets the value of the carryOnReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the carryOnReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the carryOnReferences property.
     */
    public List<Object> getCarryOnReferences() {
        if (carryOnReferences == null) {
            carryOnReferences = new ArrayList<>();
        }
        return this.carryOnReferences;
    }

}

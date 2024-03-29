//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <choice maxOccurs="unbounded">
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CheckedBagMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CarryOnBagMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDisclosureMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDetailMetadata"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BaggageQueryMetadata"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas"
})
@XmlRootElement(name = "Baggage")
public class Baggage {

    @XmlElements({
        @XmlElement(name = "CheckedBagMetadatas", type = CheckedBagMetadatas.class),
        @XmlElement(name = "CarryOnBagMetadatas", type = CarryOnBagMetadatas.class),
        @XmlElement(name = "BaggageDisclosureMetadatas", type = BaggageDisclosureMetadatas.class),
        @XmlElement(name = "BaggageDetailMetadata", type = BaggageDetailMetadataType.class),
        @XmlElement(name = "BaggageQueryMetadata", type = BaggageQueryMetadataType.class)
    })
    protected List<Object> checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas;

    /**
     * Gets the value of the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDetailMetadataType }
     * {@link BaggageDisclosureMetadatas }
     * {@link BaggageQueryMetadataType }
     * {@link CarryOnBagMetadatas }
     * {@link CheckedBagMetadatas }
     * 
     * 
     * @return
     *     The value of the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     */
    public List<Object> getCheckedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas() {
        if (checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas == null) {
            checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas = new ArrayList<>();
        }
        return this.checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas;
    }

}

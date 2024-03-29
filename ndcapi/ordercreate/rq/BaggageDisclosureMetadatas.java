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
 *       <sequence>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDisclosureMetadata" maxOccurs="unbounded"/>
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
    "baggageDisclosureMetadata"
})
@XmlRootElement(name = "BaggageDisclosureMetadatas")
public class BaggageDisclosureMetadatas {

    @XmlElement(name = "BaggageDisclosureMetadata", required = true)
    protected List<BaggageDisclosureMetadataType> baggageDisclosureMetadata;

    /**
     * Gets the value of the baggageDisclosureMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the baggageDisclosureMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDisclosureMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDisclosureMetadataType }
     * 
     * 
     * @return
     *     The value of the baggageDisclosureMetadata property.
     */
    public List<BaggageDisclosureMetadataType> getBaggageDisclosureMetadata() {
        if (baggageDisclosureMetadata == null) {
            baggageDisclosureMetadata = new ArrayList<>();
        }
        return this.baggageDisclosureMetadata;
    }

}

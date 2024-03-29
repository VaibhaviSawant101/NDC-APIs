//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

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
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DisclosureMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferInstructionMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferPenaltyMetadatas"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}OfferTermsMetadatas"/>
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
    "disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas"
})
@XmlRootElement(name = "Offer")
public class Offer {

    @XmlElements({
        @XmlElement(name = "DisclosureMetadatas", type = DisclosureMetadatas.class),
        @XmlElement(name = "OfferMetadatas", type = OfferMetadatas.class),
        @XmlElement(name = "OfferInstructionMetadatas", type = OfferInstructionMetadatas.class),
        @XmlElement(name = "OfferPenaltyMetadatas", type = OfferPenaltyMetadatas.class),
        @XmlElement(name = "OfferTermsMetadatas", type = OfferTermsMetadatas.class)
    })
    protected List<Object> disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas;

    /**
     * Gets the value of the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureMetadatas }
     * {@link OfferInstructionMetadatas }
     * {@link OfferMetadatas }
     * {@link OfferPenaltyMetadatas }
     * {@link OfferTermsMetadatas }
     * 
     * 
     * @return
     *     The value of the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     */
    public List<Object> getDisclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas() {
        if (disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas == null) {
            disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas = new ArrayList<>();
        }
        return this.disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas;
    }

}
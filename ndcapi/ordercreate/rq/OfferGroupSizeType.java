//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * MINIMUM/ MAXIMUM GROUP SIZE definition.
 * 
 * <p>Java class for OfferGroupSizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfferGroupSizeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="2">
 *         <element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         <element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGroupSizeType", propOrder = {
    "minimumOrMaximum"
})
public class OfferGroupSizeType {

    @XmlElementRefs({
        @XmlElementRef(name = "Minimum", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Maximum", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<BigInteger>> minimumOrMaximum;

    /**
     * Gets the value of the minimumOrMaximum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the minimumOrMaximum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumOrMaximum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     * @return
     *     The value of the minimumOrMaximum property.
     */
    public List<JAXBElement<BigInteger>> getMinimumOrMaximum() {
        if (minimumOrMaximum == null) {
            minimumOrMaximum = new ArrayList<>();
        }
        return this.minimumOrMaximum;
    }

}

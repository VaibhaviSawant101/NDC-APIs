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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Recursive element to allow nested selections of services from a bundle of services.
 * 
 * <p>Java class for RequestedServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestedServiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceDefinitionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SelectedService" type="{http://www.iata.org/IATA/EDIST/2017.2}RequestedServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedServiceType", propOrder = {
    "serviceDefinitionID",
    "selectedService"
})
@XmlSeeAlso({
    servicelist.rq.OrderRequestType.Offer.OfferItem.ServiceSelection.class
})
public class RequestedServiceType {

    @XmlElement(name = "ServiceDefinitionID", required = true)
    protected String serviceDefinitionID;
    @XmlElement(name = "SelectedService")
    protected List<RequestedServiceType> selectedService;

    /**
     * Gets the value of the serviceDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionID() {
        return serviceDefinitionID;
    }

    /**
     * Sets the value of the serviceDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDefinitionID(String value) {
        this.serviceDefinitionID = value;
    }

    /**
     * Gets the value of the selectedService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the selectedService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedServiceType }
     * 
     * 
     * @return
     *     The value of the selectedService property.
     */
    public List<RequestedServiceType> getSelectedService() {
        if (selectedService == null) {
            selectedService = new ArrayList<>();
        }
        return this.selectedService;
    }

}

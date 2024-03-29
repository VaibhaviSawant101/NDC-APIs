//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * SERVICE COMBINATION RULES representation.
 * 
 * <p>Java class for ServiceCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceCombinationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Combination" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Rule" type="{http://www.iata.org/IATA/EDIST/2017.2}SrvcCombineRuleSimpleType"/>
 *                   <choice>
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceReference" maxOccurs="unbounded"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCombinationType", propOrder = {
    "combination"
})
@XmlSeeAlso({
    ServiceCombinations.class
})
public class ServiceCombinationType {

    @XmlElement(name = "Combination", required = true)
    protected List<ServiceCombinationType.Combination> combination;

    /**
     * Gets the value of the combination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the combination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCombinationType.Combination }
     * 
     * 
     * @return
     *     The value of the combination property.
     */
    public List<ServiceCombinationType.Combination> getCombination() {
        if (combination == null) {
            combination = new ArrayList<>();
        }
        return this.combination;
    }


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
     *         <element name="Rule" type="{http://www.iata.org/IATA/EDIST/2017.2}SrvcCombineRuleSimpleType"/>
     *         <choice>
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceID" maxOccurs="unbounded"/>
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceReference" maxOccurs="unbounded"/>
     *         </choice>
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
        "rule",
        "serviceID",
        "serviceReference"
    })
    public static class Combination {

        @XmlElement(name = "Rule", required = true)
        protected String rule;
        @XmlElement(name = "ServiceID")
        protected List<ServiceIDType> serviceID;
        @XmlElementRef(name = "ServiceReference", namespace = "http://www.iata.org/IATA/EDIST/2017.2", type = JAXBElement.class, required = false)
        protected List<JAXBElement<Object>> serviceReference;

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRule() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRule(String value) {
            this.rule = value;
        }

        /**
         * Gets the value of the serviceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the serviceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceIDType }
         * 
         * 
         * @return
         *     The value of the serviceID property.
         */
        public List<ServiceIDType> getServiceID() {
            if (serviceID == null) {
                serviceID = new ArrayList<>();
            }
            return this.serviceID;
        }

        /**
         * Gets the value of the serviceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the serviceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         * @return
         *     The value of the serviceReference property.
         */
        public List<JAXBElement<Object>> getServiceReference() {
            if (serviceReference == null) {
                serviceReference = new ArrayList<>();
            }
            return this.serviceReference;
        }

    }

}

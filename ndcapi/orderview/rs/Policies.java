//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package orderview.rs;

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
 *         <element name="Policy" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PolicyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DefaultPolicy"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PolicyAugmentation"/>
 *                 </sequence>
 *               </extension>
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
@XmlType(name = "", propOrder = {
    "policy"
})
@XmlRootElement(name = "Policies")
public class Policies {

    @XmlElement(name = "Policy", required = true)
    protected List<Policies.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policies.Policy }
     * 
     * 
     * @return
     *     The value of the policy property.
     */
    public List<Policies.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<>();
        }
        return this.policy;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PolicyType">
     *       <sequence>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DefaultPolicy"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PolicyAugmentation"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultPolicy",
        "policyAugmentation"
    })
    public static class Policy
        extends PolicyType
    {

        @XmlElement(name = "DefaultPolicy", required = true)
        protected PolicyDefaultType defaultPolicy;
        @XmlElement(name = "PolicyAugmentation", required = true)
        protected PolicyAugmentationType policyAugmentation;

        /**
         * Gets the value of the defaultPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyDefaultType }
         *     
         */
        public PolicyDefaultType getDefaultPolicy() {
            return defaultPolicy;
        }

        /**
         * Sets the value of the defaultPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyDefaultType }
         *     
         */
        public void setDefaultPolicy(PolicyDefaultType value) {
            this.defaultPolicy = value;
        }

        /**
         * Gets the value of the policyAugmentation property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyAugmentationType }
         *     
         */
        public PolicyAugmentationType getPolicyAugmentation() {
            return policyAugmentation;
        }

        /**
         * Sets the value of the policyAugmentation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyAugmentationType }
         *     
         */
        public void setPolicyAugmentation(PolicyAugmentationType value) {
            this.policyAugmentation = value;
        }

    }

}

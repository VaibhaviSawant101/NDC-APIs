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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Policy Notification and Text, e.g. for sensitive data notification and/or handling.
 * 
 * <p>Java class for PolicyDefaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PolicyDefaultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Policy" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DataPolicyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="PolicyID" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *                   <element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType"/>
 *                     <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PolicyLink"/>
 *                   </choice>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}NodePath" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
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
@XmlType(name = "PolicyDefaultType", propOrder = {
    "policy"
})
public class PolicyDefaultType {

    @XmlElement(name = "Policy", required = true)
    protected List<PolicyDefaultType.Policy> policy;

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
     * {@link PolicyDefaultType.Policy }
     * 
     * 
     * @return
     *     The value of the policy property.
     */
    public List<PolicyDefaultType.Policy> getPolicy() {
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="DataPolicyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="PolicyID" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
     *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         <choice>
     *           <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType"/>
     *           <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PolicyLink"/>
     *         </choice>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}NodePath" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataPolicyInd",
        "policyID",
        "type",
        "description",
        "policyLink",
        "nodePath"
    })
    public static class Policy {

        @XmlElement(name = "DataPolicyInd")
        protected Boolean dataPolicyInd;
        @XmlElement(name = "PolicyID")
        protected String policyID;
        @XmlElement(name = "Type")
        protected Object type;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "PolicyLink")
        @XmlSchemaType(name = "anyURI")
        protected String policyLink;
        @XmlElement(name = "NodePath")
        protected NodePathType nodePath;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the dataPolicyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDataPolicyInd() {
            return dataPolicyInd;
        }

        /**
         * Sets the value of the dataPolicyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDataPolicyInd(Boolean value) {
            this.dataPolicyInd = value;
        }

        /**
         * Gets the value of the policyID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyID() {
            return policyID;
        }

        /**
         * Sets the value of the policyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyID(String value) {
            this.policyID = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setType(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the policyLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyLink() {
            return policyLink;
        }

        /**
         * Sets the value of the policyLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyLink(String value) {
            this.policyLink = value;
        }

        /**
         * Message Property Path information for this policy-associated element.
         * 
         * @return
         *     possible object is
         *     {@link NodePathType }
         *     
         */
        public NodePathType getNodePath() {
            return nodePath;
        }

        /**
         * Sets the value of the nodePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link NodePathType }
         *     
         */
        public void setNodePath(NodePathType value) {
            this.nodePath = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         * @return
         *     The value of the refs property.
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<>();
            }
            return this.refs;
        }

    }

}

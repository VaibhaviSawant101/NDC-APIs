//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type definition for Policy.
 * 
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PolicyType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreBaseType">
 *       <sequence>
 *         <element name="Nodes">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Node" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}NodePathType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Descriptions" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}LinkDescriptionType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Metadata" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetaBaseType">
 *                 <sequence>
 *                   <element name="Remarks" type="{http://www.iata.org/IATA/EDIST/2017.2}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="EncodingScheme" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ValidPeriod" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CorePeriodGrpType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="PolicyCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="PolicyType" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}PolicyTypeListType" />
 *       <attribute name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "nodes",
    "descriptions",
    "metadata"
})
@XmlSeeAlso({
    airshopping.rs.Policies.Policy.class,
    airshopping.rs.InfoPolicyNoticeType.Policy.class
})
public class PolicyType
    extends CoreBaseType
{

    @XmlElement(name = "Nodes", required = true)
    protected PolicyType.Nodes nodes;
    @XmlElement(name = "Descriptions")
    protected PolicyType.Descriptions descriptions;
    @XmlElement(name = "Metadata")
    protected PolicyType.Metadata metadata;
    @XmlAttribute(name = "PolicyType", required = true)
    protected String policyType;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Nodes }
     *     
     */
    public PolicyType.Nodes getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Nodes }
     *     
     */
    public void setNodes(PolicyType.Nodes value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Descriptions }
     *     
     */
    public PolicyType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Descriptions }
     *     
     */
    public void setDescriptions(PolicyType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Metadata }
     *     
     */
    public PolicyType.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Metadata }
     *     
     */
    public void setMetadata(PolicyType.Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyType(String value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}LinkDescriptionType" maxOccurs="unbounded"/>
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
        "description"
    })
    public static class Descriptions {

        @XmlElement(name = "Description", required = true)
        protected List<LinkDescriptionType> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkDescriptionType }
         * 
         * 
         * @return
         *     The value of the description property.
         */
        public List<LinkDescriptionType> getDescription() {
            if (description == null) {
                description = new ArrayList<>();
            }
            return this.description;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetaBaseType">
     *       <sequence>
     *         <element name="Remarks" type="{http://www.iata.org/IATA/EDIST/2017.2}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="EncodingScheme" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ValidPeriod" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CorePeriodGrpType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="PolicyCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remarks",
        "encodingScheme",
        "validPeriod"
    })
    public static class Metadata
        extends MetaBaseType
    {

        @XmlElement(name = "Remarks")
        protected List<RemarkType> remarks;
        @XmlElement(name = "EncodingScheme")
        protected PolicyType.Metadata.EncodingScheme encodingScheme;
        @XmlElement(name = "ValidPeriod")
        protected List<PolicyType.Metadata.ValidPeriod> validPeriod;
        @XmlAttribute(name = "PolicyCode")
        protected String policyCode;

        /**
         * Gets the value of the remarks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the remarks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemarks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RemarkType }
         * 
         * 
         * @return
         *     The value of the remarks property.
         */
        public List<RemarkType> getRemarks() {
            if (remarks == null) {
                remarks = new ArrayList<>();
            }
            return this.remarks;
        }

        /**
         * Gets the value of the encodingScheme property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyType.Metadata.EncodingScheme }
         *     
         */
        public PolicyType.Metadata.EncodingScheme getEncodingScheme() {
            return encodingScheme;
        }

        /**
         * Sets the value of the encodingScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyType.Metadata.EncodingScheme }
         *     
         */
        public void setEncodingScheme(PolicyType.Metadata.EncodingScheme value) {
            this.encodingScheme = value;
        }

        /**
         * Gets the value of the validPeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the validPeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PolicyType.Metadata.ValidPeriod }
         * 
         * 
         * @return
         *     The value of the validPeriod property.
         */
        public List<PolicyType.Metadata.ValidPeriod> getValidPeriod() {
            if (validPeriod == null) {
                validPeriod = new ArrayList<>();
            }
            return this.validPeriod;
        }

        /**
         * Gets the value of the policyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyCode() {
            return policyCode;
        }

        /**
         * Sets the value of the policyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyCode(String value) {
            this.policyCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EncodingScheme
            extends EncSchemeType
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}CorePeriodGrpType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ValidPeriod
            extends CorePeriodGrpType
        {


        }

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
     *         <element name="Node" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}NodePathType">
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
        "node"
    })
    public static class Nodes {

        @XmlElement(name = "Node", required = true)
        protected List<PolicyType.Nodes.Node> node;

        /**
         * Gets the value of the node property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the node property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PolicyType.Nodes.Node }
         * 
         * 
         * @return
         *     The value of the node property.
         */
        public List<PolicyType.Nodes.Node> getNode() {
            if (node == null) {
                node = new ArrayList<>();
            }
            return this.node;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}NodePathType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Node
            extends NodePathType
        {


        }

    }

}

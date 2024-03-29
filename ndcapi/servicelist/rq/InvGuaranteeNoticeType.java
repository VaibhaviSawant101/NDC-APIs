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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Inventory Guarantee Notice definition.
 * 
 * <p>Java class for InvGuaranteeNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvGuaranteeNoticeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Query">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="GuaranteeRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Results">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="InventoryGuarantee" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.2}UniqueStringID_SimpleType" minOccurs="0"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InventoryGuaranteeTimeLimits"/>
 *                             <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}MultiAssociationType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="NoGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvGuaranteeNoticeType", propOrder = {
    "query",
    "results"
})
public class InvGuaranteeNoticeType {

    @XmlElement(name = "Query")
    protected InvGuaranteeNoticeType.Query query;
    @XmlElement(name = "Results")
    protected InvGuaranteeNoticeType.Results results;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeNoticeType.Query }
     *     
     */
    public InvGuaranteeNoticeType.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeNoticeType.Query }
     *     
     */
    public void setQuery(InvGuaranteeNoticeType.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeNoticeType.Results }
     *     
     */
    public InvGuaranteeNoticeType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeNoticeType.Results }
     *     
     */
    public void setResults(InvGuaranteeNoticeType.Results value) {
        this.results = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="GuaranteeRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Query {

        @XmlAttribute(name = "GuaranteeRequestInd")
        protected Boolean guaranteeRequestInd;

        /**
         * Gets the value of the guaranteeRequestInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRequestInd() {
            return guaranteeRequestInd;
        }

        /**
         * Sets the value of the guaranteeRequestInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRequestInd(Boolean value) {
            this.guaranteeRequestInd = value;
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
     *         <element name="InventoryGuarantee" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.2}UniqueStringID_SimpleType" minOccurs="0"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InventoryGuaranteeTimeLimits"/>
     *                   <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}MultiAssociationType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="NoGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inventoryGuarantee"
    })
    public static class Results {

        @XmlElement(name = "InventoryGuarantee")
        protected InvGuaranteeNoticeType.Results.InventoryGuarantee inventoryGuarantee;
        @XmlAttribute(name = "NoGuaranteeInd")
        protected Boolean noGuaranteeInd;

        /**
         * Gets the value of the inventoryGuarantee property.
         * 
         * @return
         *     possible object is
         *     {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
         *     
         */
        public InvGuaranteeNoticeType.Results.InventoryGuarantee getInventoryGuarantee() {
            return inventoryGuarantee;
        }

        /**
         * Sets the value of the inventoryGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
         *     
         */
        public void setInventoryGuarantee(InvGuaranteeNoticeType.Results.InventoryGuarantee value) {
            this.inventoryGuarantee = value;
        }

        /**
         * Gets the value of the noGuaranteeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoGuaranteeInd() {
            return noGuaranteeInd;
        }

        /**
         * Sets the value of the noGuaranteeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoGuaranteeInd(Boolean value) {
            this.noGuaranteeInd = value;
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
         *         <element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.2}UniqueStringID_SimpleType" minOccurs="0"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}InventoryGuaranteeTimeLimits"/>
         *         <element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.2}MultiAssociationType" minOccurs="0"/>
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
            "invGuaranteeID",
            "inventoryGuaranteeTimeLimits",
            "associations"
        })
        public static class InventoryGuarantee {

            @XmlElement(name = "InvGuaranteeID")
            protected String invGuaranteeID;
            @XmlElement(name = "InventoryGuaranteeTimeLimits", required = true)
            protected InventoryGuaranteeTimeLimits inventoryGuaranteeTimeLimits;
            @XmlElement(name = "Associations")
            protected MultiAssociationType associations;

            /**
             * Gets the value of the invGuaranteeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvGuaranteeID() {
                return invGuaranteeID;
            }

            /**
             * Sets the value of the invGuaranteeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvGuaranteeID(String value) {
                this.invGuaranteeID = value;
            }

            /**
             * Gets the value of the inventoryGuaranteeTimeLimits property.
             * 
             * @return
             *     possible object is
             *     {@link InventoryGuaranteeTimeLimits }
             *     
             */
            public InventoryGuaranteeTimeLimits getInventoryGuaranteeTimeLimits() {
                return inventoryGuaranteeTimeLimits;
            }

            /**
             * Sets the value of the inventoryGuaranteeTimeLimits property.
             * 
             * @param value
             *     allowed object is
             *     {@link InventoryGuaranteeTimeLimits }
             *     
             */
            public void setInventoryGuaranteeTimeLimits(InventoryGuaranteeTimeLimits value) {
                this.inventoryGuaranteeTimeLimits = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link MultiAssociationType }
             *     
             */
            public MultiAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link MultiAssociationType }
             *     
             */
            public void setAssociations(MultiAssociationType value) {
                this.associations = value;
            }

        }

    }

}

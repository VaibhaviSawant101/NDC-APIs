//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Payment Processing Rules Notice definition.
 * 
 * <p>Java class for PaymentRulesNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentRulesNoticeType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}TrxProcessObjectBaseType">
 *       <sequence>
 *         <element name="FormOfPayment" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Query">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="ProceedOnFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Results">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *                             <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations"/>
 *                           </sequence>
 *                           <attribute name="PaymentFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRulesNoticeType", propOrder = {
    "formOfPayment"
})
public class PaymentRulesNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "FormOfPayment")
    protected PaymentRulesNoticeType.FormOfPayment formOfPayment;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRulesNoticeType.FormOfPayment }
     *     
     */
    public PaymentRulesNoticeType.FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRulesNoticeType.FormOfPayment }
     *     
     */
    public void setFormOfPayment(PaymentRulesNoticeType.FormOfPayment value) {
        this.formOfPayment = value;
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
     *       <choice>
     *         <element name="Query">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="ProceedOnFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Results">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
     *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations"/>
     *                 </sequence>
     *                 <attribute name="PaymentFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "query",
        "results"
    })
    public static class FormOfPayment {

        @XmlElement(name = "Query")
        protected PaymentRulesNoticeType.FormOfPayment.Query query;
        @XmlElement(name = "Results")
        protected PaymentRulesNoticeType.FormOfPayment.Results results;

        /**
         * Gets the value of the query property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentRulesNoticeType.FormOfPayment.Query }
         *     
         */
        public PaymentRulesNoticeType.FormOfPayment.Query getQuery() {
            return query;
        }

        /**
         * Sets the value of the query property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentRulesNoticeType.FormOfPayment.Query }
         *     
         */
        public void setQuery(PaymentRulesNoticeType.FormOfPayment.Query value) {
            this.query = value;
        }

        /**
         * Gets the value of the results property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentRulesNoticeType.FormOfPayment.Results }
         *     
         */
        public PaymentRulesNoticeType.FormOfPayment.Results getResults() {
            return results;
        }

        /**
         * Sets the value of the results property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentRulesNoticeType.FormOfPayment.Results }
         *     
         */
        public void setResults(PaymentRulesNoticeType.FormOfPayment.Results value) {
            this.results = value;
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
         *       <attribute name="ProceedOnFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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

            @XmlAttribute(name = "ProceedOnFailureInd")
            protected Boolean proceedOnFailureInd;

            /**
             * Gets the value of the proceedOnFailureInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isProceedOnFailureInd() {
                return proceedOnFailureInd;
            }

            /**
             * Sets the value of the proceedOnFailureInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setProceedOnFailureInd(Boolean value) {
                this.proceedOnFailureInd = value;
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
         *         <element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
         *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations"/>
         *       </sequence>
         *       <attribute name="PaymentFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "associations"
        })
        public static class Results {

            @XmlElement(name = "Code")
            protected String code;
            @XmlElement(name = "Associations", required = true)
            protected OrderItemAssociationType associations;
            @XmlAttribute(name = "PaymentFailureInd")
            protected Boolean paymentFailureInd;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
            }

            /**
             * Gets the value of the paymentFailureInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPaymentFailureInd() {
                return paymentFailureInd;
            }

            /**
             * Sets the value of the paymentFailureInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPaymentFailureInd(Boolean value) {
                this.paymentFailureInd = value;
            }

        }

    }

}

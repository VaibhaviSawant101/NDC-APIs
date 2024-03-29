//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package airshopping.rs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The document number, type and coupon numbers.
 * 
 * <p>Java class for TicketDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TicketDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TicketDocNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType"/>
 *         <element name="CpnNbrs" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CpnNbr" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
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
@XmlType(name = "TicketDocumentType", propOrder = {
    "ticketDocNbr",
    "type",
    "cpnNbrs"
})
public class TicketDocumentType {

    @XmlElement(name = "TicketDocNbr", required = true)
    protected String ticketDocNbr;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "CpnNbrs")
    protected TicketDocumentType.CpnNbrs cpnNbrs;

    /**
     * Gets the value of the ticketDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocNbr() {
        return ticketDocNbr;
    }

    /**
     * Sets the value of the ticketDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocNbr(String value) {
        this.ticketDocNbr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the cpnNbrs property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDocumentType.CpnNbrs }
     *     
     */
    public TicketDocumentType.CpnNbrs getCpnNbrs() {
        return cpnNbrs;
    }

    /**
     * Sets the value of the cpnNbrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDocumentType.CpnNbrs }
     *     
     */
    public void setCpnNbrs(TicketDocumentType.CpnNbrs value) {
        this.cpnNbrs = value;
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
     *         <element name="CpnNbr" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             </restriction>
     *           </simpleType>
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
        "cpnNbr"
    })
    public static class CpnNbrs {

        @XmlElement(name = "CpnNbr")
        protected List<BigInteger> cpnNbr;

        /**
         * Gets the value of the cpnNbr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the cpnNbr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCpnNbr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         * @return
         *     The value of the cpnNbr property.
         */
        public List<BigInteger> getCpnNbr() {
            if (cpnNbr == null) {
                cpnNbr = new ArrayList<>();
            }
            return this.cpnNbr;
        }

    }

}

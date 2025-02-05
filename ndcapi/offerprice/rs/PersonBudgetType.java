//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for PER PERSON BUDGET Qualifier.
 * 
 * <p>Java class for PersonBudgetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonBudgetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
 *               </extension>
 *             </simpleContent>
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
@XmlType(name = "PersonBudgetType", propOrder = {
    "amount"
})
public class PersonBudgetType {

    @XmlElement(name = "Amount", required = true)
    protected PersonBudgetType.Amount amount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBudgetType.Amount }
     *     
     */
    public PersonBudgetType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBudgetType.Amount }
     *     
     */
    public void setAmount(PersonBudgetType.Amount value) {
        this.amount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amount
        extends CurrencyAmountOptType
    {


    }

}

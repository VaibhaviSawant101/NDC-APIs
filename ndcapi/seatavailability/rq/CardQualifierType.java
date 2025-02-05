//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Credit Card Qualifier.
 * 
 * <p>Java class for CardQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardQualifierType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2"/>
 *               <pattern value="[A-Z]{2}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="IIN_Number" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="[0-9]{6}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}CurrCode" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *       <attribute name="IsPercentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardQualifierType", propOrder = {
    "type",
    "iinNumber",
    "amount",
    "currCode"
})
public class CardQualifierType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "IIN_Number")
    protected String iinNumber;
    @XmlElement(name = "Amount")
    protected CurrencyAmountOptType amount;
    @XmlElement(name = "CurrCode")
    protected CurrCode currCode;
    @XmlAttribute(name = "IsPercentInd")
    protected Boolean isPercentInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the iinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIINNumber() {
        return iinNumber;
    }

    /**
     * Sets the value of the iinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIINNumber(String value) {
        this.iinNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setAmount(CurrencyAmountOptType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrCode }
     *     
     */
    public CurrCode getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrCode }
     *     
     */
    public void setCurrCode(CurrCode value) {
        this.currCode = value;
    }

    /**
     * Gets the value of the isPercentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPercentInd() {
        return isPercentInd;
    }

    /**
     * Sets the value of the isPercentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPercentInd(Boolean value) {
        this.isPercentInd = value;
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

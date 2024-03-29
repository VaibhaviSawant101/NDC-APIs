//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * BAGGAGE PRICING Qualifier.
 * 
 * <p>Java class for BaggagePricingQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BaggagePricingQualifierType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageOption" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RequestAction" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *         <element name="OptionalCharges" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *       <attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="IncludeSettlementInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggagePricingQualifierType", propOrder = {
    "baggageOption",
    "requestAction",
    "optionalCharges"
})
public class BaggagePricingQualifierType {

    @XmlElement(name = "BaggageOption")
    protected List<String> baggageOption;
    @XmlElement(name = "RequestAction")
    protected String requestAction;
    @XmlElement(name = "OptionalCharges")
    protected String optionalCharges;
    @XmlAttribute(name = "FixedPrePaidInd")
    protected Boolean fixedPrePaidInd;
    @XmlAttribute(name = "CommercialAgreementID")
    protected String commercialAgreementID;
    @XmlAttribute(name = "DeferralInd")
    protected Boolean deferralInd;
    @XmlAttribute(name = "IncludeSettlementInd")
    protected Boolean includeSettlementInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the baggageOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the baggageOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the baggageOption property.
     */
    public List<String> getBaggageOption() {
        if (baggageOption == null) {
            baggageOption = new ArrayList<>();
        }
        return this.baggageOption;
    }

    /**
     * Gets the value of the requestAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAction() {
        return requestAction;
    }

    /**
     * Sets the value of the requestAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAction(String value) {
        this.requestAction = value;
    }

    /**
     * Gets the value of the optionalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalCharges() {
        return optionalCharges;
    }

    /**
     * Sets the value of the optionalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalCharges(String value) {
        this.optionalCharges = value;
    }

    /**
     * Gets the value of the fixedPrePaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrePaidInd() {
        return fixedPrePaidInd;
    }

    /**
     * Sets the value of the fixedPrePaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedPrePaidInd(Boolean value) {
        this.fixedPrePaidInd = value;
    }

    /**
     * Gets the value of the commercialAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAgreementID() {
        return commercialAgreementID;
    }

    /**
     * Sets the value of the commercialAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAgreementID(String value) {
        this.commercialAgreementID = value;
    }

    /**
     * Gets the value of the deferralInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferralInd() {
        return deferralInd;
    }

    /**
     * Sets the value of the deferralInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferralInd(Boolean value) {
        this.deferralInd = value;
    }

    /**
     * Gets the value of the includeSettlementInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSettlementInd() {
        return includeSettlementInd;
    }

    /**
     * Sets the value of the includeSettlementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSettlementInd(Boolean value) {
        this.includeSettlementInd = value;
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

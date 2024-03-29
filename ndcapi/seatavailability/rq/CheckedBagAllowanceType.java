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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * CHECKED BAG ALLOWANCE defiition.
 * 
 * <p>Java class for CheckedBagAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CheckedBagAllowanceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CheckedBag" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}WeightAllowance" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DimensionAllowance" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AllowanceDescription" minOccurs="0"/>
 *                   <element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                   <element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
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
@XmlType(name = "CheckedBagAllowanceType", propOrder = {
    "checkedBag"
})
@XmlSeeAlso({
    CheckedBags.class
})
public class CheckedBagAllowanceType {

    @XmlElement(name = "CheckedBag", required = true)
    protected List<CheckedBagAllowanceType.CheckedBag> checkedBag;

    /**
     * Gets the value of the checkedBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the checkedBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckedBagAllowanceType.CheckedBag }
     * 
     * 
     * @return
     *     The value of the checkedBag property.
     */
    public List<CheckedBagAllowanceType.CheckedBag> getCheckedBag() {
        if (checkedBag == null) {
            checkedBag = new ArrayList<>();
        }
        return this.checkedBag;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}WeightAllowance" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}DimensionAllowance" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}AllowanceDescription" minOccurs="0"/>
     *         <element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
     *         <element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "weightAllowance",
        "pieceAllowance",
        "dimensionAllowance",
        "allowanceDescription",
        "baggageDeterminingCarrier",
        "bdcAnalysisResult"
    })
    public static class CheckedBag {

        @XmlElement(name = "WeightAllowance")
        protected WeightAllowance weightAllowance;
        @XmlElement(name = "PieceAllowance")
        protected List<PieceAllowance> pieceAllowance;
        @XmlElement(name = "DimensionAllowance")
        protected BagAllowanceDimensionType dimensionAllowance;
        @XmlElement(name = "AllowanceDescription")
        protected BagAllowanceDescType allowanceDescription;
        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlElement(name = "BDC_AnalysisResult")
        protected String bdcAnalysisResult;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the weightAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link WeightAllowance }
         *     
         */
        public WeightAllowance getWeightAllowance() {
            return weightAllowance;
        }

        /**
         * Sets the value of the weightAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightAllowance }
         *     
         */
        public void setWeightAllowance(WeightAllowance value) {
            this.weightAllowance = value;
        }

        /**
         * Defines the maximum number of each allowable baggage type.Gets the value of the pieceAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the pieceAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PieceAllowance }
         * 
         * 
         * @return
         *     The value of the pieceAllowance property.
         */
        public List<PieceAllowance> getPieceAllowance() {
            if (pieceAllowance == null) {
                pieceAllowance = new ArrayList<>();
            }
            return this.pieceAllowance;
        }

        /**
         * Gets the value of the dimensionAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public BagAllowanceDimensionType getDimensionAllowance() {
            return dimensionAllowance;
        }

        /**
         * Sets the value of the dimensionAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public void setDimensionAllowance(BagAllowanceDimensionType value) {
            this.dimensionAllowance = value;
        }

        /**
         * Gets the value of the allowanceDescription property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public BagAllowanceDescType getAllowanceDescription() {
            return allowanceDescription;
        }

        /**
         * Sets the value of the allowanceDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public void setAllowanceDescription(BagAllowanceDescType value) {
            this.allowanceDescription = value;
        }

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the bdcAnalysisResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBDCAnalysisResult() {
            return bdcAnalysisResult;
        }

        /**
         * Sets the value of the bdcAnalysisResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBDCAnalysisResult(String value) {
            this.bdcAnalysisResult = value;
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

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import java.math.BigInteger;
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
 * A data type for Baggage Allowance by Piece.
 * 
 * <p>Java class for BagAllowancePieceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BagAllowancePieceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicableParty" type="{http://www.iata.org/IATA/EDIST/2017.2}BagAppSimpleType"/>
 *         <element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="BagType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ApplicableBag" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *         <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
 *         <element name="PieceMeasurements" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/EDIST/2017.2}BagAllowanceWeightType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/EDIST/2017.2}BagAllowanceDimensionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *       <attribute name="PieceAllowanceCombination">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="OR"/>
 *             <enumeration value="AND"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagAllowancePieceType", propOrder = {
    "applicableParty",
    "totalQuantity",
    "bagType",
    "applicableBag",
    "descriptions",
    "pieceMeasurements"
})
@XmlSeeAlso({
    PieceAllowance.class
})
public class BagAllowancePieceType {

    @XmlElement(name = "ApplicableParty", required = true)
    protected String applicableParty;
    @XmlElement(name = "TotalQuantity", required = true)
    protected BigInteger totalQuantity;
    @XmlElement(name = "BagType")
    protected String bagType;
    @XmlElement(name = "ApplicableBag")
    protected String applicableBag;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "PieceMeasurements", required = true)
    protected List<BagAllowancePieceType.PieceMeasurements> pieceMeasurements;
    @XmlAttribute(name = "PieceAllowanceCombination")
    protected String pieceAllowanceCombination;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the applicableParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableParty() {
        return applicableParty;
    }

    /**
     * Sets the value of the applicableParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableParty(String value) {
        this.applicableParty = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalQuantity(BigInteger value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the bagType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagType() {
        return bagType;
    }

    /**
     * Sets the value of the bagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagType(String value) {
        this.bagType = value;
    }

    /**
     * Gets the value of the applicableBag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBag() {
        return applicableBag;
    }

    /**
     * Sets the value of the applicableBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBag(String value) {
        this.applicableBag = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the pieceMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pieceMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowancePieceType.PieceMeasurements }
     * 
     * 
     * @return
     *     The value of the pieceMeasurements property.
     */
    public List<BagAllowancePieceType.PieceMeasurements> getPieceMeasurements() {
        if (pieceMeasurements == null) {
            pieceMeasurements = new ArrayList<>();
        }
        return this.pieceMeasurements;
    }

    /**
     * Gets the value of the pieceAllowanceCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceAllowanceCombination() {
        return pieceAllowanceCombination;
    }

    /**
     * Sets the value of the pieceAllowanceCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceAllowanceCombination(String value) {
        this.pieceAllowanceCombination = value;
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
     *       <sequence>
     *         <element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/EDIST/2017.2}BagAllowanceWeightType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/EDIST/2017.2}BagAllowanceDimensionType" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pieceWeightAllowance",
        "pieceDimensionAllowance"
    })
    public static class PieceMeasurements {

        @XmlElement(name = "PieceWeightAllowance")
        protected List<BagAllowanceWeightType> pieceWeightAllowance;
        @XmlElement(name = "PieceDimensionAllowance")
        protected List<BagAllowanceDimensionType> pieceDimensionAllowance;
        @XmlAttribute(name = "Quantity", required = true)
        protected int quantity;

        /**
         * Gets the value of the pieceWeightAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the pieceWeightAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceWeightAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BagAllowanceWeightType }
         * 
         * 
         * @return
         *     The value of the pieceWeightAllowance property.
         */
        public List<BagAllowanceWeightType> getPieceWeightAllowance() {
            if (pieceWeightAllowance == null) {
                pieceWeightAllowance = new ArrayList<>();
            }
            return this.pieceWeightAllowance;
        }

        /**
         * Gets the value of the pieceDimensionAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the pieceDimensionAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceDimensionAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BagAllowanceDimensionType }
         * 
         * 
         * @return
         *     The value of the pieceDimensionAllowance property.
         */
        public List<BagAllowanceDimensionType> getPieceDimensionAllowance() {
            if (pieceDimensionAllowance == null) {
                pieceDimensionAllowance = new ArrayList<>();
            }
            return this.pieceDimensionAllowance;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

    }

}

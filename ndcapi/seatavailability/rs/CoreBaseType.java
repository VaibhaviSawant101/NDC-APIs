//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package seatavailability.rs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base type definition for Core Entity Object.
 * 
 * <p>Java class for CoreBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CoreBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AugPointAssocs" type="{http://www.iata.org/IATA/EDIST/2017.2}AugPointAssocType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassSimpleType" />
 *       <attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.2}OwnerSimpleType" />
 *       <attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreBaseType", propOrder = {
    "augPointAssocs"
})
@XmlSeeAlso({
    PolicyType.class,
    LinkFormattedType.Link.class,
    LinkFormattedType.class
})
public class CoreBaseType {

    @XmlElement(name = "AugPointAssocs")
    protected AugPointAssocType augPointAssocs;
    @XmlAttribute(name = "Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String key;
    @XmlAttribute(name = "Owner")
    protected String owner;
    @XmlAttribute(name = "Seq")
    protected BigInteger seq;

    /**
     * Gets the value of the augPointAssocs property.
     * 
     * @return
     *     possible object is
     *     {@link AugPointAssocType }
     *     
     */
    public AugPointAssocType getAugPointAssocs() {
        return augPointAssocs;
    }

    /**
     * Sets the value of the augPointAssocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointAssocType }
     *     
     */
    public void setAugPointAssocs(AugPointAssocType value) {
        this.augPointAssocs = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

}

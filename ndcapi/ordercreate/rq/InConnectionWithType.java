//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ordercreate.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * COUPON-RELATED IN CONNECTION DOCUMENT/ COUPON definition.
 * 
 * <p>Java class for InConnectionWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InConnectionWithType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InConnectionDocNbr" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="[0-9a-zA-Z]{1,14}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="InConnectonCpnNbr" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               <minInclusive value="1"/>
 *               <maxInclusive value="4"/>
 *               <pattern value="[0-9a-zA-Z]{1,14}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *       <attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InConnectionWithType", propOrder = {
    "inConnectionDocNbr",
    "inConnectonCpnNbr"
})
public class InConnectionWithType {

    @XmlElement(name = "InConnectionDocNbr")
    protected String inConnectionDocNbr;
    @XmlElement(name = "InConnectonCpnNbr")
    protected Integer inConnectonCpnNbr;
    @XmlAttribute(name = "AssociateInd")
    protected Boolean associateInd;

    /**
     * Gets the value of the inConnectionDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConnectionDocNbr() {
        return inConnectionDocNbr;
    }

    /**
     * Sets the value of the inConnectionDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConnectionDocNbr(String value) {
        this.inConnectionDocNbr = value;
    }

    /**
     * Gets the value of the inConnectonCpnNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInConnectonCpnNbr() {
        return inConnectonCpnNbr;
    }

    /**
     * Sets the value of the inConnectonCpnNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInConnectonCpnNbr(Integer value) {
        this.inConnectonCpnNbr = value;
    }

    /**
     * Gets the value of the associateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssociateInd() {
        return associateInd;
    }

    /**
     * Sets the value of the associateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssociateInd(Boolean value) {
        this.associateInd = value;
    }

}

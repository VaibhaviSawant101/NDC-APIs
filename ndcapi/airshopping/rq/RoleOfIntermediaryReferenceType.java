//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Intermediary to Intermediary Role Association.
 * 
 * <p>Java class for RoleOfIntermediaryReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RoleOfIntermediaryReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="supplier_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleOfIntermediaryReferenceType")
public class RoleOfIntermediaryReferenceType {

    @XmlAttribute(name = "supplier_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object supplierRef;

    /**
     * Gets the value of the supplierRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplierRef() {
        return supplierRef;
    }

    /**
     * Sets the value of the supplierRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplierRef(Object value) {
        this.supplierRef = value;
    }

}

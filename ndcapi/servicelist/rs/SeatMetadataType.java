//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * SEAT Metadata definition.
 * 
 * <p>Java class for SeatMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SeatMetadataType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetadataObjectBaseType">
 *       <sequence>
 *         <element name="SeatStatus" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMetadataType", propOrder = {
    "seatStatus"
})
public class SeatMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "SeatStatus")
    protected String seatStatus;

    /**
     * Gets the value of the seatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatStatus() {
        return seatStatus;
    }

    /**
     * Sets the value of the seatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatStatus(String value) {
        this.seatStatus = value;
    }

}
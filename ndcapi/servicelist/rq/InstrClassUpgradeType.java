//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Instructions: Class of Service Upgrade definition.
 * 
 * <p>Java class for InstrClassUpgradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstrClassUpgradeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Classes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ClassOfService" maxOccurs="unbounded"/>
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
@XmlType(name = "InstrClassUpgradeType", propOrder = {
    "classes"
})
@XmlSeeAlso({
    OfferClassUpgradeType.class
})
public class InstrClassUpgradeType {

    @XmlElement(name = "Classes")
    protected InstrClassUpgradeType.Classes classes;

    /**
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link InstrClassUpgradeType.Classes }
     *     
     */
    public InstrClassUpgradeType.Classes getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrClassUpgradeType.Classes }
     *     
     */
    public void setClasses(InstrClassUpgradeType.Classes value) {
        this.classes = value;
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
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}ClassOfService" maxOccurs="unbounded"/>
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
        "classOfService"
    })
    public static class Classes {

        @XmlElement(name = "ClassOfService", required = true)
        protected List<FlightCOSCoreType> classOfService;

        /**
         * Upgrade-eligible Class of Service. Example: T Gets the value of the classOfService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the classOfService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassOfService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightCOSCoreType }
         * 
         * 
         * @return
         *     The value of the classOfService property.
         */
        public List<FlightCOSCoreType> getClassOfService() {
            if (classOfService == null) {
                classOfService = new ArrayList<>();
            }
            return this.classOfService;
        }

    }

}

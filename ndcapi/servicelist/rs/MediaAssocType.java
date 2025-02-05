//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package servicelist.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Associated Media definition.
 * 
 * <p>Java class for MediaAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MediaAssocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MediaGroupreference"/>
 *         <element name="MediaItems" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MediaItemReference"/>
 *                   <element name="MediaLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAssocType", propOrder = {
    "mediaGroupreference",
    "mediaItems"
})
public class MediaAssocType {

    @XmlElement(name = "MediaGroupreference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object mediaGroupreference;
    @XmlElement(name = "MediaItems")
    protected List<MediaAssocType.MediaItems> mediaItems;

    /**
     * Gets the value of the mediaGroupreference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaGroupreference() {
        return mediaGroupreference;
    }

    /**
     * Sets the value of the mediaGroupreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaGroupreference(Object value) {
        this.mediaGroupreference = value;
    }

    /**
     * Gets the value of the mediaItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mediaItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaAssocType.MediaItems }
     * 
     * 
     * @return
     *     The value of the mediaItems property.
     */
    public List<MediaAssocType.MediaItems> getMediaItems() {
        if (mediaItems == null) {
            mediaItems = new ArrayList<>();
        }
        return this.mediaItems;
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
     *       <choice>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MediaItemReference"/>
     *         <element name="MediaLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mediaItemReference",
        "mediaLink"
    })
    public static class MediaItems {

        @XmlElement(name = "MediaItemReference")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object mediaItemReference;
        @XmlElement(name = "MediaLink")
        @XmlSchemaType(name = "anyURI")
        protected String mediaLink;

        /**
         * Gets the value of the mediaItemReference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMediaItemReference() {
            return mediaItemReference;
        }

        /**
         * Sets the value of the mediaItemReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMediaItemReference(Object value) {
            this.mediaItemReference = value;
        }

        /**
         * Gets the value of the mediaLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMediaLink(String value) {
            this.mediaLink = value;
        }

    }

}

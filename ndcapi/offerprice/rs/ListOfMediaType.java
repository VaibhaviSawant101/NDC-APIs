//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package offerprice.rs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * MEDIA data list definition.
 * 
 * <p>Java class for ListOfMediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ListOfMediaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Media" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ObjectID" type="{http://www.iata.org/IATA/EDIST/2017.2}MediaID_Type" minOccurs="0"/>
 *                   <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MediaLink" minOccurs="0"/>
 *                   <element name="AttachmentID" type="{http://www.iata.org/IATA/EDIST/2017.2}MediaID_Type" minOccurs="0"/>
 *                   <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
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
@XmlType(name = "ListOfMediaType", propOrder = {
    "media"
})
public class ListOfMediaType {

    @XmlElement(name = "Media", required = true)
    protected List<ListOfMediaType.Media> media;

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfMediaType.Media }
     * 
     * 
     * @return
     *     The value of the media property.
     */
    public List<ListOfMediaType.Media> getMedia() {
        if (media == null) {
            media = new ArrayList<>();
        }
        return this.media;
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
     *         <element name="ObjectID" type="{http://www.iata.org/IATA/EDIST/2017.2}MediaID_Type" minOccurs="0"/>
     *         <element ref="{http://www.iata.org/IATA/EDIST/2017.2}MediaLink" minOccurs="0"/>
     *         <element name="AttachmentID" type="{http://www.iata.org/IATA/EDIST/2017.2}MediaID_Type" minOccurs="0"/>
     *         <element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
     *       </sequence>
     *       <attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objectID",
        "mediaLink",
        "attachmentID",
        "descriptions"
    })
    public static class Media {

        @XmlElement(name = "ObjectID")
        protected MediaIDType objectID;
        @XmlElement(name = "MediaLink")
        protected MediaLink mediaLink;
        @XmlElement(name = "AttachmentID")
        protected MediaIDType attachmentID;
        @XmlElement(name = "Descriptions")
        protected Descriptions descriptions;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the objectID property.
         * 
         * @return
         *     possible object is
         *     {@link MediaIDType }
         *     
         */
        public MediaIDType getObjectID() {
            return objectID;
        }

        /**
         * Sets the value of the objectID property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaIDType }
         *     
         */
        public void setObjectID(MediaIDType value) {
            this.objectID = value;
        }

        /**
         * Description-associated MEDIA LINK.
         * 
         * @return
         *     possible object is
         *     {@link MediaLink }
         *     
         */
        public MediaLink getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaLink }
         *     
         */
        public void setMediaLink(MediaLink value) {
            this.mediaLink = value;
        }

        /**
         * Gets the value of the attachmentID property.
         * 
         * @return
         *     possible object is
         *     {@link MediaIDType }
         *     
         */
        public MediaIDType getAttachmentID() {
            return attachmentID;
        }

        /**
         * Sets the value of the attachmentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaIDType }
         *     
         */
        public void setAttachmentID(MediaIDType value) {
            this.attachmentID = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

    }

}

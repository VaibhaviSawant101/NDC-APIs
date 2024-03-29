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
 * Passenger Authentication definition.
 * 
 * Notes:
 *  1. The AuthQuestion is returned as an Alert in a Shopping or Order response message.
 *  2. The AuthAnswer is returned as an Alert in a Shopping or Order request message.
 *  3. Note that the CustomerInputRQ may be used to send an authentication response in lieue of using an alert in a request message.
 * 
 * <p>Java class for PIN_AuthTravelerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PIN_AuthTravelerType">
 *   <complexContent>
 *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}TrxProcessObjectBaseType">
 *       <choice>
 *         <element name="AuthRequest">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PinPhraseQuestionType">
 *                 <attribute name="AuthenticationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="MaximumTrxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="RetryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AuthResponse" type="{http://www.iata.org/IATA/EDIST/2017.2}PinPhraseAnswerType"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIN_AuthTravelerType", propOrder = {
    "authRequest",
    "authResponse"
})
public class PINAuthTravelerType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "AuthRequest")
    protected PINAuthTravelerType.AuthRequest authRequest;
    @XmlElement(name = "AuthResponse")
    protected PinPhraseAnswerType authResponse;

    /**
     * Gets the value of the authRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PINAuthTravelerType.AuthRequest }
     *     
     */
    public PINAuthTravelerType.AuthRequest getAuthRequest() {
        return authRequest;
    }

    /**
     * Sets the value of the authRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINAuthTravelerType.AuthRequest }
     *     
     */
    public void setAuthRequest(PINAuthTravelerType.AuthRequest value) {
        this.authRequest = value;
    }

    /**
     * Gets the value of the authResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseAnswerType }
     *     
     */
    public PinPhraseAnswerType getAuthResponse() {
        return authResponse;
    }

    /**
     * Sets the value of the authResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseAnswerType }
     *     
     */
    public void setAuthResponse(PinPhraseAnswerType value) {
        this.authResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/EDIST/2017.2}PinPhraseQuestionType">
     *       <attribute name="AuthenticationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="MaximumTrxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="RetryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AuthRequest
        extends PinPhraseQuestionType
    {

        @XmlAttribute(name = "AuthenticationInd")
        protected Boolean authenticationInd;
        @XmlAttribute(name = "MaximumTrxInd")
        protected Boolean maximumTrxInd;
        @XmlAttribute(name = "RetryInd")
        protected Boolean retryInd;

        /**
         * Gets the value of the authenticationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAuthenticationInd() {
            return authenticationInd;
        }

        /**
         * Sets the value of the authenticationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAuthenticationInd(Boolean value) {
            this.authenticationInd = value;
        }

        /**
         * Gets the value of the maximumTrxInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMaximumTrxInd() {
            return maximumTrxInd;
        }

        /**
         * Sets the value of the maximumTrxInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMaximumTrxInd(Boolean value) {
            this.maximumTrxInd = value;
        }

        /**
         * Gets the value of the retryInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRetryInd() {
            return retryInd;
        }

        /**
         * Sets the value of the retryInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetryInd(Boolean value) {
            this.retryInd = value;
        }

    }

}

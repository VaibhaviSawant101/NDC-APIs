//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ndcapi.airshopping.rq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * SIMPLE CURRENCY PRICE BASIS UNIT: NO price break-down, taxes and/or fees.
 * 
 * <p>Java class for SimpleCurrencyPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SimpleCurrencyPriceType">
 *   <simpleContent>
 *     <extension base="<http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCurrencyPriceType")
public class SimpleCurrencyPriceType
    extends CurrencyAmountOptType
{


}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Error Code.
 * 
 * <p>Java class for ErrorCodeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeStructure", propOrder = {
    "errorText"
})
@XmlSeeAlso({
    ParametersIgnoredErrorStructure.class,
    UnknownSubscriptionErrorStructure.class,
    BeyondDataHorizonErrorStructure.class,
    UnknownSubscriberErrorStructure.class,
    UnknownEndpointErrorStructure.class,
    InvalidDataReferencesErrorStructure.class,
    UnknownExtensionsErrorStructure.class,
    UnknownParticipantErrorStructure.class,
    OtherErrorStructure.class,
    ServiceNotAvailableErrorStructure.class,
    AllowedResourceUsageExceededErrorStructure.class,
    EndpointDeniedAccessStructure.class,
    NoInfoForTopicErrorStructure.class,
    CapabilityNotSupportedErrorStructure.class,
    EndpointNotAvailableAccessStructure.class,
    AccessNotAllowedErrorStructure.class,
    UnapprovedKeyAccessStructure.class
})
public class ErrorCodeStructure {

    @XmlElement(name = "ErrorText")
    protected String errorText;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Common Subscription capabilities.
 * 
 * <p>Java class for CapabilitySubscriptionPolicyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitySubscriptionPolicyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasChangeSensitivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitySubscriptionPolicyStructure", propOrder = {
    "hasIncrementalUpdates",
    "hasChangeSensitivity"
})
public class CapabilitySubscriptionPolicyStructure {

    @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
    protected Boolean hasIncrementalUpdates;
    @XmlElement(name = "HasChangeSensitivity", defaultValue = "true")
    protected Boolean hasChangeSensitivity;

    /**
     * Gets the value of the hasIncrementalUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIncrementalUpdates() {
        return hasIncrementalUpdates;
    }

    /**
     * Sets the value of the hasIncrementalUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIncrementalUpdates(Boolean value) {
        this.hasIncrementalUpdates = value;
    }

    /**
     * Gets the value of the hasChangeSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChangeSensitivity() {
        return hasChangeSensitivity;
    }

    /**
     * Sets the value of the hasChangeSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChangeSensitivity(Boolean value) {
        this.hasChangeSensitivity = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Capability Request Policy.
 * 
 * <p>Java class for StopMonitoringCapabilityRequestPolicyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringCapabilityRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *       &lt;sequence>
 *         &lt;element name="UseReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringCapabilityRequestPolicyStructure", propOrder = {
    "useReferences",
    "useNames"
})
@XmlSeeAlso({
    uk.org.siri.siri.StopMonitoringServiceCapabilitiesStructure.RequestPolicy.class
})
public class StopMonitoringCapabilityRequestPolicyStructure
    extends CapabilityRequestPolicyStructure
{

    @XmlElement(name = "UseReferences", defaultValue = "true")
    protected Boolean useReferences;
    @XmlElement(name = "UseNames", defaultValue = "false")
    protected Boolean useNames;

    /**
     * Gets the value of the useReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseReferences() {
        return useReferences;
    }

    /**
     * Sets the value of the useReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseReferences(Boolean value) {
        this.useReferences = value;
    }

    /**
     * Gets the value of the useNames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNames() {
        return useNames;
    }

    /**
     * Sets the value of the useNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNames(Boolean value) {
        this.useNames = value;
    }

}

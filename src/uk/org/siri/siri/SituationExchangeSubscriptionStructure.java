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
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Subscription Request for Situation Exchange Service.
 * 
 * <p>Java class for SituationExchangeSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangeRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeSubscriptionPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationExchangeSubscriptionStructure", propOrder = {
    "situationExchangeRequest",
    "incrementalUpdates",
    "extensions"
})
public class SituationExchangeSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "SituationExchangeRequest", required = true)
    protected SituationExchangeRequestStructure situationExchangeRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the situationExchangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeRequestStructure }
     *     
     */
    public SituationExchangeRequestStructure getSituationExchangeRequest() {
        return situationExchangeRequest;
    }

    /**
     * Sets the value of the situationExchangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeRequestStructure }
     *     
     */
    public void setSituationExchangeRequest(SituationExchangeRequestStructure value) {
        this.situationExchangeRequest = value;
    }

    /**
     * Gets the value of the incrementalUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalUpdates() {
        return incrementalUpdates;
    }

    /**
     * Sets the value of the incrementalUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementalUpdates(Boolean value) {
        this.incrementalUpdates = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}

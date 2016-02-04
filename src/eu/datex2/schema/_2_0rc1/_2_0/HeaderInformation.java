//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaOfInterest" type="{http://datex2.eu/schema/2_0RC1/2_0}AreaOfInterestEnum" minOccurs="0"/>
 *         &lt;element name="confidentiality" type="{http://datex2.eu/schema/2_0RC1/2_0}ConfidentialityValueEnum"/>
 *         &lt;element name="informationStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}InformationStatusEnum"/>
 *         &lt;element name="urgency" type="{http://datex2.eu/schema/2_0RC1/2_0}UrgencyEnum" minOccurs="0"/>
 *         &lt;element name="headerInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformation", propOrder = {
    "areaOfInterest",
    "confidentiality",
    "informationStatus",
    "urgency",
    "headerInformationExtension"
})
public class HeaderInformation {

    @XmlSchemaType(name = "string")
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConfidentialityValueEnum confidentiality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum informationStatus;
    @XmlSchemaType(name = "string")
    protected UrgencyEnum urgency;
    protected ExtensionType headerInformationExtension;

    /**
     * Gets the value of the areaOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Sets the value of the areaOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(ConfidentialityValueEnum value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the informationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Sets the value of the informationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatus(InformationStatusEnum value) {
        this.informationStatus = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyEnum }
     *     
     */
    public UrgencyEnum getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyEnum }
     *     
     */
    public void setUrgency(UrgencyEnum value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the headerInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaderInformationExtension() {
        return headerInformationExtension;
    }

    /**
     * Sets the value of the headerInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaderInformationExtension(ExtensionType value) {
        this.headerInformationExtension = value;
    }

}

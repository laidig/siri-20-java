//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalReferencing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferencing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalLocationCode" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="externalReferencingSystem" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="externalReferencingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferencing", propOrder = {
    "externalLocationCode",
    "externalReferencingSystem",
    "externalReferencingExtension"
})
public class ExternalReferencing {

    @XmlElement(required = true)
    protected String externalLocationCode;
    @XmlElement(required = true)
    protected String externalReferencingSystem;
    protected ExtensionType externalReferencingExtension;

    /**
     * Gets the value of the externalLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLocationCode() {
        return externalLocationCode;
    }

    /**
     * Sets the value of the externalLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLocationCode(String value) {
        this.externalLocationCode = value;
    }

    /**
     * Gets the value of the externalReferencingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferencingSystem() {
        return externalReferencingSystem;
    }

    /**
     * Sets the value of the externalReferencingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferencingSystem(String value) {
        this.externalReferencingSystem = value;
    }

    /**
     * Gets the value of the externalReferencingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExternalReferencingExtension() {
        return externalReferencingExtension;
    }

    /**
     * Sets the value of the externalReferencingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExternalReferencingExtension(ExtensionType value) {
        this.externalReferencingExtension = value;
    }

}

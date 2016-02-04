//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Estimated Timetable Capability.
 * 
 * <p>Java class for EstimatedTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetablePermissions" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedTimetableCapabilitiesResponseStructure", propOrder = {
    "estimatedTimetableServiceCapabilities",
    "estimatedTimetablePermissions",
    "extensions"
})
public class EstimatedTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "EstimatedTimetableServiceCapabilities")
    protected EstimatedTimetableServiceCapabilitiesStructure estimatedTimetableServiceCapabilities;
    @XmlElement(name = "EstimatedTimetablePermissions")
    protected EstimatedTimetablePermissions estimatedTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the estimatedTimetableServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableServiceCapabilitiesStructure }
     *     
     */
    public EstimatedTimetableServiceCapabilitiesStructure getEstimatedTimetableServiceCapabilities() {
        return estimatedTimetableServiceCapabilities;
    }

    /**
     * Sets the value of the estimatedTimetableServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setEstimatedTimetableServiceCapabilities(EstimatedTimetableServiceCapabilitiesStructure value) {
        this.estimatedTimetableServiceCapabilities = value;
    }

    /**
     * Gets the value of the estimatedTimetablePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetablePermissions }
     *     
     */
    public EstimatedTimetablePermissions getEstimatedTimetablePermissions() {
        return estimatedTimetablePermissions;
    }

    /**
     * Sets the value of the estimatedTimetablePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetablePermissions }
     *     
     */
    public void setEstimatedTimetablePermissions(EstimatedTimetablePermissions value) {
        this.estimatedTimetablePermissions = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

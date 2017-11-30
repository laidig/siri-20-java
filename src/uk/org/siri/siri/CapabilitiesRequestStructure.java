//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Requests for capabilities of the current system.
 * 
 * <p>Java class for CapabilitiesRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesRequest"/>
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
@XmlType(name = "CapabilitiesRequestStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesRequest"
})
public class CapabilitiesRequestStructure
    extends RequestStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceCapabilitiesRequest", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractServiceRequestStructure> abstractFunctionalServiceCapabilitiesRequest;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the abstractFunctionalServiceCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductionTimetableCapabilitiesRequest }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractServiceRequestStructure> getAbstractFunctionalServiceCapabilitiesRequest() {
        return abstractFunctionalServiceCapabilitiesRequest;
    }

    /**
     * Sets the value of the abstractFunctionalServiceCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductionTimetableCapabilitiesRequest }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesRequest(JAXBElement<? extends AbstractServiceRequestStructure> value) {
        this.abstractFunctionalServiceCapabilitiesRequest = value;
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

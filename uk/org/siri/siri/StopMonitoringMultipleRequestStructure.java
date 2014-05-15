//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Functional Service Request for Stop Monitoring Service on multiple stops.
 * 
 * <p>Java class for StopMonitoringMultipleRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringMultipleRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;element name="StopMonitoringFIlter" type="{http://www.siri.org.uk/siri}StopMonitoringFilterStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "StopMonitoringMultipleRequestStructure", propOrder = {
    "stopMonitoringFIlter"
})
public class StopMonitoringMultipleRequestStructure
    extends AbstractFunctionalServiceRequestStructure
{

    @XmlElement(name = "StopMonitoringFIlter", required = true)
    protected List<StopMonitoringFilterStructure> stopMonitoringFIlter;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the stopMonitoringFIlter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringFIlter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringFIlter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringFilterStructure }
     * 
     * 
     */
    public List<StopMonitoringFilterStructure> getStopMonitoringFIlter() {
        if (stopMonitoringFIlter == null) {
            stopMonitoringFIlter = new ArrayList<StopMonitoringFilterStructure>();
        }
        return this.stopMonitoringFIlter;
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

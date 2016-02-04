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
 * <p>Java class for PollutionMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollutionMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationMicrogramsPerCubicMetre"/>
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutantTypeEnum"/>
 *         &lt;element name="pollutionMeasurementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionMeasurement", propOrder = {
    "pollutantConcentration",
    "pollutantType",
    "pollutionMeasurementExtension"
})
public class PollutionMeasurement {

    protected float pollutantConcentration;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PollutantTypeEnum pollutantType;
    protected ExtensionType pollutionMeasurementExtension;

    /**
     * Gets the value of the pollutantConcentration property.
     * 
     */
    public float getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Sets the value of the pollutantConcentration property.
     * 
     */
    public void setPollutantConcentration(float value) {
        this.pollutantConcentration = value;
    }

    /**
     * Gets the value of the pollutantType property.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Sets the value of the pollutantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantType(PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    /**
     * Gets the value of the pollutionMeasurementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionMeasurementExtension() {
        return pollutionMeasurementExtension;
    }

    /**
     * Sets the value of the pollutionMeasurementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionMeasurementExtension(ExtensionType value) {
        this.pollutionMeasurementExtension = value;
    }

}

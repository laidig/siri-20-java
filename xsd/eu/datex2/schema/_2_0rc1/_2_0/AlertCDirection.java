//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCDirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCDirectionCoded" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirectionEnum"/>
 *         &lt;element name="alertCDirectionNamed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="alertCDirectionSense" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="alertCDirectionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCDirection", propOrder = {
    "alertCDirectionCoded",
    "alertCDirectionNamed",
    "alertCDirectionSense",
    "alertCDirectionExtension"
})
public class AlertCDirection {

    @XmlElement(required = true)
    protected AlertCDirectionEnum alertCDirectionCoded;
    protected MultilingualString alertCDirectionNamed;
    protected Boolean alertCDirectionSense;
    protected ExtensionType alertCDirectionExtension;

    /**
     * Gets the value of the alertCDirectionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public AlertCDirectionEnum getAlertCDirectionCoded() {
        return alertCDirectionCoded;
    }

    /**
     * Sets the value of the alertCDirectionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public void setAlertCDirectionCoded(AlertCDirectionEnum value) {
        this.alertCDirectionCoded = value;
    }

    /**
     * Gets the value of the alertCDirectionNamed property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCDirectionNamed() {
        return alertCDirectionNamed;
    }

    /**
     * Sets the value of the alertCDirectionNamed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCDirectionNamed(MultilingualString value) {
        this.alertCDirectionNamed = value;
    }

    /**
     * Gets the value of the alertCDirectionSense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertCDirectionSense() {
        return alertCDirectionSense;
    }

    /**
     * Sets the value of the alertCDirectionSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertCDirectionSense(Boolean value) {
        this.alertCDirectionSense = value;
    }

    /**
     * Gets the value of the alertCDirectionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCDirectionExtension() {
        return alertCDirectionExtension;
    }

    /**
     * Sets the value of the alertCDirectionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCDirectionExtension(ExtensionType value) {
        this.alertCDirectionExtension = value;
    }

}

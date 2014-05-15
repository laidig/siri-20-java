//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointByCoordinates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointByCoordinates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearing" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/>
 *         &lt;element name="pointByCoordinatesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointByCoordinates", propOrder = {
    "bearing",
    "pointCoordinates",
    "pointByCoordinatesExtension"
})
public class PointByCoordinates {

    protected BigInteger bearing;
    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    protected ExtensionType pointByCoordinatesExtension;

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearing(BigInteger value) {
        this.bearing = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the pointByCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointByCoordinatesExtension() {
        return pointByCoordinatesExtension;
    }

    /**
     * Sets the value of the pointByCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointByCoordinatesExtension(ExtensionType value) {
        this.pointByCoordinatesExtension = value;
    }

}

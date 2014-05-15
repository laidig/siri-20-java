//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalReferencing" type="{http://datex2.eu/schema/2_0RC1/2_0}ExternalReferencing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationForDisplay" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates" minOccurs="0"/>
 *         &lt;element name="locationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "externalReferencing",
    "locationForDisplay",
    "locationExtension"
})
@XmlSeeAlso({
    LocationByReference.class,
    NetworkLocation.class,
    Area.class,
    eu.datex2.schema._2_0rc1._2_0.Itinerary.LocationContainedInItinerary.class
})
public abstract class Location {

    protected List<ExternalReferencing> externalReferencing;
    protected PointCoordinates locationForDisplay;
    protected ExtensionType locationExtension;

    /**
     * Gets the value of the externalReferencing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReferencing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReferencing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferencing }
     * 
     * 
     */
    public List<ExternalReferencing> getExternalReferencing() {
        if (externalReferencing == null) {
            externalReferencing = new ArrayList<ExternalReferencing>();
        }
        return this.externalReferencing;
    }

    /**
     * Gets the value of the locationForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getLocationForDisplay() {
        return locationForDisplay;
    }

    /**
     * Sets the value of the locationForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setLocationForDisplay(PointCoordinates value) {
        this.locationForDisplay = value;
    }

    /**
     * Gets the value of the locationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationExtension() {
        return locationExtension;
    }

    /**
     * Sets the value of the locationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationExtension(ExtensionType value) {
        this.locationExtension = value;
    }

}

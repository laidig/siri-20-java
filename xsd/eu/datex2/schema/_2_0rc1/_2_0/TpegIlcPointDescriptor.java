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
 * <p>Java class for TpegIlcPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegIlcPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegIlcPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03IlcPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegIlcPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegIlcPointDescriptor", propOrder = {
    "tpegIlcPointDescriptorType",
    "tpegIlcPointDescriptorExtension"
})
public class TpegIlcPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    protected TpegLoc03IlcPointDescriptorSubtypeEnum tpegIlcPointDescriptorType;
    protected ExtensionType tpegIlcPointDescriptorExtension;

    /**
     * Gets the value of the tpegIlcPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03IlcPointDescriptorSubtypeEnum getTpegIlcPointDescriptorType() {
        return tpegIlcPointDescriptorType;
    }

    /**
     * Sets the value of the tpegIlcPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegIlcPointDescriptorType(TpegLoc03IlcPointDescriptorSubtypeEnum value) {
        this.tpegIlcPointDescriptorType = value;
    }

    /**
     * Gets the value of the tpegIlcPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegIlcPointDescriptorExtension() {
        return tpegIlcPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegIlcPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegIlcPointDescriptorExtension(ExtensionType value) {
        this.tpegIlcPointDescriptorExtension = value;
    }

}

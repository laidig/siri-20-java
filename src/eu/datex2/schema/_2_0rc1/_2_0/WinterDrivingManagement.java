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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinterDrivingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WinterDrivingManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}WinterEquipmentManagementTypeEnum"/>
 *         &lt;element name="winterDrivingManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDrivingManagement", propOrder = {
    "winterEquipmentManagementType",
    "winterDrivingManagementExtension"
})
public class WinterDrivingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    protected ExtensionType winterDrivingManagementExtension;

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Sets the value of the winterEquipmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Gets the value of the winterDrivingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWinterDrivingManagementExtension() {
        return winterDrivingManagementExtension;
    }

    /**
     * Sets the value of the winterDrivingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWinterDrivingManagementExtension(ExtensionType value) {
        this.winterDrivingManagementExtension = value;
    }

}

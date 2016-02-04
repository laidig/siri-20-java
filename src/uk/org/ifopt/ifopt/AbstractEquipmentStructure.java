//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.siri.siri.NaturalLanguageStringStructure;


/**
 * Type for abstract EQUIPMENT.
 * 
 * <p>Java class for AbstractEquipmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEquipmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEquipmentStructure", propOrder = {
    "equipmentId",
    "equipmentName",
    "typeOfEquipment"
})
@XmlSeeAlso({
    InstalledEquipmentStructure.class
})
public abstract class AbstractEquipmentStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "EquipmentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String equipmentId;
    @XmlElement(name = "EquipmentName")
    protected NaturalLanguageStringStructure equipmentName;
    @XmlElement(name = "TypeOfEquipment")
    protected EquipmentTypeRefStructure typeOfEquipment;

    /**
     * Gets the value of the equipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Sets the value of the equipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    /**
     * Gets the value of the equipmentName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getEquipmentName() {
        return equipmentName;
    }

    /**
     * Sets the value of the equipmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setEquipmentName(NaturalLanguageStringStructure value) {
        this.equipmentName = value;
    }

    /**
     * Gets the value of the typeOfEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getTypeOfEquipment() {
        return typeOfEquipment;
    }

    /**
     * Sets the value of the typeOfEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setTypeOfEquipment(EquipmentTypeRefStructure value) {
        this.typeOfEquipment = value;
    }

}

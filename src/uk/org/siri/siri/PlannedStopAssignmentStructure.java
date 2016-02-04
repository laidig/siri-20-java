//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for assignment of a SCHEDULED STOP POINT to a specific QUAY or platform +SIRI v2.0.
 * 
 * <p>Java class for PlannedStopAssignmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlannedStopAssignmentStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AimedQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure" minOccurs="0"/>
 *         &lt;element name="AimedQuayName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlannedStopAssignmentStructure", propOrder = {
    "aimedQuayRef",
    "aimedQuayName"
})
public class PlannedStopAssignmentStructure {

    @XmlElement(name = "AimedQuayRef")
    protected QuayRefStructure aimedQuayRef;
    @XmlElement(name = "AimedQuayName")
    protected List<NaturalLanguageStringStructure> aimedQuayName;

    /**
     * Gets the value of the aimedQuayRef property.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getAimedQuayRef() {
        return aimedQuayRef;
    }

    /**
     * Sets the value of the aimedQuayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setAimedQuayRef(QuayRefStructure value) {
        this.aimedQuayRef = value;
    }

    /**
     * Gets the value of the aimedQuayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aimedQuayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAimedQuayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getAimedQuayName() {
        if (aimedQuayName == null) {
            aimedQuayName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.aimedQuayName;
    }

}

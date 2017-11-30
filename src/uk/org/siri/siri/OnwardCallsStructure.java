//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for CALLing pattern for JOURNEY PATTERN.
 * 
 * <p>Java class for OnwardCallsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnwardCallsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnwardCall" type="{http://www.siri.org.uk/siri}OnwardCallStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnwardCallsStructure", propOrder = {
    "onwardCall"
})
public class OnwardCallsStructure {

    @XmlElement(name = "OnwardCall", required = true)
    protected List<OnwardCallStructure> onwardCall;

    /**
     * Gets the value of the onwardCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onwardCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnwardCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnwardCallStructure }
     * 
     * 
     */
    public List<OnwardCallStructure> getOnwardCall() {
        if (onwardCall == null) {
            onwardCall = new ArrayList<OnwardCallStructure>();
        }
        return this.onwardCall;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Type for DATA MANAGED OBJECT, that is an object that may be assigned a RESPONSIBILITY SET dictating a responsbile ORGANISATION and/or ADMINISTRATIVE ZONE.
 * 
 * <p>Java class for DataManagedObjectStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataManagedObjectStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}VersionedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DataManagedObjectGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataManagedObjectStructure", propOrder = {
    "managedByAreaRef",
    "infoLinks"
})
@XmlSeeAlso({
    AbstractEquipmentStructure.class
})
public abstract class DataManagedObjectStructure
    extends VersionedObjectStructure
{

    @XmlElement(name = "ManagedByAreaRef")
    protected AdministrativeAreaRefStructure managedByAreaRef;
    @XmlElement(name = "InfoLinks")
    protected InfoLinksStructure infoLinks;

    /**
     * Gets the value of the managedByAreaRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public AdministrativeAreaRefStructure getManagedByAreaRef() {
        return managedByAreaRef;
    }

    /**
     * Sets the value of the managedByAreaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public void setManagedByAreaRef(AdministrativeAreaRefStructure value) {
        this.managedByAreaRef = value;
    }

    /**
     * Gets the value of the infoLinks property.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksStructure }
     *     
     */
    public InfoLinksStructure getInfoLinks() {
        return infoLinks;
    }

    /**
     * Sets the value of the infoLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksStructure }
     *     
     */
    public void setInfoLinks(InfoLinksStructure value) {
        this.infoLinks = value;
    }

}

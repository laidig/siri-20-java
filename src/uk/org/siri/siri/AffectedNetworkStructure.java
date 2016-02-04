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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.AccessModesEnumeration;


/**
 * Type for information about the parts of the network affected by an incident. If not explclitly overrided Modes and submodes will be defaulted to any values present in the general Context.
 * 
 * <p>Java class for AffectedNetworkStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedNetworkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetworkRef" type="{http://www.siri.org.uk/siri}NetworkRefStructure" minOccurs="0"/>
 *         &lt;element name="NetworkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoutesAffected" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/>
 *         &lt;choice>
 *           &lt;element name="AllLines" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *           &lt;element name="SelectedRoutes" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *           &lt;sequence>
 *             &lt;element name="AffectedLine" type="{http://www.siri.org.uk/siri}AffectedLineStructure" maxOccurs="unbounded"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedNetworkStructure", propOrder = {
    "affectedOperator",
    "networkRef",
    "networkName",
    "routesAffected",
    "vehicleMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "metroSubmode",
    "railSubmode",
    "tramSubmode",
    "waterSubmode",
    "accessMode",
    "allLines",
    "selectedRoutes",
    "affectedLine",
    "extensions"
})
@XmlSeeAlso({
    uk.org.siri.siri.AffectsScopeStructure.Networks.AffectedNetwork.class
})
public class AffectedNetworkStructure {

    @XmlElement(name = "AffectedOperator")
    protected List<AffectedOperatorStructure> affectedOperator;
    @XmlElement(name = "NetworkRef")
    protected NetworkRefStructure networkRef;
    @XmlElement(name = "NetworkName")
    protected List<NaturalLanguageStringStructure> networkName;
    @XmlElement(name = "RoutesAffected")
    protected List<NaturalLanguageStringStructure> routesAffected;
    @XmlElement(name = "VehicleMode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModesOfTransportEnumeration vehicleMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "AccessMode")
    @XmlSchemaType(name = "string")
    protected AccessModesEnumeration accessMode;
    @XmlElement(name = "AllLines")
    protected String allLines;
    @XmlElement(name = "SelectedRoutes")
    protected String selectedRoutes;
    @XmlElement(name = "AffectedLine")
    protected List<AffectedLineStructure> affectedLine;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the affectedOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedOperatorStructure }
     * 
     * 
     */
    public List<AffectedOperatorStructure> getAffectedOperator() {
        if (affectedOperator == null) {
            affectedOperator = new ArrayList<AffectedOperatorStructure>();
        }
        return this.affectedOperator;
    }

    /**
     * Gets the value of the networkRef property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkRefStructure }
     *     
     */
    public NetworkRefStructure getNetworkRef() {
        return networkRef;
    }

    /**
     * Sets the value of the networkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkRefStructure }
     *     
     */
    public void setNetworkRef(NetworkRefStructure value) {
        this.networkRef = value;
    }

    /**
     * Gets the value of the networkName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getNetworkName() {
        if (networkName == null) {
            networkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.networkName;
    }

    /**
     * Gets the value of the routesAffected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routesAffected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutesAffected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getRoutesAffected() {
        if (routesAffected == null) {
            routesAffected = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.routesAffected;
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Sets the value of the vehicleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Gets the value of the airSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Sets the value of the airSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Gets the value of the busSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Sets the value of the busSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Gets the value of the coachSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Sets the value of the coachSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Gets the value of the metroSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Sets the value of the metroSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Gets the value of the railSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Sets the value of the railSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Gets the value of the tramSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Sets the value of the tramSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Gets the value of the waterSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Sets the value of the waterSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public AccessModesEnumeration getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public void setAccessMode(AccessModesEnumeration value) {
        this.accessMode = value;
    }

    /**
     * Gets the value of the allLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLines() {
        return allLines;
    }

    /**
     * Sets the value of the allLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLines(String value) {
        this.allLines = value;
    }

    /**
     * Gets the value of the selectedRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedRoutes() {
        return selectedRoutes;
    }

    /**
     * Sets the value of the selectedRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedRoutes(String value) {
        this.selectedRoutes = value;
    }

    /**
     * Gets the value of the affectedLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedLineStructure }
     * 
     * 
     */
    public List<AffectedLineStructure> getAffectedLine() {
        if (affectedLine == null) {
            affectedLine = new ArrayList<AffectedLineStructure>();
        }
        return this.affectedLine;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}

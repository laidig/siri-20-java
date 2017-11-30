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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Stop Monitoring Service.
 * 
 * <p>Java class for StopMonitoringDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringPayloadGroup"/>
 *         &lt;element name="Note" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringDeliveryStructure", propOrder = {
    "monitoringRef",
    "monitoringName",
    "monitoredStopVisit",
    "monitoredStopVisitCancellation",
    "stopLineNotice",
    "stopLineNoticeCancellation",
    "stopNotice",
    "stopNoticeCancellation",
    "serviceException",
    "note",
    "extensions"
})
public class StopMonitoringDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "MonitoringRef")
    protected List<MonitoringRefStructure> monitoringRef;
    @XmlElement(name = "MonitoringName")
    protected List<NaturalLanguageStringStructure> monitoringName;
    @XmlElement(name = "MonitoredStopVisit")
    protected List<MonitoredStopVisitStructure> monitoredStopVisit;
    @XmlElement(name = "MonitoredStopVisitCancellation")
    protected List<MonitoredStopVisitCancellationStructure> monitoredStopVisitCancellation;
    @XmlElement(name = "StopLineNotice")
    protected List<StopLineNoticeStructure> stopLineNotice;
    @XmlElement(name = "StopLineNoticeCancellation")
    protected List<StopLineNoticeCancellationStructure> stopLineNoticeCancellation;
    @XmlElement(name = "StopNotice")
    protected List<StopNoticeStructure> stopNotice;
    @XmlElement(name = "StopNoticeCancellation")
    protected List<StopNoticeCancellationStructure> stopNoticeCancellation;
    @XmlElement(name = "ServiceException")
    protected List<ServiceExceptionStructure> serviceException;
    @XmlElement(name = "Note")
    protected List<NaturalLanguageStringStructure> note;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the monitoringRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoringRefStructure }
     * 
     * 
     */
    public List<MonitoringRefStructure> getMonitoringRef() {
        if (monitoringRef == null) {
            monitoringRef = new ArrayList<MonitoringRefStructure>();
        }
        return this.monitoringRef;
    }

    /**
     * Gets the value of the monitoringName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getMonitoringName() {
        if (monitoringName == null) {
            monitoringName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.monitoringName;
    }

    /**
     * Gets the value of the monitoredStopVisit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredStopVisit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredStopVisit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredStopVisitStructure }
     * 
     * 
     */
    public List<MonitoredStopVisitStructure> getMonitoredStopVisit() {
        if (monitoredStopVisit == null) {
            monitoredStopVisit = new ArrayList<MonitoredStopVisitStructure>();
        }
        return this.monitoredStopVisit;
    }

    /**
     * Gets the value of the monitoredStopVisitCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredStopVisitCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredStopVisitCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredStopVisitCancellationStructure }
     * 
     * 
     */
    public List<MonitoredStopVisitCancellationStructure> getMonitoredStopVisitCancellation() {
        if (monitoredStopVisitCancellation == null) {
            monitoredStopVisitCancellation = new ArrayList<MonitoredStopVisitCancellationStructure>();
        }
        return this.monitoredStopVisitCancellation;
    }

    /**
     * Gets the value of the stopLineNotice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLineNotice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLineNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLineNoticeStructure }
     * 
     * 
     */
    public List<StopLineNoticeStructure> getStopLineNotice() {
        if (stopLineNotice == null) {
            stopLineNotice = new ArrayList<StopLineNoticeStructure>();
        }
        return this.stopLineNotice;
    }

    /**
     * Gets the value of the stopLineNoticeCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLineNoticeCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLineNoticeCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLineNoticeCancellationStructure }
     * 
     * 
     */
    public List<StopLineNoticeCancellationStructure> getStopLineNoticeCancellation() {
        if (stopLineNoticeCancellation == null) {
            stopLineNoticeCancellation = new ArrayList<StopLineNoticeCancellationStructure>();
        }
        return this.stopLineNoticeCancellation;
    }

    /**
     * Notice for stop. (SIRI 2.0++) Gets the value of the stopNotice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopNotice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopNoticeStructure }
     * 
     * 
     */
    public List<StopNoticeStructure> getStopNotice() {
        if (stopNotice == null) {
            stopNotice = new ArrayList<StopNoticeStructure>();
        }
        return this.stopNotice;
    }

    /**
     * Reference to an previously communicated Notice which should now be removed from the arrival/departure board for the stop.  (SIRI 2.0++) Gets the value of the stopNoticeCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopNoticeCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopNoticeCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopNoticeCancellationStructure }
     * 
     * 
     */
    public List<StopNoticeCancellationStructure> getStopNoticeCancellation() {
        if (stopNoticeCancellation == null) {
            stopNoticeCancellation = new ArrayList<StopNoticeCancellationStructure>();
        }
        return this.stopNoticeCancellation;
    }

    /**
     * Information about unavailablilty of some or all services at the  SIRI 2.0 Gets the value of the serviceException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceExceptionStructure }
     * 
     * 
     */
    public List<ServiceExceptionStructure> getServiceException() {
        if (serviceException == null) {
            serviceException = new ArrayList<ServiceExceptionStructure>();
        }
        return this.serviceException;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getNote() {
        if (note == null) {
            note = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.note;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Rea-ltime info about a VEHICLE JOURNEY Stop.
 * 
 * <p>Java class for EstimatedCallStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedCallStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointInSequenceGroup"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ExtraCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealTimeInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallPropertyGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallNoteGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DisruptionGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OnwardsCallGroup"/>
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
@XmlType(name = "EstimatedCallStructure", propOrder = {
    "stopPointRef",
    "visitNumber",
    "order",
    "stopPointName",
    "extraCall",
    "cancellation",
    "predictionInaccurate",
    "occupancy",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "destinationDisplay",
    "callNote",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "aimedArrivalTime",
    "expectedArrivalTime",
    "expectedArrivalPredictionQuality",
    "arrivalStatus",
    "arrivalProximityText",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "arrivalStopAssignment",
    "arrivalOperatorRefs",
    "aimedDepartureTime",
    "expectedDepartureTime",
    "provisionalExpectedDepartureTime",
    "earliestExpectedDepartureTime",
    "expectedDeparturePredictionQuality",
    "aimedLatestPassengerAccessTime",
    "expectedLatestPassengerAccessTime",
    "departureStatus",
    "departureProximityText",
    "departurePlatformName",
    "departureBoardingActivity",
    "departureStopAssignment",
    "departureOperatorRefs",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "distanceFromStop",
    "numberOfStopsAway",
    "extensions"
})
public class EstimatedCallStructure {

    @XmlElement(name = "StopPointRef", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "VisitNumber")
    protected BigInteger visitNumber;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "StopPointName")
    protected List<NaturalLanguageStringStructure> stopPointName;
    @XmlElement(name = "ExtraCall")
    protected Boolean extraCall;
    @XmlElement(name = "Cancellation")
    protected Boolean cancellation;
    @XmlElement(name = "PredictionInaccurate")
    protected Boolean predictionInaccurate;
    @XmlElement(name = "Occupancy")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "BoardingStretch", defaultValue = "false")
    protected Boolean boardingStretch;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "DestinationDisplay")
    protected List<NaturalLanguageStringStructure> destinationDisplay;
    @XmlElement(name = "CallNote")
    protected List<NaturalLanguageStringStructure> callNote;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedArrivalTime;
    @XmlElement(name = "ExpectedArrivalPredictionQuality")
    protected PredictionQualityStructure expectedArrivalPredictionQuality;
    @XmlElement(name = "ArrivalStatus")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalProximityText")
    protected NaturalLanguageStringStructure arrivalProximityText;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "ArrivalStopAssignment")
    protected StopAssignmentStructure arrivalStopAssignment;
    @XmlElement(name = "ArrivalOperatorRefs")
    protected List<OperatorRefStructure> arrivalOperatorRefs;
    @XmlElement(name = "AimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDepartureTime;
    @XmlElement(name = "ProvisionalExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar provisionalExpectedDepartureTime;
    @XmlElement(name = "EarliestExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestExpectedDepartureTime;
    @XmlElement(name = "ExpectedDeparturePredictionQuality")
    protected PredictionQualityStructure expectedDeparturePredictionQuality;
    @XmlElement(name = "AimedLatestPassengerAccessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedLatestPassengerAccessTime;
    @XmlElement(name = "ExpectedLatestPassengerAccessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedLatestPassengerAccessTime;
    @XmlElement(name = "DepartureStatus")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DepartureProximityText")
    protected NaturalLanguageStringStructure departureProximityText;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "DepartureStopAssignment")
    protected StopAssignmentStructure departureStopAssignment;
    @XmlElement(name = "DepartureOperatorRefs")
    protected List<OperatorRefStructure> departureOperatorRefs;
    @XmlElement(name = "AimedHeadwayInterval")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "DistanceFromStop")
    protected BigInteger distanceFromStop;
    @XmlElement(name = "NumberOfStopsAway")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfStopsAway;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the visitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Sets the value of the visitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitNumber(BigInteger value) {
        this.visitNumber = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Name of SCHEDULED STOP POINT.  (Unbounded since SIRI 2.0) Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPointName;
    }

    /**
     * Gets the value of the extraCall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraCall() {
        return extraCall;
    }

    /**
     * Sets the value of the extraCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraCall(Boolean value) {
        this.extraCall = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    /**
     * Gets the value of the predictionInaccurate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPredictionInaccurate() {
        return predictionInaccurate;
    }

    /**
     * Sets the value of the predictionInaccurate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPredictionInaccurate(Boolean value) {
        this.predictionInaccurate = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancy(OccupancyEnumeration value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the timingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Sets the value of the timingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    /**
     * Gets the value of the boardingStretch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingStretch() {
        return boardingStretch;
    }

    /**
     * Sets the value of the boardingStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingStretch(Boolean value) {
        this.boardingStretch = value;
    }

    /**
     * Gets the value of the requestStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Sets the value of the requestStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the destinationDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDestinationDisplay() {
        if (destinationDisplay == null) {
            destinationDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationDisplay;
    }

    /**
     * Gets the value of the callNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getCallNote() {
        if (callNote == null) {
            callNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.callNote;
    }

    /**
     * Information about a change of Equipment availabilti at stop or on vehicle that may affect access or use.Gets the value of the facilityConditionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityConditionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityConditionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityConditionStructure }
     * 
     * 
     */
    public List<FacilityConditionStructure> getFacilityConditionElement() {
        if (facilityConditionElement == null) {
            facilityConditionElement = new ArrayList<FacilityConditionStructure>();
        }
        return this.facilityConditionElement;
    }

    /**
     * Gets the value of the facilityChangeElement property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public FacilityChangeStructure getFacilityChangeElement() {
        return facilityChangeElement;
    }

    /**
     * Sets the value of the facilityChangeElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public void setFacilityChangeElement(FacilityChangeStructure value) {
        this.facilityChangeElement = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRefStructure }
     * 
     * 
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
    }

    /**
     * Gets the value of the aimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Sets the value of the aimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedArrivalTime(XMLGregorianCalendar value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Gets the value of the expectedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Sets the value of the expectedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedArrivalTime(XMLGregorianCalendar value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Gets the value of the expectedArrivalPredictionQuality property.
     * 
     * @return
     *     possible object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public PredictionQualityStructure getExpectedArrivalPredictionQuality() {
        return expectedArrivalPredictionQuality;
    }

    /**
     * Sets the value of the expectedArrivalPredictionQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public void setExpectedArrivalPredictionQuality(PredictionQualityStructure value) {
        this.expectedArrivalPredictionQuality = value;
    }

    /**
     * Gets the value of the arrivalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getArrivalStatus() {
        return arrivalStatus;
    }

    /**
     * Sets the value of the arrivalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setArrivalStatus(CallStatusEnumeration value) {
        this.arrivalStatus = value;
    }

    /**
     * Gets the value of the arrivalProximityText property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalProximityText() {
        return arrivalProximityText;
    }

    /**
     * Sets the value of the arrivalProximityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalProximityText(NaturalLanguageStringStructure value) {
        this.arrivalProximityText = value;
    }

    /**
     * Bay or platform (QUAY) name to show passenger i.e. expected platform for vehicel to arrive at.Inheritable property. Can be omitted if the same as the DeparturePlatformName If there no arrival platform name separate from the departure platform name, the precedence is
     * (i) any arrival platform on any related dated timetable element, 
     * (ii) any departure platform name on this estimated element;
     * (iii) any departure platform name on any related dated timetable CALL.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Sets the value of the arrivalPlatformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalPlatformName(NaturalLanguageStringStructure value) {
        this.arrivalPlatformName = value;
    }

    /**
     * Nature of boarding and alighting allowed at stop. Default is 'Alighting'.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Sets the value of the arrivalBoardingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    /**
     * Gets the value of the arrivalStopAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public StopAssignmentStructure getArrivalStopAssignment() {
        return arrivalStopAssignment;
    }

    /**
     * Sets the value of the arrivalStopAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public void setArrivalStopAssignment(StopAssignmentStructure value) {
        this.arrivalStopAssignment = value;
    }

    /**
     * Gets the value of the arrivalOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getArrivalOperatorRefs() {
        if (arrivalOperatorRefs == null) {
            arrivalOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.arrivalOperatorRefs;
    }

    /**
     * Target departure time of VEHICLE according to latest working timetable.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Sets the value of the aimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedDepartureTime(XMLGregorianCalendar value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Estimated time of departure of VEHICLE, most likely taking into account all control actions such as waiting.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Sets the value of the expectedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureTime(XMLGregorianCalendar value) {
        this.expectedDepartureTime = value;
    }

    /**
     * Gets the value of the provisionalExpectedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionalExpectedDepartureTime() {
        return provisionalExpectedDepartureTime;
    }

    /**
     * Sets the value of the provisionalExpectedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProvisionalExpectedDepartureTime(XMLGregorianCalendar value) {
        this.provisionalExpectedDepartureTime = value;
    }

    /**
     * Gets the value of the earliestExpectedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestExpectedDepartureTime() {
        return earliestExpectedDepartureTime;
    }

    /**
     * Sets the value of the earliestExpectedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestExpectedDepartureTime(XMLGregorianCalendar value) {
        this.earliestExpectedDepartureTime = value;
    }

    /**
     * Gets the value of the expectedDeparturePredictionQuality property.
     * 
     * @return
     *     possible object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public PredictionQualityStructure getExpectedDeparturePredictionQuality() {
        return expectedDeparturePredictionQuality;
    }

    /**
     * Sets the value of the expectedDeparturePredictionQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public void setExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        this.expectedDeparturePredictionQuality = value;
    }

    /**
     * Target Latest time at which a PASSENGER should aim to arrive at the STOP PLACE containing the stop. This time may be earlier than the VEHICLE departure times as itmay include time for processes such as checkin, security, etc.(As specified by CHECK CONSTRAINT DELAYs in the underlying data) If absent assume to be the same as Earliest expected departure time, +SIRI v2.0
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedLatestPassengerAccessTime() {
        return aimedLatestPassengerAccessTime;
    }

    /**
     * Sets the value of the aimedLatestPassengerAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedLatestPassengerAccessTime(XMLGregorianCalendar value) {
        this.aimedLatestPassengerAccessTime = value;
    }

    /**
     * Expected Latest time at which a PASSENGER should aim to arrive at the STOP PLACE containing the stop. This time may be earlier than the VEHICLE departure times as it may include time for processes such as checkin, security, etc.(As specified by CHECK CONSTRAINT DELAYs in the underlying data) If absent assume to be the same as Earliest expected departure time, +SIRI v2.0
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedLatestPassengerAccessTime() {
        return expectedLatestPassengerAccessTime;
    }

    /**
     * Sets the value of the expectedLatestPassengerAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedLatestPassengerAccessTime(XMLGregorianCalendar value) {
        this.expectedLatestPassengerAccessTime = value;
    }

    /**
     * Gets the value of the departureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Sets the value of the departureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setDepartureStatus(CallStatusEnumeration value) {
        this.departureStatus = value;
    }

    /**
     * Gets the value of the departureProximityText property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDepartureProximityText() {
        return departureProximityText;
    }

    /**
     * Sets the value of the departureProximityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDepartureProximityText(NaturalLanguageStringStructure value) {
        this.departureProximityText = value;
    }

    /**
     * Departure QUAY ( Bay or platform) name. Defaulted taken from  from planned timetable..
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDeparturePlatformName() {
        return departurePlatformName;
    }

    /**
     * Sets the value of the departurePlatformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDeparturePlatformName(NaturalLanguageStringStructure value) {
        this.departurePlatformName = value;
    }

    /**
     * Gets the value of the departureBoardingActivity property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Sets the value of the departureBoardingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    /**
     * Gets the value of the departureStopAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public StopAssignmentStructure getDepartureStopAssignment() {
        return departureStopAssignment;
    }

    /**
     * Sets the value of the departureStopAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public void setDepartureStopAssignment(StopAssignmentStructure value) {
        this.departureStopAssignment = value;
    }

    /**
     * Gets the value of the departureOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getDepartureOperatorRefs() {
        if (departureOperatorRefs == null) {
            departureOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.departureOperatorRefs;
    }

    /**
     * Gets the value of the aimedHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAimedHeadwayInterval() {
        return aimedHeadwayInterval;
    }

    /**
     * Sets the value of the aimedHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAimedHeadwayInterval(Duration value) {
        this.aimedHeadwayInterval = value;
    }

    /**
     * Gets the value of the expectedHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedHeadwayInterval() {
        return expectedHeadwayInterval;
    }

    /**
     * Sets the value of the expectedHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedHeadwayInterval(Duration value) {
        this.expectedHeadwayInterval = value;
    }

    /**
     * Gets the value of the distanceFromStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromStop() {
        return distanceFromStop;
    }

    /**
     * Sets the value of the distanceFromStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromStop(BigInteger value) {
        this.distanceFromStop = value;
    }

    /**
     * Gets the value of the numberOfStopsAway property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStopsAway() {
        return numberOfStopsAway;
    }

    /**
     * Sets the value of the numberOfStopsAway property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStopsAway(BigInteger value) {
        this.numberOfStopsAway = value;
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

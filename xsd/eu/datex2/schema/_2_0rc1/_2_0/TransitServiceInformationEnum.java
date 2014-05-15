//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitServiceInformationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransitServiceInformationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cancellations"/>
 *     &lt;enumeration value="delayDueToBadWeather"/>
 *     &lt;enumeration value="delayDueToRepairs"/>
 *     &lt;enumeration value="delayedUntilFurtherNotice"/>
 *     &lt;enumeration value="delaysDueToFlotsam"/>
 *     &lt;enumeration value="departureOnSchedule"/>
 *     &lt;enumeration value="ferryReplacedByIceRoad"/>
 *     &lt;enumeration value="freeShuttleServiceOperating"/>
 *     &lt;enumeration value="informationServiceNotAvailable"/>
 *     &lt;enumeration value="irregularServiceDelays"/>
 *     &lt;enumeration value="loadCapacityChanged"/>
 *     &lt;enumeration value="restrictionsForLongerVehicles"/>
 *     &lt;enumeration value="serviceDelays"/>
 *     &lt;enumeration value="serviceDelaysOfUncertainDuration"/>
 *     &lt;enumeration value="serviceFullyBooked"/>
 *     &lt;enumeration value="serviceNotOperating"/>
 *     &lt;enumeration value="serviceNotOperatingSubstituteServiceAvailable"/>
 *     &lt;enumeration value="serviceSuspended"/>
 *     &lt;enumeration value="serviceWithdrawn"/>
 *     &lt;enumeration value="shuttleServiceOperating"/>
 *     &lt;enumeration value="temporaryChangesToTimetables"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransitServiceInformationEnum")
@XmlEnum
public enum TransitServiceInformationEnum {

    @XmlEnumValue("cancellations")
    CANCELLATIONS("cancellations"),
    @XmlEnumValue("delayDueToBadWeather")
    DELAY_DUE_TO_BAD_WEATHER("delayDueToBadWeather"),
    @XmlEnumValue("delayDueToRepairs")
    DELAY_DUE_TO_REPAIRS("delayDueToRepairs"),
    @XmlEnumValue("delayedUntilFurtherNotice")
    DELAYED_UNTIL_FURTHER_NOTICE("delayedUntilFurtherNotice"),
    @XmlEnumValue("delaysDueToFlotsam")
    DELAYS_DUE_TO_FLOTSAM("delaysDueToFlotsam"),
    @XmlEnumValue("departureOnSchedule")
    DEPARTURE_ON_SCHEDULE("departureOnSchedule"),
    @XmlEnumValue("ferryReplacedByIceRoad")
    FERRY_REPLACED_BY_ICE_ROAD("ferryReplacedByIceRoad"),
    @XmlEnumValue("freeShuttleServiceOperating")
    FREE_SHUTTLE_SERVICE_OPERATING("freeShuttleServiceOperating"),
    @XmlEnumValue("informationServiceNotAvailable")
    INFORMATION_SERVICE_NOT_AVAILABLE("informationServiceNotAvailable"),
    @XmlEnumValue("irregularServiceDelays")
    IRREGULAR_SERVICE_DELAYS("irregularServiceDelays"),
    @XmlEnumValue("loadCapacityChanged")
    LOAD_CAPACITY_CHANGED("loadCapacityChanged"),
    @XmlEnumValue("restrictionsForLongerVehicles")
    RESTRICTIONS_FOR_LONGER_VEHICLES("restrictionsForLongerVehicles"),
    @XmlEnumValue("serviceDelays")
    SERVICE_DELAYS("serviceDelays"),
    @XmlEnumValue("serviceDelaysOfUncertainDuration")
    SERVICE_DELAYS_OF_UNCERTAIN_DURATION("serviceDelaysOfUncertainDuration"),
    @XmlEnumValue("serviceFullyBooked")
    SERVICE_FULLY_BOOKED("serviceFullyBooked"),
    @XmlEnumValue("serviceNotOperating")
    SERVICE_NOT_OPERATING("serviceNotOperating"),
    @XmlEnumValue("serviceNotOperatingSubstituteServiceAvailable")
    SERVICE_NOT_OPERATING_SUBSTITUTE_SERVICE_AVAILABLE("serviceNotOperatingSubstituteServiceAvailable"),
    @XmlEnumValue("serviceSuspended")
    SERVICE_SUSPENDED("serviceSuspended"),
    @XmlEnumValue("serviceWithdrawn")
    SERVICE_WITHDRAWN("serviceWithdrawn"),
    @XmlEnumValue("shuttleServiceOperating")
    SHUTTLE_SERVICE_OPERATING("shuttleServiceOperating"),
    @XmlEnumValue("temporaryChangesToTimetables")
    TEMPORARY_CHANGES_TO_TIMETABLES("temporaryChangesToTimetables"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TransitServiceInformationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitServiceInformationEnum fromValue(String v) {
        for (TransitServiceInformationEnum c: TransitServiceInformationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

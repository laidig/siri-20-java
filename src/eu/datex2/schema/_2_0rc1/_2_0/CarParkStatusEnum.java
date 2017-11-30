//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarParkStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarParkStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carParkClosed"/>
 *     &lt;enumeration value="allCarParksFull"/>
 *     &lt;enumeration value="carParkFacilityFaulty"/>
 *     &lt;enumeration value="carParkFull"/>
 *     &lt;enumeration value="carParkStatusUnknown"/>
 *     &lt;enumeration value="enoughSpacesAvailable"/>
 *     &lt;enumeration value="multiStoryCarParksFull"/>
 *     &lt;enumeration value="noMoreParkingSpacesAvailable"/>
 *     &lt;enumeration value="noParkAndRideInformation"/>
 *     &lt;enumeration value="noParkingAllowed"/>
 *     &lt;enumeration value="noParkingInformationAvailable"/>
 *     &lt;enumeration value="normalParkingRestrictionsLifted"/>
 *     &lt;enumeration value="onlyAFewSpacesAvailable"/>
 *     &lt;enumeration value="parkAndRideServiceNotOperating"/>
 *     &lt;enumeration value="parkAndRideServiceOperating"/>
 *     &lt;enumeration value="specialParkingRestrictionsInForce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarParkStatusEnum")
@XmlEnum
public enum CarParkStatusEnum {

    @XmlEnumValue("carParkClosed")
    CAR_PARK_CLOSED("carParkClosed"),
    @XmlEnumValue("allCarParksFull")
    ALL_CAR_PARKS_FULL("allCarParksFull"),
    @XmlEnumValue("carParkFacilityFaulty")
    CAR_PARK_FACILITY_FAULTY("carParkFacilityFaulty"),
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),
    @XmlEnumValue("carParkStatusUnknown")
    CAR_PARK_STATUS_UNKNOWN("carParkStatusUnknown"),
    @XmlEnumValue("enoughSpacesAvailable")
    ENOUGH_SPACES_AVAILABLE("enoughSpacesAvailable"),
    @XmlEnumValue("multiStoryCarParksFull")
    MULTI_STORY_CAR_PARKS_FULL("multiStoryCarParksFull"),
    @XmlEnumValue("noMoreParkingSpacesAvailable")
    NO_MORE_PARKING_SPACES_AVAILABLE("noMoreParkingSpacesAvailable"),
    @XmlEnumValue("noParkAndRideInformation")
    NO_PARK_AND_RIDE_INFORMATION("noParkAndRideInformation"),
    @XmlEnumValue("noParkingAllowed")
    NO_PARKING_ALLOWED("noParkingAllowed"),
    @XmlEnumValue("noParkingInformationAvailable")
    NO_PARKING_INFORMATION_AVAILABLE("noParkingInformationAvailable"),
    @XmlEnumValue("normalParkingRestrictionsLifted")
    NORMAL_PARKING_RESTRICTIONS_LIFTED("normalParkingRestrictionsLifted"),
    @XmlEnumValue("onlyAFewSpacesAvailable")
    ONLY_A_FEW_SPACES_AVAILABLE("onlyAFewSpacesAvailable"),
    @XmlEnumValue("parkAndRideServiceNotOperating")
    PARK_AND_RIDE_SERVICE_NOT_OPERATING("parkAndRideServiceNotOperating"),
    @XmlEnumValue("parkAndRideServiceOperating")
    PARK_AND_RIDE_SERVICE_OPERATING("parkAndRideServiceOperating"),
    @XmlEnumValue("specialParkingRestrictionsInForce")
    SPECIAL_PARKING_RESTRICTIONS_IN_FORCE("specialParkingRestrictionsInForce");
    private final String value;

    CarParkStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkStatusEnum fromValue(String v) {
        for (CarParkStatusEnum c: CarParkStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

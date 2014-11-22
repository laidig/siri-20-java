//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RailSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RailSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti2_0"/>
 *     &lt;enumeration value="loc13_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti2_1"/>
 *     &lt;enumeration value="highSpeedRailService"/>
 *     &lt;enumeration value="pti2_2"/>
 *     &lt;enumeration value="loc13_3"/>
 *     &lt;enumeration value="longDistanceTrain"/>
 *     &lt;enumeration value="pti2_3"/>
 *     &lt;enumeration value="loc13_2"/>
 *     &lt;enumeration value="interRegionalRailService"/>
 *     &lt;enumeration value="pti2_4"/>
 *     &lt;enumeration value="carTransportRailService"/>
 *     &lt;enumeration value="pti2_5"/>
 *     &lt;enumeration value="sleeperRailService"/>
 *     &lt;enumeration value="pti2_6"/>
 *     &lt;enumeration value="loc13_4"/>
 *     &lt;enumeration value="regionalRail"/>
 *     &lt;enumeration value="pti2_7"/>
 *     &lt;enumeration value="loc13_7"/>
 *     &lt;enumeration value="touristRailway"/>
 *     &lt;enumeration value="pti2_8"/>
 *     &lt;enumeration value="railShuttle"/>
 *     &lt;enumeration value="pti2_9"/>
 *     &lt;enumeration value="loc13_5"/>
 *     &lt;enumeration value="suburbanRailway"/>
 *     &lt;enumeration value="pti2_10"/>
 *     &lt;enumeration value="replacementRailService"/>
 *     &lt;enumeration value="pti2_11"/>
 *     &lt;enumeration value="specialTrainService"/>
 *     &lt;enumeration value="pti2_12"/>
 *     &lt;enumeration value="lorryTransportRailService"/>
 *     &lt;enumeration value="pti2_13"/>
 *     &lt;enumeration value="allRailServices"/>
 *     &lt;enumeration value="pti2_14"/>
 *     &lt;enumeration value="crossCountryRailService"/>
 *     &lt;enumeration value="pti2_15"/>
 *     &lt;enumeration value="vehicleRailTransportService"/>
 *     &lt;enumeration value="pti2_16"/>
 *     &lt;enumeration value="loc13_8"/>
 *     &lt;enumeration value="rackAndPinionRailway"/>
 *     &lt;enumeration value="pti2_17"/>
 *     &lt;enumeration value="additionalTrainService"/>
 *     &lt;enumeration value="pti2_255"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="loc13_6"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="loc13_1"/>
 *     &lt;enumeration value="interbational"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RailSubmodesOfTransportEnumeration")
@XmlEnum
public enum RailSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti2_0")
    PTI_2_0("pti2_0"),
    @XmlEnumValue("loc13_0")
    LOC_13_0("loc13_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti2_1")
    PTI_2_1("pti2_1"),
    @XmlEnumValue("highSpeedRailService")
    HIGH_SPEED_RAIL_SERVICE("highSpeedRailService"),
    @XmlEnumValue("pti2_2")
    PTI_2_2("pti2_2"),
    @XmlEnumValue("loc13_3")
    LOC_13_3("loc13_3"),
    @XmlEnumValue("longDistanceTrain")
    LONG_DISTANCE_TRAIN("longDistanceTrain"),
    @XmlEnumValue("pti2_3")
    PTI_2_3("pti2_3"),
    @XmlEnumValue("loc13_2")
    LOC_13_2("loc13_2"),
    @XmlEnumValue("interRegionalRailService")
    INTER_REGIONAL_RAIL_SERVICE("interRegionalRailService"),
    @XmlEnumValue("pti2_4")
    PTI_2_4("pti2_4"),
    @XmlEnumValue("carTransportRailService")
    CAR_TRANSPORT_RAIL_SERVICE("carTransportRailService"),
    @XmlEnumValue("pti2_5")
    PTI_2_5("pti2_5"),
    @XmlEnumValue("sleeperRailService")
    SLEEPER_RAIL_SERVICE("sleeperRailService"),
    @XmlEnumValue("pti2_6")
    PTI_2_6("pti2_6"),
    @XmlEnumValue("loc13_4")
    LOC_13_4("loc13_4"),
    @XmlEnumValue("regionalRail")
    REGIONAL_RAIL("regionalRail"),
    @XmlEnumValue("pti2_7")
    PTI_2_7("pti2_7"),
    @XmlEnumValue("loc13_7")
    LOC_13_7("loc13_7"),
    @XmlEnumValue("touristRailway")
    TOURIST_RAILWAY("touristRailway"),
    @XmlEnumValue("pti2_8")
    PTI_2_8("pti2_8"),
    @XmlEnumValue("railShuttle")
    RAIL_SHUTTLE("railShuttle"),
    @XmlEnumValue("pti2_9")
    PTI_2_9("pti2_9"),
    @XmlEnumValue("loc13_5")
    LOC_13_5("loc13_5"),
    @XmlEnumValue("suburbanRailway")
    SUBURBAN_RAILWAY("suburbanRailway"),
    @XmlEnumValue("pti2_10")
    PTI_2_10("pti2_10"),
    @XmlEnumValue("replacementRailService")
    REPLACEMENT_RAIL_SERVICE("replacementRailService"),
    @XmlEnumValue("pti2_11")
    PTI_2_11("pti2_11"),
    @XmlEnumValue("specialTrainService")
    SPECIAL_TRAIN_SERVICE("specialTrainService"),
    @XmlEnumValue("pti2_12")
    PTI_2_12("pti2_12"),
    @XmlEnumValue("lorryTransportRailService")
    LORRY_TRANSPORT_RAIL_SERVICE("lorryTransportRailService"),
    @XmlEnumValue("pti2_13")
    PTI_2_13("pti2_13"),
    @XmlEnumValue("allRailServices")
    ALL_RAIL_SERVICES("allRailServices"),
    @XmlEnumValue("pti2_14")
    PTI_2_14("pti2_14"),
    @XmlEnumValue("crossCountryRailService")
    CROSS_COUNTRY_RAIL_SERVICE("crossCountryRailService"),
    @XmlEnumValue("pti2_15")
    PTI_2_15("pti2_15"),
    @XmlEnumValue("vehicleRailTransportService")
    VEHICLE_RAIL_TRANSPORT_SERVICE("vehicleRailTransportService"),
    @XmlEnumValue("pti2_16")
    PTI_2_16("pti2_16"),
    @XmlEnumValue("loc13_8")
    LOC_13_8("loc13_8"),
    @XmlEnumValue("rackAndPinionRailway")
    RACK_AND_PINION_RAILWAY("rackAndPinionRailway"),
    @XmlEnumValue("pti2_17")
    PTI_2_17("pti2_17"),
    @XmlEnumValue("additionalTrainService")
    ADDITIONAL_TRAIN_SERVICE("additionalTrainService"),
    @XmlEnumValue("pti2_255")
    PTI_2_255("pti2_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("loc13_6")
    LOC_13_6("loc13_6"),
    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("loc13_1")
    LOC_13_1("loc13_1"),
    @XmlEnumValue("interbational")
    INTERBATIONAL("interbational");
    private final String value;

    RailSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailSubmodesOfTransportEnumeration fromValue(String v) {
        for (RailSubmodesOfTransportEnumeration c: RailSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
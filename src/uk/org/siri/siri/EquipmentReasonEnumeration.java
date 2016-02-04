//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti21_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti21_1"/>
 *     &lt;enumeration value="pointsProblem"/>
 *     &lt;enumeration value="pti21_2"/>
 *     &lt;enumeration value="pointsFailure"/>
 *     &lt;enumeration value="pti21_3"/>
 *     &lt;enumeration value="signalProblem"/>
 *     &lt;enumeration value="pti21_3_Alias_1"/>
 *     &lt;enumeration value="trainWarningSystemProblem"/>
 *     &lt;enumeration value="pti21_3_Alias_2"/>
 *     &lt;enumeration value="trackCircuitProblem"/>
 *     &lt;enumeration value="pti21_4"/>
 *     &lt;enumeration value="signalFailure"/>
 *     &lt;enumeration value="pti21_4_Alias_1"/>
 *     &lt;enumeration value="signalAndSwitchFailure"/>
 *     &lt;enumeration value="pti21_5"/>
 *     &lt;enumeration value="derailment"/>
 *     &lt;enumeration value="pti21_6"/>
 *     &lt;enumeration value="engineFailure"/>
 *     &lt;enumeration value="pti21_6_Alias_1"/>
 *     &lt;enumeration value="tractionFailure"/>
 *     &lt;enumeration value="pti21_7"/>
 *     &lt;enumeration value="breakDown"/>
 *     &lt;enumeration value="pti21_8"/>
 *     &lt;enumeration value="technicalProblem"/>
 *     &lt;enumeration value="pti21_8_Alias_1"/>
 *     &lt;enumeration value="brokenRail"/>
 *     &lt;enumeration value="pti21_8_Alias_2"/>
 *     &lt;enumeration value="poorRailConditions"/>
 *     &lt;enumeration value="pti21_8_Alias_3"/>
 *     &lt;enumeration value="wheelImpactLoad"/>
 *     &lt;enumeration value="pti21_8_Alias_4"/>
 *     &lt;enumeration value="lackOfOperationalStock"/>
 *     &lt;enumeration value="pti21_8_Alias_5"/>
 *     &lt;enumeration value="defectiveFireAlarmEquipment"/>
 *     &lt;enumeration value="pti21_8_Alias_6"/>
 *     &lt;enumeration value="defectivePlatformEdgeDoors"/>
 *     &lt;enumeration value="pti21_8_Alias_7"/>
 *     &lt;enumeration value="defectiveCctv"/>
 *     &lt;enumeration value="pti21_8_Alias_8"/>
 *     &lt;enumeration value="defectivePublicAnnouncementSystem"/>
 *     &lt;enumeration value="pti21_8_Alias_9"/>
 *     &lt;enumeration value="ticketingSystemNotAvailable"/>
 *     &lt;enumeration value="pti21_8_Alias_10"/>
 *     &lt;enumeration value="leveCrossingFailure"/>
 *     &lt;enumeration value="pti21_9"/>
 *     &lt;enumeration value="repairWork"/>
 *     &lt;enumeration value="pti21_10"/>
 *     &lt;enumeration value="constructionWork"/>
 *     &lt;enumeration value="pti21_11"/>
 *     &lt;enumeration value="maintenanceWork"/>
 *     &lt;enumeration value="pti21_11_Alias_1"/>
 *     &lt;enumeration value="emergencyEngineeringWork"/>
 *     &lt;enumeration value="pti21_11_Alias_2"/>
 *     &lt;enumeration value="lateFinishToEngineeringWork"/>
 *     &lt;enumeration value="pti21_12"/>
 *     &lt;enumeration value="powerProblem"/>
 *     &lt;enumeration value="pti21_12_Alias_1"/>
 *     &lt;enumeration value="oveheadWireFailure"/>
 *     &lt;enumeration value="pti21_13"/>
 *     &lt;enumeration value="fuelProblem"/>
 *     &lt;enumeration value="pti21_14"/>
 *     &lt;enumeration value="swingBridgeFailure"/>
 *     &lt;enumeration value="pti21_15"/>
 *     &lt;enumeration value="escalatorFailure"/>
 *     &lt;enumeration value="pti21_16"/>
 *     &lt;enumeration value="liftFailure"/>
 *     &lt;enumeration value="pti21_17"/>
 *     &lt;enumeration value="gangwayProblem"/>
 *     &lt;enumeration value="pti21_18"/>
 *     &lt;enumeration value="closedForMaintenance"/>
 *     &lt;enumeration value="pti21_19"/>
 *     &lt;enumeration value="fuelShortage"/>
 *     &lt;enumeration value="pti21_20"/>
 *     &lt;enumeration value="deicingWork"/>
 *     &lt;enumeration value="pti21_21"/>
 *     &lt;enumeration value="wheelProblem"/>
 *     &lt;enumeration value="pti21_21_Alias_1"/>
 *     &lt;enumeration value="slipperyTrack"/>
 *     &lt;enumeration value="pti21_22"/>
 *     &lt;enumeration value="luggageCarouselProblem"/>
 *     &lt;enumeration value="pti21_255"/>
 *     &lt;enumeration value="undefinedEquipmentProblem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentReasonEnumeration")
@XmlEnum
public enum EquipmentReasonEnumeration {

    @XmlEnumValue("pti21_0")
    PTI_21_0("pti21_0"),

    /**
     * TPEG Pti21_0 unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti21_1")
    PTI_21_1("pti21_1"),

    /**
     * TPEG Pti21_1 points problem.
     * 
     */
    @XmlEnumValue("pointsProblem")
    POINTS_PROBLEM("pointsProblem"),
    @XmlEnumValue("pti21_2")
    PTI_21_2("pti21_2"),

    /**
     * TPEG Pti21_2 points failure.
     * 
     */
    @XmlEnumValue("pointsFailure")
    POINTS_FAILURE("pointsFailure"),
    @XmlEnumValue("pti21_3")
    PTI_21_3("pti21_3"),

    /**
     * TPEG Pti21_3 signal problem.
     * 
     */
    @XmlEnumValue("signalProblem")
    SIGNAL_PROBLEM("signalProblem"),
    @XmlEnumValue("pti21_3_Alias_1")
    PTI_21_3_ALIAS_1("pti21_3_Alias_1"),

    /**
     * Train warning system eg TPWSAlias to TPEG Pti21_3 signal problem.
     * 
     */
    @XmlEnumValue("trainWarningSystemProblem")
    TRAIN_WARNING_SYSTEM_PROBLEM("trainWarningSystemProblem"),
    @XmlEnumValue("pti21_3_Alias_2")
    PTI_21_3_ALIAS_2("pti21_3_Alias_2"),

    /**
     * Track circuit alias to TPEG Pti21_3 signal problem.
     * 
     */
    @XmlEnumValue("trackCircuitProblem")
    TRACK_CIRCUIT_PROBLEM("trackCircuitProblem"),
    @XmlEnumValue("pti21_4")
    PTI_21_4("pti21_4"),

    /**
     * TPEG Pti21_4 signal failure.
     * 
     */
    @XmlEnumValue("signalFailure")
    SIGNAL_FAILURE("signalFailure"),
    @XmlEnumValue("pti21_4_Alias_1")
    PTI_21_4_ALIAS_1("pti21_4_Alias_1"),

    /**
     * TPEG Pti21_4 signal failure.
     * 
     */
    @XmlEnumValue("signalAndSwitchFailure")
    SIGNAL_AND_SWITCH_FAILURE("signalAndSwitchFailure"),
    @XmlEnumValue("pti21_5")
    PTI_21_5("pti21_5"),

    /**
     * TPEG Pti21_5 derailment.
     * 
     */
    @XmlEnumValue("derailment")
    DERAILMENT("derailment"),
    @XmlEnumValue("pti21_6")
    PTI_21_6("pti21_6"),

    /**
     * TPEG Pti21_6 engine failure.
     * 
     */
    @XmlEnumValue("engineFailure")
    ENGINE_FAILURE("engineFailure"),
    @XmlEnumValue("pti21_6_Alias_1")
    PTI_21_6_ALIAS_1("pti21_6_Alias_1"),

    /**
     * traction failure alais to TPEG Pti21_6 engine failure.
     * 
     */
    @XmlEnumValue("tractionFailure")
    TRACTION_FAILURE("tractionFailure"),
    @XmlEnumValue("pti21_7")
    PTI_21_7("pti21_7"),

    /**
     * TPEG Pti21_7 break down.
     * 
     */
    @XmlEnumValue("breakDown")
    BREAK_DOWN("breakDown"),
    @XmlEnumValue("pti21_8")
    PTI_21_8("pti21_8"),

    /**
     * TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("technicalProblem")
    TECHNICAL_PROBLEM("technicalProblem"),
    @XmlEnumValue("pti21_8_Alias_1")
    PTI_21_8_ALIAS_1("pti21_8_Alias_1"),

    /**
     * Broken rail - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("brokenRail")
    BROKEN_RAIL("brokenRail"),
    @XmlEnumValue("pti21_8_Alias_2")
    PTI_21_8_ALIAS_2("pti21_8_Alias_2"),

    /**
     * poor rail conditions - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("poorRailConditions")
    POOR_RAIL_CONDITIONS("poorRailConditions"),
    @XmlEnumValue("pti21_8_Alias_3")
    PTI_21_8_ALIAS_3("pti21_8_Alias_3"),

    /**
     * Wheel Impact Load detectedi by trackside equipment alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("wheelImpactLoad")
    WHEEL_IMPACT_LOAD("wheelImpactLoad"),
    @XmlEnumValue("pti21_8_Alias_4")
    PTI_21_8_ALIAS_4("pti21_8_Alias_4"),

    /**
     * late lack of operational stock - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("lackOfOperationalStock")
    LACK_OF_OPERATIONAL_STOCK("lackOfOperationalStock"),
    @XmlEnumValue("pti21_8_Alias_5")
    PTI_21_8_ALIAS_5("pti21_8_Alias_5"),

    /**
     * defective fire alarm equipment - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectiveFireAlarmEquipment")
    DEFECTIVE_FIRE_ALARM_EQUIPMENT("defectiveFireAlarmEquipment"),
    @XmlEnumValue("pti21_8_Alias_6")
    PTI_21_8_ALIAS_6("pti21_8_Alias_6"),

    /**
     * defective PEDs (platform edge doors) - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectivePlatformEdgeDoors")
    DEFECTIVE_PLATFORM_EDGE_DOORS("defectivePlatformEdgeDoors"),
    @XmlEnumValue("pti21_8_Alias_7")
    PTI_21_8_ALIAS_7("pti21_8_Alias_7"),

    /**
     * defective CCTV - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectiveCctv")
    DEFECTIVE_CCTV("defectiveCctv"),
    @XmlEnumValue("pti21_8_Alias_8")
    PTI_21_8_ALIAS_8("pti21_8_Alias_8"),

    /**
     * defective PA - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("defectivePublicAnnouncementSystem")
    DEFECTIVE_PUBLIC_ANNOUNCEMENT_SYSTEM("defectivePublicAnnouncementSystem"),
    @XmlEnumValue("pti21_8_Alias_9")
    PTI_21_8_ALIAS_9("pti21_8_Alias_9"),

    /**
     * ticketing facility unavailable - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("ticketingSystemNotAvailable")
    TICKETING_SYSTEM_NOT_AVAILABLE("ticketingSystemNotAvailable"),
    @XmlEnumValue("pti21_8_Alias_10")
    PTI_21_8_ALIAS_10("pti21_8_Alias_10"),

    /**
     * ticketing facility unavailable - alias to TPEG Pti21_8 technical problem.
     * 
     */
    @XmlEnumValue("leveCrossingFailure")
    LEVE_CROSSING_FAILURE("leveCrossingFailure"),
    @XmlEnumValue("pti21_9")
    PTI_21_9("pti21_9"),

    /**
     * TPEG Pti21_9 repair work.
     * 
     */
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),
    @XmlEnumValue("pti21_10")
    PTI_21_10("pti21_10"),

    /**
     * TPEG Pti21_10 construction work.
     * 
     */
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("pti21_11")
    PTI_21_11("pti21_11"),

    /**
     * TPEG Pti21_11 maintenance work.
     * 
     */
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),
    @XmlEnumValue("pti21_11_Alias_1")
    PTI_21_11_ALIAS_1("pti21_11_Alias_1"),

    /**
     * emergency engineering work - alias to TPEG Pti21_11 maintenance work.
     * 
     */
    @XmlEnumValue("emergencyEngineeringWork")
    EMERGENCY_ENGINEERING_WORK("emergencyEngineeringWork"),
    @XmlEnumValue("pti21_11_Alias_2")
    PTI_21_11_ALIAS_2("pti21_11_Alias_2"),

    /**
     * late finish to engineering work - alias to TPEG Pti21_11 maintenance work.
     * 
     */
    @XmlEnumValue("lateFinishToEngineeringWork")
    LATE_FINISH_TO_ENGINEERING_WORK("lateFinishToEngineeringWork"),
    @XmlEnumValue("pti21_12")
    PTI_21_12("pti21_12"),

    /**
     * TPEG Pti21_12 power problem.
     * 
     */
    @XmlEnumValue("powerProblem")
    POWER_PROBLEM("powerProblem"),
    @XmlEnumValue("pti21_12_Alias_1")
    PTI_21_12_ALIAS_1("pti21_12_Alias_1"),

    /**
     * TPEG Pti21_12 power problem.
     * 
     */
    @XmlEnumValue("oveheadWireFailure")
    OVEHEAD_WIRE_FAILURE("oveheadWireFailure"),
    @XmlEnumValue("pti21_13")
    PTI_21_13("pti21_13"),

    /**
     * TPEG Pti21_13 fuel problem.
     * 
     */
    @XmlEnumValue("fuelProblem")
    FUEL_PROBLEM("fuelProblem"),
    @XmlEnumValue("pti21_14")
    PTI_21_14("pti21_14"),

    /**
     * TPEG Pti21_14 swing bridge failure.
     * 
     */
    @XmlEnumValue("swingBridgeFailure")
    SWING_BRIDGE_FAILURE("swingBridgeFailure"),
    @XmlEnumValue("pti21_15")
    PTI_21_15("pti21_15"),

    /**
     * TPEG Pti21_15 escalator failure.
     * 
     */
    @XmlEnumValue("escalatorFailure")
    ESCALATOR_FAILURE("escalatorFailure"),
    @XmlEnumValue("pti21_16")
    PTI_21_16("pti21_16"),

    /**
     * TPEG Pti21_16 lift failure.
     * 
     */
    @XmlEnumValue("liftFailure")
    LIFT_FAILURE("liftFailure"),
    @XmlEnumValue("pti21_17")
    PTI_21_17("pti21_17"),

    /**
     * TPEG Pti21_17 gangway problem.
     * 
     */
    @XmlEnumValue("gangwayProblem")
    GANGWAY_PROBLEM("gangwayProblem"),
    @XmlEnumValue("pti21_18")
    PTI_21_18("pti21_18"),

    /**
     * TPEG Pti21_18 closed for maintenance.
     * 
     */
    @XmlEnumValue("closedForMaintenance")
    CLOSED_FOR_MAINTENANCE("closedForMaintenance"),
    @XmlEnumValue("pti21_19")
    PTI_21_19("pti21_19"),

    /**
     * TPEG Pti21_19 fuel shortage.
     * 
     */
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),
    @XmlEnumValue("pti21_20")
    PTI_21_20("pti21_20"),

    /**
     * TPEG Pti21_20 de-icing work.
     * 
     */
    @XmlEnumValue("deicingWork")
    DEICING_WORK("deicingWork"),
    @XmlEnumValue("pti21_21")
    PTI_21_21("pti21_21"),

    /**
     * TPEG Pti21_21 wheel problem.
     * 
     */
    @XmlEnumValue("wheelProblem")
    WHEEL_PROBLEM("wheelProblem"),
    @XmlEnumValue("pti21_21_Alias_1")
    PTI_21_21_ALIAS_1("pti21_21_Alias_1"),

    /**
     * TPEG Pti21_21 wheel problem.
     * 
     */
    @XmlEnumValue("slipperyTrack")
    SLIPPERY_TRACK("slipperyTrack"),
    @XmlEnumValue("pti21_22")
    PTI_21_22("pti21_22"),

    /**
     * TPEG Pti21_22 luggage carousel problem.
     * 
     */
    @XmlEnumValue("luggageCarouselProblem")
    LUGGAGE_CAROUSEL_PROBLEM("luggageCarouselProblem"),
    @XmlEnumValue("pti21_255")
    PTI_21_255("pti21_255"),

    /**
     * TPEG Pti21_255 undefined equipment problem.
     * 
     */
    @XmlEnumValue("undefinedEquipmentProblem")
    UNDEFINED_EQUIPMENT_PROBLEM("undefinedEquipmentProblem");
    private final String value;

    EquipmentReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentReasonEnumeration fromValue(String v) {
        for (EquipmentReasonEnumeration c: EquipmentReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

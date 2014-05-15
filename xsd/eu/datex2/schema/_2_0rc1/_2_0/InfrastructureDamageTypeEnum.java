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
 * <p>Java class for InfrastructureDamageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InfrastructureDamageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="burstPipe"/>
 *     &lt;enumeration value="burstWaterMain"/>
 *     &lt;enumeration value="collapsedSewer"/>
 *     &lt;enumeration value="damagedBridge"/>
 *     &lt;enumeration value="damagedCrashBarrier"/>
 *     &lt;enumeration value="damagedFlyover"/>
 *     &lt;enumeration value="damagedGallery"/>
 *     &lt;enumeration value="damagedGantry"/>
 *     &lt;enumeration value="damagedRoadSurface"/>
 *     &lt;enumeration value="damagedTunnel"/>
 *     &lt;enumeration value="damagedViaduct"/>
 *     &lt;enumeration value="fallenPowerCables"/>
 *     &lt;enumeration value="gasLeak"/>
 *     &lt;enumeration value="weakBridge"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InfrastructureDamageTypeEnum")
@XmlEnum
public enum InfrastructureDamageTypeEnum {

    @XmlEnumValue("burstPipe")
    BURST_PIPE("burstPipe"),
    @XmlEnumValue("burstWaterMain")
    BURST_WATER_MAIN("burstWaterMain"),
    @XmlEnumValue("collapsedSewer")
    COLLAPSED_SEWER("collapsedSewer"),
    @XmlEnumValue("damagedBridge")
    DAMAGED_BRIDGE("damagedBridge"),
    @XmlEnumValue("damagedCrashBarrier")
    DAMAGED_CRASH_BARRIER("damagedCrashBarrier"),
    @XmlEnumValue("damagedFlyover")
    DAMAGED_FLYOVER("damagedFlyover"),
    @XmlEnumValue("damagedGallery")
    DAMAGED_GALLERY("damagedGallery"),
    @XmlEnumValue("damagedGantry")
    DAMAGED_GANTRY("damagedGantry"),
    @XmlEnumValue("damagedRoadSurface")
    DAMAGED_ROAD_SURFACE("damagedRoadSurface"),
    @XmlEnumValue("damagedTunnel")
    DAMAGED_TUNNEL("damagedTunnel"),
    @XmlEnumValue("damagedViaduct")
    DAMAGED_VIADUCT("damagedViaduct"),
    @XmlEnumValue("fallenPowerCables")
    FALLEN_POWER_CABLES("fallenPowerCables"),
    @XmlEnumValue("gasLeak")
    GAS_LEAK("gasLeak"),
    @XmlEnumValue("weakBridge")
    WEAK_BRIDGE("weakBridge"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    InfrastructureDamageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfrastructureDamageTypeEnum fromValue(String v) {
        for (InfrastructureDamageTypeEnum c: InfrastructureDamageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

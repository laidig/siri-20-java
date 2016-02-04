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
 * <p>Java class for EnvironmentSubReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="roughSea"/>
 *     &lt;enumeration value="heavySnowFall"/>
 *     &lt;enumeration value="driftingSnow"/>
 *     &lt;enumeration value="heavyRain"/>
 *     &lt;enumeration value="blizzardConditions"/>
 *     &lt;enumeration value="strongWinds"/>
 *     &lt;enumeration value="stormConditions"/>
 *     &lt;enumeration value="stormDamage"/>
 *     &lt;enumeration value="tidalRestrictions"/>
 *     &lt;enumeration value="highTide"/>
 *     &lt;enumeration value="lowTide"/>
 *     &lt;enumeration value="ice"/>
 *     &lt;enumeration value="slipperiness"/>
 *     &lt;enumeration value="iceDrift"/>
 *     &lt;enumeration value="glazedFrost"/>
 *     &lt;enumeration value="frozen"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="sleet"/>
 *     &lt;enumeration value="highTemperatures"/>
 *     &lt;enumeration value="flooding"/>
 *     &lt;enumeration value="waterlogged"/>
 *     &lt;enumeration value="lowWaterLevel"/>
 *     &lt;enumeration value="highWaterLevel"/>
 *     &lt;enumeration value="fallenLeaves"/>
 *     &lt;enumeration value="fallenTree"/>
 *     &lt;enumeration value="landslide"/>
 *     &lt;enumeration value="undefinedEnvironmentalProblem"/>
 *     &lt;enumeration value="sewerOverflow"/>
 *     &lt;enumeration value="grassFire"/>
 *     &lt;enumeration value="lighteningStrike"/>
 *     &lt;enumeration value="avalanches"/>
 *     &lt;enumeration value="flashFloods"/>
 *     &lt;enumeration value="mudslip"/>
 *     &lt;enumeration value="rockfalls"/>
 *     &lt;enumeration value="subsidence"/>
 *     &lt;enumeration value="earthquakeDamage"/>
 *     &lt;enumeration value="sewerOverflow"/>
 *     &lt;enumeration value="grassFire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentSubReasonEnumeration")
@XmlEnum
public enum EnvironmentSubReasonEnumeration {


    /**
     * TPEG Pti22_0 unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti22_1 fog.
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),

    /**
     * TPEG Pti22_2 rough sea.
     * 
     */
    @XmlEnumValue("roughSea")
    ROUGH_SEA("roughSea"),
    @XmlEnumValue("heavySnowFall")
    HEAVY_SNOW_FALL("heavySnowFall"),

    /**
     * drifting snow - Alias to TPEG Pti22_3 heavySnowFall.
     * 
     */
    @XmlEnumValue("driftingSnow")
    DRIFTING_SNOW("driftingSnow"),

    /**
     * TPEG Pti22_4 heavy rain.
     * 
     */
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),

    /**
     * Blizzard Conditions - Alias to TPEG Pti22_3 heavySnowFall.
     * 
     */
    @XmlEnumValue("blizzardConditions")
    BLIZZARD_CONDITIONS("blizzardConditions"),

    /**
     * TPEG Pti22_5 strong winds.
     * 
     */
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),

    /**
     * stormConditions alias to TPEG Pti22_5 strong winds.
     * 
     */
    @XmlEnumValue("stormConditions")
    STORM_CONDITIONS("stormConditions"),

    /**
     * storm damage alias to TPEG Pti22_5 strong winds.
     * 
     */
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),

    /**
     * TPEG Pti22_6 tidal restrictions.
     * 
     */
    @XmlEnumValue("tidalRestrictions")
    TIDAL_RESTRICTIONS("tidalRestrictions"),

    /**
     * TPEG Pti22_7 high tide.
     * 
     */
    @XmlEnumValue("highTide")
    HIGH_TIDE("highTide"),

    /**
     * TPEG Pti22_8 low tide.
     * 
     */
    @XmlEnumValue("lowTide")
    LOW_TIDE("lowTide"),

    /**
     * TPEG Pti22_9 ice.
     * 
     */
    @XmlEnumValue("ice")
    ICE("ice"),

    /**
     * TPEG Pti22_9 ice.
     * 
     */
    @XmlEnumValue("slipperiness")
    SLIPPERINESS("slipperiness"),

    /**
     * TPEG Pti22_9 ice.
     * 
     */
    @XmlEnumValue("iceDrift")
    ICE_DRIFT("iceDrift"),

    /**
     * TPEG Pti22_9 ice.
     * 
     */
    @XmlEnumValue("glazedFrost")
    GLAZED_FROST("glazedFrost"),

    /**
     * TPEG Pti22_10 frozen.
     * 
     */
    @XmlEnumValue("frozen")
    FROZEN("frozen"),

    /**
     * TPEG Pti22_11 hail.
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),

    /**
     * Sleet Alias to TPEG Pti22_11 hail.
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),

    /**
     * TPEG Pti22_12 high temperatures.
     * 
     */
    @XmlEnumValue("highTemperatures")
    HIGH_TEMPERATURES("highTemperatures"),

    /**
     * TPEG Pti22_13 flooding.
     * 
     */
    @XmlEnumValue("flooding")
    FLOODING("flooding"),

    /**
     * TPEG Pti22_14 waterlogged.
     * 
     */
    @XmlEnumValue("waterlogged")
    WATERLOGGED("waterlogged"),

    /**
     * TPEG Pti22_15 low water level.
     * 
     */
    @XmlEnumValue("lowWaterLevel")
    LOW_WATER_LEVEL("lowWaterLevel"),

    /**
     * TPEG Pti22_16 high water level.
     * 
     */
    @XmlEnumValue("highWaterLevel")
    HIGH_WATER_LEVEL("highWaterLevel"),

    /**
     * TPEG Pti22_17 fallen leaves.
     * 
     */
    @XmlEnumValue("fallenLeaves")
    FALLEN_LEAVES("fallenLeaves"),

    /**
     * TPEG Pti22_18 fallen tree.
     * 
     */
    @XmlEnumValue("fallenTree")
    FALLEN_TREE("fallenTree"),

    /**
     * TPEG Pti22_19 landslide.
     * 
     */
    @XmlEnumValue("landslide")
    LANDSLIDE("landslide"),

    /**
     * TPEG Pti22_255 undefined environmental problem.
     * 
     */
    @XmlEnumValue("undefinedEnvironmentalProblem")
    UNDEFINED_ENVIRONMENTAL_PROBLEM("undefinedEnvironmentalProblem"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),
    @XmlEnumValue("lighteningStrike")
    LIGHTENING_STRIKE("lighteningStrike"),
    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),
    @XmlEnumValue("mudslip")
    MUDSLIP("mudslip"),
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage");
    private final String value;

    EnvironmentSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentSubReasonEnumeration fromValue(String v) {
        for (EnvironmentSubReasonEnumeration c: EnvironmentSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

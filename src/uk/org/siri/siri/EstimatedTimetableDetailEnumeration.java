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
 * <p>Java class for EstimatedTimetableDetailEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstimatedTimetableDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="calls"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstimatedTimetableDetailEnumeration")
@XmlEnum
public enum EstimatedTimetableDetailEnumeration {


    /**
     * Return only the minimum amount of optional data for each Stop Visit to provide a display, A time at stop, LINE name and destination name.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return minimum and other available basic details for each Stop Visit. Do not include data on times at next stop or destination.
     * 
     */
    @XmlEnumValue("basic")
    BASIC("basic"),

    /**
     * Return all basic data, and also origin VIA points and destination.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return in addition to normal data, the estimated call data  i .
     * 
     */
    @XmlEnumValue("calls")
    CALLS("calls"),

    /**
     * Return all available data for each   including calls.
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    EstimatedTimetableDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstimatedTimetableDetailEnumeration fromValue(String v) {
        for (EstimatedTimetableDetailEnumeration c: EstimatedTimetableDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

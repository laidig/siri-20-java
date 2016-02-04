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
 * <p>Java class for CallStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="onTime"/>
 *     &lt;enumeration value="early"/>
 *     &lt;enumeration value="delayed"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="arrived"/>
 *     &lt;enumeration value="departed"/>
 *     &lt;enumeration value="missed"/>
 *     &lt;enumeration value="noReport"/>
 *     &lt;enumeration value="notExpected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallStatusEnumeration")
@XmlEnum
public enum CallStatusEnumeration {


    /**
     * Service is on time.
     * 
     */
    @XmlEnumValue("onTime")
    ON_TIME("onTime"),

    /**
     * Service is earlier than expected.
     * 
     */
    @XmlEnumValue("early")
    EARLY("early"),

    /**
     * Service is delayed.
     * 
     */
    @XmlEnumValue("delayed")
    DELAYED("delayed"),

    /**
     * Service is cancelled.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Service has arrived.
     * 
     */
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),
    @XmlEnumValue("departed")
    DEPARTED("departed"),
    @XmlEnumValue("missed")
    MISSED("missed"),

    /**
     * There is no information about the service.
     * 
     */
    @XmlEnumValue("noReport")
    NO_REPORT("noReport"),

    /**
     * Service is not expected to call this stop. For instance a flexible service that has not yet been preordered.
     * 
     */
    @XmlEnumValue("notExpected")
    NOT_EXPECTED("notExpected");
    private final String value;

    CallStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallStatusEnumeration fromValue(String v) {
        for (CallStatusEnumeration c: CallStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

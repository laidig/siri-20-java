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
 * <p>Java class for StopVisitTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopVisitTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="arrivals"/>
 *     &lt;enumeration value="departures"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopVisitTypeEnumeration")
@XmlEnum
public enum StopVisitTypeEnumeration {


    /**
     * Return all Stop Visits.
     * 
     */
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * Return only arrival Stop Visits.
     * 
     */
    @XmlEnumValue("arrivals")
    ARRIVALS("arrivals"),

    /**
     * Return only departure Stop Visits.
     * 
     */
    @XmlEnumValue("departures")
    DEPARTURES("departures");
    private final String value;

    StopVisitTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopVisitTypeEnumeration fromValue(String v) {
        for (StopVisitTypeEnumeration c: StopVisitTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

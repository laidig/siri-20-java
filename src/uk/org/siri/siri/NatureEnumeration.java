//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NatureEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NatureEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plannedOnly"/>
 *     &lt;enumeration value="unplannedOnly"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NatureEnumeration")
@XmlEnum
public enum NatureEnumeration {

    @XmlEnumValue("plannedOnly")
    PLANNED_ONLY("plannedOnly"),
    @XmlEnumValue("unplannedOnly")
    UNPLANNED_ONLY("unplannedOnly"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    NatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NatureEnumeration fromValue(String v) {
        for (NatureEnumeration c: NatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

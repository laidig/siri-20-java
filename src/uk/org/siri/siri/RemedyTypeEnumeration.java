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
 * <p>Java class for RemedyTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemedyTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="repair"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="otherRoute"/>
 *     &lt;enumeration value="otherLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemedyTypeEnumeration")
@XmlEnum
public enum RemedyTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("repair")
    REPAIR("repair"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("otherRoute")
    OTHER_ROUTE("otherRoute"),
    @XmlEnumValue("otherLocation")
    OTHER_LOCATION("otherLocation");
    private final String value;

    RemedyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemedyTypeEnumeration fromValue(String v) {
        for (RemedyTypeEnumeration c: RemedyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompassBearing8Enumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassBearing8Enumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompassBearing8Enumeration")
@XmlEnum
public enum CompassBearing8Enumeration {

    SW,
    SE,
    NW,
    NE,
    W,
    E,
    S,
    N;

    public String value() {
        return name();
    }

    public static CompassBearing8Enumeration fromValue(String v) {
        return valueOf(v);
    }

}

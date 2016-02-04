//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksDurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadworksDurationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="longTerm"/>
 *     &lt;enumeration value="mediumTerm"/>
 *     &lt;enumeration value="shortTerm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadworksDurationEnum")
@XmlEnum
public enum RoadworksDurationEnum {

    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("mediumTerm")
    MEDIUM_TERM("mediumTerm"),
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm");
    private final String value;

    RoadworksDurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksDurationEnum fromValue(String v) {
        for (RoadworksDurationEnum c: RoadworksDurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

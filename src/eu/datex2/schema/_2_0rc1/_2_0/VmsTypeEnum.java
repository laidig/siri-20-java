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
 * <p>Java class for VmsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="colourGraphic"/>
 *     &lt;enumeration value="continuousSign"/>
 *     &lt;enumeration value="monochromeGraphic"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsTypeEnum")
@XmlEnum
public enum VmsTypeEnum {

    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),
    @XmlEnumValue("continuousSign")
    CONTINUOUS_SIGN("continuousSign"),
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsTypeEnum fromValue(String v) {
        for (VmsTypeEnum c: VmsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

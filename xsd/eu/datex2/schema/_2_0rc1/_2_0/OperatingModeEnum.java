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
 * <p>Java class for OperatingModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatingModeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="operatingMode0"/>
 *     &lt;enumeration value="operatingMode1"/>
 *     &lt;enumeration value="operatingMode2"/>
 *     &lt;enumeration value="operatingMode3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatingModeEnum")
@XmlEnum
public enum OperatingModeEnum {

    @XmlEnumValue("operatingMode0")
    OPERATING_MODE_0("operatingMode0"),
    @XmlEnumValue("operatingMode1")
    OPERATING_MODE_1("operatingMode1"),
    @XmlEnumValue("operatingMode2")
    OPERATING_MODE_2("operatingMode2"),
    @XmlEnumValue("operatingMode3")
    OPERATING_MODE_3("operatingMode3");
    private final String value;

    OperatingModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingModeEnum fromValue(String v) {
        for (OperatingModeEnum c: OperatingModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

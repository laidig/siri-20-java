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
 * <p>Java class for OperatorActionOriginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionOriginEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionOriginEnum")
@XmlEnum
public enum OperatorActionOriginEnum {

    @XmlEnumValue("external")
    EXTERNAL("external"),
    @XmlEnumValue("internal")
    INTERNAL("internal");
    private final String value;

    OperatorActionOriginEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionOriginEnum fromValue(String v) {
        for (OperatorActionOriginEnum c: OperatorActionOriginEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

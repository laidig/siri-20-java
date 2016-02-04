//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 03:36:57 PM EST 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicalNeedEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalNeedEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="allergic"/>
 *     &lt;enumeration value="heartCondition"/>
 *     &lt;enumeration value="otherMedicalNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalNeedEnumeration")
@XmlEnum
public enum MedicalNeedEnumeration {

    @XmlEnumValue("allergic")
    ALLERGIC("allergic"),
    @XmlEnumValue("heartCondition")
    HEART_CONDITION("heartCondition"),
    @XmlEnumValue("otherMedicalNeed")
    OTHER_MEDICAL_NEED("otherMedicalNeed");
    private final String value;

    MedicalNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalNeedEnumeration fromValue(String v) {
        for (MedicalNeedEnumeration c: MedicalNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

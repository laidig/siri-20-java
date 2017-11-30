//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonCategoryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adult"/>
 *     &lt;enumeration value="child"/>
 *     &lt;enumeration value="emergencyServicesPerson"/>
 *     &lt;enumeration value="fireman"/>
 *     &lt;enumeration value="infant"/>
 *     &lt;enumeration value="medicalStaff"/>
 *     &lt;enumeration value="memberOfThePublic"/>
 *     &lt;enumeration value="policeman"/>
 *     &lt;enumeration value="politician"/>
 *     &lt;enumeration value="publicTransportPassenger"/>
 *     &lt;enumeration value="sickPerson"/>
 *     &lt;enumeration value="trafficOfficer"/>
 *     &lt;enumeration value="trafficWarden"/>
 *     &lt;enumeration value="veryImportantPerson"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonCategoryEnum")
@XmlEnum
public enum PersonCategoryEnum {

    @XmlEnumValue("adult")
    ADULT("adult"),
    @XmlEnumValue("child")
    CHILD("child"),
    @XmlEnumValue("emergencyServicesPerson")
    EMERGENCY_SERVICES_PERSON("emergencyServicesPerson"),
    @XmlEnumValue("fireman")
    FIREMAN("fireman"),
    @XmlEnumValue("infant")
    INFANT("infant"),
    @XmlEnumValue("medicalStaff")
    MEDICAL_STAFF("medicalStaff"),
    @XmlEnumValue("memberOfThePublic")
    MEMBER_OF_THE_PUBLIC("memberOfThePublic"),
    @XmlEnumValue("policeman")
    POLICEMAN("policeman"),
    @XmlEnumValue("politician")
    POLITICIAN("politician"),
    @XmlEnumValue("publicTransportPassenger")
    PUBLIC_TRANSPORT_PASSENGER("publicTransportPassenger"),
    @XmlEnumValue("sickPerson")
    SICK_PERSON("sickPerson"),
    @XmlEnumValue("trafficOfficer")
    TRAFFIC_OFFICER("trafficOfficer"),
    @XmlEnumValue("trafficWarden")
    TRAFFIC_WARDEN("trafficWarden"),
    @XmlEnumValue("veryImportantPerson")
    VERY_IMPORTANT_PERSON("veryImportantPerson");
    private final String value;

    PersonCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonCategoryEnum fromValue(String v) {
        for (PersonCategoryEnum c: PersonCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

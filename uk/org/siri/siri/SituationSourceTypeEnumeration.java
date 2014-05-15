//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituationSourceTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituationSourceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="directReport"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="post"/>
 *     &lt;enumeration value="feed"/>
 *     &lt;enumeration value="radio"/>
 *     &lt;enumeration value="tv"/>
 *     &lt;enumeration value="web"/>
 *     &lt;enumeration value="pager"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituationSourceTypeEnumeration")
@XmlEnum
public enum SituationSourceTypeEnumeration {

    @XmlEnumValue("directReport")
    DIRECT_REPORT("directReport"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("post")
    POST("post"),
    @XmlEnumValue("feed")
    FEED("feed"),
    @XmlEnumValue("radio")
    RADIO("radio"),
    @XmlEnumValue("tv")
    TV("tv"),
    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("pager")
    PAGER("pager"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SituationSourceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SituationSourceTypeEnumeration fromValue(String v) {
        for (SituationSourceTypeEnumeration c: SituationSourceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

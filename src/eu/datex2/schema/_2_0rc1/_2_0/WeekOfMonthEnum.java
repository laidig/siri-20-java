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
 * <p>Java class for WeekOfMonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekOfMonthEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="firstWeekOfMonth"/>
 *     &lt;enumeration value="secondWeekOfMonth"/>
 *     &lt;enumeration value="thirdWeekOfMonth"/>
 *     &lt;enumeration value="fourthWeekOfMonth"/>
 *     &lt;enumeration value="fifthWeekOfMonth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeekOfMonthEnum")
@XmlEnum
public enum WeekOfMonthEnum {

    @XmlEnumValue("firstWeekOfMonth")
    FIRST_WEEK_OF_MONTH("firstWeekOfMonth"),
    @XmlEnumValue("secondWeekOfMonth")
    SECOND_WEEK_OF_MONTH("secondWeekOfMonth"),
    @XmlEnumValue("thirdWeekOfMonth")
    THIRD_WEEK_OF_MONTH("thirdWeekOfMonth"),
    @XmlEnumValue("fourthWeekOfMonth")
    FOURTH_WEEK_OF_MONTH("fourthWeekOfMonth"),
    @XmlEnumValue("fifthWeekOfMonth")
    FIFTH_WEEK_OF_MONTH("fifthWeekOfMonth");
    private final String value;

    WeekOfMonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeekOfMonthEnum fromValue(String v) {
        for (WeekOfMonthEnum c: WeekOfMonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

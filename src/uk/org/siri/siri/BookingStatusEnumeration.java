//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti24_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti17_1"/>
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="pti24_2"/>
 *     &lt;enumeration value="limited"/>
 *     &lt;enumeration value="pti24_3"/>
 *     &lt;enumeration value="veryLimited"/>
 *     &lt;enumeration value="pti24_4"/>
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="pti24_5"/>
 *     &lt;enumeration value="waitingList"/>
 *     &lt;enumeration value="pti24_6"/>
 *     &lt;enumeration value="noBookingRequired"/>
 *     &lt;enumeration value="pti24_7"/>
 *     &lt;enumeration value="bookingRequired"/>
 *     &lt;enumeration value="pti24_8"/>
 *     &lt;enumeration value="bookingOptional"/>
 *     &lt;enumeration value="pti24_255"/>
 *     &lt;enumeration value="undefinedBookingInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookingStatusEnumeration")
@XmlEnum
public enum BookingStatusEnumeration {

    @XmlEnumValue("pti24_0")
    PTI_24_0("pti24_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti17_1")
    PTI_17_1("pti17_1"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("pti24_2")
    PTI_24_2("pti24_2"),
    @XmlEnumValue("limited")
    LIMITED("limited"),
    @XmlEnumValue("pti24_3")
    PTI_24_3("pti24_3"),
    @XmlEnumValue("veryLimited")
    VERY_LIMITED("veryLimited"),
    @XmlEnumValue("pti24_4")
    PTI_24_4("pti24_4"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("pti24_5")
    PTI_24_5("pti24_5"),
    @XmlEnumValue("waitingList")
    WAITING_LIST("waitingList"),
    @XmlEnumValue("pti24_6")
    PTI_24_6("pti24_6"),
    @XmlEnumValue("noBookingRequired")
    NO_BOOKING_REQUIRED("noBookingRequired"),
    @XmlEnumValue("pti24_7")
    PTI_24_7("pti24_7"),
    @XmlEnumValue("bookingRequired")
    BOOKING_REQUIRED("bookingRequired"),
    @XmlEnumValue("pti24_8")
    PTI_24_8("pti24_8"),
    @XmlEnumValue("bookingOptional")
    BOOKING_OPTIONAL("bookingOptional"),
    @XmlEnumValue("pti24_255")
    PTI_24_255("pti24_255"),
    @XmlEnumValue("undefinedBookingInformation")
    UNDEFINED_BOOKING_INFORMATION("undefinedBookingInformation");
    private final String value;

    BookingStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingStatusEnumeration fromValue(String v) {
        for (BookingStatusEnumeration c: BookingStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

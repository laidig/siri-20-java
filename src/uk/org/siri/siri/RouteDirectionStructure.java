//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary information about a  Direction of a Line
 * 
 * <p>Java class for RouteDirectionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteDirectionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}DirectionStructure">
 *       &lt;sequence>
 *         &lt;element name="JourneyPatterns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JourneyPattern" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.siri.org.uk/siri}JourneyPatternRef" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="StopsInPattern" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDirectionStructure", propOrder = {
    "journeyPatterns",
    "extensions"
})
public class RouteDirectionStructure
    extends DirectionStructure
{

    @XmlElement(name = "JourneyPatterns")
    protected RouteDirectionStructure.JourneyPatterns journeyPatterns;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the journeyPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link RouteDirectionStructure.JourneyPatterns }
     *     
     */
    public RouteDirectionStructure.JourneyPatterns getJourneyPatterns() {
        return journeyPatterns;
    }

    /**
     * Sets the value of the journeyPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteDirectionStructure.JourneyPatterns }
     *     
     */
    public void setJourneyPatterns(RouteDirectionStructure.JourneyPatterns value) {
        this.journeyPatterns = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JourneyPattern" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.siri.org.uk/siri}JourneyPatternRef" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="StopsInPattern" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journeyPattern"
    })
    public static class JourneyPatterns {

        @XmlElement(name = "JourneyPattern", required = true)
        protected List<RouteDirectionStructure.JourneyPatterns.JourneyPattern> journeyPattern;

        /**
         * Gets the value of the journeyPattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journeyPattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteDirectionStructure.JourneyPatterns.JourneyPattern }
         * 
         * 
         */
        public List<RouteDirectionStructure.JourneyPatterns.JourneyPattern> getJourneyPattern() {
            if (journeyPattern == null) {
                journeyPattern = new ArrayList<RouteDirectionStructure.JourneyPatterns.JourneyPattern>();
            }
            return this.journeyPattern;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.siri.org.uk/siri}JourneyPatternRef" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="StopsInPattern" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "journeyPatternRef",
            "name",
            "stopsInPattern"
        })
        public static class JourneyPattern {

            @XmlElement(name = "JourneyPatternRef")
            protected JourneyPatternRefStructure journeyPatternRef;
            @XmlElement(name = "Name")
            protected List<NaturalLanguageStringStructure> name;
            @XmlElement(name = "StopsInPattern")
            protected RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern stopsInPattern;

            /**
             * Gets the value of the journeyPatternRef property.
             * 
             * @return
             *     possible object is
             *     {@link JourneyPatternRefStructure }
             *     
             */
            public JourneyPatternRefStructure getJourneyPatternRef() {
                return journeyPatternRef;
            }

            /**
             * Sets the value of the journeyPatternRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link JourneyPatternRefStructure }
             *     
             */
            public void setJourneyPatternRef(JourneyPatternRefStructure value) {
                this.journeyPatternRef = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the name property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NaturalLanguageStringStructure }
             * 
             * 
             */
            public List<NaturalLanguageStringStructure> getName() {
                if (name == null) {
                    name = new ArrayList<NaturalLanguageStringStructure>();
                }
                return this.name;
            }

            /**
             * Gets the value of the stopsInPattern property.
             * 
             * @return
             *     possible object is
             *     {@link RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern }
             *     
             */
            public RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern getStopsInPattern() {
                return stopsInPattern;
            }

            /**
             * Sets the value of the stopsInPattern property.
             * 
             * @param value
             *     allowed object is
             *     {@link RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern }
             *     
             */
            public void setStopsInPattern(RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern value) {
                this.stopsInPattern = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "stopPointInPattern"
            })
            public static class StopsInPattern {

                @XmlElement(name = "StopPointInPattern", required = true)
                protected List<StopPointInPatternStructure> stopPointInPattern;

                /**
                 * Gets the value of the stopPointInPattern property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the stopPointInPattern property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStopPointInPattern().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StopPointInPatternStructure }
                 * 
                 * 
                 */
                public List<StopPointInPatternStructure> getStopPointInPattern() {
                    if (stopPointInPattern == null) {
                        stopPointInPattern = new ArrayList<StopPointInPatternStructure>();
                    }
                    return this.stopPointInPattern;
                }

            }

        }

    }

}

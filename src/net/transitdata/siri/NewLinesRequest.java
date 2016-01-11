package net.transitdata.siri;

import java.math.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import uk.org.siri.siri.*;
import uk.org.siri.siri.AnnotatedLineStructure.Destinations;
import uk.org.siri.siri.AnnotatedLineStructure.Directions;
import uk.org.siri.siri.RouteDirectionStructure.JourneyPatterns;
import uk.org.siri.siri.RouteDirectionStructure.JourneyPatterns.JourneyPattern;
import uk.org.siri.siri.RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern;

public class NewLinesRequest {
	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	private enum detailLevel {
		minimum , normal , stops , full
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewLinesRequest nlr = new NewLinesRequest();
		
		Util ut = new Util();

			
		LinesDeliveryStructure lds = nlr.getLinesDdlivery(detailLevel.stops);
		
		Siri siri = new Siri();
		
		siri.setLinesDelivery(lds);
		
		String xml = ut.getXMLFromObject(siri, true, Scheduled.class.getClassLoader());
		//String json = ut.getJSONFromObject(siri, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	@XmlAccessorType (XmlAccessType.FIELD)
	@XmlRootElement(name="polylines")
	public static class Polylines {
		@XmlElement(name="lines")
		protected ArrayList<String> lines = new ArrayList<String>();
		
		public void add(String line){
			lines.add(line);
		}
		public ArrayList<String> getPolylines(){
			return this.lines;
		}
		
	}
	@XmlRootElement(name="Color")
	public static class Color {
		protected String color = new String();
		public String get(){
			return color;
		}
		public void set(String c){
			this.color = c;
		}
	}
	
	@XmlRootElement(name="Scheduled")
	public static class Scheduled {
		@XmlElement(name="Scheduled")
		protected boolean scheduled = true;
		
		public boolean get(){
			return this.scheduled;
		}
		public void set(boolean b){
			this.scheduled = b;
		}
		
	}
	
	private LinesDeliveryStructure getLinesDdlivery(detailLevel dl) {
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e1) {
			e1.printStackTrace();
		}
		
		LinesDeliveryStructure lds = new LinesDeliveryStructure();
		 
		DirectionRefStructure direction0 = new DirectionRefStructure();
		direction0.setValue("0");
		
		DirectionRefStructure direction1 = new DirectionRefStructure();
		direction1.setValue("1");
		
		AnnotatedLineStructure l1 = new AnnotatedLineStructure();
		LineRefStructure line1 = new LineRefStructure();
		line1.setValue("Agency_Line1");

		LineDirectionStructure  lineDirStruct1 = new LineDirectionStructure();
		
		lineDirStruct1.setDirectionRef(direction0);
		lineDirStruct1.setLineRef(line1);
		
		
		
		Destinations dest1 = new Destinations();
		AnnotatedDestinationStructure annotatedDest = new AnnotatedDestinationStructure();
		DestinationRefStructure destRef = new DestinationRefStructure();
		destRef.setValue("Tatooine");
		annotatedDest.setDestinationRef(destRef );
		dest1.getDestination().add(annotatedDest );

//		l1.setDestinations(dest1 );

		
		NaturalLanguageStringStructure lineName = new NaturalLanguageStringStructure();
		lineName.setValue("Line 1");

		StopPointRefStructure spr1 = new StopPointRefStructure();
		spr1.setValue("Agency_1234");
		
		StopPointRefStructure spr2 = new StopPointRefStructure();
		spr2.setValue("Agency_5678");
				
		//journey patterns
		JourneyPattern pattern = new JourneyPattern();
		JourneyPatterns patterns = new JourneyPatterns();
		
		StopsInPattern stopsInPattern = new StopsInPattern();
		StopPointInPatternStructure pointInPattern = new StopPointInPatternStructure();
		pointInPattern.setStopPointRef(spr1);
		pointInPattern.setOrder(BigInteger.ONE);
		NaturalLanguageStringStructure stopName = new NaturalLanguageStringStructure();
		stopName.setValue("1st and Main");
		pointInPattern.getStopName().add(stopName );
		
		StopPointInPatternStructure pointInPattern2 = new StopPointInPatternStructure();
		pointInPattern2.setStopPointRef(spr2);
		pointInPattern2.setOrder(BigInteger.valueOf(2));
		NaturalLanguageStringStructure stopName2 = new NaturalLanguageStringStructure();
		stopName2.setValue("2st and Main");
		pointInPattern2.getStopName().add(stopName2);
		
		stopsInPattern.getStopPointInPattern().add(pointInPattern);
		stopsInPattern.getStopPointInPattern().add(pointInPattern2);
		
		
		
		Directions directions = new Directions();
		RouteDirectionStructure rds = new RouteDirectionStructure();
		NaturalLanguageStringStructure directionName = new NaturalLanguageStringStructure();
		directionName.setValue("Tatooine");
		rds.getDirectionName().add(directionName );

		
		directions.getDirection().add(rds);
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		XMLGregorianCalendar nowTime = df.newXMLGregorianCalendar(gregorianCalendar);
				
		//minimum: Return only the name and identifier of stops
		//ideally, this would return only stops with scheduled service
		lds.setResponseTimestamp(nowTime);
		l1.setLineRef(line1);
		l1.getLineName().add(lineName);
		l1.setMonitored(true);
		l1.setDirections(directions);
		
		// normal: Return name, identifier and coordinates of the stop.??
		// my interpretation is that normal returns the list of stops with coordinates and their polylines
		//ideally, this would return only stops with scheduled service
		if (dl == detailLevel.normal || dl == detailLevel.stops || dl == detailLevel.full){
			BigDecimal stopLat = new BigDecimal(44.12345);
			BigDecimal stopLon = new BigDecimal(-74.12345);
			BigDecimal stopLat2 = new BigDecimal(44.23456);
			BigDecimal stopLon2 = new BigDecimal(-74.23456);
			
			LocationStructure location = new LocationStructure();
			location.setLongitude(stopLon.setScale(6, BigDecimal.ROUND_HALF_DOWN));
			location.setLatitude(stopLat.setScale(6, BigDecimal.ROUND_HALF_DOWN));
						
			LocationStructure location2 = new LocationStructure();
			location2.setLongitude(stopLon2);
			location2.setLatitude(stopLat2);
			
			pointInPattern.setLocation(location);
			pointInPattern2.setLocation(location2);
			ExtensionsStructure polylineExtension = new ExtensionsStructure();
			
			Polylines polylines = new Polylines();
			polylines.add("eetvFznpbM?P");
			polylines.add("idtvFrvpbMFhALhCVrEFjALfCHhALhC"); 
			//polylineExtension.setAny(polylines);
			
			Color color = new Color();
			color.set("00AAFF");
			
			lds.setExtensions(polylineExtension);
			
		}
		
		// stops returns stops with coordinates, including those without scheduled service
		if (dl == detailLevel.stops || dl == detailLevel.full){
			BigDecimal unschedStopLat2 = new BigDecimal(44.3456);
			BigDecimal unschedStopLon2 = new BigDecimal(-74.3456);
			
			LocationStructure unschedStopLocation = new LocationStructure();
			unschedStopLocation.setLongitude(unschedStopLon2);
			unschedStopLocation.setLatitude(unschedStopLat2);
			NaturalLanguageStringStructure unschedStopName = new NaturalLanguageStringStructure();
			unschedStopName.setValue("stop with no currently scheduled service");
			
			StopPointRefStructure spr3 = new StopPointRefStructure();
			spr3.setValue("Agency_5678");
			
			StopPointInPatternStructure pointInPattern3 = new StopPointInPatternStructure();
			pointInPattern3.getStopName().add(unschedStopName);
			pointInPattern3.setLocation(unschedStopLocation);
			pointInPattern3.setStopPointRef(spr3);
			pointInPattern3.setOrder(BigInteger.valueOf(3));
			//
			
			ExtensionsStructure scheduledExtension = new ExtensionsStructure();
			Scheduled scheduled = new Scheduled();
			scheduled.set(false);
			
			//scheduledExtension.setAny(scheduled);
			pointInPattern3.setExtensions(scheduledExtension );
			stopsInPattern.getStopPointInPattern().add(pointInPattern3);
		}
		// full returns each distinct pattern (see /siri-20-java/examples/siri_exu_discovery/exd_lines_discoveryResponse.xml)
		// as well as other lines that stop at the stops in question
		// full is TBD and unexpected at this time
		
		rds.setJourneyPatterns(patterns);
		pattern.setStopsInPattern(stopsInPattern );
		patterns.getJourneyPattern().add(pattern);
		rds.setDirectionRef(direction1);
		lds.getAnnotatedLineRef().add(l1);
		
		return lds;
	}

}

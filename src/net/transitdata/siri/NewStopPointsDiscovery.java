package net.transitdata.siri;

import java.math.*;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import uk.org.siri.siri.*;
import uk.org.siri.siri.AnnotatedStopPointStructure.Lines;

public class NewStopPointsDiscovery {

	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//NOTE need a way to exclude lines that are not currently served. URL param? 
		
		NewStopPointsDiscovery nspd = new NewStopPointsDiscovery();
		
		Util ut = new Util();
				
		
		StopPointsDeliveryStructure spds = nspd.getStopPointsRequest();
		Siri siri = new Siri();
		
		siri.setStopPointsDelivery(spds);
		
		String xml = ut.getXMLFromObject(siri, true);
		//String json = ut.getJSONFromObject(siri, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	
	private StopPointsDeliveryStructure getStopPointsRequest(){
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e1) {
			e1.printStackTrace();
		}
		

		StopPointsDeliveryStructure spds = new StopPointsDeliveryStructure();
		
		NaturalLanguageStringStructure stopName = new NaturalLanguageStringStructure();
		stopName.setValue("Stop A");
		
		DirectionRefStructure direction0 = new DirectionRefStructure();
		direction0.setValue("0");
		
		DirectionRefStructure direction1 = new DirectionRefStructure();
		direction1.setValue("1");
		
		LineRefStructure line1 = new LineRefStructure();
		line1.setValue("Agency_1");
		LineDirectionStructure  lineDirStruct1 = new LineDirectionStructure();
		lineDirStruct1.setDirectionRef(direction0);
		lineDirStruct1.setLineRef(line1);
		
		
		LineRefStructure line2 = new LineRefStructure();
		line2.setValue("Agency_2");
		LineDirectionStructure lineDirStruct2 = new LineDirectionStructure();
		lineDirStruct2.setDirectionRef(direction1);
		lineDirStruct2.setLineRef(line2);
		
		Lines lines = new Lines();
		lines.getLineRefOrLineDirection().add(lineDirStruct1);
		lines.getLineRefOrLineDirection().add(lineDirStruct2);
		
		BigDecimal stopLat = new BigDecimal(44.12345);
		BigDecimal stopLon = new BigDecimal(-74.12345);
		
		LocationStructure location = new LocationStructure();
		location.setLongitude(stopLon);
		location.setLatitude(stopLat);
		
		
		AnnotatedStopPointStructure asps = new AnnotatedStopPointStructure();
		
		
		StopPointRefStructure spr = new StopPointRefStructure();
		spr.setValue("Agency_1234");
		
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		XMLGregorianCalendar nowTime = df.newXMLGregorianCalendar(gregorianCalendar);
		
		// minimum: "Return only the name and identifier of the stop"
		spds.setResponseTimestamp(nowTime);
		asps.getStopName().add(stopName);
		
		// normal: "Return name, identifier and coordinates of the stop."
		asps.setLocation(location);
		asps.setLines(lines);
		asps.setMonitored(true);
		
		// full : "Return all available data for each stop."
		// not relevant?
		
		
		asps.setStopPointRef(spr);
		spds.getAnnotatedStopPointRef().add(asps);
		return spds;
	}
}

// demonstration class to create a StopMonitoringResponse 
package net.transitdata.siri;

import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import uk.org.siri.siri.*;
import uk.org.siri.siri.VehicleActivityStructure.MonitoredVehicleJourney;

public class NewStopMonitoring {
	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewStopMonitoring nsm = new NewStopMonitoring();
		Util ut = new Util();
		
		StopMonitoringDeliveryStructure sm = nsm.getStopMonitoring();
		String xml = ut.getXMLFromObject(sm, true);
		String json = ut.getJSONFromObject(sm, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	
	public StopMonitoringDeliveryStructure getStopMonitoring(){
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e1) {
			e1.printStackTrace();
		}
		
		StopMonitoringDeliveryStructure smds = new StopMonitoringDeliveryStructure();
		MonitoredStopVisitStructure msv = new MonitoredStopVisitStructure();
		MonitoredVehicleJourneyStructure mvj = new MonitoredVehicleJourneyStructure();
		
		
		LineRefStructure line = new LineRefStructure();		
		line.setValue("Line123");
		
		DirectionRefStructure dr = new DirectionRefStructure();
		dr.setValue("0");
		
		//Dated vehicle journey aka trip_id
		String dvj = new String("trip_12345");
		
		DataFrameRefStructure dfr = new DataFrameRefStructure();
		dfr.setValue("2014-05-14");
				
		FramedVehicleJourneyRefStructure fvj = new FramedVehicleJourneyRefStructure();
		fvj.setDatedVehicleJourneyRef(dvj);
		fvj.setDataFrameRef(dfr);
		
		NaturalLanguageStringStructure pln = new NaturalLanguageStringStructure();
		pln.setValue("Line1");
		
		OperatorRefStructure opref = new OperatorRefStructure();
		opref.setValue("OperatorA");
		
		JourneyPlaceRefStructure originref = new JourneyPlaceRefStructure();
		originref.setValue("StopA");
		
		JourneyPlaceRefStructure destref = new JourneyPlaceRefStructure();
		destref.setValue("StopZ");
		
		NaturalLanguageStringStructure destname = new NaturalLanguageStringStructure();
		destname.setValue("Stop Z");
		
		XMLGregorianCalendar nowTime = df.newXMLGregorianCalendar();
		mvj.setLocationRecordedAtTime(nowTime);
		msv.setRecordedAtTime(nowTime);
		
		
		// arrival time 1 minute from now.
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.add(GregorianCalendar.MINUTE, 1);
		XMLGregorianCalendar arrtime = df.newXMLGregorianCalendar(gregorianCalendar); 
		
		StopPointRefStructure stopref = new StopPointRefStructure();
		stopref.setValue("StopB");
		
		NaturalLanguageStringStructure stopname = new NaturalLanguageStringStructure();
		stopname.setValue("Stop B");
		
		MonitoredCallStructure mc = new MonitoredCallStructure();
		mc.getStopPointName().add(stopname);
		mc.setStopPointRef(stopref);
		mc.setExpectedArrivalTime(arrtime);
		
		mvj.setMonitored(true);
		mvj.setFramedVehicleJourneyRef(fvj);
		mvj.setMonitoredCall(mc);
		mvj.getDestinationName().add(destname);
		mvj.setOriginRef(originref);
		mvj.setOperatorRef(opref);
		mvj.getPublishedLineName().add(pln);
		mvj.setLineRef(line);
		mvj.setDirectionRef(dr);
		
		
		msv.setMonitoredVehicleJourney(mvj);
		
		smds.getMonitoredStopVisit().add(msv);
		
		return smds;
	}

}

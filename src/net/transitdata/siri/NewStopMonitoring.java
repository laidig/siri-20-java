// demonstration class to create a StopMonitoringResponse 
package net.transitdata.siri;

import java.math.BigInteger;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import uk.org.siri.siri.*;

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
		
		String detailLevel = new String();
		detailLevel = "calls";
		
		ServiceDelivery sm = nsm.getStopMonitoring(detailLevel);
		String xml = ut.getXMLFromObject(sm, true);
		String json = ut.getJSONFromObject(sm, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	
	public ServiceDelivery getStopMonitoring(String detailLevel){
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e1) {
			e1.printStackTrace();
		}
		
		ServiceDelivery sd = new ServiceDelivery();
		
		StopMonitoringDeliveryStructure smds = new StopMonitoringDeliveryStructure();
		MonitoredStopVisitStructure msv = new MonitoredStopVisitStructure();
		MonitoredVehicleJourneyStructure mvj = new MonitoredVehicleJourneyStructure();
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		XMLGregorianCalendar nowTime = df.newXMLGregorianCalendar(gregorianCalendar);
		
		MonitoredCallStructure mc = new MonitoredCallStructure();
		
		//STOP_ID
		StopPointRefStructure stoprefA = new StopPointRefStructure();
		stoprefA.setValue("OperatorA_1234");
		//STOP_NAME
		NaturalLanguageStringStructure stopnameA = new NaturalLanguageStringStructure();
		stopnameA.setValue("Stop A");

		StopPointRefStructure stoprefB = new StopPointRefStructure();
		stoprefB.setValue("OperatorA_1235");
		
		NaturalLanguageStringStructure stopnameB = new NaturalLanguageStringStructure();
		stopnameB.setValue("Stop B");
		
		//Arrival time 1 minute from now
		gregorianCalendar.add(GregorianCalendar.MINUTE, 1);
		XMLGregorianCalendar arrtime = df.newXMLGregorianCalendar(gregorianCalendar); 
		gregorianCalendar.add(GregorianCalendar.MINUTE, 1);
		XMLGregorianCalendar arrtime2 = df.newXMLGregorianCalendar(gregorianCalendar);
		
		//Route_ID
		LineRefStructure line = new LineRefStructure();		
		line.setValue("OperatorA_Line123");
		
		DirectionRefStructure dr = new DirectionRefStructure();
		dr.setValue("0");
		
		//Dated vehicle journey aka trip_id
		String dvj = new String("OperatorA_trip_12345");
		
		DataFrameRefStructure dfr = new DataFrameRefStructure();
		dfr.setValue("2014-05-14");
				
		//FramedVehicleJourneyRefStructure Trip ID and date that it corresponds to
		FramedVehicleJourneyRefStructure fvj = new FramedVehicleJourneyRefStructure();
		fvj.setDatedVehicleJourneyRef(dvj);
		fvj.setDataFrameRef(dfr);
		
		//SHAPE_ID
		JourneyPatternRefStructure jprs = new JourneyPatternRefStructure();
		jprs.setValue("Shape_5678");
		
		//ROUTE_SHORT_NAME
		NaturalLanguageStringStructure pln = new NaturalLanguageStringStructure();
		pln.setValue("Line1");
		
		//AGENCY_ID
		OperatorRefStructure opref = new OperatorRefStructure();
		opref.setValue("OperatorA");
		
		JourneyPlaceRefStructure originref = new JourneyPlaceRefStructure();
		originref.setValue("StopA");
		
		JourneyPlaceRefStructure destref = new JourneyPlaceRefStructure();
		destref.setValue("StopZ");
		
		NaturalLanguageStringStructure destname = new NaturalLanguageStringStructure();
		destname.setValue("Stop Z");
		
		//Presentable Distance
		NaturalLanguageStringStructure approaching = new NaturalLanguageStringStructure();
		approaching.setValue("Approaching");
		
		NaturalLanguageStringStructure oneStopAway = new NaturalLanguageStringStructure();
		oneStopAway.setValue("1 Stop Away");
		
		mvj.setLocationRecordedAtTime(nowTime);
		msv.setRecordedAtTime(nowTime);
		
		//minimum
		
		mc.setNumberOfStopsAway(BigInteger.ZERO);
		mc.setExpectedArrivalTime(arrtime);
		mc.setArrivalProximityText(approaching);
		mc.setDistanceFromStop(BigInteger.valueOf(200));
		mvj.getPublishedLineName().add(pln);
		mvj.getDestinationName().add(destname);
		mvj.setMonitored(true);

		
		//basic
		if (detailLevel =="basic" || detailLevel =="normal" || detailLevel == "calls"){
			mc.setStopPointRef(stoprefA);
			
		mvj.setFramedVehicleJourneyRef(fvj);
		mvj.setDirectionRef(dr);
		mvj.setOperatorRef(opref);
		mvj.setLineRef(line);
		mvj.setProgressRate(ProgressRateEnumeration.NORMAL_PROGRESS);
		
		}
		
		//normal
		if (detailLevel =="normal" || detailLevel == "calls"){
		mc.getStopPointName().add(stopnameA);
		mvj.setOriginRef(originref);
		mvj.setJourneyPatternRef(jprs);
		}
		
		//calls
		if (detailLevel == "calls"){
		OnwardCallsStructure ocs = new OnwardCallsStructure();
		OnwardCallStructure oc = new OnwardCallStructure();
		 	
		oc.setAimedArrivalTime(arrtime2);
		oc.setDistanceFromStop(BigInteger.valueOf(400));
		oc.setStopPointRef(stoprefB);
		oc.getStopPointName().add(stopnameB);
		oc.setVisitNumber(BigInteger.valueOf(1));

		oc.setArrivalProximityText(oneStopAway);
		oc.setNumberOfStopsAway(BigInteger.ONE);
		
		ocs.getOnwardCall().add(oc);
		mvj.setOnwardCalls(ocs);
		}
		// set it all up
		mvj.setMonitoredCall(mc);
		msv.setMonitoredVehicleJourney(mvj);
		
		smds.getMonitoredStopVisit().add(msv);
		smds.setResponseTimestamp(nowTime);
		
		sd.setResponseTimestamp(nowTime);
		sd.getStopMonitoringDelivery().add(smds);
		
		return sd;
	}

}

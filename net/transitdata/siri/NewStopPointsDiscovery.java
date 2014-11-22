package net.transitdata.siri;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import uk.org.siri.siri.*;

public class NewStopPointsDiscovery {

	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopPointsDiscoveryRequestStructure spdrs = new StopPointsDiscoveryRequestStructure();
		Util ut = new Util();
		
		StopPointsDeliveryStructure sm = spdrs.getStopPointsDetailLevel();
		String xml = ut.getXMLFromObject(sm, true);
		String json = ut.getJSONFromObject(sm, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	
	private StopPointsDeliveryStructure getStopPointsRequest(){
		StopPointsDeliveryStructure spds = new StopPointsDeliveryStructure();
		
		return spds;
	}
}

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
		NewStopMonitoring nsm = new NewStopMonitoring();
		Util ut = new Util();
		
		StopMonitoringDeliveryStructure sm = nsm.getStopMonitoring();
		String xml = ut.getXMLFromObject(sm, true);
		String json = ut.getJSONFromObject(sm, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	
}

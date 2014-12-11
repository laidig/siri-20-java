package net.transitdata.siri;

import java.math.*;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import uk.org.siri.siri.*;

public class NewLinesRequest {
	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewLinesRequest nlr = new NewLinesRequest();
		
		Util ut = new Util();
				
		
		LinesDeliveryStructure lds = nlr.getLinesDdlivery();
		Siri siri = new Siri();
		
		siri.setLinesDelivery(lds);
		
		String xml = ut.getXMLFromObject(siri, true);
		//String json = ut.getJSONFromObject(siri, true);
		
		System.out.println("XML:\n" + xml );
		//System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	
	private LinesDeliveryStructure getLinesDdlivery() {
		LinesDeliveryStructure lds = new LinesDeliveryStructure();
		 

		

		
		return lds;
	}

}

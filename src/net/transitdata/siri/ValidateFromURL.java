package net.transitdata.siri;

import java.io.IOException;

import uk.org.siri.siri.Siri;

public class ValidateFromURL {
	public static void main(String[] args) {
		final String URL = "";
		
		Util ut = new Util();

		String xml;
		try {
			xml = ut.getStringFromURL(URL);
			ut.validateXML(xml);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}

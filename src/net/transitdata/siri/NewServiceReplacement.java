package net.transitdata.siri;

import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import eu.datex2.schema._2_0rc1._2_0.Situation;

import uk.org.siri.siri.AffectedVehicleJourneyStructure;
import uk.org.siri.siri.AffectsScopeStructure;
import uk.org.siri.siri.AffectsScopeStructure.VehicleJourneys;
import uk.org.siri.siri.FramedVehicleJourneyRefStructure;
import uk.org.siri.siri.PtSituationElementStructure;
import uk.org.siri.siri.ServiceConditionEnumeration;
import uk.org.siri.siri.ServiceDelivery;
import uk.org.siri.siri.Siri;
import uk.org.siri.siri.SituationExchangeDeliveriesStructure;
import uk.org.siri.siri.SituationExchangeDeliveryStructure;
import uk.org.siri.siri.SituationExchangeDeliveryStructure.Situations;

public class NewServiceReplacement {
	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewServiceReplacement nsr = new NewServiceReplacement();
		Util ut = new Util();
		

		Siri sed = nsr.getSituations();
		String xml = ut.getXMLFromObject(sed, true);
		System.out.println("XML:\n" + xml );
		
//		String json = ut.getJSONFromObject(sed, true);
//		System.out.println("JSON:\n" + json);
		ut.validateXML(xml);

	}
	private Siri getSituations(){
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e1) {
			e1.printStackTrace();
		}
		
		SituationExchangeDeliveryStructure sed = new SituationExchangeDeliveryStructure();
		
		
		
		AffectsScopeStructure ass = new AffectsScopeStructure();
		VehicleJourneys cancelledAndReplacementJourneys = new VehicleJourneys();
		AffectedVehicleJourneyStructure cancelledAffectedJourney = new AffectedVehicleJourneyStructure();
		
		FramedVehicleJourneyRefStructure trip1 = new FramedVehicleJourneyRefStructure();
		trip1.setDatedVehicleJourneyRef("Trip1");
		cancelledAffectedJourney.setFramedVehicleJourneyRef(trip1);
		
		cancelledAffectedJourney.getJourneyCondition().add(ServiceConditionEnumeration.CANCELLED);
		cancelledAndReplacementJourneys.getAffectedVehicleJourney().add(cancelledAffectedJourney);
				
				
		AffectedVehicleJourneyStructure replacementAffectedJourney = new AffectedVehicleJourneyStructure();
		FramedVehicleJourneyRefStructure trip2 = new FramedVehicleJourneyRefStructure();
		trip2.setDatedVehicleJourneyRef("Trip2");
		
		replacementAffectedJourney.setFramedVehicleJourneyRef(trip2);
		replacementAffectedJourney.getJourneyCondition().add(ServiceConditionEnumeration.REPLACEMENT_SERVICE);
		cancelledAndReplacementJourneys.getAffectedVehicleJourney().add(replacementAffectedJourney);
		
		ass.setVehicleJourneys(cancelledAndReplacementJourneys);
		
		PtSituationElementStructure ptse = new PtSituationElementStructure();
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		XMLGregorianCalendar nowTime = df.newXMLGregorianCalendar(gregorianCalendar);
		
		ptse.setCreationTime(nowTime);
		ptse.setAffects(ass);
		
		Situations situations = new Situations();
		
		situations.getPtSituationElement().add(ptse);
		
		try{
		sed.setSituations(situations);
		}
		catch  (Exception e1){
			e1.printStackTrace();
		}
		
		ServiceDelivery sd = new ServiceDelivery();
		sd.getSituationExchangeDelivery().add(sed);
		
		Siri siri = new Siri();
		siri.setServiceDelivery(sd);
		return siri;
	}
}

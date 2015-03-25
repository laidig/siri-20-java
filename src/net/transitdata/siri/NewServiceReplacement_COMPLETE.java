package net.transitdata.siri;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import eu.datex2.schema._2_0rc1._2_0.InformationStatusEnum;
import eu.datex2.schema._2_0rc1._2_0.Location;
import eu.datex2.schema._2_0rc1._2_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._2_0rc1._2_0.Situation;
import eu.datex2.schema._2_0rc1._2_0.SourceTypeEnum;

import uk.org.siri.siri.AffectedRouteStructure;
import uk.org.siri.siri.AffectedStopPointStructure;
import uk.org.siri.siri.AffectedVehicleJourneyStructure;
import uk.org.siri.siri.AffectsScopeStructure;
import uk.org.siri.siri.AffectsScopeStructure.VehicleJourneys;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.DefaultedTextStructure;
import uk.org.siri.siri.DestinationRefStructure;
import uk.org.siri.siri.DestinationStructure;
import uk.org.siri.siri.EntryQualifierStructure;
import uk.org.siri.siri.EnvironmentReasonEnumeration;
import uk.org.siri.siri.FramedVehicleJourneyRefStructure;
import uk.org.siri.siri.HalfOpenTimestampOutputRangeStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.PtSituationElementStructure;
import uk.org.siri.siri.RouteRefStructure;
import uk.org.siri.siri.ServiceConditionEnumeration;
import uk.org.siri.siri.ServiceDelivery;
import uk.org.siri.siri.SeverityEnumeration;
import uk.org.siri.siri.Siri;
import uk.org.siri.siri.SituationExchangeDeliveriesStructure;
import uk.org.siri.siri.SituationExchangeDeliveryStructure;
import uk.org.siri.siri.SituationSourceTypeEnumeration;
import uk.org.siri.siri.SituationExchangeDeliveryStructure.Situations;
import uk.org.siri.siri.SituationSourceStructure;
import uk.org.siri.siri.ZoneRefStructure;

public class NewServiceReplacement_COMPLETE {
	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewServiceReplacement_COMPLETE nsr = new NewServiceReplacement_COMPLETE();
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
		AffectsScopeStructure ass2 = new AffectsScopeStructure();
		VehicleJourneys cancelledandReplacementJourneys = new VehicleJourneys();

		AffectedVehicleJourneyStructure cancelledAffectedJourney = new AffectedVehicleJourneyStructure();
		
		DataFrameRefStructure dfrs = new DataFrameRefStructure();
		dfrs.setValue("Never");
		
		AffectedRouteStructure ars = new AffectedRouteStructure();
		RouteRefStructure routeRef = new RouteRefStructure();
		routeRef.setValue("Route1");
		ars.setRouteRef(routeRef);
		
	
		ZoneRefStructure zone = new ZoneRefStructure();
		zone.setValue("AGalaxyFarFarAway");
		
		AffectedStopPointStructure destinationref = new AffectedStopPointStructure();
		destinationref.setPlaceRef(zone);
		
		
		FramedVehicleJourneyRefStructure trip1 = new FramedVehicleJourneyRefStructure();
		trip1.setDatedVehicleJourneyRef("Trip1");
		trip1.setDataFrameRef(dfrs);
		
		
		cancelledAffectedJourney.setFramedVehicleJourneyRef(trip1);
		cancelledAffectedJourney.getDestinations().add(destinationref);
		cancelledAffectedJourney.getRoute().add(ars);
		cancelledAffectedJourney.getJourneyCondition().add(ServiceConditionEnumeration.CANCELLED);
		cancelledandReplacementJourneys.getAffectedVehicleJourney().add(cancelledAffectedJourney);
				
				
		AffectedVehicleJourneyStructure replacementAffectedJourney = new AffectedVehicleJourneyStructure();
		FramedVehicleJourneyRefStructure trip2 = new FramedVehicleJourneyRefStructure();
		trip2.setDatedVehicleJourneyRef("Trip2");
		trip2.setDataFrameRef(dfrs);
		
		replacementAffectedJourney.setFramedVehicleJourneyRef(trip2);
		replacementAffectedJourney.getDestinations().add(destinationref);
		replacementAffectedJourney.getRoute().add(ars);
		replacementAffectedJourney.getJourneyCondition().add(ServiceConditionEnumeration.REPLACEMENT_SERVICE);
		cancelledandReplacementJourneys.getAffectedVehicleJourney().add(replacementAffectedJourney);

		
		ass.setVehicleJourneys(cancelledandReplacementJourneys);
		
		PtSituationElementStructure ptse = new PtSituationElementStructure();
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		XMLGregorianCalendar nowTime = df.newXMLGregorianCalendar(gregorianCalendar);
		
		SituationSourceStructure source = new SituationSourceStructure();
		source.setSourceType(SituationSourceTypeEnumeration.FEED);
		source.setSourceMethod(SourceTypeEnum.PUBLIC_AND_PRIVATE_UTILITIES);
		
		HalfOpenTimestampOutputRangeStructure validityPeriod = new HalfOpenTimestampOutputRangeStructure();
		validityPeriod.setStartTime(nowTime);
		
		ptse.setCreationTime(nowTime);
		ptse.setAffects(ass);
		ptse.setReality(InformationStatusEnum.TEST);
		ptse.setSource(source);
		ptse.setLikelihood(ProbabilityOfOccurrenceEnum.RISK_OF);
		ptse.setEnvironmentReason(EnvironmentReasonEnumeration.HEAVY_SNOW_FALL);
		
		EntryQualifierStructure one = new EntryQualifierStructure();
		one.setValue("Situation1");
		ptse.setSituationNumber(one);
		DefaultedTextStructure descripton = new DefaultedTextStructure();
		descripton.setValue("The biggest storm ever!");
		ptse.getDescription().add(descripton );
		ptse.getValidityPeriod().add(validityPeriod);
		
		Situations situations = new Situations();
		
		situations.getPtSituationElement().add(ptse);
		
		try{
		sed.setSituations(situations);
		sed.setResponseTimestamp(nowTime);
		}
		catch  (Exception e1){
			e1.printStackTrace();
		}
		
		ServiceDelivery sd = new ServiceDelivery();
		sd.getSituationExchangeDelivery().add(sed);
		sd.setResponseTimestamp(nowTime);

				
		Siri siri = new Siri();
		siri.setVersion("2.0m");
		siri.setServiceDelivery(sd);
		return siri;
	}
}

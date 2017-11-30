
package net.transitdata.siri;

import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;

import eu.datex2.schema._2_0rc1._2_0.Situation;

import uk.org.ifopt.acsb.MobilityEnumeration;
import uk.org.ifopt.acsb.SuitabilityEnumeration;
import uk.org.ifopt.acsb.SuitabilityStructure;
import uk.org.ifopt.acsb.UserNeedStructure;
import uk.org.ifopt.ifopt.PlaceEquipmentStructure;
import uk.org.siri.siri.*;
import uk.org.siri.siri.AffectsScopeStructure.VehicleJourneys;
import uk.org.siri.siri.SituationExchangeDeliveryStructure.Situations;

public class ElevatorStatusExample {
    JAXBContext jc;
    DatatypeFactory df = null;
    Schema schema = null;
    /**
     * @param args
     */

    public static void main(String[] args) {
        ElevatorStatusExample ese = new ElevatorStatusExample();
        Util ut = new Util();

        Siri sed = getSituations();
        String xml = ut.getXMLFromObject(sed, true);
        System.out.println("XML:\n" + xml);

        String json = ut.getJSONFromObject(sed, true);
        System.out.println("JSON:\n" + json);
        ut.validateXML(xml);

    }

    private static Siri getSituations(){
        try {
            df = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e1) {
            e1.printStackTrace();
        }

        SituationExchangeDeliveryStructure sed = new SituationExchangeDeliveryStructure();

        AffectsScopeStructure.StopPoints stopPoints = new AffectsScopeStructure.StopPoints();
        // This should match to a GTFS stop_id
        AffectedStopPointStructure stopPointRef = new AffectedStopPointStructure();
        StopPointRefStructure stop1 = new StopPointRefStructure();
        stop1.setValue("stop1");
        stopPointRef.setStopPointRef(stop1);


        SeverityEnumeration sev = SeverityEnumeration.SEVERE;

        UserNeedStructure userNeedStructure = new UserNeedStructure();
        userNeedStructure.setMobilityNeed(MobilityEnumeration.RESTRICTED_MOBILITY);

        SuitabilityStructure notSuitable = new SuitabilityStructure();
        notSuitable.setSuitable(SuitabilityEnumeration.NOT_SUITABLE);
        notSuitable.setUserNeed(userNeedStructure);

        AffectsScopeStructure ass = new AffectsScopeStructure();
        ass.setStopPoints(stopPoints);


        PtConsequencesStructure consequences = new PtConsequencesStructure();
        PtConsequenceStructure consequenceStructure = new PtConsequenceStructure();
        consequenceStructure.setAffects(ass);
        consequenceStructure.setSeverity(sev);

        DefaultedTextStructure description = new DefaultedTextStructure();
        description.setValue("Elevator at Stop 1 is out of service");

        PtSituationElementStructure ptse = new PtSituationElementStructure();
        ptse.setConsequences(consequences);

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
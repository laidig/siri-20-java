

========================



Changes to SIRI schema for WS-I WSDL Basic Profile compliance

   2012.07.25
     WSDL [FR]
	Requirement (BP2019): "The 'namespace' attribute is not specified in any contained soapbind:body, soapbind:header, soapbind::headerfault, soapbind:fault elements." 
	=> removal of all corresponding namespaces in Binding, on both Document WSDL

	Requirement (BP2417) : "Every QName in the WSDL document and its imports, that is referring to a schema component, uses the namespace defined in the targetNamespace attribute on the xs:schema element, or a namespace defined in the namespace attribute on an xs:import element within the xs:schema element."
	=> Change of siri:ErrorConditionElement and siri:ServiceDeliveryErrorConditionElement to siriWS:WSErrorConditionElement and siriWS:WSServiceDeliveryErrorConditionElement
	Addition of siriWS:WSErrorConditionElement and siriWS:WSServiceDeliveryErrorConditionElement in  siri_wsProducer-Framework.xsd
	
	Addition of a SIRI WSDL 2.0 (automaticcaly produced, with a little additional hand cleaning, by Altova XMLSpy) => siri_wsProducer-WSDL2.wsdl and siri_wsConsumer-WSDL2.wsdl


 
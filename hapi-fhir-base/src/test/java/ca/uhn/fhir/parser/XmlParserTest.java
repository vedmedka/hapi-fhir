package ca.uhn.fhir.parser;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import ca.uhn.fhir.context.ConfigurationException;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.resource.Observation;

public class XmlParserTest {

	@Test
	public void testLoadObservation() throws ConfigurationException, DataFormatException, IOException {
		
		FhirContext ctx = new FhirContext(Observation.class);
		XmlParser p = new XmlParser(ctx);
		
		IResource resource = p.parseResource(IOUtils.toString(XmlParserTest.class.getResourceAsStream("/observation-example-eeg.xml")));
		
		System.out.println(resource);
		
	}
	
}
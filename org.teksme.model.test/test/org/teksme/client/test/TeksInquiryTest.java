package org.teksme.client.test;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import org.teksme.model.teks.Campaign;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class TeksInquiryTest {

	private static final String APPID = "6152376517";
	private static final String ACCOUNTID = "8392748729";
	private static final String MODEL_FILE = "output/teks.xml";
	private static ResourceSet resourceSet = null;

	@BeforeClass
	public static void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

	}

	@Test
	public void testInquiryCreation() throws IOException {

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks eduTeks = factory.createTeks();
		eduTeks.setAppId(APPID);
		eduTeks.setAccountID(ACCOUNTID);

		Campaign campaign = factory.createCampaign();
		campaign.setId(UUID.randomUUID().toString());

		Inquiry checkInRequest = factory.createInquiry();
		checkInRequest.setAuthor("Ministry of Education");
		checkInRequest.setLastModified(new Date());
		checkInRequest.setTitle("Time and attendance system");

		FreeText employeeId = factory.createFreeText();
		employeeId.setQuestion("Please enter your Employee ID Number");
		employeeId.setAutoKeyword(false);
		employeeId.setInquiryRef(checkInRequest);
		employeeId.setMandatory(true);
		employeeId.setKeyword("");

		checkInRequest.setChoice(0, employeeId);

		FreeText numMaleStudents = factory.createFreeText();
		numMaleStudents.setQuestion("Number of male students in the classroom");
		numMaleStudents.setAutoKeyword(false);
		numMaleStudents.setInquiryRef(checkInRequest);
		numMaleStudents.setMandatory(true);
		numMaleStudents.setKeyword("");

		checkInRequest.setChoice(1, numMaleStudents);

		FreeText numFemaleStudents = factory.createFreeText();
		numFemaleStudents
				.setQuestion("Number of female students in the classroom");
		numFemaleStudents.setAutoKeyword(false);
		numFemaleStudents.setInquiryRef(checkInRequest);
		numFemaleStudents.setMandatory(true);
		numFemaleStudents.setKeyword("");

		checkInRequest.setChoice(2, numFemaleStudents);

		campaign.setInstance(checkInRequest);

		eduTeks.setCampaign(campaign);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(eduTeks);
		// serialize resource Ð you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);

	}

}

package org.teksme.client.test.model;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Answer;
import org.teksme.model.teks.Developer;
import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreateMultipleChoicePollTest extends TeksModelTest {

	private static final String APPID = "128552450490126";
	private static final String DEVELOPER_PROFILE_ID = "56f3d45cb6f14af22fee33245bf53b8e";
	private static final String MODEL_FILE = "output/multiple_choice_teks.xml";

	@Test
	public void testCompositePollCreation() throws IOException {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks eduTeks = factory.createTeks();
		eduTeks.setAppId(APPID);

		Developer developerProfile = factory.createDeveloper();
		developerProfile.setId(DEVELOPER_PROFILE_ID);

		eduTeks.setDeveloper(developerProfile);

		Poll poll = factory.createPoll();
		poll.setAuthor("Fabiano Cruz");
		poll.setLastModified(new Date());
		poll.setId(UUID.randomUUID().toString());

		MultipleChoice question = factory.createMultipleChoice();
		question.setQuestion("Which media helped establish mass marketing because they could target segments of the audience rather than geographic areas of distribution");
		question.setRequired(true);
		question.setPollRef(poll);

		Keyword key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1120");

		Answer firstAnswer = factory.createAnswer();
		firstAnswer.setText("magazines and radio");
		firstAnswer.setKeyword(key);
		firstAnswer.setQuestionRef(question);

		key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1121");

		Answer secondAnswer = factory.createAnswer();
		secondAnswer.setText("radio and newspapers");
		secondAnswer.setKeyword(key);
		secondAnswer.setQuestionRef(question);

		key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1122");

		Answer thirdAnswer = factory.createAnswer();
		thirdAnswer.setText("newspapers and radio");
		thirdAnswer.setKeyword(key);
		thirdAnswer.setQuestionRef(question);

		key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1123");

		Answer fourthAnswer = factory.createAnswer();
		fourthAnswer.setText("newspapers and television");
		fourthAnswer.setKeyword(key);
		fourthAnswer.setQuestionRef(question);

		question.setAnswer(0, firstAnswer);
		question.setAnswer(1, secondAnswer);
		question.setAnswer(2, thirdAnswer);
		question.setAnswer(3, fourthAnswer);

		eduTeks.setPoll(poll);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(eduTeks);
		// serialize resource Ð you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);

	}

}

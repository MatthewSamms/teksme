/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.client.test.model;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Answer;
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
		// firstAnswer.setId("12398719");

		key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1121");

		Answer secondAnswer = factory.createAnswer();
		secondAnswer.setText("radio and newspapers");
		secondAnswer.setKeyword(key);
		secondAnswer.setQuestionRef(question);
		// secondAnswer.setId("12568719");

		key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1122");

		Answer thirdAnswer = factory.createAnswer();
		thirdAnswer.setText("newspapers and radio");
		thirdAnswer.setKeyword(key);
		thirdAnswer.setQuestionRef(question);
		// thirdAnswer.setId("12568979");

		key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("1123");

		Answer fourthAnswer = factory.createAnswer();
		fourthAnswer.setText("newspapers and television");
		fourthAnswer.setKeyword(key);
		fourthAnswer.setQuestionRef(question);
		// fourthAnswer.setId("45668979");

		question.setAnswer(0, firstAnswer);
		question.setAnswer(1, secondAnswer);
		question.setAnswer(2, thirdAnswer);
		question.setAnswer(3, fourthAnswer);

		eduTeks.setPoll(poll);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(eduTeks);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);

	}

}

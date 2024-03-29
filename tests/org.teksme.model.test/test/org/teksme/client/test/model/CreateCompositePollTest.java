/*
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version
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
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreateCompositePollTest extends TeksModelTest {

	private static final String DEVELOPER_PROFILE_ID = "o318947871972892719jiasjs8198";
	private static final String MODEL_FILE = "output/teks.xml";

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

		Keyword key = factory.createKeyword();
		key.setAutoKeyword(false);
		key.setKey("CHECKIN");

		FreeText employeeId = factory.createFreeText();
		employeeId.setQuestion("Please enter your Employee ID Number");
		employeeId.setRequired(true);
		employeeId.setPollRef(poll);
		employeeId.setKeyword(key);

		FreeText numMaleStudents = factory.createFreeText();
		numMaleStudents.setQuestion("Number of male students in the classroom");
		numMaleStudents.setRequired(true);
		numMaleStudents.setPollRef(poll);

		FreeText numFemaleStudents = factory.createFreeText();
		numFemaleStudents
				.setQuestion("Number of female students in the classroom");
		numFemaleStudents.setRequired(true);
		numFemaleStudents.setPollRef(poll);

		poll.setQuestion(0, employeeId);
		poll.setQuestion(1, numMaleStudents);
		poll.setQuestion(2, numFemaleStudents);

		eduTeks.setPoll(poll);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(eduTeks);
		// serialize resource � you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);

	}

}

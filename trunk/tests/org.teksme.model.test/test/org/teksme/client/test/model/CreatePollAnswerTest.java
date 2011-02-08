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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.User;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreatePollAnswerTest extends TeksModelTest {

	private static final String MODEL_FILE = "output/teks_user.xml";

	@Test
	public void createOutboundMsg() {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();

		User newUser = factory.createUser();
		newUser.setFirstName("Pat");
		newUser.setLastName("Adams");
		newUser.setEmail("pat@painting.com");
		newUser.setGender("male");
		newUser.setCountry("USA");
		newUser.setYearOfBirth(1928);

		teksModel.setAccount(newUser);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(teksModel);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

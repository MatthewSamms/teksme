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
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Application;
import org.teksme.model.teks.Profile;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.User;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.common.utils.Utils;

public class CreateAccountTest extends TeksModelTest {

	private static final String MODEL_FILE = "output/teks_user.xml";

	@Test
	public void createOutboundMsg() throws NoSuchAlgorithmException {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();

		User newUser = factory.createUser();
		newUser.setFirstName("Pat");
		newUser.setLastName("Adams");
		newUser.setMobileNumber("+12026451324");
		newUser.setEmail("pat@painting.com");
		newUser.setPassword(Utils.makeSHA1Hash("teksme"));
		newUser.setCountry("USA");
		newUser.setYearOfBirth(1928);
		newUser.setCompany("Inter-American Development Bank");
		newUser.setWebsiteURL("http://www.iadb.org");

		Application app = factory.createApplication();
		app.setCallbackURL("http://localhost:8080/callback");
		app.setDescription("Simple application using TeksMe");
		app.setKey("675hvkhmkp5sd5v7yd6cp3uj");
		app.setName("WaWaRed");
		app.setRateLimits(50000);
		app.setRegistered(new Date());
		app.setSharedSecret("6BU4893qXN");
		app.setStatus("active");
		
		Profile profile = factory.createProfile();
		
		app.setProfileRef(profile);
		profile.setApplication(0, app);
		
		newUser.setProfile(profile);

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

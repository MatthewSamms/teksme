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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class ReadCompositePollTest {

	private static final String MODEL_FILE = "output/teks_outmsg.xml";

	@Test
	public void readModel() throws IOException {

		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		// load resource
		Resource res = resourceSet.getResource(URI.createURI(MODEL_FILE), true);

		Teks eduTeks = (Teks) res.getContents().get(0);

		System.out.println(eduTeks.toString());

	}
}

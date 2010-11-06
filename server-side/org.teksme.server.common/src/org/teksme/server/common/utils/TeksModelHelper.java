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

package org.teksme.server.common.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class TeksModelHelper {

	public static TeksModelHelper INSTANCE = TeksModelHelper.init();

	Logger logger = Logger.getLogger(TeksModelHelper.class.getName());

	private TeksModelHelper() { }

	private static TeksModelHelper init() {
		if (INSTANCE == null) {
			INSTANCE = new TeksModelHelper();
		}
		return INSTANCE;
	}

	public Teks createTeksModelFromXml(String xmlInput) throws IOException {

		// logger.info("XML: " + xmlInput);

		InputStream is = new ByteArrayInputStream(xmlInput.getBytes("ASCII"));

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new TeksResourceFactoryImpl());

		TeksPackageImpl.init();

		XMLResourceImpl load_resource = (XMLResourceImpl) resourceSet.createResource(URI.createURI("*.xml"));
		load_resource.load(is, null);

		Teks teksObj = (Teks) load_resource.getContents().get(0);
		
		return teksObj;

	}

}

package org.teksme.server.mail.parser;

import java.io.IOException;

import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;

public abstract class TeksBuilder {

	protected Teks teksModel = null;

	public Teks getTeksModel() {
		return teksModel;
	}

	public void createNewTeksModel() {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		teksModel = factory.createTeks();
	}

	public abstract void buildModelDoc() throws IOException;

	public abstract void buildModelHeader() throws IOException;

	public abstract void buildModelBody() throws IOException;

}

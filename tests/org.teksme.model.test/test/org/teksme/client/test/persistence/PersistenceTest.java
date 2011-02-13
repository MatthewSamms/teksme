package org.teksme.client.test.persistence;

import java.util.Properties;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.hibernate.cfg.Environment;
import org.junit.Before;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.model.teks.util.TeksResourceFactoryImpl;

public class PersistenceTest {

	static Properties props = new Properties();
	static final String dbName = "teksme";
	ResourceSet resourceSet = null;

	@Before
	public void setResourceSet() {
		// create resource set and resource
		resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new TeksResourceFactoryImpl());

		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "teksmeuser");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:8889/"
				+ dbName);
		props.setProperty(Environment.PASS, "teksme");
		props.setProperty(Environment.DIALECT,
				org.hibernate.dialect.MySQLInnoDBDialect.class.getName());

		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
				"REFRESH,PERSIST,MERGE");

		TeksPackageImpl.init();
	}

}

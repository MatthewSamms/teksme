package org.teksme.client.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.teksme.client.test.model.CreateCompositePollTest;
import org.teksme.client.test.model.ReadCompositePollTest;
import org.teksme.client.test.persistence.PersistCompositePollTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CreateCompositePollTest.class,
		ReadCompositePollTest.class, PersistCompositePollTest.class })
public class AllTests {

}

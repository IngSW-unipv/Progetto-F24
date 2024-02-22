package it.unipv.test.persistance;

import org.junit.Before;
import org.junit.Test;

import it.unipv.java.persistance.PersistanceFacade;

public class PersistanceFacadeTest {
	@Before
	public void init() {
		PersistanceFacade.getInstance();
	}
	@Test
	public void testInstanceCreation() {
		PersistanceFacade.getInstance().loginUser(null);
	}
}

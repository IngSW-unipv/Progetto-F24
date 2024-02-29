package it.unipv.test.persistance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.unipv.java.persistance.DaoFactory;

public class DaoFactoryTest {
	
	@Before
	public void initDaoFactory() {
		DaoFactory.getInstance();
	}

	@Test
	public void testDaoFactoryInstance() {
		Assert.assertNotNull("Istanza DaoFactory non creata!", DaoFactory.getInstance());
	}
	
	@Test
	public void test() {
		Assert.assertNotNull("Istanza DaoFactory non creata!", DaoFactory.getInstance());
	}
}

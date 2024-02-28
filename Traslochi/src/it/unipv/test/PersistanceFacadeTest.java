package it.unipv.test;
/*
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import it.unipv.java.model.RegisterData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.Cliente;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
*/
public class PersistanceFacadeTest {
/*
	public void PersistanceFacadeTest() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
	private User utenteDaLoggare;
	private User clienteDaLoggare;
	private User dipendenteDaLoggare;
	private User responsabileDaLoggare;
	private RegisterData clienteRegistrazione;
	private RegisterData dipendenteRegistrazione;
	private RegisterData responsabileRegistrazione;
	
	@Before
	public void init() {
		PersistanceFacade.getInstance();
		utenteDaLoggare.setNome("NomeProva");
		utenteDaLoggare.setCognome("CognomeProva");
		utenteDaLoggare.setCf("CFPROVA");
		utenteDaLoggare.setEmail("NomeProva.CognomeProva@qualcosa.com");
		utenteDaLoggare.setPassword("PasswordProva");
	}
	@Test
	public void testInstanceCreation() {
		assertNotNull("Istanza Creata", PersistanceFacade.getInstance());
	}
	@Test
	public void testRegisterUser() {
		assertTrue("Cliente Registrato", PersistanceFacade.getInstance().registerUser(clienteRegistrazione));
		assertTrue("Dipendente Registrato",PersistanceFacade.getInstance().registerUser(dipendenteRegistrazione));
		assertTrue("Responsabile Registrato",PersistanceFacade.getInstance().registerUser(responsabileRegistrazione));
		}
	/*
	@Test
	public void testLoginUser() {
		assertTrue("Cliente Creato", PersistanceFacade.getInstance().loginUser(clienteDaLoggare));
		assertNotNull("Cliente Loggato", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		SingleSessioneAttiva.getInstance().logout();
		assertNull("Cliente Logout", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		
		assertTrue("Dipendente Creato",PersistanceFacade.getInstance().loginUser(dipendenteDaLoggare));
		assertNotNull("Dipendente Loggato", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		SingleSessioneAttiva.getInstance().logout();
		assertNull("Dipendente Logout", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		
		assertTrue("Responsabile Creato",PersistanceFacade.getInstance().loginUser(responsabileDaLoggare));
		assertNotNull("Responsabile Loggato", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		SingleSessioneAttiva.getInstance().logout();
		assertNull("Responsabile Logout", SingleSessioneAttiva.getInstance().getUtenteAttivo());
	}
	
	@Ignore
	@Test
	public void testEliminaUser() {
		assertTrue("Cliente Creato", PersistanceFacade.getInstance().loginUser(clienteDaLoggare));
		assertNotNull("Cliente Loggato", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		SingleSessioneAttiva.getInstance().logout();
		assertNull("Cliente Logout", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		
		assertTrue("Dipendente Creato",PersistanceFacade.getInstance().loginUser(dipendenteDaLoggare));
		assertNotNull("Dipendente Loggato", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		SingleSessioneAttiva.getInstance().logout();
		assertNull("Dipendente Logout", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		
		assertTrue("Responsabile Creato",PersistanceFacade.getInstance().loginUser(responsabileDaLoggare));
		assertNotNull("Responsabile Loggato", SingleSessioneAttiva.getInstance().getUtenteAttivo());
		SingleSessioneAttiva.getInstance().logout();
		assertNull("Responsabile Logout", SingleSessioneAttiva.getInstance().getUtenteAttivo());
	}
*/
}

package it.unipv.test.persistance;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.persistance.PersistanceFacade;

public class UserTest {
	private UserModel utenteDaLoggare;
	private UserModel clienteDaLoggare;
	private UserModel dipendenteDaLoggare;
	private UserModel responsabileDaLoggare;
	private RegisterModel clienteRegistrazione;
	private RegisterModel dipendenteRegistrazione;
	private RegisterModel responsabileRegistrazione;
	
	@Before
	public void init() {
		PersistanceFacade.getInstance();
		utenteDaLoggare = new UserModel();
		utenteDaLoggare.setNome("NomeProva");
		utenteDaLoggare.setCognome("CognomeProva");
		utenteDaLoggare.setCf("CFPROVA");
		utenteDaLoggare.setEmail("NomeProva.CognomeProva@qualcosa.com");
		utenteDaLoggare.setPassword("PasswordProva");
		
		clienteDaLoggare = utenteDaLoggare;
		clienteDaLoggare.setUserType(UserType.CLIENTE);
		clienteDaLoggare.setId("IDPROVACLIENTE");
		
		dipendenteDaLoggare = utenteDaLoggare;
		dipendenteDaLoggare.setUserType(UserType.DIPENDENTE);
		dipendenteDaLoggare.setId("IDPROVADIPENDENTE");
		
		responsabileDaLoggare = utenteDaLoggare;
		responsabileDaLoggare.setUserType(UserType.RESPONSABILE);
		responsabileDaLoggare.setId("IDPROVARESPONSABILE");
		
		clienteRegistrazione = new RegisterModel(clienteDaLoggare);
		dipendenteRegistrazione = new RegisterModel(dipendenteDaLoggare);
		responsabileRegistrazione = new RegisterModel(responsabileDaLoggare);
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
}

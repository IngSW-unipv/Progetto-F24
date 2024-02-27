package it.unipv.test.persistance;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.TurnoData;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.persistance.dao.cliente.RdbClienteDao;
import it.unipv.java.persistance.dao.dipendente.RdbDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.RdbPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.RdbResponsabileDao;
import it.unipv.java.persistance.dao.turno.RdbTurnoDao;

public class QueryTest {
/*	private UserModel utenteDaLoggare;
	private UserModel clienteDaLoggare;
	private UserModel dipendenteDaLoggare;
	private UserModel responsabileDaLoggare;
	private RegisterModel clienteRegistrazione;
	private RegisterModel dipendenteRegistrazione;
	private RegisterModel responsabileRegistrazione;
	private PrenotazioneModel modelloPrenotazione;
	
	private RdbClienteDao rdbCliente;
	private RdbResponsabileDao rdbResponsabile;
	private RdbDipendenteDao rdbDipendente;
	private RdbTurnoDao rdbTurno;
	private RdbPrenotazioneDao rdbPrenotazione;
	private TurnoModel turno;
	
	@Before
	public void init() {
		modelloPrenotazione = new PrenotazioneModel();
		modelloPrenotazione.setCVC("ProvaCVC");
		modelloPrenotazione.setDataConsegna("ProvaDataConsegna");
		modelloPrenotazione.setDataRitiro("ProvaDataRitiro");
		modelloPrenotazione.setIdCliente("ProvaIdCliente");
		modelloPrenotazione.setIdPrenotazione("ProvaIdPrenotazione");
		modelloPrenotazione.setIdResponsabile("ProvaIdResponsabile");
		modelloPrenotazione.setImportoPagato(0);
		modelloPrenotazione.setIndirizzoDiConsegna("ProvaIndirizzoDiConsegna");
		modelloPrenotazione.setIndirizzodiRitiro("ProvaIndirizzodiRitiro");
		modelloPrenotazione.setMetodoDiPagamento("ProvaMetodoDiPagamento");
		modelloPrenotazione.setScadAnno("ProvaScadAnno");
		modelloPrenotazione.setScadGiorno("ProvaScadGiorno");
		modelloPrenotazione.setScadMese("ProvaScadMese");
		modelloPrenotazione.setStatoPrenotazione("ProvaStatoPrenotazione");
		
		turno = new TurnoModel();
		turno.setOrarioini("OrarioProva");;
		turno.setIndLavoro("TurnoProva");
		turno.setIdDipendente("TurnoProva");
		
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
		
		rdbCliente = new RdbClienteDao();
		rdbResponsabile = new RdbResponsabileDao();
		rdbDipendente = new RdbDipendenteDao();
		rdbTurno = new RdbTurnoDao();
		rdbPrenotazione = new RdbPrenotazioneDao();
	}
	@Test
	public void testCreateQuery() {
		assertTrue("Cliente non registrato", rdbCliente.createCliente(clienteRegistrazione));
		assertTrue("Responsabile non registrato", rdbResponsabile.createResponsabile(responsabileRegistrazione));
		assertTrue("Dipendente non registrato", rdbDipendente.createDipendente(dipendenteRegistrazione));
		assertTrue("Turno non registrato", rdbTurno.createTurno(turno));
		assertTrue("Prenotazione non registrata", rdbPrenotazione.createPrenotazione(modelloPrenotazione));
	}
	@Ignore
	@Test
	public void testRegisterUser() {
				}
/*	
	@Ignore
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

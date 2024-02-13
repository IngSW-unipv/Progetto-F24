package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.model.user.UserTypeUtil;
import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.persistance.dao.dipendente.DipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.PrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.ResponsabileDao;
import it.unipv.java.persistance.dao.turno.TurnoDao;

 import java.util.List;
import java.util.Random;

public class DataAccessFacade {
	RegisterModel rm;
	LoginModel lm;
	private UserModel loggedInUser;
	private static DataAccessFacade instance;

	private DataAccessFacade() {
	}

	public static DataAccessFacade getInstance() {
		if (instance == null) {
			synchronized (DataAccessFacade.class) {
				if (instance == null) {
					instance = new DataAccessFacade();
				}
			}
		}
		return instance;
	}

	public RegisterModel getRm() {
		return rm;
	}

	public void setRm(RegisterModel rm) {
		this.rm = rm;
	}

	public LoginModel getLm() {
		return lm;
	}

	public void setLm(LoginModel lm) {
		this.lm = lm;
	}

	public String generateIdFromCf(String cf) {
		if (cf == null || cf.length() < 5) {
			throw new IllegalArgumentException("CF non valido");
		}
		String baseId = cf.substring(0, 5); // Estrae le prime 5 cifre dal CF
		Random random = new Random();
		int n1 = random.nextInt(8); // Primo numero tra 0 e 7
		int n2 = n1 + 1 + random.nextInt(8 - n1); // Secondo numero, maggiore di n1
		int n3 = n2 + 1 + random.nextInt(9 - n2); // Terzo numero, maggiore di n2
		return baseId + n1 + n2 + n3;
	}

	public boolean registerUser(RegisterModel rm) {

		DataAccessFacade ag = DataAccessFacade.getInstance();
		String id = ag.generateIdFromCf(rm.getUm().getCf());
		rm.getUm().setId(id);
		UserType userType = UserTypeUtil.determineUserType(rm.getUm());
		rm.getUm().setUserType(userType);
		boolean esito = false;
		switch (userType) {
		case DIPENDENTE:
			esito = new DipendenteDao().createDipendente(rm);
			break;
		case RESPONSABILE:
			esito = new ResponsabileDao().createResponsabile(rm);
			break;
		case CLIENTE:
			esito = new ClienteDao().createCliente(rm);
			break;
		}
		return esito;
	}

	public void setLoggedInUser(UserModel user) {
		this.loggedInUser = user;
	}

	public UserModel getLoggedInUser() {
		return this.loggedInUser;
	}

	public boolean loginUser(UserModel um) {
		UserType userType = UserTypeUtil.determineUserType(um);
		boolean loginSuccess = false;

		switch (userType) {
		case CLIENTE:
			UserModel user = new ClienteDao().getCliente(um);
			if (user != null) {
				DataAccessFacade.getInstance().setLoggedInUser(user);
			} else {
				// Gestione del caso in cui il login non ha successo
			}
			break;
		case DIPENDENTE:
			loginSuccess = new DipendenteDao().getDipendente(um);
			break;
		case RESPONSABILE:
			loginSuccess = new ResponsabileDao().getResponsabile(um);
			break;
		}

		return loginSuccess;
	}

	public boolean createPrenotazione(PrenotazioneModel p) {
		DataAccessFacade facade = DataAccessFacade.getInstance();

		UserModel loggedInUser = facade.getLoggedInUser();

		if (loggedInUser != null) {
			p.setIdCliente(loggedInUser.getId());

			boolean createSuccess = new PrenotazioneDao().createPrenotazione(p);

			if (createSuccess) {
				return true;
				// La prenotazione è stata creata con successo
				// restituisco al prenotazione model che poi restiuisce alla view tramite il
				// controller
			} else {
				return false;
				// La prenotazione è stata creata con successo
				// restituisco al prenotazione model che poi restiuisce alla view tramite il
				// controller
			}
		} else {
			return false;
			// Gestisci il caso in cui nessun utente è loggato
			// NON PUO ARRIVARCI A STA SCHERMATA SE NON è LOGGATO
		}
	}

	public boolean eliminazioneUser(UserModel us) {

		return new DipendenteDao().deleteDipendente(us);
	}

	public boolean getTurno(TurnoModel tm) {
		return new TurnoDao().createTurno(tm);
	}

	public boolean aggiungiTurno(TurnoModel tm) {
		return new TurnoDao().createTurno(tm);
	}

	public List<UserModel> mostraDipendenti() {

		return new DipendenteDao().getAllDipendenti();
	}

	public List<PrenotazioneModel> mostraPrenotazioni() {

		return new PrenotazioneDao().getAllPrenotazioni();
	}
	
	public List<PrenotazioneModel> getPrenotazioniUtente(UserModel um) {
		return new PrenotazioneDao().getPrenotazione(um);
	}

	public List<TurnoModel> mostraTurni() {
		return new TurnoDao().getAllTurni();

	}

	public boolean modificaProfilo(UserModel um) {
		UserType userType = UserTypeUtil.determineUserType(um);
		
		switch (userType) {
		case CLIENTE:
			return new ClienteDao().updateCliente(um); 
			
		case DIPENDENTE:
			return   new DipendenteDao().updateDipendente(um);
 		 
		}

		return false ;
		  

	}

	public boolean visualizzaProfilo(UserModel um) {
		UserType userType = UserTypeUtil.determineUserType(um);
		
		switch (userType) {
		case CLIENTE:
			return new ClienteDao().getCliente(um); 
			
		case DIPENDENTE:
			return new DipendenteDao().getDipendente(um);
 		 
		}

		return um ; 
	}
}

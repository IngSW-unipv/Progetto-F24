package it.unipv.java.persistance;

import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.User;
import it.unipv.java.util.user.UserStrategyFactory;

/**
 * La classe PersistanceFacade definisce un oggetto Facade Singleton con lo 
 * strato di Persistenza. Questa classe contiene tutte le operazioni necessarie per
 * accedere, modificare e estrarre informazioni dalla forma di persistenza sottostante
 * senza conoscere quale sia il tipo di persistenza adottata.
 * 
 * @author Pasciu01
 * @version 1.0
 */
public class PersistanceFacade {
	private static PersistanceFacade instance;
	
	private PersistanceFacade() {}
	
	public static PersistanceFacade getInstance() {
		if(instance == null) {
			instance = new PersistanceFacade();
			return instance;
		}
		return instance;
	}
	
	public User loginUser(LoginData datiLogin) {
		return UserStrategyFactory.getInstance().getUserStrategy(datiLogin.getEmailInserita()).getUser(this, datiLogin);
	}
	
	public boolean registerUser(RegisterData datiRegistrazione) {
		return UserStrategyFactory.getInstance().getUserStrategy(datiRegistrazione.getEmailInserita()).createUser(this, datiRegistrazione);
	}
	
	public boolean modificaProfilo(User utenteAttivo) {
		return UserStrategyFactory.getInstance().getUserStrategy(utenteAttivo).updateUser(this, utenteAttivo);
	}

	public boolean eliminaDipendente(User u) {
			return DaoFactory.getInstance().getDipendentePersistance().deleteDipendente(u);
	}
	
	public boolean aggiungiTurno(TurnoModel tm) {
		return DaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<TurnoModel> mostraTurni() {
		return DaoFactory.getInstance().getTurnoPersistance().getAllTurni(); 
	}
	
	public boolean createPrenotazione(PrenotazioneData datiPrenotazione) {
		return DaoFactory.getInstance().getPrenotazionePersistance().createPrenotazione(datiPrenotazione);
	}
	
	public List<PrenotazioneData> getPrenotazioniCliente() {
		return DaoFactory.getInstance().getPrenotazionePersistance().getPrenotazioniUtente();
	}
	
	public List<PrenotazioneData> mostraPrenotazioni() {
		return DaoFactory.getInstance().getPrenotazionePersistance().getAllPrenotazioni();
	}
	
	public boolean setTurno(TurnoModel tm) {
		return DaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<User> getTuttiDipendenti() {
		return DaoFactory.getInstance().getDipendentePersistance().getAllDipendenti();
	}
}

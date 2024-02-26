package it.unipv.java.persistance;

import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.newuser.User;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.util.dao.strategies.IDaoFactoryStrategy;
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
		return UserStrategyFactory.getInstance().getUserLoginStrategy(datiLogin).getUser(this, datiLogin);
	}
	
	public boolean registerUser(RegisterModel datiRegistrazione) {
		switch(datiRegistrazione.getUm().getUserType()) {
		case DIPENDENTE:
			return DaoFactory.getInstance().getDipendentePersistance().createDipendente(datiRegistrazione);
		case RESPONSABILE:
			return DaoFactory.getInstance().getResponsabilePersistance().createResponsabile(datiRegistrazione);
		case CLIENTE:
			return DaoFactory.getInstance().getClientePersistance().createCliente(datiRegistrazione);
		}	
		return false;
	}
	
/*	public boolean modificaProfilo() {
		switch (SingleSessioneAttiva.getInstance().getUtenteAttivo().getUserType()) {
		case CLIENTE:
			return DaoFactory.getInstance().getClientePersistance().updateCliente(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		case DIPENDENTE:
			return DaoFactory.getInstance().getDipendentePersistance().updateDipendente(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		case RESPONSABILE:
			return DaoFactory.getInstance().getResponsabilePersistance().updateResponsabile(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		}
		return false ; 
	} */
	
//	DEVE ESSERE ELIMINA USER? DISAMBIGUARE SU CHI/COME SI POSSANO ELIMINARE USER
	public boolean eliminaDipendente(UserModel user) {
			return DaoFactory.getInstance().getDipendentePersistance().deleteDipendente(user);
	}

	public boolean getTurno(TurnoModel tm) {
		return DaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}

	public boolean aggiungiTurno(TurnoModel tm) {
		return DaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<TurnoModel> mostraTurni() {
		return DaoFactory.getInstance().getTurnoPersistance().getAllTurni(); 
	}
	
	public boolean createPrenotazione(PrenotazioneModel datiPrenotazione) {
		return DaoFactory.getInstance().getPrenotazionePersistance().createPrenotazione(datiPrenotazione);
	}
	
	public List<PrenotazioneModel> getPrenotazioniUtente() {
		return DaoFactory.getInstance().getPrenotazionePersistance().getPrenotazioniUtente();
	}
	
	public List<PrenotazioneModel> mostraPrenotazioni() {
		return DaoFactory.getInstance().getPrenotazionePersistance().getAllPrenotazioni();
	}
	
	public boolean setTurno(TurnoModel tm) {
		return DaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<UserModel> mostraDipendenti() {
		return DaoFactory.getInstance().getDipendentePersistance().getAllDipendenti();
	}

	public UserModel visualizzaProfilo(UserModel um) {
		// TODO Auto-generated method stub
		return null;
	}
}

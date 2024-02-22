package it.unipv.java.persistance;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;

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
	
	public boolean loginUser(LoginModel datiLogin) {
		switch(datiLogin.getUm().getUserType()) {
		case DIPENDENTE:
			return SingleFactoryDao.getInstance().getDipendentePersistance().getDipendente(datiLogin);
		case RESPONSABILE:
			return SingleFactoryDao.getInstance().getResponsabilePersistance().getResponsabile(datiLogin);
		case CLIENTE:
			return SingleFactoryDao.getInstance().getClientePersistance().getCliente(datiLogin);
		}	
		return false;
	}
	
	public boolean registerUser(RegisterModel datiRegistrazione) {
		switch(datiRegistrazione.getUm().getUserType()) {
		case DIPENDENTE:
			return SingleFactoryDao.getInstance().getDipendentePersistance().createDipendente(datiRegistrazione);
		case RESPONSABILE:
			return SingleFactoryDao.getInstance().getResponsabilePersistance().createResponsabile(datiRegistrazione);
		case CLIENTE:
			return SingleFactoryDao.getInstance().getClientePersistance().createCliente(datiRegistrazione);
		}	
		return false;
	}
	
	public boolean eliminaDipendente(UserModel user) {
			return SingleFactoryDao.getInstance().getDipendentePersistance().deleteDipendente(user);
	}

	public boolean getTurno(TurnoModel tm) {
		return SingleFactoryDao.getInstance().getTurnoPersistance().createTurno(tm);
	}

	public boolean aggiungiTurno(TurnoModel tm) {
		return SingleFactoryDao.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<TurnoModel> mostraTurni() {
		return SingleFactoryDao.getInstance().getTurnoPersistance().getAllTurni(); 
	}
	
	public boolean modificaProfilo() {
		switch (SingleSessioneAttiva.getInstance().getUtenteAttivo().getUserType()) {
		case CLIENTE:
			return SingleFactoryDao.getInstance().getClientePersistance().updateCliente(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		case DIPENDENTE:
			return SingleFactoryDao.getInstance().getDipendentePersistance().updateDipendente(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		case RESPONSABILE:
			return SingleFactoryDao.getInstance().getResponsabilePersistance().updateResponsabile(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		}
		return false ; 
	}
	
	public boolean createPrenotazione(PrenotazioneModel datiPrenotazione) {
		return SingleFactoryDao.getInstance().getPrenotazionePersistance().createPrenotazione(datiPrenotazione);
	}
	
	public List<PrenotazioneModel> getPrenotazioniUtente() {
		return SingleFactoryDao.getInstance().getPrenotazionePersistance().getPrenotazione();
	}
	
	public List<PrenotazioneModel> mostraPrenotazioni() {
		return SingleFactoryDao.getInstance().getPrenotazionePersistance().getAllPrenotazioni();
	}
	
	public boolean setTurno(TurnoModel tm) {
		return SingleFactoryDao.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<UserModel> mostraDipendenti() {
		return SingleFactoryDao.getInstance().getDipendentePersistance().getAllDipendenti();
	}
}

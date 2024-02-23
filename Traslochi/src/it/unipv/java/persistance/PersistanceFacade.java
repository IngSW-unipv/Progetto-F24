package it.unipv.java.persistance;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.factory.SingleDaoFactory;

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
	
	public boolean loginUser(UserModel datiLogin) {
		switch(datiLogin.getUserType()) {
		case DIPENDENTE:
			return SingleDaoFactory.getInstance().getDipendentePersistance().getDipendente(datiLogin);
		case RESPONSABILE:
			return SingleDaoFactory.getInstance().getResponsabilePersistance().getResponsabile(datiLogin);
		case CLIENTE:
			return SingleDaoFactory.getInstance().getClientePersistance().getCliente(datiLogin);
		}	
		return false;
	}
	
	public boolean registerUser(RegisterModel datiRegistrazione) {
		switch(datiRegistrazione.getUm().getUserType()) {
		case DIPENDENTE:
			return SingleDaoFactory.getInstance().getDipendentePersistance().createDipendente(datiRegistrazione);
		case RESPONSABILE:
			return SingleDaoFactory.getInstance().getResponsabilePersistance().createResponsabile(datiRegistrazione);
		case CLIENTE:
			return SingleDaoFactory.getInstance().getClientePersistance().createCliente(datiRegistrazione);
		}	
		return false;
	}
	
	public boolean eliminaDipendente(UserModel user) {
			return SingleDaoFactory.getInstance().getDipendentePersistance().deleteDipendente(user);
	}

	public boolean getTurno(TurnoModel tm) {
		return SingleDaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}

	public boolean aggiungiTurno(TurnoModel tm) {
		return SingleDaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<TurnoModel> mostraTurni() {
		return SingleDaoFactory.getInstance().getTurnoPersistance().getAllTurni(); 
	}
	
	public boolean modificaProfilo() {
		switch (SingleSessioneAttiva.getInstance().getUtenteAttivo().getUserType()) {
		case CLIENTE:
			return SingleDaoFactory.getInstance().getClientePersistance().updateCliente(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		case DIPENDENTE:
			return SingleDaoFactory.getInstance().getDipendentePersistance().updateDipendente(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		case RESPONSABILE:
			return SingleDaoFactory.getInstance().getResponsabilePersistance().updateResponsabile(SingleSessioneAttiva.getInstance().getUtenteAttivo());
		}
		return false ; 
	}
	
	public boolean createPrenotazione(PrenotazioneModel datiPrenotazione) {
		return SingleDaoFactory.getInstance().getPrenotazionePersistance().createPrenotazione(datiPrenotazione);
	}
	
	public List<PrenotazioneModel> getPrenotazioniUtente() {
		return SingleDaoFactory.getInstance().getPrenotazionePersistance().getPrenotazione();
	}
	
	public List<PrenotazioneModel> mostraPrenotazioni() {
		return SingleDaoFactory.getInstance().getPrenotazionePersistance().getAllPrenotazioni();
	}
	
	public boolean setTurno(TurnoModel tm) {
		return SingleDaoFactory.getInstance().getTurnoPersistance().createTurno(tm);
	}
	
	public List<UserModel> mostraDipendenti() {
		return SingleDaoFactory.getInstance().getDipendentePersistance().getAllDipendenti();
	}

	public UserModel visualizzaProfilo(UserModel um) {
		// TODO Auto-generated method stub
		return null;
	}
}

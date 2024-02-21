package it.unipv.java.persistance;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;

public class PersistanceFacade {
	private static PersistanceFacade instance;
	
	private PersistanceFacade() {}
	
	public static void getInstance() {
		if(instance == null) {
			instance = new PersistanceFacade();
		}
	}
	public boolean createPrenotazione(PrenotazioneModel datiPrenotazione) {
		return SingleFactoryDao.getInstance().getPrenotazionePersistance().createPrenotazione(datiPrenotazione);
	}
	
	public List<PrenotazioneModel> getPrenotazioniUtente(UserModel loggedUser) {
		return SingleFactoryDao.getInstance().getPrenotazionePersistance().getPrenotazione(loggedUser);
	}
	
}

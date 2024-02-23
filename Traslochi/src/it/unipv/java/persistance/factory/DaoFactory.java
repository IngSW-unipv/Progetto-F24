package it.unipv.java.persistance.factory;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.strategies.StrategyFactory;

public class DaoFactory {
	private static DaoFactory instance;
	
	private DaoFactory() {}
	
	public static DaoFactory getInstance() {
		if(instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public IPrenotazioneDao getPrenotazionePersistance() {
		return StrategyFactory.getInstance().getStrategy().getPrenotazioneDao(this);
	}
	
	public IDipendenteDao getDipendentePersistance() {
		return StrategyFactory.getInstance().getStrategy().getDipendenteDao(this);
	}
	
	public IClienteDao getClientePersistance() {
		return StrategyFactory.getInstance().getStrategy().getClienteDao(this);
	}
	
	public IResponsabileDao getResponsabilePersistance() {
		return StrategyFactory.getInstance().getStrategy().getResponsabileDao(this);
	}
	
	public ITurnoDao getTurnoPersistance() {
		return StrategyFactory.getInstance().getStrategy().getTurnoDao(this);
	}
}

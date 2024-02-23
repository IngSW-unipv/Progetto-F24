package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.DipendenteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.prenotazione.PrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.responsabile.ResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.dao.turno.TurnoDao;
import it.unipv.java.persistance.factory.SingleDaoFactory;

public class RdbDaoStrategy implements IDaoFactoryStrategy{
	
	public RdbDaoStrategy() {
		
	}
	
	@Override
	public IDipendenteDao getDipendenteDao(SingleDaoFactory instance) {
		return new DipendenteDao();
	}

	@Override
	public IClienteDao getClienteDao(SingleDaoFactory instance) {
		return new ClienteDao();
	}

	@Override
	public IResponsabileDao getResponsabileDao(SingleDaoFactory instance) {
		return new ResponsabileDao();
	}

	@Override
	public IPrenotazioneDao getPrenotazioneDao(SingleDaoFactory instance) {
		return new PrenotazioneDao();
	}

	@Override
	public ITurnoDao getTurnoDao(SingleDaoFactory instance) {
		return new TurnoDao();
	}

}

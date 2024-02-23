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

public class RdbDaoStrategy implements IDaoFactoryStrategy{

	@Override
	public IDipendenteDao getDipendenteDao() {
		return new DipendenteDao();
	}

	@Override
	public IClienteDao getClienteDao() {
		return new ClienteDao();
	}

	@Override
	public IResponsabileDao getResponsabileDao() {
		return new ResponsabileDao();
	}

	@Override
	public IPrenotazioneDao getPrenotazioneDao() {
		return new PrenotazioneDao();
	}

	@Override
	public ITurnoDao getTurnoDao() {
		return new TurnoDao();
	}

}

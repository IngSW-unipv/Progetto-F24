package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.RdbClienteDao;
import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.RdbDipendenteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.prenotazione.RdbPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.responsabile.RdbResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.dao.turno.RdbTurnoDao;
import it.unipv.java.persistance.factory.DaoFactory;

/**
 * Una strategia di creazione degli oggetti Dao. Questa strategia specifica
 * l'utilizzo di un Database Relazionale, pertanto restituisce oggetti RdbDao.
 * @author Pasciu01
 * @see IDaoFactoryStrategy
 * @version 1.0
 */
public class RdbDaoStrategy implements IDaoFactoryStrategy{
	
	public RdbDaoStrategy() {
	}
	
	@Override
	public IDipendenteDao getDipendenteDao(DaoFactory instance) {
		return new RdbDipendenteDao();
	}

	@Override
	public IClienteDao getClienteDao(DaoFactory instance) {
		return new RdbClienteDao();
	}

	@Override
	public IResponsabileDao getResponsabileDao(DaoFactory instance) {
		return new RdbResponsabileDao();
	}

	@Override
	public IPrenotazioneDao getPrenotazioneDao(DaoFactory instance) {
		return new RdbPrenotazioneDao();
	}

	@Override
	public ITurnoDao getTurnoDao(DaoFactory instance) {
		return new RdbTurnoDao();
	}

}

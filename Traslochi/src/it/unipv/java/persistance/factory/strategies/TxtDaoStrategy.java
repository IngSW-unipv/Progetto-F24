package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.cliente.TxtClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.DaoFactory;

/**
 * Una strategia di creazione degli oggetti Dao. Questa strategia specifica
 * l'utilizzo di un file txt, pertanto restituisce oggetti TxtDao.
 * NON IMPLEMENTATA
 * @author Pasciu01
 * @see IDaoFactoryStrategy
 * @version 1.0
 */
public class TxtDaoStrategy implements IDaoFactoryStrategy{

	@Override
	public IDipendenteDao getDipendenteDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IClienteDao getClienteDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return new TxtClienteDao();
	}

	@Override
	public IResponsabileDao getResponsabileDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPrenotazioneDao getPrenotazioneDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITurnoDao getTurnoDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

}

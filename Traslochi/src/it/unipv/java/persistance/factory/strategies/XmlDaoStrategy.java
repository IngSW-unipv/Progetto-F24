package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.DaoFactory;

public class XmlDaoStrategy implements IDaoFactoryStrategy{

	@Override
	public IDipendenteDao getDipendenteDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IClienteDao getClienteDao(DaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
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

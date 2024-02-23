package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.SingleDaoFactory;

public class XmlDaoStrategy implements IDaoFactoryStrategy{

	@Override
	public IDipendenteDao getDipendenteDao(SingleDaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IClienteDao getClienteDao(SingleDaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResponsabileDao getResponsabileDao(SingleDaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPrenotazioneDao getPrenotazioneDao(SingleDaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITurnoDao getTurnoDao(SingleDaoFactory instance) {
		// TODO Auto-generated method stub
		return null;
	}

}

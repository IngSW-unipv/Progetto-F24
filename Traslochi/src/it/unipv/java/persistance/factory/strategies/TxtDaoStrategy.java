package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;

public class TxtDaoStrategy implements IDaoFactoryStrategy{

	@Override
	public IDipendenteDao getDipendenteDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IClienteDao getClienteDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResponsabileDao getResponsabileDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPrenotazioneDao getPrenotazioneDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITurnoDao getTurnoDao() {
		// TODO Auto-generated method stub
		return null;
	}

}

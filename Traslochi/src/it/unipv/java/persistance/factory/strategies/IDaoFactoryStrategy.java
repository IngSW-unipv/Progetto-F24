package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.SingleDaoFactory;

public interface IDaoFactoryStrategy {
	IDipendenteDao getDipendenteDao(SingleDaoFactory instance);
	IClienteDao getClienteDao(SingleDaoFactory instance);
	IResponsabileDao getResponsabileDao(SingleDaoFactory instance);
	IPrenotazioneDao getPrenotazioneDao(SingleDaoFactory instance);
	ITurnoDao getTurnoDao(SingleDaoFactory instance);
}

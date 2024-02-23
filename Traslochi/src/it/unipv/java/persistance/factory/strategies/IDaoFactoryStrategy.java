package it.unipv.java.persistance.factory.strategies;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.DaoFactory;

public interface IDaoFactoryStrategy {
	IDipendenteDao getDipendenteDao(DaoFactory instance);
	IClienteDao getClienteDao(DaoFactory instance);
	IResponsabileDao getResponsabileDao(DaoFactory instance);
	IPrenotazioneDao getPrenotazioneDao(DaoFactory instance);
	ITurnoDao getTurnoDao(DaoFactory instance);
}

package it.unipv.java.persistance.factory;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;

public interface IFactoryStrategy {
	IDipendenteDao getDipendenteDao();
	IClienteDao getClienteDao();
	IResponsabileDao getResponsabileDao();
	IPrenotazioneDao getPrenotazioneDao();
	ITurnoDao getTurnoDao();
}

package it.unipv.java.persistance.factory;

import java.io.FileInputStream;
import java.util.Properties;

import it.unipv.java.persistance.dao.cliente.IClienteDao;
import it.unipv.java.persistance.dao.dipendente.IDipendenteDao;
import it.unipv.java.persistance.dao.prenotazione.IPrenotazioneDao;
import it.unipv.java.persistance.dao.responsabile.IResponsabileDao;
import it.unipv.java.persistance.dao.turno.ITurnoDao;
import it.unipv.java.persistance.factory.strategies.IDaoFactoryStrategy;
import it.unipv.java.persistance.factory.strategies.StrategyFactory;

public class SingleDaoFactory {
	private static final String DATATYPE_PROPERTY="Persistance_Type";
	private IDaoFactoryStrategy strategy;
	private static SingleDaoFactory instance;
	
	private SingleDaoFactory() {
		this.strategy = StrategyFactory.getInstance().setStrategy(findPersistenzaAttiva());
	}
	
	private String findPersistenzaAttiva() {
		try {
			Properties p = new Properties(System.getProperties());
			p.load(new FileInputStream("properties/properties"));
			
			return p.getProperty(DATATYPE_PROPERTY);
			
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return null;
	}
	
	public static SingleDaoFactory getInstance() {
		if(instance == null) {
			instance = new SingleDaoFactory();
		}
		return instance;
	}
	
	public IPrenotazioneDao getPrenotazionePersistance() {
		return strategy.getPrenotazioneDao(this);
	}
	
	public IDipendenteDao getDipendentePersistance() {
		return strategy.getDipendenteDao(this);
	}
	
	
	public IClienteDao getClientePersistance() {
		return strategy.getClienteDao(this);
	}
	
	public IResponsabileDao getResponsabilePersistance() {
		return strategy.getResponsabileDao(this);
	}
	
	public ITurnoDao getTurnoPersistance() {
		return strategy.getTurnoDao(this);
	}
}

package it.unipv.java.persistance;

import java.io.FileInputStream;
import java.util.Properties;

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

public class SingleFactoryDao {
	public enum PersistanceTypes {
		Default,
		MySql,
		Xml,	//Unimplemented
		Txt		//Unimplemented
	}
	private static SingleFactoryDao instance;
	private static final String DATATYPE_PROPERTY="Persistance_Type";
	private PersistanceTypes persistenzaAttiva;
	
	private SingleFactoryDao() {
		persistenzaAttiva = PersistanceTypes.Default;
		init();
	}
	
	private void init() {
		try {
		Properties p = new Properties(System.getProperties());
		p.load(new FileInputStream("properties/properties"));
		String tipoPersistenza=p.getProperty(DATATYPE_PROPERTY);
		
		this.persistenzaAttiva = PersistanceTypes.valueOf(tipoPersistenza);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

	public static SingleFactoryDao getInstance() {
		if(instance == null) {
			instance = new SingleFactoryDao();
		}
		return instance;
	}
	
	public IPrenotazioneDao getPrenotazionePersistance() {
		switch(persistenzaAttiva) {
			case MySql: return new PrenotazioneDao();
			case Xml: return null;
			case Txt: return null;
			default: return null;
		}
	}
	
	public IDipendenteDao getDipendentePersistance() {
		
		switch(persistenzaAttiva) {
			case MySql: return new DipendenteDao();
			case Xml: return null;
			case Txt: return null;
			default: return null;
		}
	}
	
	public IClienteDao getClientePersistance() {
		
		switch(persistenzaAttiva) {
			case MySql: return new ClienteDao();
			case Xml: return null;
			case Txt: return null;
			default: return null;
		}
	}
	public IResponsabileDao getResponsabilePersistance() {
		
		switch(persistenzaAttiva) {
			case MySql: return new ResponsabileDao();
			case Xml: return null;
			case Txt: return null;
			default: return null;
		}
	}
	public ITurnoDao getTurnoPersistance() {
		
		switch(persistenzaAttiva) {
			case MySql: return new TurnoDao();
			case Xml: return null;
			case Txt: return null;
			default: return null;
		}
	}
}

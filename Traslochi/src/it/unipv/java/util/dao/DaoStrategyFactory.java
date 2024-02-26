package it.unipv.java.util.dao;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.java.util.dao.strategies.IDaoFactoryStrategy;

/**
 * La classe StrategyFactory rappresenta l'oggetto Singleton che si occupa di
 * identificare e attuare la strategia di creazione oggetti IDao attraverso 
 * ciò che viene specificato nel file properties, andando a scegliere tra le
 * IDaoFactoryStrategy esistenti.
 * @author Pasciu01
 * @see IDaoFactoryStrategy
 * @version 1.0
 */
public class DaoStrategyFactory {
	private static DaoStrategyFactory instance;
	private static final String DATATYPE_PROPERTY="Persistance_Type";
	private IDaoFactoryStrategy strategy;
	
	//La prima volta che viene creato, viene riconosciuto quale tipo di persistenza si vuole usare
	//e viene inizializzata la strategia
	private DaoStrategyFactory() {
		String tipoPersistenza = findPersistenzaAttiva();
		this.strategy = setStrategy(tipoPersistenza);
	}
	/**
	 * Restituisce l'istanza StrategyFactory. Quando viene creata per la prima volta, va a leggere nel file
	 * properties quale sia la strategia di creazione da adottare e la attiva.
	 * @author Pasciu01
	 * @see IDaoFactoryStrategy
	 * @see DaoStrategyFactory
	 * @version 1.0
	 */
	public static DaoStrategyFactory getInstance() {
		if(instance == null) {
			instance = new DaoStrategyFactory();
		}
		return instance;
		
	}
	/**
	 * Metodo che legge nel file properties quale sia il tipo di persistenza da
	 * adottare.
	 * @author Pasciu01
	 * @return tipoPersistenza La stringa che specifica quale sia il tipo di
	 * strategia da attivare, ossia quale sia il tipo di persistenza da usare. 
	 * @version 1.0
	 */
	private String findPersistenzaAttiva() {
		String tipoPersistenza;
		try {
			Properties p = new Properties(System.getProperties());
			p.load(new FileInputStream("properties/properties"));
			tipoPersistenza = p.getProperty(DATATYPE_PROPERTY);
			return tipoPersistenza;
			
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return null;
	}

	/**
	 * Metodo che attiva la strategia da adottare a partire da quello che c'è scritto
	 * nel file properties.
	 * @author Pasciu01
	 * @param persistenzaAttiva la String che specifica quale sia la strategia da attuare.
	 * @return strategy L'oggetto IDaoFactoryStrategy che si dovrà usare d'ora in avanti.
	 * @version 1.0
	 */
	public IDaoFactoryStrategy setStrategy(String persistenzaAttiva) {	
		if(strategy == null) {
			String strategyPath;

			try {
				Properties p = new Properties(System.getProperties());
				p.load(new FileInputStream("properties/properties"));
				strategyPath=p.getProperty(persistenzaAttiva);

				Constructor<?> c = Class.forName(strategyPath).getConstructor();
				strategy =(IDaoFactoryStrategy)c.newInstance();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return strategy;
	}
	
	/**
	 * Metodo che restituisce la strategia attivata da StrategyFactory.
	 * @author Pasciu01
	 * @version 1.0
	 */
	public IDaoFactoryStrategy getStrategy() {
		return strategy;
	}
	
}

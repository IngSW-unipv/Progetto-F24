package it.unipv.java.persistance.factory.strategies;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class StrategyFactory {
	//Questo oggetto Singleton, a partire da una strategia specificata in properties/properties
	//costruisce gli oggetti Dao figlie delle interfacce IDAO
	private static StrategyFactory instance;
	private static final String DATATYPE_PROPERTY="Persistance_Type";
	private IDaoFactoryStrategy strategy;
	
	//La prima volta che viene creato, viene riconosciuto quale tipo di persistenza si vuole usare
	//e viene inizializzata la strategia
	private StrategyFactory() {
		String tipoPersistenza = findPersistenzaAttiva();
		this.strategy = setStrategy(tipoPersistenza);
	}
	
	public static StrategyFactory getInstance() {
		if(instance == null) {
			instance = new StrategyFactory();
		}
		return instance;
		
	}
	//Leggi nel file properties qual'è la strategia da usare
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
	//Setta la strategia da adottare
	public IDaoFactoryStrategy setStrategy(String persistenzaAttiva) {	
		if(strategy == null) {
			String strategyPath;

			try {
				Properties p = new Properties(System.getProperties());
				p.load(new FileInputStream("properties/properties"));
				strategyPath=p.getProperty(persistenzaAttiva);

				Constructor<?> c = Class.forName(strategyPath).getConstructor();
				strategy =(RdbDaoStrategy)c.newInstance();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return strategy;
	}
	//Restituisci la strategia, fondamentalmente a DaoFactory
	public IDaoFactoryStrategy getStrategy() {
		return strategy;
	}
	
}

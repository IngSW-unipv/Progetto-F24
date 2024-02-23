package it.unipv.java.persistance.factory.strategies;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class StrategyFactory {
	private static StrategyFactory instance;
	private static final String DATATYPE_PROPERTY="Persistance_Type";
	private IDaoFactoryStrategy strategy;
	
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
	
	public IDaoFactoryStrategy setStrategy(String persistenzaAttiva) {	
		if(strategy == null) {
			String strategyPath;

			try {
				Properties p = new Properties(System.getProperties());
				p.load(new FileInputStream("properties/properties"));
				strategyPath=p.getProperty(persistenzaAttiva);

				Constructor<?> c = Class.forName(strategyPath).getConstructor();
				strategy =(RdbDaoStrategy)c.newInstance(persistenzaAttiva);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return strategy;
	}

	public IDaoFactoryStrategy getStrategy() {
		return strategy;
	}
	
}

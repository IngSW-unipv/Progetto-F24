package it.unipv.java.persistance.factory.strategies;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class StrategyFactory {
	private static StrategyFactory instance;
	private static IDaoFactoryStrategy strategy;
	
	private StrategyFactory() {}
	
	public static StrategyFactory getInstance() {
		if(instance == null) {
			instance = new StrategyFactory();
		}
		return instance;
		
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
}

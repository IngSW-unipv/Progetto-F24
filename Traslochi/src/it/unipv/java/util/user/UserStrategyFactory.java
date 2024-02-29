package it.unipv.java.util.user;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.java.model.user.User;
import it.unipv.java.util.user.strategies.IUserStrategy;

public class UserStrategyFactory {
	private static UserStrategyFactory instance;
	private IUserStrategy strategiaUtente;
	private static final String USER_PROPERTYNAME = "User";

	private UserStrategyFactory() {
	}

	public static UserStrategyFactory getInstance() {
		if(instance == null) {
			instance = new UserStrategyFactory();
		}
		return instance;
		
	}

	public IUserStrategy getUserStrategy(User utenteLoggato) {
		Properties p = new Properties(System.getProperties());
		String classSimpleName = utenteLoggato.getClass().getSimpleName();
		try {
			p.load(new FileInputStream("properties/properties"));
			String UnformattedString = p.getProperty(USER_PROPERTYNAME);
			String tipoUtenteClassName = String.format(UnformattedString, classSimpleName);
				
				Constructor<?> c = Class.forName(tipoUtenteClassName).getConstructor();
				strategiaUtente=(IUserStrategy)c.newInstance();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				strategiaUtente=null;
			}
		return strategiaUtente;
	}	
	
	public IUserStrategy getUserStrategy(String Email) {
		String dominio = Email.substring(Email.indexOf("@") + 1);
		Properties p = new Properties(System.getProperties());
		
		try {
			p.load(new FileInputStream("properties/properties"));
			String dominioClassName = p.getProperty(dominio);
			
			if(dominioClassName == null)
				dominioClassName = p.getProperty("altroDominio.it");
			
			Constructor<?> c = Class.forName(dominioClassName).getConstructor();
			strategiaUtente = (IUserStrategy)c.newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			strategiaUtente = null;
		}
	return strategiaUtente;
	}
}

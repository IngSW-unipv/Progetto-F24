package it.unipv.java.util.user;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;
import it.unipv.java.util.user.strategies.IUserStrategy;

public class UserStrategyFactory {
	private static UserStrategyFactory instance;
	private IUserStrategy controllerUtente;
	private static final String USER_PROPERTYNAME = "User";

	private UserStrategyFactory() {
	}

	public static UserStrategyFactory getInstance() {
		if(instance == null) {
			instance = new UserStrategyFactory();
		}
		return instance;
		
	}

	public IUserStrategy getUserControllerStrategy(User tipoUtente) {
		Properties p = new Properties(System.getProperties());
		String className = tipoUtente.getClass().getSimpleName();
		try {
			p.load(new FileInputStream("properties/properties"));
			String UnformattedString = p.getProperty(USER_PROPERTYNAME);
			String tipoUtenteClassName = String.format(UnformattedString, className);
				
				Constructor<?> c = Class.forName(tipoUtenteClassName).getConstructor();
				controllerUtente=(IUserStrategy)c.newInstance();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				controllerUtente=null;
			}
		return controllerUtente;
	}	
	
	public IUserStrategy getUserLoginStrategy(String Email) {
//		String dominio = datiLogin.getEmailInserita().substring(datiLogin.getEmailInserita().indexOf("@") + 1);
		String dominio = Email.substring(Email.indexOf("@") + 1);
		Properties p = new Properties(System.getProperties());
		
		try {
			p.load(new FileInputStream("properties/properties"));
			String dominioClassName = p.getProperty(dominio);
			
			if(dominioClassName == null)
				dominioClassName = p.getProperty("altroDominio.it");
			
			Constructor<?> c = Class.forName(dominioClassName).getConstructor();
			controllerUtente = (IUserStrategy)c.newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			controllerUtente = null;
		}
	return controllerUtente;
}

	public IUserStrategy getUserRegisterStrategy(RegisterData datiRegistrazione) {
		String dominio = datiRegistrazione.getEmailInserita().substring(datiRegistrazione.getEmailInserita().indexOf("@") + 1);
		Properties p = new Properties(System.getProperties());
		
		try {
			p.load(new FileInputStream("properties/properties"));
			String dominioClassName = p.getProperty(dominio);
			
			if(dominioClassName == null)
				dominioClassName = p.getProperty("altroDominio.it");
			
			Constructor<?> c = Class.forName(dominioClassName).getConstructor();
			controllerUtente = (IUserStrategy)c.newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			controllerUtente = null;
		}
	return controllerUtente;
	}
}

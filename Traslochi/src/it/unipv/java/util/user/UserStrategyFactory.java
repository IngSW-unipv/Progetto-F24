package it.unipv.java.util.user;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.newuser.User;
import it.unipv.java.model.user.UserType;
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

	public IUserStrategy getUserControllerStrategy(User tipoUtente) {
		Properties p = new Properties(System.getProperties());
		String className = tipoUtente.getClass().getSimpleName();
		try {
			p.load(new FileInputStream("properties/properties"));
			String UnformattedString = p.getProperty(USER_PROPERTYNAME);
			String tipoUtenteClassName = String.format(UnformattedString, className);
				
				Constructor<?> c = Class.forName(tipoUtenteClassName).getConstructor();
				strategiaUtente=(IUserStrategy)c.newInstance();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				strategiaUtente=null;
			}
		return strategiaUtente;
	}	
	
	public IUserStrategy getUserLoginStrategy(LoginData datiLogin) {
		String dominio = datiLogin.getEmailInserita().substring(datiLogin.getEmailInserita().indexOf("@") + 1);
		Properties p = new Properties(System.getProperties());
		
		try {
			p.load(new FileInputStream("properties/properties"));
			String dominioClassName = p.getProperty(dominio);
			
			if(dominioClassName == null)
				dominioClassName = p.getProperty("altroDominio.it");
			
			Constructor<?> c = Class.forName(dominioClassName).getConstructor();
			strategiaUtente=(IUserStrategy)c.newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			strategiaUtente=null;
		}
	return strategiaUtente;
}	
}

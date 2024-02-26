package it.unipv.java.strategies.user;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.newuser.User;
import it.unipv.java.model.user.UserType;

public class UserStrategyFactory {
	private static UserStrategyFactory instance;
	private IUserStrategy strategiaUtente;

	private UserStrategyFactory() {
	}

	public static UserStrategyFactory getInstance() {
		if(instance == null) {
			instance = new UserStrategyFactory();
		}
		return instance;
		
	}

	public IUserStrategy getUserControllerStrategy(User tipoUtente) {
			try {
				String tipoUtenteClassName = tipoUtente.getClass().getName();
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
				dominioClassName = "it.unipv.java.strategies.user.ClienteStrategy";
			
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

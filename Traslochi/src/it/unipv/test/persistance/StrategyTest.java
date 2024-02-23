package it.unipv.test.persistance;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.persistance.PersistanceFacade;

public class StrategyTest {
	private UserModel responsabile;
	
	public StrategyTest() {
		this.responsabile = set();
	}
	
	private UserModel set() {
		UserModel user = new UserModel();
		user .setId("IDPROVAREGISTR");
		user.setNome("NomeProva");
		user.setCognome("CognomeProva");
		user.setCf("CFPROVA");
		user.setEmail("NomeProva.CognomeProva@qualcosa.com");
		user.setPassword("PasswordProva");
		user.setUserType(UserType.DIPENDENTE);
		return user;
	}


	public UserModel getResponsabile() {
		return responsabile;
	}

	public void setResponsabile(UserModel responsabile) {
		this.responsabile = responsabile;
	}

	public static void main(String[] args) {
		StrategyTest test = new StrategyTest();
		RegisterModel registra = new RegisterModel(test.getResponsabile());
		PersistanceFacade.getInstance().registerUser(registra);
	}

}

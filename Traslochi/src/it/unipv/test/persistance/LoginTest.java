package it.unipv.test.persistance;

import it.unipv.java.controller.LoginController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.newuser.User;
import it.unipv.java.view.LoginView;

public class LoginTest {
	public static void main(String[] args) {
		LoginView login = new LoginView();
		LoginController cv = new LoginController(login);
		LoginData datiInseriti = new LoginData("marco.celeste@email.com", "passwordHash1");
		SingleSessioneAttiva.getInstance().login(datiInseriti);
		User utenteLoggato = SingleSessioneAttiva.getInstance().getUtenteAttivo();
		if(utenteLoggato != null) {
			login.setVisible(false);
//Sarebbe questo UserStrategyFactory.getInstance().getUserControllerStrategy(utenteLoggato).flussoController(actionListener);
		}
	}
}

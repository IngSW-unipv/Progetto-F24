package it.unipv.test;

import it.unipv.java.controller.LoginController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.User;
import it.unipv.java.view.LoginView;

public class LoginTest {
public void LoginTest() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
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

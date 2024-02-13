package it.unipv.test;

import it.unipv.java.controller.LoginController;
import it.unipv.java.view.LoginView;

public class Engine {
 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LoginView login = new LoginView();
		LoginController cv = new LoginController(login);
	}
}
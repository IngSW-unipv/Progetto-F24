package it.unipv.java;

import it.unipv.java.controller.LoginController;
import it.unipv.java.view.LoginView;

public class Engine {

	public static void main(String[] args) {
		LoginView login;
		LoginController controller;
		
		login = new LoginView();
		controller = new LoginController(login);
	}

}

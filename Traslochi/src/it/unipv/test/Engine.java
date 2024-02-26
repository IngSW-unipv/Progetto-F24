package it.unipv.test;

import it.unipv.java.controller.NewLoginController;
import it.unipv.java.view.LoginView;

public class Engine {
	
	public static void main(String[] args) {
		LoginView lv = new LoginView();
		NewLoginController lc = new NewLoginController(lv);
	}
	
}
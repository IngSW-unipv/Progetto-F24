package it.unipv.test;

import it.unipv.java.controller.LoginController;
import it.unipv.java.view.LoginView;

public class Engine {
	
	public static void main(String[] args) {
		LoginView lv = new LoginView();
		LoginController lc = new LoginController(lv);
	}
	
}
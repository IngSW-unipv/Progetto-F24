package it.unipv.java.controller;

import it.unipv.java.model.LoginModel;
import it.unipv.java.view.LoginView;

public class LoginController {
	public LoginModel lm;
	public LoginView lv;
	
	public LoginController(LoginModel lm, LoginView lv) {
		this.lm = lm;
		this.lv = lv;
		setlisteners();
	}
	
	private void setlisteners() {
		
	}
}

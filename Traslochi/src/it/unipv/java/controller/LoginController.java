package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;

public class LoginController {
	public LoginModel lm;
	public LoginView lv;

	public LoginController(LoginModel lm, LoginView lv) {
		this.lm = lm;
		this.lv = lv;
		setlisteners();
	}

	private void setlisteners() {
		lv.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserModel loginuser = new UserModel();
				loginuser.setEmail(lv.getEmail());
				loginuser.setPassword(lv.getPassword());
				lm.setUm(loginuser);
				if (lm.confermaLogin()) {
					//istanzio la home page quale? dipende dal valore di ritorno di conferma login se dip,cliente,respons
					
					
				} else {
					// lm.showErrorMessage("Errore nella registrazione. Verifica i dati inseriti.");
				}
			}
		});

		lv.getRegisterButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});

	}

}// fine loginController
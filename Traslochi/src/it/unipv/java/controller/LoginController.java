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
				lm.setUserModel(loginuser);
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
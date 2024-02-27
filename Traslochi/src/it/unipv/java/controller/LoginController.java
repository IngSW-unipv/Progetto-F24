package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.User;
import it.unipv.java.util.user.UserStrategyFactory;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class LoginController {
	public LoginData datiInseriti;	//Model
	public LoginView loginView;

	public LoginController(LoginView schermataLogin) {
		this.loginView = schermataLogin;
		setListeners();
	}

	private void setListeners() {
		loginView.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti = new LoginData(loginView.getEmail(),loginView.getPassword());
				SingleSessioneAttiva.getInstance().login(datiInseriti);
				User utenteLoggato = SingleSessioneAttiva.getInstance().getUtenteAttivo();
				if(utenteLoggato.getEmail() == datiInseriti.getEmailInserita()) {
					loginView.setVisible(false);
					UserStrategyFactory.getInstance().getUserControllerStrategy(utenteLoggato).flussoController(this);
				} else {
					WarningView wv = new WarningView();
					wv.mostraErroreLoginUtente();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							 wv.closeWindow();
							 loginView.setPassword("");
							 loginView.setEmail("");
						 }
					});
				}										
			}
		});
		loginView.getRegisterButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				RegisterController registerController = new RegisterController(registerView);
				registerView.setVisible(true);
				loginView.setVisible(false);
			}
		});
	}
}
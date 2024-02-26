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
	public LoginData datiInseriti;
	public LoginView schermataLogin;

	public LoginController(LoginView schermataLogin) {
		this.schermataLogin = schermataLogin;
		setListeners();
	}

	private void setListeners() {
		schermataLogin.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti = new LoginData(schermataLogin.getEmail(),schermataLogin.getPassword());
				SingleSessioneAttiva.getInstance().login(datiInseriti);
				User utenteLoggato = SingleSessioneAttiva.getInstance().getUtenteAttivo();
				if(utenteLoggato != null) {
					schermataLogin.setVisible(false);
					UserStrategyFactory.getInstance().getUserControllerStrategy(utenteLoggato).flussoController(this);
				} else {
					WarningView wv = new WarningView();
					wv.mostraErroreLoginUtente();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							 wv.closeWindow();
							 schermataLogin.setPassword("");
							 schermataLogin.setEmail("");
						 }
					});
				}										
			}
		});
		schermataLogin.getRegisterButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				NewRegisterController registerController = new NewRegisterController(registerView);
				registerView.setVisible(true);
			}
		});
	}
	
	public ActionListener getLoginButtonActionListener() {
        return schermataLogin.getLoginButton().getActionListeners()[0];
    }
}
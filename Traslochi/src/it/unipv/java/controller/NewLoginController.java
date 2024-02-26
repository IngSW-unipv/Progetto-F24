package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.newuser.User;
import it.unipv.java.strategies.user.UserStrategyFactory;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class NewLoginController {
	public LoginData datiInseriti;
	public LoginView lv;

	public NewLoginController(LoginView lv) {
		this.lv = lv;
		setListeners();
	}

	private void setListeners() {
		lv.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti = new LoginData(lv.getEmail(),lv.getPassword());
				//QUI SI POTREBBE APPLICARE UN PATTERN CHAIN OF RESPONSABILITY
				SingleSessioneAttiva.getInstance().login(datiInseriti);
				User utenteLoggato = SingleSessioneAttiva.getInstance().getUtenteAttivo();
				if(utenteLoggato != null) {
					lv.setVisible(false);
					UserStrategyFactory.getInstance().getUserControllerStrategy(utenteLoggato).flussoController(this);
				} else {
/*					// lm.showErrorMessage("Errore nel login. Verifica i dati inseriti.");
					WarningView wv= new WarningView();
					wv.mostraErrorGenerale();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
	DA RIVEDERE				 public void actionPerformed(ActionEvent e) { 
							 wv.closeWindow();
							 lv.setPassword("");
							 lv.setEmail("");
						 }
					});									*/
				}										
			}
		});
		lv.getRegisterButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				RegisterController registerController = new RegisterController(registerView);
				registerView.setVisible(true);
			}
		});
	}
	
	public ActionListener getLoginButtonActionListener() {
        return lv.getLoginButton().getActionListeners()[0];
    }
}
package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.RegistrationHandler;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;

public class RegisterController {
	private RegisterView registerView;
	private RegisterData datiInseriti;
	
	public RegisterController(RegisterView registerView) {
		this.registerView = registerView;
		this.datiInseriti = new RegisterData();
		setListeners(); 
	}
	private void setListeners() {
		registerView.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti.setNomeInserito(registerView.getNome());
				datiInseriti.setCognomeInserito(registerView.getCognome());
				datiInseriti.setCfInserito(registerView.getCF());
				datiInseriti.setEmailInserita(registerView.getEmail());
				datiInseriti.setPasswordInserita(registerView.getPass());
				datiInseriti.setConfermaPasswordInserita(registerView.getPassRipetuta()); 
				//Pseudo Chain Of Responsability
				RegistrationHandler gestoreRegistrazione = new RegistrationHandler(datiInseriti);
				if(gestoreRegistrazione.executeChainControllo()) {	
					gestoreRegistrazione.registraUtente(datiInseriti);
				} else {
					registerView.setPass("");
					registerView.setPassRipetuta("");
				}
			}
		}); 
		registerView.getBottoneReturn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerView.setVisible(false);
				LoginView loginView = new LoginView();
				LoginController loginController = new LoginController(loginView);
				loginView.setVisible(true);
				
			}
		});
	}
	
}
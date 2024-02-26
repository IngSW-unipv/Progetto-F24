package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.util.responsabilitychain.RegistrationHandler;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;

public class NewRegisterController {
	private RegisterView rv;
	private RegisterData datiInseriti;
	
	public NewRegisterController(RegisterView registerView) {
		this.rv = registerView;
		this.datiInseriti = new RegisterData();
		setListeners();

	}

	private void setListeners() {
		rv.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti.setNomeInserito(rv.getNome());
				datiInseriti.setCognomeInserito(rv.getCognome());
				datiInseriti.setCfInserito(rv.getCF());
				datiInseriti.setEmailInserita(rv.getEmail());
				datiInseriti.setPasswordInserita(rv.getPass());
				datiInseriti.setConfermaPasswordInserita(rv.getPassRipetuta());
				
				//Pseudo Chain Of Responsibility
				RegistrationHandler gestoreRegistrazione = new RegistrationHandler(datiInseriti);
				if(gestoreRegistrazione.executeChainControllo())
					gestoreRegistrazione.registraUtente(datiInseriti);
			}
		});
		rv.getBottoneReturn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rv.setVisible(false);
				LoginView lv = new LoginView();
				lv.setVisible(true);
			}
		});
	}
	
}
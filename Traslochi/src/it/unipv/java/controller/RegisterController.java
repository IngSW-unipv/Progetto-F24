package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class RegisterController {

	private RegisterView rv;
	private RegisterModel rm;
	private LoginView lv;
	

	
	public RegisterController(RegisterView registerView, RegisterModel registerModel) {
		this.rv = registerView;
		this.rm = registerModel;
		initcomponents();

	}

	private void initcomponents() {
		rv.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Creazione di un nuovo UserModel con i dati raccolti dalla view
				
				
				UserModel um = new UserModel();
				um.setNome(rv.getNome());
				um.setCognome(rv.getCognome());
				um.setEmail(rv.getEmail());
				um.setPassword(rv.getPass());

				rm.setUserModel(um);
 				if (rm.confermaRegistrazione()) {
					
					lv.setVisible(true);
					WarningView wv= new WarningView();
					wv.registrEffettuata();
				} else {
					// rv.showErrorMessage("Errore nella registrazione. Verifica i dati inseriti.");
				}
			}
		});
	}

	
	/*
	 * warningView.getBottoneRiprova().addActionListener(new ActionListener() {
	 * public void actionPerformed(ActionEvent e) { registerView.riprovaPassword();
	 * warningView.closeWindow(); } });
	 */
	/*private void controllopasswordripetuta() {
	
	//CONTROLLO SE PASS= PASSRIPETUTA e SE MAIL ESISTE GIA'
	/*if(!registerView.getPass().equals(registerView.getPassRipetuta())) {
		warningView.mostraErrorPassword();
	} else if(clienteDao.checkExistingEmail(registerView.getEmail())) {
		warningView.mostraErrorEmail();
	}else if(registerView.getPass().equals(registerView.getPassRipetuta()) && clienteDao.checkExistingEmail(registerView.getEmail()) == false) {
		registerModel.setNome(registerView.getNome());
		registerModel.setCognome(registerView.getCognome());
		registerModel.setEmail(registerView.getEmail());
		registerModel.setPassword(registerView.getPass());
		registerModel.setIdCliente(registerView.getCF()); 
		/*boolean registrazioneSuccesso = clienteDao.createCliente(registerModel);
		
		if(registrazioneSuccesso) {
			registerView.dispose(); // CHIUDI SCHERMATA REGISTRAZIONE
	        loginView.setVisible(true); // APRI SCHERMATA LOGIN
		} */
}// fine register controller

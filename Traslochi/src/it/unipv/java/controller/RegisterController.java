package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class RegisterController {

	private RegisterView registerView;
	private RegisterModel registerModel;
	private ClienteDao clienteDao;
	private WarningView warningView;
	private LoginView loginView;
	
	public RegisterController(RegisterView registerView, RegisterModel registerModel, ClienteDao clienteDao, WarningView warningView) {
		this.registerView= registerView;
		this.registerModel= registerModel;
		this.clienteDao= clienteDao;
		this.warningView= warningView;
		
		registerView.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confermaRegistrazione();
			}
		});
		
		warningView.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerView.riprovaPassword();
				warningView.closeWindow();
			}
		});
		
	}
	
	private void confermaRegistrazione() {
		//PRENDO I DATI DALLA VIEW
		String nome= registerView.getNome();
		String cognome = registerView.getCognome();
		String codiceFiscale = registerView.getCF();
		String email = registerView.getEmail();
		String password = new String(registerView.getPass());
		String passwordRipetuta = new String(registerView.getPassRipetuta());
		
		
		
		//MANCA DA IMPLEMENTARE SE LA MAIL NON ESISTE GIA'
		//CONTROLLO SE PASS= PASSRIPETUTA
		if(!password.equals(passwordRipetuta)) {
			warningView.mostraErrorMessage();
		} else if(password.equals(passwordRipetuta)) {
			registerModel.setNome(nome);
			registerModel.setCognome(cognome);
			registerModel.setEmail(email);
			registerModel.setPassword(password);
			
			boolean registrazioneSuccesso = clienteDao.createCliente(registerModel);
			
			if(registrazioneSuccesso) {
				registerView.dispose(); // CHIUDI SCHERMATA REGISTRAZIONE
		        loginView.setVisible(true); // APRI SCHERMATA LOGIN
			}
			
			
			
			
		}
	}
	
	
}

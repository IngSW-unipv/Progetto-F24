package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class RegisterController {

	private RegisterView registerView;
	private RegisterModel registerModel;
	private ClienteDao clienteDao;
	private WarningView warningView;
	
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
				riprovaPassword();
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
		
		
		
		
		//CONTROLLO SE PASS= PASSRIPETUTA
		if(!password.equals(passwordRipetuta)) {
			warningView.mostraErrorMessage();
			registerView.riprovaPassword();
		}
	}
	
	private void riprovaPassword() {
		registerView.setPassRipetuta(" ");
	}
}

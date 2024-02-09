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
		
		//CONTROLLO SE PASS= PASSRIPETUTA e SE MAIL ESISTE GIA'
		if(!registerView.getPass().equals(registerView.getPassRipetuta())) {
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
			
		}
	}
	
	
}

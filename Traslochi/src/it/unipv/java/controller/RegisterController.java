package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.cliente.ClienteDao;
 import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class RegisterController {

	private RegisterView rv;
	private RegisterModel rm; 
	//private ClienteDao clienteDao;
	//private WarningView warningView;
	
 	public RegisterController() {
		// TODO Auto-generated constructor stub
	}
 	
	public RegisterController(RegisterView registerView, RegisterModel registerModel, WarningView warningView) {
		this.rv= registerView;
		this.rm= registerModel; 
		initcomponents();
		
	}
		 
	 private void initcomponents() {
		rv.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rm.setNome(rv.getNome());
				rm.setCognome(rv.getCognome());
				rm.setEmail(rv.getEmail());
				rm.setPassword(rv.getPass());
			  
			
		            if (rm.confermaRegistrazione()) {
		                //rv.showMessage("Registrazione completata con successo!");
		            } else {
		                //rv.showErrorMessage("Errore nella registrazione. Verifica i dati inseriti.");
		            }
			}
		});
		
		/*warningView.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerView.riprovaPassword();
				warningView.closeWindow();
			}
		});*/
	}
	 
}//fine register controller
	
	
	
	


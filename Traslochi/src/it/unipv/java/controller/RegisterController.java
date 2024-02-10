package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class RegisterController {

	private RegisterView rv;
	private RegisterModel rm;  
    private WarningView warningView;

 	public RegisterController() {
		// TODO Auto-generated constructor stub
	}
 	
	public RegisterController(RegisterView registerView, RegisterModel registerModel, WarningView warningView) {
	       this.rv = registerView;
	        this.rm = registerModel;
	        this.warningView = warningView;
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
	                   // rv.showMessage("Registrazione completata con successo!");
	                } else {
	                   // rv.showErrorMessage("Errore nella registrazione. Verifica i dati inseriti.");
	                }
	            }
	        });
	    }
		/*warningView.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerView.riprovaPassword();
				warningView.closeWindow();
			}
		});*/
	 
	 
}//fine register controller
	
	
	
	


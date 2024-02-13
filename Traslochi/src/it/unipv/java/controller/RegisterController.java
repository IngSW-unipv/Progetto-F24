package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.model.user.UserTypeUtil;
import it.unipv.java.persistance.DataAccessFacade;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.WarningView;

public class RegisterController {

	private RegisterView rv;
	private RegisterModel rm;
	private LoginView lv;
	private UserTypeUtil utu;


	//NON è INIZIALIZZATO REGISTERMODEL, Non FUNZIONA VIEW PER QUELLO
	public RegisterController(RegisterView registerView) {
		this.rv = registerView; 
		this.rm= new RegisterModel(new UserModel());
		initcomponents();

	}

	private void initcomponents() {
		
		rv.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Creazione di un nuovo UserModel con i dati raccolti dalla view
				boolean control= passControl(rv.getPass());
				//boolean controlNull= rm.validaDati();
				
				if(control) {
				UserModel um = new UserModel();
				um.setNome(rv.getNome());
				um.setCognome(rv.getCognome());
				um.setCf(rv.getCF());
				um.setEmail(rv.getEmail());
				um.setPassword(rv.getPass());
				boolean controlNull= rm.validaDati(um);
				
				if(controlNull) {
				rm.setUserModel(um);
				} else if(!controlNull) {
					WarningView wv2= new WarningView();
					wv2.mostraErrorGenerale();
					wv2.getBottoneRiprova().addActionListener(new ActionListener() {
						 public void actionPerformed(ActionEvent e) { 
							 //rv.riprovaPassword();
							 wv2.closeWindow();
						 } });
				}
				
 				if (rm.confermaRegistrazione()) {
 					WarningView wv= new WarningView();
 					rv.setVisible(false);
				/*	wv.registrEffettuata();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						 public void actionPerformed(ActionEvent e) { 
							 wv.closeWindow();
						 } });*/
					
				} }  else if (!control) {
					WarningView wv1= new WarningView();
					wv1.mostraErrorPassword();
					wv1.getBottoneRiprova().addActionListener(new ActionListener() {
						 public void actionPerformed(ActionEvent e) { 
							 rv.riprovaPassword();
							 wv1.closeWindow();
						 } });
					
				} 
				else if(!emailControl(rv.getEmail())) {
					WarningView wv3= new WarningView();
					wv3.mostraErrorEmail();
					wv3.getBottoneRiprova().addActionListener(new ActionListener() {
						 public void actionPerformed(ActionEvent e) { 
							 rv.setEmail("");
							 wv3.closeWindow();
						 } });
				}
				
				
			}
		});
		rv.getBottoneReturn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rv.setVisible(false);	
			}
		});

	}

	public boolean passControl(String pass) {
		if(pass.equals(rv.getPassRipetuta())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean vuotoControl() {
		if(!rv.getNome().trim().isEmpty() && !rv.getCognome().trim().isEmpty() && !rv.getEmail().trim().isEmpty()
				&& !rv.getCF().trim().isEmpty() && !rv.getPass().trim().isEmpty() && !rv.getPassRipetuta().trim().isEmpty()) {
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean emailControl(String email) {
		return email.contains("@");
	}
	 
}// fine register controller
package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;

public class NewRegisterController {
	private RegisterView rv;
	private RegisterData rd;
	
	public NewRegisterController(RegisterView registerView) {
		this.rv = registerView;
		setListeners();

	}

	private void setListeners() {
		
		rv.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//QUI SI DEVE APPLICARE UN PATTERN CHAIN OF RESPONSABILITY PER IL CONTROLLO DATI + REGISTRAZIONE
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
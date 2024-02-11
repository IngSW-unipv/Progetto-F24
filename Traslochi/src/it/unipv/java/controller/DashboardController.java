package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.ResponsabileModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.ResponsabileView;

public class DashboardController {
	public UserModel um;
	public ResponsabileView rv;
	public ClienteView cv;
	public DipendenteView dv;
	
	public DashboardController(UserModel um, ResponsabileView rv) {
		this.um = um;
		this.rv = rv;
		setlisteners(um, rv);
	}
	public DashboardController(UserModel um, ClienteView cv) {
		this.um = um;
		this.cv = cv;
		setlisteners(um, cv);
	}
	public DashboardController(UserModel um, DipendenteView dv) {
		this.um = um;
		this.dv = dv;
		setlisteners(um, dv);
	}
	
	
	private void setlisteners(UserModel um, ResponsabileView rv) {
		rv.getButton
	}
<<<<<<< Updated upstream
	private void setlisteners(UserModel um, ClienteView cv) {
		
	}
	private void setlisteners(UserModel um, DipendenteView dv) {
		
=======
	
	
>>>>>>> Stashed changes
	}


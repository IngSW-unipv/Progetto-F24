package it.unipv.java.controller;

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
		setlisteners();
	}
	public DashboardController(UserModel um, ClienteView cv) {
		this.um = um;
		this.cv = cv;
		setlisteners();
	}
	public DashboardController(UserModel um, DipendenteView dv) {
		this.um = um;
		this.dv = dv;
		setlisteners();
	}
	private void setlisteners() {
		
	}
}

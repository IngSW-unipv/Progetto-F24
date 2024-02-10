package it.unipv.java.controller;

import it.unipv.java.model.DipendenteModel;
import it.unipv.java.view.DipendenteView;

public class DipendenteController {
	public DipendenteModel dm;
	public DipendenteView dv;
	
	public DipendenteController(DipendenteModel dm, DipendenteView dv) {
		this.dm = dm;
		this.dv = dv;
	}
}

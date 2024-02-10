package it.unipv.java.controller;

import it.unipv.java.model.ResponsabileModel;
import it.unipv.java.view.ResponsabileView;

public class ResponsabileController {
	public ResponsabileModel resm;
	public ResponsabileView resv;
	
	public ResponsabileController(ResponsabileModel resm, ResponsabileView resv) {
		this.resm = resm;
		this.resv = resv;
	}
}

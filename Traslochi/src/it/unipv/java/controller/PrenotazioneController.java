package it.unipv.java.controller;

import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.view.PrenotazioneView;

public class PrenotazioneController {
	public PrenotazioneModel pm;
	public PrenotazioneView pv;
	
	public PrenotazioneController(PrenotazioneModel pm, PrenotazioneView pv) {
		this.pm = pm;
		this.pv = pv;
		setlisteners();
	}
	
	private void setlisteners() {
		
	}
}

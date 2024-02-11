package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		pv.getButtonConfermaPren().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrenotazioneModel prenotazione = new PrenotazioneModel();
				prenotazione.setIndirizzodiRitiro(pv.getIndirizzoRitiro());
				prenotazione.setIndirizzoDiConsegna(pv.getIndirizzoConsegna());
				prenotazione.setDataRitiro(pv.getDataRitiro());
				prenotazione.setDataConsegna(pv.getDataConsegna());
				prenotazione.setCVC(pv.getTextField_6());
				prenotazione.setScadGiorno(pv.getTextField_7());
				prenotazione.setScadMese(pv.getTextField_8());
				prenotazione.setScadAnno(pv.getTextField_9());
				if(!pv.getRadioCarta().isSelected() && !pv.getRadioContanti().isSelected()){
					//eccezione: non hai selezionato contanti/carta
				}
			}
		});
	}
}

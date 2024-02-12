package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.DeleteModel;
import it.unipv.java.model.user.DipendenteModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.RimuoviDipView;
import it.unipv.java.view.WarningView;

public class RimuoviDipController {

	private RimuoviDipView rdv;
	private DeleteModel delm;
	
	public RimuoviDipController(RimuoviDipView rdv, DeleteModel dm) {
		this.rdv = rdv;
		this.dm = dm;
		setListeners();
	}
	private void setListeners() {
		rdv.getButtonReturn().addActionListener(new ActionListener() {		//Manca il return button nella view
			public void actionPerformed(ActionEvent e) {
				rdv.setVisible(false);	
			}
		});
		
		rdv.getButtonConfermaRim().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DipendenteModel dm = new DipendenteModel();
				dm.setCf(rdv.getCodiceFiscale());
				dm.setIdDipendente(rdv.getIdDipendente());
				
			}
		});
	}
	
}

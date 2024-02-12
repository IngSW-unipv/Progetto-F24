package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import it.unipv.java.model.DeleteModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.RimuoviDipView;
import it.unipv.java.view.WarningView;

public class RimuoviDipController {

	private RimuoviDipView rdv;
	private DeleteModel delm;
	
	public RimuoviDipController(RimuoviDipView rdv, DeleteModel dm) {
		this.rdv = rdv;
		this.delm = dm;
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
				UserModel dm = new UserModel();
				dm.setCf(rdv.getCodiceFiscale());
				dm.setId(rdv.getIdDipendente()); 
				//Warning:Fallimento o Successo.
				WarningView wv= new WarningView();
				if(delm.confermaEliminazione(dm)) {
					wv.registrEffettuata();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							wv.closeWindow();
						} 
					});
				}else{
					wv.mostraErrorPassword();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							wv.closeWindow();
						} 
					});
				}
			}
		});
	}
	/*
	public static void main(String[] args) {
		RimuoviDipView rdv = new RimuoviDipView();
		rdv.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		rdv.setVisible(true);
		RimuoviDipController r = new RimuoviDipController(rdv, null);
	}
	*/
}

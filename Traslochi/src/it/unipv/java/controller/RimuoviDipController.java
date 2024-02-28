package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.DeleteModel;
import it.unipv.java.util.responsabilitychain.RemoveDipHandler;
import it.unipv.java.view.RimuoviDipView;
import it.unipv.java.view.WarningView;

public class RimuoviDipController {

	private RimuoviDipView rdv;
	private DeleteModel delm;
	
	public RimuoviDipController(RimuoviDipView rdv) {
		this.rdv = rdv;
		setListeners();
	}
	
	private void setListeners() {
		rdv.getButtonAnnulla().addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				rdv.setVisible(false);	
			}
		});

		
		rdv.getButtonConfermaRim().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delm= new DeleteModel();
				delm.setCf(rdv.getCodiceFiscale());
				delm.setId(rdv.getIdDipendente());
				
				RemoveDipHandler rdh= new RemoveDipHandler(delm);
				boolean confElim = rdh.eliminaDipendente(rdh.getDipendente());
				WarningView wv = new WarningView();
				if(confElim) {
					rdv.setVisible(false);
					wv.elimEffettuata();
					rdv.setVisible(false);
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
						}
					});
				} else{
					wv.idErrato();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
							rdv.setIdDipendente("");
							rdv.setCfDipendente("");
						}
					});
				}
			}
		});
		
		
		
		
		
		
		
		
		
		/*		
		rdv.getButtonConfermaRim().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User dm = new User();
				dm.setCf(rdv.getCodiceFiscale());
				dm.setId(rdv.getIdDipendente()); 
				//Warning:Fallimento o Successo.
				WarningView wv= new WarningView();
				if(delm.confermaEliminazione(dm)) {
					wv.elimEffettuata();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							wv.closeWindow();
						} 
					});
					}else{
					wv.elimNonEffettuata();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							wv.closeWindow();
						} 
					});
				}
			}
		});*/
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

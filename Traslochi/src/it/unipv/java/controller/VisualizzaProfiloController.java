package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.user.User;
import it.unipv.java.view.VisualizzaProfiloView;

public class VisualizzaProfiloController {

	private User um;
	private VisualizzaProfiloView vpv;

	
	VisualizzaProfiloController(User um, VisualizzaProfiloView vpv) {
		this.um = um;
		this.vpv = vpv;
		setFields();
		setListeners();
	}

	
	private void setFields() {
		vpv.setNome(um.getNome());
		vpv.setCognome(um.getCognome());
		vpv.setEmail(um.getEmail());
		vpv.setCF(um.getCf());
 	}
	
	private void setListeners() {
		
		vpv.getBottoneNome().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getNomeArea().setEditable(true);
			}
		});
		
		vpv.getBottoneCognome().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getCognomeArea().setEditable(true);
			}
		});
		
		vpv.getBottoneEmail().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getEmailArea().setEditable(true);
			}
		});
		
		vpv.getBottoneCF().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getCfArea().setEditable(true);
			}
		});
		  
		vpv.getBottoneConferma().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getNomeArea().setEditable(false);
				vpv.getCognomeArea().setEditable(false);
				vpv.getEmailArea().setEditable(false);
				vpv.getCfArea().setEditable(false);
 				
				um.setNome(vpv.getNome());
				um.setCognome(vpv.getCognome());
				um.setEmail(vpv.getEmail());
				um.setCf(vpv.getCodFis());
 				 
//				vpm.modificaProfilo(um);
			}
		});
		
		vpv.getBottoneTornaIndietro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.setVisible(false);
			}
		});

		
	}
	














}

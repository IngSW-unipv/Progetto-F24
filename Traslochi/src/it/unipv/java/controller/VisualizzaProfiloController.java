package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.UserModel;
import it.unipv.java.view.VisualizzaProfiloView;

public class VisualizzaProfiloController {

	private UserModel um;
	private VisualizzaProfiloView vpv;
	
	VisualizzaProfiloController(UserModel um, VisualizzaProfiloView vpv) {
		this.um = um;
		this.vpv = vpv;
		setListeners();
	}

	private void setListeners() {
		vpv.setNome(um.getNome());
		vpv.setCognome(um.getCognome());
		vpv.setEmail(um.getEmail());
		vpv.setCF(um.getCf());
		vpv.setPassword(um.getPassword());
		
		vpv.getBottoneNome().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getNomeArea().setEditable(true);
			}
		});
	}
	














}

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
		setFields();
		setListeners();
	}

	
	private void setFields() {
		vpv.setNome(um.getNome());
		vpv.setCognome(um.getCognome());
		vpv.setEmail(um.getEmail());
		vpv.setCF(um.getCf());
		vpv.setPassword(um.getPassword());
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
		
		vpv.getBottonePassw().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getPassArea().setEditable(true);
			}
		});
		
		vpv.getBottoneConferma().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getNomeArea().setEditable(false);
				vpv.getCognomeArea().setEditable(false);
				vpv.getEmailArea().setEditable(false);
				vpv.getCfArea().setEditable(false);
				vpv.getPassArea().setEditable(false);
				
				um.setNome(vpv.getNome());
				um.setCognome(vpv.getCognome());
				um.setEmail(vpv.getEmail());
				um.setCf(vpv.getCodFis());
				um.setPassword(vpv.getPassword());
				
				//DA FARE UPDATE IN DB HO FATTO UN METODO CHE SI CHIAMA UPDATEUSER(UserModel userModel) in USERMODEL 
				//GUARDARE LI E IMPLEMENTARE QUA
				
			}
		});
		
		vpv.getBottoneTornaIndietro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.setVisible(false);
			}
		});

		
	}
	














}

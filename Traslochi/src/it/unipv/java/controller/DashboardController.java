package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.ResponsabileModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DashboardController {
	private UserModel um;
	private ResponsabileView rv;
	private ClienteView cv;
	private DipendenteView dv;
	private VisualizzaProfiloView pv;
	
	public DashboardController(UserModel um, ResponsabileView rv, VisualizzaProfiloView pv) {
		this.um = um;
		this.rv = rv;
		this.pv = pv;
		setlisteners(um, rv);
	}
	public DashboardController(UserModel um, ClienteView cv, VisualizzaProfiloView pv) {
		this.um = um;
		this.cv = cv;
		this.pv = pv;
		setlisteners(um, cv);
	}
	public DashboardController(UserModel um, DipendenteView dv, VisualizzaProfiloView pv) {
		this.um = um;
		this.dv = dv;
		this.pv = pv;
		setlisteners(um, dv);
	}
	private void setlisteners(UserModel um, ResponsabileView rv) {
		rv.getButtonVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});
	
		rv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
/*		
		rv.getButtonVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteView clienteView = new ClienteView();
				clienteView.setVisible(true);
			}
		});
*/
	}
	private void setlisteners(UserModel um, ClienteView cv) {
		cv.getBottoneVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});
/*	
		cv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
*/
	}
	private void setlisteners(UserModel um, DipendenteView dv) {
		dv.getButtonVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});
/*
		dv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
*/
	}
}

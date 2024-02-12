package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteController {
	private UserModel um;
	private ResponsabileView rv;
	private ClienteView cv;
	private DipendenteView dv;
	private VisualizzaProfiloView pv;
	
	public DipendenteController(UserModel um, DipendenteView dv, VisualizzaProfiloView pv) {
		this.um = um;
		this.dv = dv;
		this.pv = pv;
		setlisteners();
	}

	private void setlisteners() {
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

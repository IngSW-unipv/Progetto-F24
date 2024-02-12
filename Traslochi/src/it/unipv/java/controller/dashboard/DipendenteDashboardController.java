package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteDashboardController {
	private TurnoModel tm;
	private DipendenteView dv;
	private VisualizzaProfiloView pv;
	
	public DipendenteDashboardController(TurnoModel tm, DipendenteView dv, VisualizzaProfiloView pv) {
		this.tm = tm;
		this.dv = dv;
		this.pv = pv;
		fillTurno();
		setListeners();
	}

	private void fillTurno() {
		dv.setOrarioInizioTurno(null /*model inizio turno*/);
		dv.setIndirizzoLavoro(null /*model indirizzo lavoro*/);
		
	}

	private void setListeners() {
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

package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteController {
	private TurnoModel tm;
	private DipendenteView dv;
	private VisualizzaProfiloView pv;
	
 	public DipendenteController(TurnoModel tm, DipendenteView dv, VisualizzaProfiloView pv) { 
 		this.tm = tm;
		this.dv = dv;
		this.pv = pv;
		fillTurno();
		setListeners();
	}

	private void fillTurno() {
		dv.setOrarioInizioTurno();//LO SETTO QUANDO PREMO IL BOTTONE DI INIZIO TIMER
		dv.setIndirizzoLavoro(tm.get);
		dv.setOrarioFineTurno();//LO SETTO QUANDO PREMO IL BOTTONE DI FINE TIMER
		
	}

	private void setListeners() {
		dv.getButtonVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});
 
		dv.getButtonInizioTurno().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String orarioInizio = LocalTime.now().toString();
                dv.setOrarioInizioTurno(orarioInizio);
                tm.setOrarioInizio(orarioInizio); // Aggiorna il modello con l'orario di inizio
 				
			}
		});
		dv.getButtonFineTurno().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //SI stoppa TIMER  
			}
		});
 
 
	}
}

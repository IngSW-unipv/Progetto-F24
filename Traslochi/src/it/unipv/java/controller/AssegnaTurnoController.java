package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.Dipendente;
import it.unipv.java.model.user.Responsabile;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.AssegnaTurnoView;
import it.unipv.java.view.WarningView;

public class AssegnaTurnoController {

	private AssegnaTurnoView atv;
	private TurnoModel tm;
	
	public AssegnaTurnoController(AssegnaTurnoView atv) {
		this.atv = atv;
		this.atv.setVisible(true);
		setListeners();
	}
	
	private void setListeners() {
		atv.getButtonAnnulla().addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				atv.setVisible(false);	
			}
		});
		

		
		atv.getButtonConfTurno().addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				tm = new TurnoModel();
				tm.setIdDipendente(atv.getIdDip());
				tm.setIndLavoro(atv.getIndLavoro());
				tm.setOrarioini(atv.getOrarioIniTur());
				
				WarningView wv= new WarningView();
				boolean result = PersistanceFacade.getInstance().aggiungiTurno(tm);
				
				
				if(result && controlloID(atv.getIdDip()) && controlloSpaziVuoti(atv.getIdDip(), atv.getOrarioIniTur(), atv.getIndLavoro())) {
					atv.setVisible(false);
					wv.turnoAssegnato();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
						}
					});
				} else if (!result) {
					wv.turnoNonAssegnato();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
							atv.setOrarioIniTur("");
							atv.setIndLavoro("");
							atv.setIdDip("");
						}
					});
				} else if (!controlloID(atv.getIdDip())) {
					wv.idNonEsistente();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
							atv.setIdDip("");
						}
					});
				} else if (!controlloSpaziVuoti(atv.getIdDip(), atv.getOrarioIniTur(), atv.getIndLavoro())) {
					wv.spazioVuoto();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
						}
					});
				}
			}
		});
		
	}
	

	public boolean controlloID(String idInserito) {
		Responsabile resp = new Responsabile();
		boolean result= true;
		List<User> listaDip = resp.getDipendentiRegistrati();
		for(User user : listaDip) {
			Dipendente dipendente = (Dipendente) user;
			if(dipendente.getId().equals(atv.getIdDip())) {
				result= true;	
			} else {
				result= false;
			}
		}
		return result;
	}
	
	public boolean controlloSpaziVuoti(String idInserito, String orarioInserito, String indirizzoInserito) {
		boolean result= true;
		if(idInserito == "" || orarioInserito == "" || indirizzoInserito == "") {
			result= false;
		} else {
			result= true;
		}
		
		return result;
		
	}	
}

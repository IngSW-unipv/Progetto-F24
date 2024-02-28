package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.TurnoModel;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.AssegnaTurnoView;

public class AssegnaTurnoController {

	private AssegnaTurnoView atv;
	private TurnoModel tm;
	
	public AssegnaTurnoController(AssegnaTurnoView atv) {
		this.atv = atv;
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
				
				boolean result = PersistanceFacade.getInstance().aggiungiTurno(tm);
				if(result) {
					
				}
			}
		});
		
		
		
		
		
		
		
		
	}
}

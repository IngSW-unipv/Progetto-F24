package it.unipv.java.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.controller.PrenotazioneController;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ClienteController {
	private ClienteView cv;
	private VisualizzaProfiloView pv;
	
	public ClienteController(ClienteView cv) {
		this.cv = cv;
		
		riempiPrenotazioniClienteTXT();
		setListeners();
	}
	
	private void setListeners() {
		cv.getBottoneVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});

		cv.getBottonePrenotazione().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cv.setVisible(false);
				PrenotazioneView prenotazioneView = new PrenotazioneView();
				PrenotazioneController pc= new PrenotazioneController(prenotazioneView);
				prenotazioneView.setVisible(true);
			}
		});
	}
	
	private void riempiPrenotazioniClienteTXT() {
		List<PrenotazioneModel> prenotazioni= PersistanceFacade.getInstance().getPrenotazioniCliente();
		StringBuilder sb1 = new StringBuilder();
		
		for(PrenotazioneModel prenotazione : prenotazioni) {
			sb1.append(prenotazione.toString()).append("\n");
		}
		
		cv.getTextPrenotazioni().setText(sb1.toString());
		
	}
	
	
	
}
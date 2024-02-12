package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ClienteController {
	private UserModel um;
	private ClienteView cv;
	private VisualizzaProfiloView pv;
	
	public ClienteController(UserModel um, ClienteView cv, VisualizzaProfiloView pv) {
		this.um = um;
		this.cv = cv;
		this.pv = pv;
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
				PrenotazioneView prenotazioneView = new PrenotazioneView();
				prenotazioneView.setVisible(true);
			}
		});
		
			}
	
	private void riempiPrenotazioniClienteTXT() {
		DataAccessFacade.getInstance().stampaPrenotazioni(um);
	}
}
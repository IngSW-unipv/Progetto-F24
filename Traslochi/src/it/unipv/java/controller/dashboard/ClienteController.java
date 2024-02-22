package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.controller.PrenotazioneController;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ClienteController {
	private UserModel um;
	private ClienteView cv;
	private VisualizzaProfiloView pv;
	
	public ClienteController(UserModel um, ClienteView cv) {
		this.um = um;
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
		PrenotazioneModel pren = new PrenotazioneModel();
		List<PrenotazioneModel> lista = new ArrayList<PrenotazioneModel>();
		lista = pren.getPrenotazioniUtente(um);
		if(lista == null)
			cv.getTextPrenotazioni().setText("Nessuna Prenotazione Effettuata!");
		else
			for(PrenotazioneModel prenotazione : lista) {
				cv.getTextPrenotazioni().setText(
						prenotazione.getIndirizzodiRitiro() +
						prenotazione.getIndirizzoDiConsegna() +
						prenotazione.getDataRitiro() +
						prenotazione.getDataConsegna() +"/n");
		}
	}
}
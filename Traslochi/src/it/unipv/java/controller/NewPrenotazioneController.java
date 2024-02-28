package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.controller.user.ClienteController;
import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.util.prenotazionegestor.PrenotazioneHandler;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.view.WarningView;

public class NewPrenotazioneController {
	private PrenotazioneData datiInseriti;
	private PrenotazioneView pv;

	public NewPrenotazioneController(PrenotazioneView pv) {
		this.datiInseriti = new PrenotazioneData();
		this.pv = pv;
		setlisteners();
	}

	// Teoricamente sbagliato, troppo accoppiato ai radio, aggiungendo una nuova
	// tipologia di importo bisogna
	// aggiungere if/else, rotto principio di Open/Closed
	private void setlisteners() {
		pv.getButtonConfermaPren().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pv.getRadioCarta().isSelected()) {
					PrenotazioneHandler prenotazioneHandler = new PrenotazioneHandler(fillPrenotazioneCarta());
					prenotazioneHandler.registraPrenotazione();
				} else if (pv.getRadioContanti().isSelected()) {
					PrenotazioneHandler prenotazioneHandler = new PrenotazioneHandler(fillPrenotazioneContanti());
					prenotazioneHandler.registraPrenotazione();
				} else {
					WarningView wv = new WarningView();
					wv.mostraErrorMetodoPag();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
						}
					});
				}
			}
		});

		pv.getButtonTornaIndietro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteView clienteView = new ClienteView();
				ClienteController clienteController = new ClienteController(clienteView);
				pv.setVisible(false);
				clienteView.setVisible(true);
			}
		});

		// Terribile, ultra accoppiato ad un tipo di riempimento che non c'entra nulla
		pv.getButtonCalcolaImporto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti.setDataRitiro(pv.getDataRitiro());
				datiInseriti.setDataConsegna(pv.getDataConsegna());
				if ((pv.getDataRitiro() != null) && (pv.getDataConsegna() != null)) {
					PrenotazioneHandler prenotazioneHandler = new PrenotazioneHandler(fillPrenotazioneCarta());
					pv.setImportoDaPagare(Double.toString(prenotazioneHandler.calcolaImporto()));
				} else {
					WarningView wv = new WarningView();
					wv.mostraErrorGenerale();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
						}
					});
				}
			}
		});
	}

	public PrenotazioneData fillPrenotazioneCarta() {
		datiInseriti.setIndirizzoRitiro(pv.getIndirizzoRitiro());
		datiInseriti.setIndirizzoConsegna(pv.getIndirizzoConsegna());
		datiInseriti.setDataRitiro(pv.getDataRitiro());
		datiInseriti.setDataConsegna(pv.getDataConsegna());
		datiInseriti.setCvc(pv.getTextField_6());
		datiInseriti.setScadGiorno(pv.getTextField_7());
		datiInseriti.setScadMese(pv.getTextField_8());
		datiInseriti.setScadAnno(pv.getTextField_9());

		return datiInseriti;
	}

	public PrenotazioneData fillPrenotazioneContanti() {
		datiInseriti.setIndirizzoRitiro(pv.getIndirizzoRitiro());
		datiInseriti.setIndirizzoConsegna(pv.getIndirizzoConsegna());
		datiInseriti.setDataRitiro(pv.getDataRitiro());
		datiInseriti.setDataConsegna(pv.getDataConsegna());

		return datiInseriti;
	}
}

package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.view.ClienteView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.model.PrenotazioneModel;

public class PrenotazioneController {
	private PrenotazioneModel pm;
	private PrenotazioneView pv;

	public PrenotazioneController(PrenotazioneModel pm, PrenotazioneView pv) {
		this.pm = pm;
		this.pv = pv;
		setlisteners();
	}

	private void setlisteners() {
		pv.getButtonConfermaPren().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.setIndirizzodiRitiro(pv.getIndirizzoRitiro());
				pm.setIndirizzoDiConsegna(pv.getIndirizzoConsegna());
				pm.setDataRitiro(pv.getDataRitiro());
				pm.setDataConsegna(pv.getDataConsegna());
				pm.setCVC(pv.getTextField_6());
				  pm.setScadGiorno(pv.getTextField_7());
				pm.setScadMese(pv.getTextField_8());
				pm.setScadAnno(pv.getTextField_9());

				if (!pv.getRadioCarta().isSelected() && !pv.getRadioContanti().isSelected()) {
					// eccezione: pm.showErrorMessage("Seleziona un metodo di pagamento");
				}

				if (pm.validaDati()) {
					if (pm.savePrenotazione()) {
						// RITORNO ALLA VIEW PREN CREATA
					} else {
						// RITORNO ALLA VIEW PREN NON CREATA

					}

				} else {
					// pm.showErrorMessage("Errore nella prenotazione. Verifica i dati inseriti.");

				}
				;
			}
		});

		pv.getButtonTornaIndietro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteView clienteView = new ClienteView();
				clienteView.setVisible(true);
			}
		});
	}

}// fine prenotazione controller

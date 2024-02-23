package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.view.ClienteView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.view.WarningView;
import it.unipv.java.model.PrenotazioneModel;

public class PrenotazioneController {
	private PrenotazioneModel pm;
	private PrenotazioneView pv;
	private WarningView wv;
	private ClienteView cv;

	public PrenotazioneController(PrenotazioneView pv) {
		this.pm = new PrenotazioneModel();
		this.pv = pv;
		setlisteners();
	}

	private void setlisteners() {
		pv.getButtonConfermaPren().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PrenotazioneModel pm= new PrenotazioneModel();
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
					wv.mostraErrorMetodoPag();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();
						}
					});

				}

				if (pm.validaDati()) {
					if (pm.savePrenotazione()) {
						// RITORNO ALLA VIEW PREN CREATA
						pv.setVisible(false);
						cv.setVisible(true);
						wv.mostraPrenEff();
						wv.getBottoneRiprova().addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								wv.closeWindow();
							}
						});

						
					} else {
						// RITORNO ALLA VIEW PREN NON CREATA
						pv.setVisible(false);
						wv.mostraErrorGenerale();
					}

				} else {
					// pm.showErrorMessage("Errore nella prenotazione. Verifica i dati inseriti.");
					wv.mostraErrorGenerale();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							wv.closeWindow();	
						}
					});

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

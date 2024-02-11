package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.ResponsabileModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.ResponsabileView;

public class DashboardController {
	public UserModel um;
	public ResponsabileView rv;
	public ClienteView cv;
	public DipendenteView dv;
	
	public DashboardController(UserModel um, ResponsabileView rv) {
		this.um = um;
		this.rv = rv;
		setlisteners(um, rv);
	}
	public DashboardController(UserModel um, ClienteView cv) {
		this.um = um;
		this.cv = cv;
		setlisteners();
	}
	public DashboardController(UserModel um, DipendenteView dv) {
		this.um = um;
		this.dv = dv;
		setlisteners();
	}
	private void setlisteners(UserModel um, ResponsabileView rv) {
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
				if(!pv.getRadioCarta().isSelected() && !pv.getRadioContanti().isSelected()){
					//eccezione: pm.showErrorMessage("Seleziona un metodo di pagamento");
				}
				if(pm.validaDati())
					pm.savePrenotazione();
					// pm.showMessage("Prenotazione completata con successo!");
				else
					// pm.showErrorMessage("Errore nella prenotazione. Verifica i dati inseriti.");
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
	}
}

package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.UserModel;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendenteView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ClienteController {
	private UserModel um;
	private ResponsabileView rv;
	private ClienteView cv;
	private DipendenteView dv;
	private VisualizzaProfiloView pv;
	
	public DashboardController(UserModel um, ClienteView cv, VisualizzaProfiloView pv) {
		this.um = um;
		this.cv = cv;
		this.pv = pv;
		setlisteners(um, cv);
	}
	
	private void setlisteners(UserModel um, ClienteView cv) {
		cv.getBottoneVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});
/*	
		cv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
*/
	}
}

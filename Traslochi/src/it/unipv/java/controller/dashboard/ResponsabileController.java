package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.UserModel;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ResponsabileController {
	private UserModel um;
	private ResponsabileView rv;
	private VisualizzaProfiloView pv;
	
	public ResponsabileController(UserModel um, ResponsabileView rv, VisualizzaProfiloView pv) {
		this.um = um;
		this.rv = rv;
		this.pv = pv;
		setlisteners();
	}
	
	private void setlisteners() {
		rv.getButtonVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);
			}
		});
	
		rv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
/*		
		rv.getButtonVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteView clienteView = new ClienteView();
				clienteView.setVisible(true);
			}
		});
*/
}
}
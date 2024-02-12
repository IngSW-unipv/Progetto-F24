package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.AssegnaTurnoView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ResponsabileController {
	private UserModel um;
	private ResponsabileView rv;
	private VisualizzaProfiloView pv;
	private AssegnaTurnoView at;
	private TurnoModel tm;
	
	public ResponsabileController(UserModel um, ResponsabileView rv, VisualizzaProfiloView pv,AssegnaTurnoView at,TurnoModel tm) {
		this.um = um;
		this.rv = rv;
		this.pv = pv;
		this.at=at;
		this.tm=tm;
		setListeners();
	}
	
	private void setListeners() {
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
		
	at.getButtonConfTurno().addActionListener(new ActionListener() {
		
  public void actionPerformed(ActionEvent e) {
				tm.setIdDipendente(at.getIdDip());
				tm.setIndLavoro(at.getIndLavoro());
				tm.setOrarioini(at.getOrarioIniTur()); 
				boolean success=tm.AggiungiTurno();
 			}
		});
	
}//fine set Listener
	
	
}//fine ResponsabileController
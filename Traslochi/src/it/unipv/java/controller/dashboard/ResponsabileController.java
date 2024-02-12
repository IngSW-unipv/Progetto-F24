package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.AssegnaTurnoView;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ResponsabileController {
	private UserModel um;
	private ResponsabileView rv;
 	private AssegnaTurnoView at;
	private TurnoModel tm;
	private PrenotazioneModel pm;
	public ResponsabileController(UserModel um, ResponsabileView rv,  AssegnaTurnoView at,TurnoModel tm) {
		this.um = um;
		this.rv = rv;
 		this.at=at;
		this.tm=tm;
		setListeners();
	}
	
	private void setListeners() {
		 
	
		rv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
 
	 
		
	at.getButtonConfTurno().addActionListener(new ActionListener() {
		
  public void actionPerformed(ActionEvent e) {
				tm.setIdDipendente(at.getIdDip());
				tm.setIndLavoro(at.getIndLavoro());
				tm.setOrarioini(at.getOrarioIniTur()); 
				boolean success=tm.aggiungiTurno(); //TI RITORNA DAL DB RESTUIRE QUALCOSA VIEW
 			}
		});
	   
	
	//ORA DEVO MOSTRARE TUTTI I DIPENDENTI DAL DB
	 um.tuttiDipendenti();//ARRAYLIST CON TUTTI I DIPENDENTI QUA SI FA BINDING COMPONENTE VIEW E DIPENDENTI, SECONDO ME NON ANDRANNO TUTTI A CAPO SARANNO TUTTI IN UN UNICA FILA
	//ORA DEVO MOSTRARE TUTTE LE PRENOTAZIONI DAL DB
	pm.mostratuttePrenotazioni();
	//ORA DEVO MOSTRARE TUTTE I TURNI
	tm.mostraTurni();
}//fine set Listener
	
	
}//fine ResponsabileController
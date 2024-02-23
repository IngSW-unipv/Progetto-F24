package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
	
	//HO TOLTO ASSEGNATURNO E TURNOMODEL DAL COSTRUTTORE --> NIKUZ
	public ResponsabileController(UserModel um, ResponsabileView rv) {
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
	List<UserModel> dipendenti= um.tuttiDipendenti();//ARRAYLIST CON TUTTI I DIPENDENTI QUA SI FA BINDING COMPONENTE VIEW E DIPENDENTI, SECONDO ME NON ANDRANNO TUTTI A CAPO SARANNO TUTTI IN UN UNICA FILA
	StringBuilder sb = new StringBuilder();
	
	for(UserModel dipendente : dipendenti) {
		sb.append(dipendente.toString()).append("\n");
	}
	
	rv.getTuttiDipendenti().setText(sb.toString());
	
	
	
	//ORA DEVO MOSTRARE TUTTE LE PRENOTAZIONI DAL DB
	List<PrenotazioneModel> prenotazioni= pm.mostratuttePrenotazioni();
	StringBuilder sb1 = new StringBuilder();
	
	for(PrenotazioneModel prenotazione : prenotazioni) {
		sb1.append(prenotazione.toString()).append("\n");
	}
	
	rv.getTuttePrenotazioni().setText(sb1.toString());
		
		
		
		
	//ORA DEVO MOSTRARE TUTTE I TURNI
	List<TurnoModel> turni= tm.mostraTurni();
	StringBuilder sb2 = new StringBuilder();
	
	for(TurnoModel turno : turni) {
		sb2.append(turno.toString()).append("\n");
	}
	
	rv.getTuttiTurni().setText(sb2.toString());
	
	
	
	
	
	
}//fine set Listener
	
	
}//fine ResponsabileController
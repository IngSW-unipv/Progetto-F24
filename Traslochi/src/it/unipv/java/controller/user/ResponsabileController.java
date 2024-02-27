package it.unipv.java.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.TurnoData;
import it.unipv.java.model.user.Dipendente;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.AssegnaTurnoView;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ResponsabileController {
	private Dipendente dip;
	private ResponsabileView rv;
 	private AssegnaTurnoView at;
	private TurnoData tm;
	private PrenotazioneData pm;
	
	//HO TOLTO ASSEGNATURNO E TURNOMODEL DAL COSTRUTTORE --> NIKUZ
	public ResponsabileController(ResponsabileView rv) {
		this.rv = rv;
		setListeners();
	}
	
	private void setListeners() {	
		rv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				registerView.setVisible(true);
			}
		});
 
	 
		
		
		
		
	//QUESTO è DA INSERIRE IN ASSEGNATURNOCONTROLLER !!!!!!!!!!!!!!!!!!	
	/*at.getButtonConfTurno().addActionListener(new ActionListener() {
		
    public void actionPerformed(ActionEvent e) {
				tm.setIdDipendente(at.getIdDip());
				tm.setIndLavoro(at.getIndLavoro());
				tm.setOrarioini(at.getOrarioIniTur()); 
				boolean success=tm.aggiungiTurno(); //TI RITORNA DAL DB RESTUIRE QUALCOSA VIEW
				
 			}
		});
	   
	*/
		
		
	//QUESTO SERVE PER MOSTRARE LE ROBE NELLE LISTE APPENA SARANNO RIEMPITE CON QUALCOSA	
	//ORA DEVO MOSTRARE TUTTI I DIPENDENTI DAL DB	
	
	List<User> dipendenti= PersistanceFacade.getInstance().getTuttiDipendenti();//ARRAYLIST CON TUTTI I DIPENDENTI QUA SI FA BINDING COMPONENTE VIEW E DIPENDENTI, SECONDO ME NON ANDRANNO TUTTI A CAPO SARANNO TUTTI IN UN UNICA FILA
	StringBuilder sb = new StringBuilder();
	
	for(User dipendente : dipendenti) {
		sb.append(dipendente.toString()).append("\n");
	}
	
	rv.getTuttiDipendenti().setText(sb.toString());
	
	
	
	//ORA DEVO MOSTRARE TUTTE LE PRENOTAZIONI DAL DB
	List<PrenotazioneData> prenotazioni= PersistanceFacade.getInstance().mostraPrenotazioni();
	StringBuilder sb1 = new StringBuilder();
	
	for(PrenotazioneData prenotazione : prenotazioni) {
		sb1.append(prenotazione.toString()).append("\n");
	}
	
	rv.getTuttePrenotazioni().setText(sb1.toString());
		
		
		
		
	//ORA DEVO MOSTRARE TUTTE I TURNI
	List<TurnoData> turni= PersistanceFacade.getInstance().mostraTurni();
	StringBuilder sb2 = new StringBuilder();
	
	for(TurnoData turno : turni) {
		sb2.append(turno.toString()).append("\n");
	}
	
	rv.getTuttiTurni().setText(sb2.toString());
	
	
	
	
	
	
}//fine set Listener
	
	
}//fine ResponsabileController
package it.unipv.java.controller.icontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import it.unipv.java.controller.AssegnaTurnoController;
import it.unipv.java.controller.RimuoviDipController;
import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.Responsabile;
import it.unipv.java.model.user.User;
import it.unipv.java.util.controllerpila.ControllerGestor;
import it.unipv.java.view.AssegnaTurnoView;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.RimuoviDipView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ResponsabileController implements IController{
	private ResponsabileView rv;

	public ResponsabileController(ResponsabileView rv) {
		this.rv = rv;
		this.rv.setVisible(true);
		riempiPrenotazioniTXT();
		riempiTurnoTXT();
		riempiDipendentiTXT();
		setListeners();
	}

	private void setListeners() {
		rv.getButtonAggiungiDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				RegisterController registerController = new RegisterController(registerView);
				riempiPrenotazioniTXT();
			    riempiTurnoTXT();
			    riempiDipendentiTXT();
				ControllerGestor.getInstance().getStack().push(registerController);
				rv.setVisible(false);
			}
		});
		
		rv.getButtonAssegnaTurno().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AssegnaTurnoView atv = new AssegnaTurnoView();
				AssegnaTurnoController atc = new AssegnaTurnoController(atv);
				atv.setVisible(true);
				
			}
		});
		
		rv.getButtonRimuoviDip().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RimuoviDipView rimuoviDipView = new RimuoviDipView();
				RimuoviDipController rdc = new RimuoviDipController(rimuoviDipView);
				rimuoviDipView.setVisible(true);
			}
		});
		
		rv.getButtonVisProfilo().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VisualizzaProfiloView profiloView = new VisualizzaProfiloView();
				VisualizzaProfiloController profiloController = new VisualizzaProfiloController(profiloView);
				profiloView.setVisible(true);
            }
        });
		
		rv.getButtonLogOut().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SingleSessioneAttiva.getInstance().logout();
            	rv.setVisible(false); 
            	ControllerGestor.getInstance().getStack().pop();
            	IController precController = ControllerGestor.getInstance().getStack().peek();
            	precController.getView().setVisible(true);
//            	
            }
        });
	 
		
	}

	private void riempiPrenotazioniTXT() {
		List<PrenotazioneData> tuttePrenotazioni = new ArrayList<PrenotazioneData>();
		Responsabile responsabileLoggato = new Responsabile();
		responsabileLoggato = (Responsabile) SingleSessioneAttiva.getInstance().getUtenteAttivo();
		tuttePrenotazioni = responsabileLoggato.getPrenotazioniRegistrate();
		StringBuilder sb = new StringBuilder();

		for (PrenotazioneData prenotazione : tuttePrenotazioni) {
			sb.append(prenotazione.toString()).append("\n");
		}
		rv.getTuttePrenotazioni().setText(sb.toString());
	} 
	private void riempiDipendentiTXT() {
		List<User> tuttiDipendenti = new ArrayList<User>();
		Responsabile responsabileLoggato = new Responsabile();
		responsabileLoggato = (Responsabile) SingleSessioneAttiva.getInstance().getUtenteAttivo();
		tuttiDipendenti = responsabileLoggato.getDipendentiRegistrati();
		StringBuilder sb = new StringBuilder();

		for (User turno : tuttiDipendenti) {
			sb.append(turno.toString()).append("\n");
		}
		rv.getTuttiDipendenti().setText(sb.toString());
	}

	private void riempiTurnoTXT() {
		List<TurnoModel> tuttiTurni = new ArrayList<TurnoModel>();
		Responsabile responsabileLoggato = new Responsabile();
		responsabileLoggato = (Responsabile) SingleSessioneAttiva.getInstance().getUtenteAttivo();
		tuttiTurni = responsabileLoggato.getTurniRegistrati();
		StringBuilder sb = new StringBuilder();

		for (TurnoModel turno : tuttiTurni) {
			sb.append(turno.toString()).append("\n");
		}
		rv.getTuttiTurni().setText(sb.toString());
	}

	@Override
	public JFrame getView() {
		// TODO Auto-generated method stub
		return this.rv;
	}
}
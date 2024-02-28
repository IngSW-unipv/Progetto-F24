package it.unipv.java.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import it.unipv.java.controller.LoginController;
import it.unipv.java.controller.VisualizzaProfiloController;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.User;
import it.unipv.java.view.DipendentView;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteController {
    private TurnoModel tm;
    private DipendentView dv;
    
    public DipendenteController(DipendentView dv) { 
        this.tm = new TurnoModel();
        this.dv = dv;
        setListeners();
    }

    private void setListeners() {
        dv.getButtonVisProfilo().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VisualizzaProfiloView profiloView = new VisualizzaProfiloView();
				VisualizzaProfiloController profiloController = new VisualizzaProfiloController(profiloView);
				profiloView.setVisible(true);
            }
        });

        dv.getButtonInizioTurno().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String orarioInizio = LocalTime.now().toString();
                dv.setOrarioInizioTurno(orarioInizio); //DAL DATABASE IL RESPONSABILE ASSEGNA TURNO
                tm.setOrarioini(orarioInizio);  
                
                dv.setIndirizzoLavoro(tm.getIndLavoro());
            }
        });

        dv.getButtonFineTurno().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Registra l'orario di fine turno
                String orarioFine = LocalTime.now().toString();
                dv.setOrarioFineTurno(orarioFine);
                 
             }
        });
        
        dv.getButtonLogOut().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	LoginView login = new LoginView();
            	LoginController lg=new LoginController(login);
            	dv.setVisible(false);
            	login.setVisible(true);
                  
             }
        });
    }
}

package it.unipv.java.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.view.DipendentView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteController {
    private TurnoModel tm;
    private DipendentView dv;
    private VisualizzaProfiloView pv;
    private UserModel um;
    
    public DipendenteController(DipendentView dv) { 
        this.tm = new TurnoModel();
        this.um=um;
        this.dv = dv;
        this.pv = pv;
        setListeners();
    }

    private void setListeners() {
        dv.getButtonVisProfilo().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pv.setVisible(true);
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
    }
}
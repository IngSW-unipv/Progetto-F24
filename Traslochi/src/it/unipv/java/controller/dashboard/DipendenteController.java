package it.unipv.java.controller.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import it.unipv.java.model.TurnoModel;
import it.unipv.java.persistance.DataAccessFacade;
import it.unipv.java.view.DipendentView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteController {
    private TurnoModel tm;
    private DipendentView dv;
    private VisualizzaProfiloView pv;
    
    public DipendenteController(TurnoModel tm, DipendentView dv, VisualizzaProfiloView pv) { 
        this.tm = tm;
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

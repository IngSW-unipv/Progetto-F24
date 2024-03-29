package it.unipv.java.controller.icontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JFrame;

import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.util.controllerpila.ControllerGestor;
import it.unipv.java.view.DipendentView;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.VisualizzaProfiloView;

public class DipendenteController implements IController{
    private TurnoModel tm;
    private DipendentView dv;
    
    public DipendenteController(DipendentView dv) { 
        this.tm = new TurnoModel();
        this.dv = dv;
        this.dv.setVisible(true);
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
            	SingleSessioneAttiva.getInstance().logout();
            	dv.setVisible(false); 
            	ControllerGestor.getInstance().getStack().pop();
            	IController precController = ControllerGestor.getInstance().getStack().peek();
            	precController.getView().setVisible(true);
                  
             }
        });
    }

	@Override
	public JFrame getView() {
		return this.dv;
	}
}

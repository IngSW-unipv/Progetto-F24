package it.unipv.java.controller.icontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.view.VisualizzaProfiloView;

public class VisualizzaProfiloController implements IController{
	private VisualizzaProfiloView vpv;

	
	public VisualizzaProfiloController(VisualizzaProfiloView vpv) {
		this.vpv = vpv;
		this.vpv.setVisible(true);
		setFields();
		setListeners();
	}

	
	private void setFields() {
		vpv.setNome(SingleSessioneAttiva.getInstance().getUtenteAttivo().getNome());
		vpv.setCognome(SingleSessioneAttiva.getInstance().getUtenteAttivo().getCognome());
		vpv.setEmail(SingleSessioneAttiva.getInstance().getUtenteAttivo().getEmail());
		vpv.setCF(SingleSessioneAttiva.getInstance().getUtenteAttivo().getCf());
 	}
	
	private void setListeners() {
		
		vpv.getBottoneNome().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getNomeArea().setEditable(true);
			}
		});
		
		vpv.getBottoneCognome().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getCognomeArea().setEditable(true);
			}
		});
		
		vpv.getBottoneEmail().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getEmailArea().setEditable(true);
			}
		});
		
		vpv.getBottoneCF().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getCfArea().setEditable(true);
			}
		});
		  
		vpv.getBottoneConferma().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.getNomeArea().setEditable(false);
				vpv.getCognomeArea().setEditable(false);
				vpv.getEmailArea().setEditable(false);
				vpv.getCfArea().setEditable(false);
 				
 				 if(SingleSessioneAttiva.getInstance().modificaProfilo()) {
 					SingleSessioneAttiva.getInstance().getUtenteAttivo().setNome(vpv.getNome());
 					SingleSessioneAttiva.getInstance().getUtenteAttivo().setCognome(vpv.getCognome());
 					SingleSessioneAttiva.getInstance().getUtenteAttivo().setEmail(vpv.getEmail());
 					SingleSessioneAttiva.getInstance().getUtenteAttivo().setCf(vpv.getCodFis());
 					 //chiude view visualizzaprofilo e mostra view registrazione effettuata
 				 }else {
 					 //warning view
 				 }

 				//vpm.modificaProfilo(um);
			}
		});
		
		vpv.getBottoneTornaIndietro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpv.setVisible(false);
			}
		});

		
	}

	@Override
	public JFrame getView() {
		return this.vpv;
	}
	














}

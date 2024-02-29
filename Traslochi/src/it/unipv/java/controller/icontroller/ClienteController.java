package it.unipv.java.controller.icontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.Cliente;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.PrenotazioneView;
import it.unipv.java.view.VisualizzaProfiloView;

public class ClienteController implements IController{
	private ClienteView clienteView;

	public ClienteController(ClienteView clienteView) {
		this.clienteView = clienteView;
		this.clienteView.setVisible(true);

		riempiPrenotazioniClienteTXT();
		setListeners();
	}

	private void setListeners() {
		clienteView.getBottoneVisProfilo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizzaProfiloView profiloView = new VisualizzaProfiloView();
				VisualizzaProfiloController profiloController = new VisualizzaProfiloController(profiloView);
				profiloView.setVisible(true);
			}
		});

		clienteView.getBottonePrenotazione().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteView.setVisible(false);
				PrenotazioneView prenotazioneView = new PrenotazioneView();
				PrenotazioneController prenotazioneController = new PrenotazioneController(prenotazioneView);
				prenotazioneView.setVisible(true);
				clienteView.setVisible(false);
			}
		});
		clienteView.getBottoneLogOut().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SingleSessioneAttiva.getInstance().logout();
            	LoginView login = new LoginView();
            	LoginController lg = new LoginController(login);
            	login.setVisible(true);
            	clienteView.setVisible(false); 
            }
        });
	}

	private void riempiPrenotazioniClienteTXT() {
		Cliente clienteLoggato = new Cliente();
		List<PrenotazioneData> prenotazioni = new ArrayList<PrenotazioneData>();

		clienteLoggato = (Cliente) SingleSessioneAttiva.getInstance().getUtenteAttivo();
		prenotazioni = clienteLoggato.getPrenotazioniUtente();
		StringBuilder sb = new StringBuilder();

		for (PrenotazioneData prenotazione : prenotazioni) {
			sb.append(prenotazione.toString()).append("\n");
		}
		clienteView.getTextPrenotazioni().setText(sb.toString());
	}

	@Override
	public JFrame getView() {
		return this.clienteView;
	}

}
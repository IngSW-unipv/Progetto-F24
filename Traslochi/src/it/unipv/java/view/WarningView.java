package it.unipv.java.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class WarningView {

	private JFrame frame;
	private JButton riprovaButton;
	private JLabel label;
	private JPanel panel;

	public WarningView() {
		initialize();
		
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 232, 81);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 243, 102);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		label = new JLabel("  Attenzione, le password non combaciano!");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(0, 10, 233, 28);
		panel.add(label);
		
		riprovaButton = new JButton("Riprova");
		riprovaButton.setBackground(SystemColor.textHighlight);
		riprovaButton.setForeground(SystemColor.activeCaption);
		riprovaButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		riprovaButton.setBorder(null);
		riprovaButton.setBounds(68, 42, 89, 23);
		panel.add(riprovaButton);
		riprovaButton.setFocusable(false);
	}
	
	public void mostraErrorPassword() {
		initialize();
		frame.setVisible(true);
		label.setText("Password non coincidono!");
		riprovaButton.setText("Riprova");
	}
	
	public void mostraErrorEmail() {
		initialize();
		frame.setVisible(true);
		label.setText("Email errata, riprovare");
		riprovaButton.setText("Riprova");
	}
	
	public void registrEffettuata() {
		initialize();
		frame.setVisible(true);
		label.setText("Registrazione effettuata!");
		riprovaButton.setText("ok");
		
		
	}
	
	public void mostraErrorGenerale() {
		initialize();
		frame.setVisible(true);
		label.setText("Errore, riprovare");
		riprovaButton.setText("Riprova");
	}
	
	public void mostraErroreLoginUtente() {
		initialize();
		frame.setVisible(true);
		label.setText("L'utente/La Password inserite sono errate!");
		riprovaButton.setText("Riprova");
	}
	
	public void mostraErrorMetodoPag() {
		initialize();
		frame.setVisible(true);
		label.setText("Inserire Metodo di Pagamento!");
		riprovaButton.setText("ok");
	}
	
	public void mostraPrenEff() {
		initialize();
		frame.setVisible(true);
		label.setText("Prenotazione Effettuata!");
		riprovaButton.setText("ok");
	}
	
	public JButton getBottoneRiprova() {
		return riprovaButton;
	}
	
	public void closeWindow() {
        frame.setVisible(false);
    }
	
	public void idErrato() {
		initialize();
		frame.setVisible(true);
		label.setText("ID o CF errato/i");
		riprovaButton.setText("Riprova");
	}


	public void elimEffettuata() {
		initialize();
		frame.setVisible(true);
		label.setText("Dipendente rimosso!");
		riprovaButton.setText("ok");
		
	}


	public void elimNonEffettuata() {
		initialize();
		frame.setVisible(true);
		label.setText("Dipendente non presente !");
		riprovaButton.setText("Riprova");
		
	}
	
	public void turnoAssegnato() {
		initialize();
		frame.setVisible(true);
		label.setText("turno assegnato");
		riprovaButton.setText("ok");
	}
	
	public void turnoNonAssegnato() {
		initialize();
		frame.setVisible(true);
		label.setText("errore nei dati, riprovare");
		riprovaButton.setText("Riprova");
		
	}
	
	public void idNonEsistente() {
		initialize();
		frame.setVisible(true);
		label.setText("ID errato, riprovare");
		riprovaButton.setText("Riprova");
	}
	
	public void spazioVuoto() {
		initialize();
		frame.setVisible(true);
		label.setText("inserire tutti i dati!");
		riprovaButton.setText("Riprova");
	}
	
	public boolean isVisible() {
		if (frame.isVisible()) {
			return true;
		} else {
			return false;
		}
	}



	public void mostraErrorPrenotazione() {
		initialize();
		frame.setVisible(true);
		label.setText("Registrazione non effettuata!");
		riprovaButton.setText("Riprova");
	}
  
	public void mostraErrorCfErrato() {
		initialize();
		frame.setVisible(true);
		label.setText("Codice Fiscale non valido!");
		riprovaButton.setText("Riprova");
	}

	public void mostraConfermaPrenotazione() {
		initialize();
		frame.setVisible(true);
		label.setText("Registrazione effettuata!");
		riprovaButton.setText("OK");
	}

	public void mostraErrorCampiVuoti() {
		initialize();
		frame.setVisible(true);
		label.setText("Riempi tutti i campi!");
		riprovaButton.setText("Riprova");	
	}
    
	public void mostraErrorPasswordNonValida() {
		initialize();
		frame.setVisible(true);
		label.setText("La Password dovrebbe avere almeno Un carattere maiuscolo, un numero e un carattere speciale!");
		riprovaButton.setText("Riprova");
	}


	public void mostraErroreNome() {
		initialize();
		frame.setVisible(true);
		label.setText("Il nome non dovrebbe contenere numeri/caratteri speciali!");
		riprovaButton.setText("Riprova");	
	}


	public void mostraErrorEmailNonValida() {
		initialize();
		frame.setVisible(true);
		label.setText("La mail non è valida!");
		riprovaButton.setText("Riprova");			
	}
}

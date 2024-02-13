package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Point;
import javax.swing.SwingConstants;

public class WarningView {

	private JFrame frame;
	private JButton riprovaButton;
	private JLabel label;
	private JPanel panel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarningView window = new WarningView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
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
	
	public boolean isVisible() {
		if (frame.isVisible()) {
			return true;
		} else {
			return false;
		}
	}
}

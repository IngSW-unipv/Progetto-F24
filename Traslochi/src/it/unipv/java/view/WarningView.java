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

public class WarningView {

	private JFrame frame;
	private JButton riprovaButton;
	private JLabel labelPassword;
	private JLabel labelEmail;
	private JLabel labelRegistrazione;
	private JLabel labelErrore;

	
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 243, 102);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		labelPassword = new JLabel("  Attenzione, le password non combaciano!");
		labelPassword.setForeground(SystemColor.textHighlight);
		labelPassword.setFont(new Font("Tahoma", Font.BOLD, 10));
		labelPassword.setBounds(10, 0, 233, 54);
		panel.add(labelPassword);
		
		riprovaButton = new JButton("Riprova");
		riprovaButton.setBackground(SystemColor.textHighlight);
		riprovaButton.setForeground(SystemColor.activeCaption);
		riprovaButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		riprovaButton.setBorder(null);
		riprovaButton.setBounds(68, 42, 89, 23);
		panel.add(riprovaButton);
		riprovaButton.setFocusable(false);
		
		labelEmail = new JLabel("Questa email esiste già!");
		labelEmail.setForeground(SystemColor.textHighlight);
		labelEmail.setFont(new Font("Tahoma", Font.BOLD, 10));
		labelEmail.setBounds(49, 0, 132, 54);
		panel.add(labelEmail);
		
		labelRegistrazione = new JLabel("Registrazione Effettuata");
		labelRegistrazione.setForeground(SystemColor.textHighlight);
		labelRegistrazione.setFont(new Font("Tahoma", Font.BOLD, 10));
		labelRegistrazione.setBounds(49, -5, 132, 65);
		panel.add(labelRegistrazione);
		
		labelErrore = new JLabel("Errore, controllare i dati!");
		labelErrore.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelErrore.setForeground(SystemColor.textHighlight);
		labelErrore.setBounds(37, 10, 144, 35);
		panel.add(labelErrore);
	}
	
	public void mostraErrorPassword() {
		initialize();
		labelPassword.setVisible(true);
		labelEmail.setVisible(false);
		labelRegistrazione.setVisible(false);
		riprovaButton.setText("Riprova");
	}
	
	public void mostraErrorEmail() {
		initialize();
		labelPassword.setVisible(false);
		labelEmail.setVisible(true);
		labelRegistrazione.setVisible(false);
		riprovaButton.setText("Riprova");
	}
	
	public void registrEffettuata() {
		initialize();
		labelPassword.setVisible(false);
		labelEmail.setVisible(false);
		labelRegistrazione.setVisible(true);
		riprovaButton.setText("ok");
		
		
	}
	
	public void mostraErrorGenerale() {
		initialize();
		labelPassword.setVisible(false);
		labelEmail.setVisible(false);
		labelRegistrazione.setVisible(false);
		labelErrore.setVisible(true);
		riprovaButton.setText("Riprova");
	}
	
	public JButton getBottoneRiprova() {
		return riprovaButton;
	}
	
	public void closeWindow() {
        frame.dispose();
    }
}

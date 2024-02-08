package it.unipv.java.view;

import java.awt.EventQueue;
import it.unipv.java.view.RegisterView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Point;

public class WarningView {

	private JFrame frame;
	private RegisterView registerView;
	private JButton riprovaButton;
	private JLabel labelPassword;
	private JLabel labelEmail;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public WarningView() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Progetto-F24\\Traslochi\\resources\\bidons.jpg"));
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 232, 81);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(registerView.getJPasswordField());
		
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
	}
	
	public void mostraErrorPassword() {
		labelPassword.setVisible(true);
		labelEmail.setVisible(false);
		initialize();
	}
	
	public void mostraErrorEmail() {
		labelPassword.setVisible(false);
		labelEmail.setVisible(true);
		initialize();
	}
	
	public JButton getBottoneRiprova() {
		return riprovaButton;
	}
	
	public void closeWindow() {
        frame.dispose();
    }
}

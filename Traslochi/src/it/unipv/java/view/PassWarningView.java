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

public class PassWarningView {

	private JFrame frame;
	private RegisterView registerView;
	private JButton riprovaButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassWarningView window = new PassWarningView();
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
	public PassWarningView() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nikola.manev\\Downloads\\bidons.jpg"));
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
		
		JLabel lblNewLabel = new JLabel("  Attenzione, le password non combaciano!");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(10, 0, 233, 54);
		panel.add(lblNewLabel);
		
		riprovaButton = new JButton("Riprova");
		riprovaButton.setBackground(SystemColor.textHighlight);
		riprovaButton.setForeground(SystemColor.activeCaption);
		riprovaButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		riprovaButton.setBorder(null);
		riprovaButton.setBounds(68, 42, 89, 23);
		panel.add(riprovaButton);
		riprovaButton.setFocusable(false);
	}
	
	public void mostraErrorMessage() {
		initialize();
	}
	
	public JButton getBottoneRiprova() {
		return riprovaButton;
	}
	
	public void closeWindow() {
        frame.dispose();
    }
}

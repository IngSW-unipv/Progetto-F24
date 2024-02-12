package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class DipendenteView extends JFrame {

	private JPanel contentPane;
	private JButton buttonVisProfilo_1;
	private JTextPane orarioInizioTurno;
	private JTextPane orarioFineTurno;
	private JTextPane indirizzoLavoro;
	private JButton buttonInizioTurno;
	private JButton buttonFineTurno;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DipendenteView frame = new DipendenteView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public DipendenteView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nikola.manev\\Desktop\\immagini java\\bookPren.jpg"));
		setTitle("Bidons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 505);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBorder(null);
		panel.setBounds(0, 0, 1206, 79);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Turno Lavorativo");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		buttonVisProfilo_1 = new JButton("Visualizza Profilo");
		buttonVisProfilo_1.setForeground(SystemColor.window);
		buttonVisProfilo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVisProfilo_1.setFocusable(false);
		buttonVisProfilo_1.setBorder(null);
		buttonVisProfilo_1.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(54)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addGap(431)
					.addComponent(buttonVisProfilo_1, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
					.addGap(397))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(buttonVisProfilo_1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(26))
		);
		panel.setLayout(gl_panel);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		panel_1.setBorder(null);
		panel_1.setBounds(0, 78, 901, 388);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Orario di Inizio Turno");
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblOrarioDiFine = new JLabel("Orario di Fine Turno\r\n");
		lblOrarioDiFine.setForeground(SystemColor.activeCaption);
		lblOrarioDiFine.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		orarioInizioTurno = new JTextPane();
		orarioInizioTurno.setEditable(false);
		orarioInizioTurno.setBackground(SystemColor.inactiveCaptionBorder);
		
		orarioFineTurno = new JTextPane();
		orarioFineTurno.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel lblLuogoDiLavoro = new JLabel("Indirizzo Assegnato (Città, Indirizzo, CAP)");
		lblLuogoDiLavoro.setForeground(SystemColor.activeCaption);
		lblLuogoDiLavoro.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		indirizzoLavoro = new JTextPane();
		indirizzoLavoro.setEditable(false);
		indirizzoLavoro.setBackground(SystemColor.inactiveCaptionBorder);
		
		buttonInizioTurno = new JButton("Inizio Turno");
		buttonInizioTurno.setForeground(SystemColor.text);
		buttonInizioTurno.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonInizioTurno.setFocusable(false);
		buttonInizioTurno.setBorder(null);
		buttonInizioTurno.setBackground(SystemColor.textHighlight);
		
		buttonFineTurno = new JButton("Fine Turno");
		buttonFineTurno.setForeground(SystemColor.text);
		buttonFineTurno.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonFineTurno.setFocusable(false);
		buttonFineTurno.setBorder(null);
		buttonFineTurno.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(129)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(28)
							.addComponent(orarioInizioTurno, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
							.addGap(55)))
					.addGap(311)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(31)
							.addComponent(orarioFineTurno, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblOrarioDiFine, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
					.addGap(125))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(274)
					.addComponent(lblLuogoDiLavoro, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
					.addGap(302))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(187)
					.addComponent(indirizzoLavoro, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
					.addGap(211))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(278)
					.addComponent(buttonInizioTurno, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(164)
					.addComponent(buttonFineTurno, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addGap(289))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addGap(19))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(31)
							.addComponent(orarioInizioTurno))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(31)
							.addComponent(orarioFineTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblOrarioDiFine, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addGap(19)))
					.addGap(48)
					.addComponent(lblLuogoDiLavoro, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(indirizzoLavoro, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addGap(94)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonInizioTurno, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonFineTurno, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
					.addGap(61))
		);
		panel_1.setLayout(gl_panel_1);
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JButton getButtonVisProfilo() {
		return buttonVisProfilo_1;
	}


	public void setButtonVisProfilo(JButton buttonVisProfilo) {
		this.buttonVisProfilo_1 = buttonVisProfilo;
	}


	public String getOrarioInizioTurno() {
		return orarioInizioTurno.getContentType();
	}


	public void setOrarioInizioTurno(String orarioInizio) {
		orarioInizioTurno.setText(orarioInizio);
 	}


	public JTextPane getOrarioFineTurno() {
		return orarioFineTurno;
	}


	public void setOrarioFineTurno(String  orarioFine) {
		 orarioFineTurno.setText(orarioFine);  
	}


	public JTextPane getIndirizzoLavoro() {
		return indirizzoLavoro;
	}


	public void setIndirizzoLavoro(String indirizzo ) {
		indirizzoLavoro.setText(indirizzo);

	}


	public JButton getButtonInizioTurno() {
		return buttonInizioTurno;
	}


	public void setButtonInizioTurno(JButton buttonInizioTurno) {
		this.buttonInizioTurno = buttonInizioTurno;
	}


	public JButton getButtonFineTurno() {
		return buttonFineTurno;
	}


	public void setButtonFineTurno(JButton buttonFineTurno) {
		this.buttonFineTurno = buttonFineTurno;
	}
	
}

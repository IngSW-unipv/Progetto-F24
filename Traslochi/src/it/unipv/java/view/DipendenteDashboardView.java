package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class DipendenteDashboardView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton buttonVisProfilo;
	private JTextPane orarioInizioTurno;
	private JTextPane orarioFineTurno;
	private JTextPane indirizzoLavoro;
	private JButton buttonInizioTurno;
	private JButton buttonFineTurno;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DipendenteDashboardView frame = new DipendenteDashboardView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public DipendenteDashboardView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
		setTitle("Bidons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1421, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblTurniLavorativi = new JLabel("Turno Lavorativo");
		lblTurniLavorativi.setForeground(new Color(248, 248, 255));
		lblTurniLavorativi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		buttonVisProfilo = new JButton("Visualizza Profilo");
		buttonVisProfilo.setForeground(SystemColor.window);
		buttonVisProfilo.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVisProfilo.setFocusable(false);
		buttonVisProfilo.setBorder(null);
		buttonVisProfilo.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(83)
					.addComponent(lblTurniLavorativi, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
					.addGap(728)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(221))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTurniLavorativi, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1376, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1403, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1073, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 75, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel("Orario di Inizio Turno");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblOrarioDiFine = new JLabel("Orario di Fine Turno\r\n");
		lblOrarioDiFine.setForeground(SystemColor.activeCaption);
		lblOrarioDiFine.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		orarioInizioTurno = new JTextPane();
		orarioInizioTurno.setBackground(SystemColor.inactiveCaptionBorder);
		
		orarioFineTurno = new JTextPane();
		orarioFineTurno.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel lblLuogoDiLavoro = new JLabel("Indirizzo Assegnato (Città, Indirizzo, CAP)");
		lblLuogoDiLavoro.setForeground(SystemColor.activeCaption);
		lblLuogoDiLavoro.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		indirizzoLavoro = new JTextPane();
		indirizzoLavoro.setBackground(SystemColor.inactiveCaptionBorder);
		
		buttonInizioTurno = new JButton("Inizio Turno");
		buttonInizioTurno.setForeground(SystemColor.text);
		buttonInizioTurno.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonInizioTurno.setBackground(SystemColor.textHighlight);
		buttonInizioTurno.setBorder(null);
		buttonInizioTurno.setFocusable(false);
		
		buttonFineTurno = new JButton("Fine Turno");
		buttonFineTurno.setForeground(SystemColor.text);
		buttonFineTurno.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonFineTurno.setBackground(SystemColor.textHighlight);
		buttonFineTurno.setBorder(null);
		buttonFineTurno.setFocusable(false);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("resources/icona tempo.jpg"));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("resources/icona tempo.jpg"));
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("resources/iconaIndirizzo.jpg"));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(189)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
							.addGap(596)
							.addComponent(lblNewLabel_1_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(232)
							.addComponent(orarioInizioTurno, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(28)
							.addComponent(orarioFineTurno, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
							.addGap(284))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblOrarioDiFine, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
							.addGap(232))))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(469)
					.addComponent(buttonInizioTurno, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(190)
					.addComponent(buttonFineTurno, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addGap(600))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(479)
					.addComponent(lblNewLabel_1_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLuogoDiLavoro)
					.addContainerGap(629, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(347)
					.addComponent(indirizzoLavoro, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
					.addGap(416))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(26)
								.addComponent(lblNewLabel_1_1))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(20)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblOrarioDiFine, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(orarioFineTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblLuogoDiLavoro, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(indirizzoLavoro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(130)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(buttonFineTurno, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
								.addComponent(buttonInizioTurno, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
						.addComponent(orarioInizioTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(149))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}


	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JButton getButtonVisProfilo() {
		return buttonVisProfilo;
	}


	public void setButtonVisProfilo(JButton buttonVisProfilo) {
		this.buttonVisProfilo = buttonVisProfilo;
	}


	public JTextPane getOrarioInizioTurno() {
		return orarioInizioTurno;
	}


	public void setOrarioInizioTurno(JTextPane orarioInizioTurno) {
		this.orarioInizioTurno = orarioInizioTurno;
	}


	public JTextPane getOrarioFineTurno() {
		return orarioFineTurno;
	}


	public void setOrarioFineTurno(JTextPane orarioFineTurno) {
		this.orarioFineTurno = orarioFineTurno;
	}


	public JTextPane getIndirizzoLavoro() {
		return indirizzoLavoro;
	}


	public void setIndirizzoLavoro(JTextPane indirizzoLavoro) {
		this.indirizzoLavoro = indirizzoLavoro;
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

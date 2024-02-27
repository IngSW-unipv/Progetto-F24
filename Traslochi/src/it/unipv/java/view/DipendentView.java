package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class DipendentView extends JFrame {

	private JPanel contentPane;
	private JTextField indirizzoLavoro;
	private JTextField orarioInizioTurno;
	private JTextField orarioFineTurno;
	private JButton buttonInizioTurno;
	private JButton buttonFineTurno;
	private JButton buttonVisProfilo;
	private JButton buttonLogOut;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DipendentView frame = new DipendentView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public DipendentView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaRegister.jpg"));
		setTitle("Bidons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 530);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBorder(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ora di Inizio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ora di Fine");
		lblNewLabel_1_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_2 = new JLabel("Indirizzo di Lavoro\r\n");
		lblNewLabel_1_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		buttonInizioTurno = new JButton("Inizia Turno");
		buttonInizioTurno.setForeground(SystemColor.textHighlightText);
		buttonInizioTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonInizioTurno.setBackground(SystemColor.textHighlight);
		buttonInizioTurno.setBorder(null);
		buttonInizioTurno.setFocusable(false);
		
		buttonFineTurno = new JButton("Fine Turno");
		buttonFineTurno.setBackground(SystemColor.textHighlight);
		buttonFineTurno.setForeground(SystemColor.textHighlightText);
		buttonFineTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFineTurno.setBorder(null);
		buttonFineTurno.setFocusable(false);
		
		indirizzoLavoro = new JTextField();
		indirizzoLavoro.setEditable(false);
		indirizzoLavoro.setBackground(SystemColor.inactiveCaptionBorder);
		indirizzoLavoro.setColumns(10);
		
		orarioInizioTurno = new JTextField();
		orarioInizioTurno.setEditable(false);
		orarioInizioTurno.setBackground(SystemColor.inactiveCaptionBorder);
		orarioInizioTurno.setColumns(10);
		
		orarioFineTurno = new JTextField();
		orarioFineTurno.setEditable(false);
		orarioFineTurno.setBackground(SystemColor.inactiveCaptionBorder);
		orarioFineTurno.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(377)
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(255)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(indirizzoLavoro, Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(buttonInizioTurno, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(209)
									.addComponent(buttonFineTurno, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
							.addGap(108))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(123)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(orarioInizioTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(431)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(orarioFineTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))
					.addGap(712))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1452, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(orarioInizioTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(indirizzoLavoro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(94)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(buttonFineTurno, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addComponent(buttonInizioTurno, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(79))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(orarioFineTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		JLabel lblNewLabel = new JLabel("Turno Lavorativo");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		buttonVisProfilo = new JButton("Visualizza Profilo");
		buttonVisProfilo.setForeground(SystemColor.window);
		buttonVisProfilo.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVisProfilo.setBackground(SystemColor.textHighlight);
		buttonVisProfilo.setBorder(null);
		buttonVisProfilo.setFocusable(false);
		
		buttonLogOut = new JButton("Log Out");
		buttonLogOut.setForeground(SystemColor.window);
		buttonLogOut.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonLogOut.setFocusable(false);
		buttonLogOut.setBorder(null);
		buttonLogOut.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(292)
					.addComponent(buttonLogOut, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(667, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addComponent(buttonLogOut, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	
	public JButton getButtonVisProfilo() {
		return buttonVisProfilo;
	}
	
	public JButton getButtonInizioTurno() {
		return buttonInizioTurno;
	}
	
	public JButton getButtonFineTurno() {
		return buttonFineTurno;
	}
	
	public JButton getButtonLogOut() {
		return buttonLogOut;
	}
	
	public String getOraInizio() {
		return orarioInizioTurno.getText();
	}
	
	public void setOrarioInizioTurno(String stringa) {
		orarioInizioTurno.setText(stringa);
	}
	
	public String getOraFine() {
		return orarioFineTurno.getText();
	}
	
	public void setOrarioFineTurno(String stringa) {
		orarioFineTurno.setText(stringa);
	}
	
	public String getIndLavoro() {
		return indirizzoLavoro.getText();
	}
	
	public void setIndirizzoLavoro(String stringa) {
		indirizzoLavoro.setText(stringa);
	}
	
}

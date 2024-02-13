package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class DipendentView extends JFrame {

	private JPanel contentPane;
	private JTextField indLavoro;
	private JTextField oraInizio;
	private JTextField oraFine;
	private JButton buttonInizTur;
	private JButton buttonFineTur;
	private JButton buttonVisualProf;

	
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
		setBounds(100, 100, 923, 507);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
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
		
		buttonInizTur = new JButton("Inizia Turno");
		buttonInizTur.setForeground(SystemColor.textHighlightText);
		buttonInizTur.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonInizTur.setBackground(SystemColor.textHighlight);
		buttonInizTur.setBorder(null);
		buttonInizTur.setFocusable(false);
		
		buttonFineTur = new JButton("Fine Turno");
		buttonFineTur.setBackground(SystemColor.textHighlight);
		buttonFineTur.setForeground(SystemColor.textHighlightText);
		buttonFineTur.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFineTur.setBorder(null);
		buttonFineTur.setFocusable(false);
		
		indLavoro = new JTextField();
		indLavoro.setEditable(false);
		indLavoro.setBackground(SystemColor.inactiveCaptionBorder);
		indLavoro.setColumns(10);
		
		oraInizio = new JTextField();
		oraInizio.setEditable(false);
		oraInizio.setBackground(SystemColor.inactiveCaptionBorder);
		oraInizio.setColumns(10);
		
		oraFine = new JTextField();
		oraFine.setEditable(false);
		oraFine.setBackground(SystemColor.inactiveCaptionBorder);
		oraFine.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1442, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(377)
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(255)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(indLavoro, Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(buttonInizTur, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(209)
									.addComponent(buttonFineTur, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(123)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(oraInizio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(431)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(oraFine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
							.addComponent(oraInizio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(indLavoro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(94)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(buttonFineTur, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addComponent(buttonInizTur, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(79))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(oraFine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		JLabel lblNewLabel = new JLabel("Turno Lavorativo");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		buttonVisualProf = new JButton("Visualizza Profilo");
		buttonVisualProf.setForeground(SystemColor.window);
		buttonVisualProf.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVisualProf.setBackground(SystemColor.textHighlight);
		buttonVisualProf.setBorder(null);
		buttonVisualProf.setFocusable(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(529)
					.addComponent(buttonVisualProf, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(580, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addComponent(buttonVisualProf))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	
	public JButton getVisProfButton() {
		return buttonVisualProf;
	}
	
	public JButton getInizioTurnoButton() {
		return buttonInizTur;
	}
	
	public JButton getFineTurnoButton() {
		return buttonFineTur;
	}
	
	public String getOraInizio() {
		return oraInizio.getText();
	}
	
	public void setOraInizio(String stringa) {
		oraInizio.setText(stringa);
	}
	
	public String getOraFine() {
		return oraFine.getText();
	}
	
	public void setOraFine(String stringa) {
		oraFine.setText(stringa);
	}
	
	public String getIndLavoro() {
		return indLavoro.getText();
	}
	
	public void setIndLavoro(String stringa) {
		indLavoro.setText(stringa);
	}
	
	
	
	
}

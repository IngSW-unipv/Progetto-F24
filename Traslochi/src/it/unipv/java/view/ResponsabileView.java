package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import java.awt.ComponentOrientation;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class ResponsabileView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton buttonLogOut;
	private JButton buttonVisProfilo;
	private JButton buttonAggiungiDip;
	private JButton buttonRimuoviDip;
	private JButton buttonAssegnaTurno;
	private JTextPane tuttePrenotazioni;
	private JTextPane tuttiTurni;
	private JTextPane tuttiDipendenti;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResponsabileView frame = new ResponsabileView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ResponsabileView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaRegister.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1377, 636);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblNewLabel = new JLabel("Pannello di Controllo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		
		buttonLogOut = new JButton("Log Out");
		buttonLogOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonLogOut.setBackground(SystemColor.textHighlight);
		buttonLogOut.setBorder(null);
		buttonLogOut.setForeground(Color.WHITE);
		buttonLogOut.setFocusable(false);
		
		buttonVisProfilo = new JButton("Visualizza Profilo");
		buttonVisProfilo.setForeground(Color.WHITE);
		buttonVisProfilo.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonVisProfilo.setBorder(null);
		buttonVisProfilo.setBackground(SystemColor.textHighlight);
		buttonVisProfilo.setFocusable(false);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addGap(620)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(buttonLogOut, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonVisProfilo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
						.addComponent(buttonLogOut, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
					.addGap(26))
		);
		gl_panel.setAutoCreateGaps(true);
		gl_panel.setAutoCreateContainerGaps(true);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Tutti i Dipendenti");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1_1 = new JLabel("Turni Assegnati");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1_2 = new JLabel("Tutte le Prenotazioni");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		buttonAggiungiDip = new JButton("Aggiungi Dipendente");
		buttonAggiungiDip.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAggiungiDip.setForeground(SystemColor.window);
		buttonAggiungiDip.setBackground(SystemColor.textHighlight);
		buttonAggiungiDip.setBorder(null);
		buttonAggiungiDip.setFocusable(false);
		
		buttonRimuoviDip = new JButton("Rimuovi Dipendente");
		buttonRimuoviDip.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonRimuoviDip.setForeground(SystemColor.window);
		buttonRimuoviDip.setBackground(SystemColor.textHighlight);
		buttonRimuoviDip.setBorder(null);
		buttonRimuoviDip.setFocusable(false);
		
		JLabel lblNewLabel_2 = new JLabel("DIPENDENTI");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1 = new JLabel("TURNI");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_2 = new JLabel("PRENOTAZIONI");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		buttonAssegnaTurno = new JButton("Assegna Turno");
		buttonAssegnaTurno.setForeground(SystemColor.window);
		buttonAssegnaTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAssegnaTurno.setBorder(null);
		buttonAssegnaTurno.setBackground(SystemColor.textHighlight);
		buttonAssegnaTurno.setFocusable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(100, 149, 237));
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(new Color(100, 149, 237));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(buttonAggiungiDip, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(49)
							.addComponent(buttonRimuoviDip, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
					.addGap(47)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
							.addGap(48))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(170)
							.addComponent(buttonAssegnaTurno, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(160)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNewLabel_1_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(scrollPane_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
					.addGap(68))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(buttonAssegnaTurno, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonRimuoviDip, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonAggiungiDip, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(92)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)))
		);
		
		tuttePrenotazioni = new JTextPane();
		tuttePrenotazioni.setFont(new Font("Tahoma", Font.BOLD, 11));
		tuttePrenotazioni.setForeground(new Color(100, 149, 237));
		tuttePrenotazioni.setBackground(SystemColor.inactiveCaptionBorder);
		tuttePrenotazioni.setBorder(new CompoundBorder());
		scrollPane_2.setViewportView(tuttePrenotazioni);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollPane_2.setRowHeaderView(scrollBar_2);
		
		tuttiTurni = new JTextPane();
		tuttiTurni.setFont(new Font("Tahoma", Font.BOLD, 11));
		tuttiTurni.setForeground(new Color(100, 149, 237));
		tuttiTurni.setBackground(SystemColor.inactiveCaptionBorder);
		tuttiTurni.setBorder(new CompoundBorder());
		scrollPane_1.setViewportView(tuttiTurni);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		tuttiDipendenti = new JTextPane();
		tuttiDipendenti.setFont(new Font("Tahoma", Font.BOLD, 11));
		tuttiDipendenti.setForeground(new Color(100, 149, 237));
		tuttiDipendenti.setBackground(SystemColor.inactiveCaptionBorder);
		tuttiDipendenti.setDisabledTextColor(SystemColor.textHighlight);
		tuttiDipendenti.setCaretColor(SystemColor.textHighlight);
		tuttiDipendenti.setBorder(new CompoundBorder());
		scrollPane.setViewportView(tuttiDipendenti);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrollPane.setRowHeaderView(scrollBar);
		contentPane.setLayout(gl_contentPane);
	}
	
	public JButton getButtonAggiungiDip() {
		return buttonAggiungiDip;
	}


	public JButton getButtonAssegnaTurno() {
		return buttonAssegnaTurno;
	}

	public JButton getButtonRimuoviDip() {
		return buttonRimuoviDip;
	}
	
	public JButton getButtonVisProfilo() {
		return buttonVisProfilo;
	}


	public JTextPane getTuttePrenotazioni() {
		return tuttePrenotazioni;
	}


	public void setTuttePrenotazioni(JTextPane tuttePrenotazioni) {
		this.tuttePrenotazioni = tuttePrenotazioni;
	}


	public JTextPane getTuttiTurni() {
		return tuttiTurni;
	}


	public void setTuttiTurni(JTextPane tuttiTurni) {
		this.tuttiTurni = tuttiTurni;
	}

	public JTextPane getTuttiDipendenti() {
		return tuttiDipendenti;
	}

	public void setTuttiDipendenti(JTextPane tuttiDipendenti) {
		this.tuttiDipendenti = tuttiDipendenti;
	}
	
}

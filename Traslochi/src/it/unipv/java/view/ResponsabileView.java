package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class ResponsabileView extends JFrame {

	private JPanel contentPane;
	private JButton buttonVisProfilo;
	private JButton buttonAggiungiDip;
	private JButton buttonAssegnaTurno;
	private JButton buttonRimuoviDip;
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
		setTitle("Bidons");
		  // Ottieni le dimensioni dello schermo
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    double width = screenSize.getWidth();
	    double height = screenSize.getHeight();

	    // Imposta le dimensioni della finestra in base a una percentuale dello schermo
	    double windowWidth = width * 0.8; // 80% della larghezza dello schermo
	    double windowHeight = height * 0.8; // 80% dell'altezza dello schermo

	    // Imposta la posizione e le dimensioni della finestra
	    setSize((int) windowWidth, (int) windowHeight);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    // Centra la finestra sullo schermo
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    contentPane = new JPanel();
	    contentPane.setBackground(SystemColor.window);
	    contentPane.setBorder(null);
	    setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize((int) windowWidth, (int) windowHeight);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblPannelloDiControllo = new JLabel("Pannello di Controllo");
		lblPannelloDiControllo.setForeground(new Color(248, 248, 255));
		lblPannelloDiControllo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
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
					.addGap(55)
					.addComponent(lblPannelloDiControllo, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addGap(870)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1208, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblPannelloDiControllo, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(21))))
		);
		panel.setLayout(gl_panel);
		
		buttonAggiungiDip = new JButton("Aggiungi Dipendente");
		buttonAggiungiDip.setBackground(SystemColor.textHighlight);
		buttonAggiungiDip.setBorder(null);
		buttonAggiungiDip.setForeground(new Color(248, 248, 255));
		buttonAggiungiDip.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		buttonAssegnaTurno = new JButton("Assegna Turno");
		buttonAssegnaTurno.setBorder(null);
		buttonAssegnaTurno.setBackground(SystemColor.textHighlight);
		buttonAssegnaTurno.setForeground(new Color(248, 248, 255));
		buttonAssegnaTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel = new JLabel("DIPENDENTI");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblTurni = new JLabel("TURNI");
		lblTurni.setForeground(new Color(30, 144, 255));
		lblTurni.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblPrenotazioni = new JLabel("PRENOTAZIONI");
		lblPrenotazioni.setForeground(new Color(30, 144, 255));
		lblPrenotazioni.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Tutti i Dipendenti");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("Turni assegnati");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_2 = new JLabel("Tutte le Prenotazioni");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.textHighlight);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(SystemColor.textHighlight);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBackground(SystemColor.textHighlight);
		scrollPane_2.setForeground(SystemColor.textHighlight);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		buttonRimuoviDip = new JButton("Rimuovi Dipendente");
		buttonRimuoviDip.setBackground(SystemColor.textHighlight);
		buttonRimuoviDip.setForeground(SystemColor.text);
		buttonRimuoviDip.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonRimuoviDip.setBorder(null);
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(SystemColor.textHighlight);
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(156)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(183)
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblTurni, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(86)
									.addComponent(buttonAggiungiDip, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(buttonRimuoviDip, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(270)
									.addComponent(buttonAssegnaTurno, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
							.addGap(330)
							.addComponent(lblPrenotazioni, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(146)
									.addComponent(lblNewLabel_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(59)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)))
							.addGap(77)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(103)
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(204)
									.addComponent(lblNewLabel_1_1)))
							.addGap(90)
							.addComponent(separator_1_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(174)
									.addComponent(lblNewLabel_1_2))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(85)
									.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1384, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(45)
									.addComponent(buttonAssegnaTurno, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPrenotazioni, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTurni, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(buttonAggiungiDip, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
										.addComponent(buttonRimuoviDip, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))))
							.addGap(77)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_1_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
									.addGap(101))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(separator_1_1, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		
		tuttePrenotazioni = new JTextPane();
		tuttePrenotazioni.setEditable(false);
		tuttePrenotazioni.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.textHighlight, SystemColor.textHighlight));
		tuttePrenotazioni.setBackground(SystemColor.inactiveCaptionBorder);
		scrollPane_2.setViewportView(tuttePrenotazioni);
		
		tuttiTurni = new JTextPane();
		tuttiTurni.setEditable(false);
		tuttiTurni.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.textHighlight, SystemColor.textHighlight));
		tuttiTurni.setBackground(SystemColor.inactiveCaptionBorder);
		scrollPane_1.setViewportView(tuttiTurni);
		
		tuttiDipendenti = new JTextPane();
		tuttiDipendenti.setEditable(false);
		tuttiDipendenti.setBackground(SystemColor.inactiveCaptionBorder);
		tuttiDipendenti.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.textHighlight, SystemColor.textHighlight));
		scrollPane.setViewportView(tuttiDipendenti);
		
		buttonVisProfilo.setFocusable(false);
		buttonAggiungiDip.setFocusable(false);
		buttonAssegnaTurno.setFocusable(false);
		buttonRimuoviDip.setFocusable(false);
		contentPane.setLayout(gl_contentPane);
	}


	public JButton getButtonVisProfilo() {
		return buttonVisProfilo;
	}


	public void setButtonVisProfilo(JButton buttonVisProfilo) {
		this.buttonVisProfilo = buttonVisProfilo;
	}


	public JButton getButtonAggiungiDip() {
		return buttonAggiungiDip;
	}


	public void setButtonAggiungiDip(JButton buttonAggiungiDip) {
		this.buttonAggiungiDip = buttonAggiungiDip;
	}


	public JButton getButtonAssegnaTurno() {
		return buttonAssegnaTurno;
	}


	public void setButtonAssegnaTurno(JButton buttonAssegnaTurno) {
		this.buttonAssegnaTurno = buttonAssegnaTurno;
	}


	public JButton getButtonRimuoviDip() {
		return buttonRimuoviDip;
	}


	public void setButtonRimuoviDip(JButton buttonRimuoviDip) {
		this.buttonRimuoviDip = buttonRimuoviDip;
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

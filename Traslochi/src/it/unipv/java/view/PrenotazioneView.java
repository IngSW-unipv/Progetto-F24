package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class PrenotazioneView extends JFrame {

	private JPanel contentPane;
	private JTextField indirizzoRitiro;
	private JTextField indirizzoConsegna;
	private JTextField dataRitiro;
	private JTextField dataConsegna;
	private JTextField importoDaPagare;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JButton buttonTornaIndietro;
	private JRadioButton radioCarta;
	private JRadioButton radioContanti;
	private JPanel panelBancomat;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrenotazioneView frame = new PrenotazioneView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrenotazioneView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1421, 684);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblPrenotazione = new JLabel("Prenotazione");
		lblPrenotazione.setForeground(new Color(248, 248, 255));
		lblPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		buttonTornaIndietro = new JButton("<");
		buttonTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonTornaIndietro.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonTornaIndietro.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.controlText, SystemColor.controlText, new Color(153, 180, 209), new Color(153, 180, 209)));
		buttonTornaIndietro.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(buttonTornaIndietro, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(lblPrenotazione, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
					.addGap(2245))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPrenotazione, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(buttonTornaIndietro, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("Indirizzo di Ritiro (Città, Indirizzo, CAP)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(70, 130, 180));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblIndirizzoDiConsegna = new JLabel("Indirizzo di Consegna\r\n (Città, Indirizzo, CAP)");
		lblIndirizzoDiConsegna.setForeground(new Color(70, 130, 180));
		lblIndirizzoDiConsegna.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblDataDiRitiro = new JLabel("Data di Ritiro (Giorno/Mese/Anno , Orario)\r\n");
		lblDataDiRitiro.setForeground(new Color(70, 130, 180));
		lblDataDiRitiro.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblDataDiConsegna = new JLabel("Data di Consegna (Giorno/Mese/Anno, Orario)\r\n\r\n");
		lblDataDiConsegna.setForeground(new Color(70, 130, 180));
		lblDataDiConsegna.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator_2 = new JSeparator();
		
		JSeparator separator_2_1 = new JSeparator();
		
		indirizzoRitiro = new JTextField();
		indirizzoRitiro.setBorder(null);
		indirizzoRitiro.setColumns(10);
		
		indirizzoConsegna = new JTextField();
		indirizzoConsegna.setBorder(null);
		indirizzoConsegna.setColumns(10);
		
		dataRitiro = new JTextField();
		dataRitiro.setBorder(null);
		dataRitiro.setColumns(10);
		
		dataConsegna = new JTextField();
		dataConsegna.setBorder(null);
		dataConsegna.setColumns(10);
		
		JLabel lblMetodoDiPagamento = new JLabel("Metodo di Pagamento");
		lblMetodoDiPagamento.setForeground(new Color(70, 130, 180));
		lblMetodoDiPagamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		radioCarta = new JRadioButton("Carta");
		radioCarta.setBackground(new Color(100, 149, 237));
		
		radioContanti = new JRadioButton("Contanti");
		radioContanti.setBackground(new Color(100, 149, 237));
		
		JLabel lblImportoDaPagare = new JLabel("Importo da Pagare");
		lblImportoDaPagare.setForeground(new Color(70, 130, 180));
		lblImportoDaPagare.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		panelBancomat = new JPanel();
		panelBancomat.setBackground(new Color(240, 248, 255));
		panelBancomat.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(30, 144, 255), new Color(100, 149, 237), null, null));
		
		importoDaPagare = new JTextField();
		importoDaPagare.setBackground(new Color(240, 248, 255));
		importoDaPagare.setBorder(null);
		importoDaPagare.setHorizontalAlignment(SwingConstants.RIGHT);
		importoDaPagare.setText("0");
		importoDaPagare.setFont(new Font("Tahoma", Font.BOLD, 20));
		importoDaPagare.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("€");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		JButton buttonConfermaPren = new JButton("Conferma Prenotazione");
		buttonConfermaPren.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonConfermaPren.setForeground(new Color(248, 248, 255));
		buttonConfermaPren.setBackground(new Color(30, 144, 255));
		buttonConfermaPren.setBorder(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Desktop\\immagini java\\IconaMetodoPag3%.jpg"));
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Desktop\\immagini java\\iconaData4%.png"));
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Desktop\\immagini java\\iconaData4%.png"));
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Desktop\\immagini java\\iconaIndirizzo4%.jpg"));
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("");
		lblNewLabel_3_3_1_1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Desktop\\immagini java\\iconaIndirizzo4%.jpg"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 2571, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_3_1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(radioCarta)
												.addGap(77)
												.addComponent(radioContanti))
											.addComponent(lblMetodoDiPagamento, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblImportoDaPagare, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED))
											.addComponent(lblDataDiRitiro, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
											.addComponent(dataRitiro)
											.addComponent(separator_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(importoDaPagare, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(190)
												.addComponent(lblNewLabel_3_4)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addComponent(lblDataDiConsegna, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
													.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
															.addComponent(dataConsegna, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
															.addComponent(separator_2_1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
														.addGap(324))))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(63)
												.addComponent(panelBancomat, GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(187)
											.addComponent(buttonConfermaPren, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))))
								.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
								.addComponent(lblIndirizzoDiConsegna, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
								.addComponent(indirizzoConsegna)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
								.addComponent(indirizzoRitiro, Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(indirizzoRitiro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_3_3_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblIndirizzoDiConsegna, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(indirizzoConsegna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDataDiRitiro, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dataRitiro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDataDiConsegna, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dataConsegna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelBancomat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetodoDiPagamento, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioCarta)
								.addComponent(radioContanti))
							.addGap(53)
							.addComponent(lblImportoDaPagare, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(importoDaPagare, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(43))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(buttonConfermaPren, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		JLabel labelNomeTitCarta = new JLabel("Nome del Titolare della carta");
		labelNomeTitCarta.setForeground(new Color(70, 130, 180));
		labelNomeTitCarta.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JSeparator separator_3 = new JSeparator();
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(240, 248, 255));
		textField_5.setBorder(null);
		textField_5.setColumns(10);
		
		JLabel labelNumCarta = new JLabel("Numero della Carta di Credito");
		labelNumCarta.setForeground(new Color(70, 130, 180));
		labelNumCarta.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JSeparator separator_3_1 = new JSeparator();
		
		JLabel labelCVC = new JLabel("CVC :");
		labelCVC.setForeground(new Color(70, 130, 180));
		labelCVC.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(248, 248, 255));
		textField_6.setColumns(10);
		textField_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JLabel labelDataScad = new JLabel("Data di Scadenza :");
		labelDataScad.setForeground(new Color(70, 130, 180));
		labelDataScad.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("/");
		
		JLabel lblNewLabel_3_2 = new JLabel("/");
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(240, 248, 255));
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		GroupLayout gl_panelBancomat = new GroupLayout(panelBancomat);
		gl_panelBancomat.setHorizontalGroup(
			gl_panelBancomat.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBancomat.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelBancomat.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelBancomat.createParallelGroup(Alignment.LEADING, false)
							.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
							.addComponent(textField_5))
						.addGroup(gl_panelBancomat.createSequentialGroup()
							.addComponent(labelCVC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addComponent(labelNomeTitCarta))
					.addGap(118)
					.addGroup(gl_panelBancomat.createParallelGroup(Alignment.LEADING)
						.addComponent(labelNumCarta, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_3_1, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelBancomat.createSequentialGroup()
							.addComponent(labelDataScad, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		gl_panelBancomat.setVerticalGroup(
			gl_panelBancomat.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBancomat.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelBancomat.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelNumCarta, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelNomeTitCarta))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelBancomat.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelBancomat.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_3_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panelBancomat.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelCVC, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelDataScad, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1)
						.addComponent(lblNewLabel_3_2))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelBancomat.setLayout(gl_panelBancomat);
		contentPane.setLayout(gl_contentPane);
		panelBancomat.setVisible(false);
		
		
		//AZIONE RADIO BUTTON
		radioContanti.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (radioContanti.isSelected()) {
		            panelBancomat.setVisible(false);
		            radioCarta.setSelected(false);
		           
		        }
		    }
		});

		radioCarta.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (radioCarta.isSelected()) {
		            panelBancomat.setVisible(true);
		            radioContanti.setSelected(false);
		        }
		    }
		});

		
		
		
		
		
		
		
	}
}

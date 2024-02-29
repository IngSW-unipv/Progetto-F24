package it.unipv.java.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;

import it.unipv.java.model.PrenotazioneData;

import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class PrenotazioneView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JButton buttonConfermaPren;
	private JButton buttonMostraImporto;

	public PrenotazioneView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
		setTitle("Bidons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1262, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);
		setLocationRelativeTo(null);

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
		buttonTornaIndietro.setFocusable(false);
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
		importoDaPagare.setEditable(false);
		importoDaPagare.setBackground(new Color(240, 248, 255));
		importoDaPagare.setBorder(null);
		importoDaPagare.setHorizontalAlignment(SwingConstants.RIGHT);
		importoDaPagare.setFont(new Font("Tahoma", Font.BOLD, 20));
		importoDaPagare.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("€");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		buttonConfermaPren = new JButton("Conferma Prenotazione");
		buttonConfermaPren.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonConfermaPren.setForeground(new Color(248, 248, 255));
		buttonConfermaPren.setBackground(new Color(30, 144, 255));
		buttonConfermaPren.setBorder(null);
		buttonConfermaPren.setFocusable(false);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("resources/IconaMetodoPag.jpg"));
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon("resources/iconaData.png"));
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setIcon(new ImageIcon("resources/iconaData.png"));
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setIcon(new ImageIcon("resources/iconaIndirizzo.jpg"));
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("");
		lblNewLabel_3_3_1_1.setIcon(new ImageIcon("resources/iconaIndirizzo.jpg"));
		
		buttonMostraImporto = new JButton("Mostra Importo");
		buttonMostraImporto.setForeground(new Color(248, 248, 255));
		buttonMostraImporto.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonMostraImporto.setBorder(null);
		buttonMostraImporto.setBackground(SystemColor.activeCaption);
		buttonMostraImporto.setFocusable(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
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
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(radioCarta)
											.addGap(77)
											.addComponent(radioContanti))
										.addComponent(lblMetodoDiPagamento, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDataDiRitiro, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
										.addComponent(dataRitiro)
										.addComponent(separator_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
													.addComponent(importoDaPagare, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(buttonMostraImporto, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblImportoDaPagare, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)))
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
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(244)
													.addComponent(buttonConfermaPren, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
												.addComponent(panelBancomat, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)))))
								.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
								.addComponent(lblIndirizzoDiConsegna, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
								.addComponent(indirizzoConsegna)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
								.addComponent(indirizzoRitiro, Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1405, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1166, Short.MAX_VALUE))
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
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetodoDiPagamento, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioCarta)
								.addComponent(radioContanti))
							.addGap(53)
							.addComponent(lblImportoDaPagare, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelBancomat, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(importoDaPagare, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(buttonMostraImporto, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(43))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(buttonConfermaPren, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		JLabel labelNomeTitCarta = new JLabel("Nome del Titolare della carta");
		labelNomeTitCarta.setBounds(13, 14, 173, 15);
		labelNomeTitCarta.setForeground(new Color(70, 130, 180));
		labelNomeTitCarta.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(13, 55, 226, 2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(13, 35, 226, 14);
		textField_5.setBackground(new Color(240, 248, 255));
		textField_5.setBorder(null);
		textField_5.setColumns(10);
		
		JLabel labelNumCarta = new JLabel("Numero della Carta di Credito");
		labelNumCarta.setBounds(394, 14, 201, 15);
		labelNumCarta.setForeground(new Color(70, 130, 180));
		labelNumCarta.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(394, 55, 226, 2);
		
		JLabel labelCVC = new JLabel("CVC :");
		labelCVC.setBounds(13, 81, 32, 15);
		labelCVC.setForeground(new Color(70, 130, 180));
		labelCVC.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_6 = new JTextField();
		textField_6.setBounds(49, 78, 60, 22);
		textField_6.setBackground(new Color(248, 248, 255));
		textField_6.setColumns(10);
		textField_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JLabel labelDataScad = new JLabel("Data di Scadenza :");
		labelDataScad.setBounds(394, 81, 113, 15);
		labelDataScad.setForeground(new Color(70, 130, 180));
		labelDataScad.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_7 = new JTextField();
		textField_7.setBounds(517, 79, 24, 20);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(559, 79, 24, 20);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(601, 79, 24, 20);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("/");
		lblNewLabel_3_1.setBounds(587, 82, 4, 14);
		
		JLabel lblNewLabel_3_2 = new JLabel("/");
		lblNewLabel_3_2.setBounds(548, 82, 4, 14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(394, 35, 226, 14);
		textField_10.setBackground(new Color(240, 248, 255));
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		panelBancomat.setLayout(null);
		panelBancomat.add(separator_3);
		panelBancomat.add(textField_5);
		panelBancomat.add(labelCVC);
		panelBancomat.add(textField_6);
		panelBancomat.add(labelNomeTitCarta);
		panelBancomat.add(labelNumCarta);
		panelBancomat.add(separator_3_1);
		panelBancomat.add(labelDataScad);
		panelBancomat.add(textField_7);
		panelBancomat.add(lblNewLabel_3_2);
		panelBancomat.add(textField_8);
		panelBancomat.add(lblNewLabel_3_1);
		panelBancomat.add(textField_9);
		panelBancomat.add(textField_10);
		
		JTextPane txtContanti = new JTextPane();
		txtContanti.setBackground(new Color(240, 248, 255));
		txtContanti.setCaretColor(new Color(240, 248, 255));
		txtContanti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtContanti.setText("I contanti dovranno essere consegnati al nostro Dipendente incaricato di svolgere il Trasloco. Nel caso di mancato pagamento il trasloco non verrà effettuato.");
		txtContanti.setBounds(10, 14, 761, 92);
		panelBancomat.add(txtContanti);
		contentPane.setLayout(gl_contentPane);
		panelBancomat.setVisible(false);
		
		
		//AZIONE RADIO BUTTON
		radioContanti.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (radioContanti.isSelected()) {
		            separator_3.setVisible(false);
		        	panelBancomat.setVisible(true);
		            radioCarta.setSelected(false);
		            textField_5.setVisible(false);
		            labelCVC.setVisible(false);
		            textField_6.setVisible(false);
		            labelNomeTitCarta.setVisible(false);
		            labelNumCarta.setVisible(false);
		            separator_3_1.setVisible(false);
		            labelDataScad.setVisible(false);
		            textField_7.setVisible(false);
		            lblNewLabel_3_2.setVisible(false);
		            textField_8.setVisible(false);
		            lblNewLabel_3_1.setVisible(false);
		            textField_9.setVisible(false);
		            textField_10.setVisible(false);
		           txtContanti.setVisible(true);
		        }
		    }
		});

		radioCarta.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (radioCarta.isSelected()) {
		            panelBancomat.setVisible(true);
		            radioContanti.setSelected(false);
		            txtContanti.setVisible(false);
		            textField_5.setVisible(true);
		            labelCVC.setVisible(true);
		            textField_6.setVisible(true);
		            labelNomeTitCarta.setVisible(true);
		            labelNumCarta.setVisible(true);
		            separator_3_1.setVisible(true);
		            labelDataScad.setVisible(true);
		            textField_7.setVisible(true);
		            lblNewLabel_3_2.setVisible(true);
		            textField_8.setVisible(true);
		            lblNewLabel_3_1.setVisible(true);
		            textField_9.setVisible(true);
		            textField_10.setVisible(true);
		            separator_3.setVisible(true);
		        }
		    }
		});
		
	}

	
	public String getIndirizzoRitiro() {
		return indirizzoRitiro.getText();
	}

	public void setIndirizzoRitiro(JTextField indirizzoRitiro) {
		this.indirizzoRitiro = indirizzoRitiro;
	}

	public String getIndirizzoConsegna() {
		return indirizzoConsegna.getText();
	}

	public void setIndirizzoConsegna(JTextField indirizzoConsegna) {
		this.indirizzoConsegna = indirizzoConsegna;
	}

	public String getDataRitiro() {
		return dataRitiro.getText();
	}

	public void setDataRitiro(JTextField dataRitiro) {
		this.dataRitiro = dataRitiro;
	}

	public String getDataConsegna() {
		return dataConsegna.getText();
	}

	public void setDataConsegna(JTextField dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public String getImportoDaPagare() {
		return importoDaPagare.getText();
	}

	public void setImportoDaPagare(String string) {
		importoDaPagare.setText(string);
	}

	public JButton getButtonTornaIndietro() {
		return buttonTornaIndietro;
	}
	
	public JButton getButtonCalcolaImporto() {
		return buttonMostraImporto;
	}

	public JButton getButtonConfermaPren() {
		return buttonConfermaPren;
	}

	public void setButtonConfermaPren(JButton buttonConfermaPren) {
		this.buttonConfermaPren = buttonConfermaPren;
	}

	public JRadioButton getRadioCarta() {
		return radioCarta;
	}

	public void setRadioCarta(JRadioButton radioCarta) {
		this.radioCarta = radioCarta;
	}

	public JRadioButton getRadioContanti() {
		return radioContanti;
	}

	public void setRadioContanti(JRadioButton radioContanti) {
		this.radioContanti = radioContanti;
	}

	public String getTextField_6() {
		return textField_6.getText();
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public String getTextField_7() {
		return textField_7.getText();
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public String getTextField_8() {
		return textField_8.getText();
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public String getTextField_9() {
		return textField_9.getText();
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public void setViewTest(PrenotazioneData pm) {
		indirizzoRitiro.setText(pm.getIndirizzoRitiro());
		indirizzoConsegna.setText(pm.getIndirizzoConsegna());
		dataRitiro.setText(pm.getDataRitiro());
		dataConsegna.setText(pm.getDataConsegna());
		textField_6.setText(pm.getCvc());
		textField_7.setText(pm.getScadGiorno());
		textField_8.setText(pm.getScadMese());
		textField_9.setText(pm.getScadAnno());
	}
	
}

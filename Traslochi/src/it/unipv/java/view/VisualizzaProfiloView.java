package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class VisualizzaProfiloView extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JButton buttonTornaIndietro;
	private JButton buttonCancProf;
	private JButton buttonModPass;
	private JButton buttonModEmail;
	private JButton buttonModCF;
	private JButton buttonModCogn;
	private JButton buttonModNome;
	private JButton buttonConfScelte;
	private JTextArea nome;
	private JTextArea cognome;
	private JTextArea codiceFiscale;
	private JTextArea email;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizzaProfiloView frame = new VisualizzaProfiloView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VisualizzaProfiloView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
		setTitle("Bidons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 648);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblProfilo = new JLabel("Profilo Utente");
		lblProfilo.setForeground(new Color(248, 248, 255));
		lblProfilo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		buttonTornaIndietro = new JButton("<");
		buttonTornaIndietro.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonTornaIndietro.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.controlText, SystemColor.controlText, new Color(153, 180, 209), new Color(153, 180, 209)));
		buttonTornaIndietro.setBackground(SystemColor.textHighlight);
		
		buttonCancProf = new JButton("Cancella Profilo");
		buttonCancProf.setForeground(SystemColor.text);
		buttonCancProf.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonCancProf.setBorder(null);
		buttonCancProf.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(buttonTornaIndietro, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(133)
					.addComponent(lblProfilo, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
					.addGap(71)
					.addComponent(buttonCancProf, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(1989))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblProfilo, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(buttonCancProf, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(buttonTornaIndietro)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setForeground(new Color(100, 149, 237));
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.textHighlight);
		
		nome = new JTextArea();
		nome.setBackground(SystemColor.inactiveCaptionBorder);
		nome.setBorder(null);
		
		JLabel labelCognome = new JLabel("Cognome");
		labelCognome.setForeground(new Color(100, 149, 237));
		labelCognome.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		
		cognome = new JTextArea();
		cognome.setBackground(SystemColor.inactiveCaptionBorder);
		cognome.setBorder(null);
		
		JLabel labelCF = new JLabel("Codice Fiscale");
		labelCF.setForeground(new Color(100, 149, 237));
		labelCF.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(SystemColor.textHighlight);
		
		codiceFiscale = new JTextArea();
		codiceFiscale.setBackground(SystemColor.inactiveCaptionBorder);
		codiceFiscale.setBorder(null);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(100, 149, 237));
		labelEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(SystemColor.textHighlight);
		
		email = new JTextArea();
		email.setBackground(SystemColor.inactiveCaptionBorder);
		email.setBorder(null);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setForeground(new Color(100, 149, 237));
		labelPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(SystemColor.textHighlight);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.inactiveCaptionBorder);
		passwordField.setBorder(null);
		
		buttonModPass = new JButton("Modifica");
		buttonModPass.setForeground(SystemColor.text);
		buttonModPass.setBackground(SystemColor.textHighlight);
		buttonModPass.setBorder(null);
		buttonModPass.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		buttonModEmail = new JButton("Modifica");
		buttonModEmail.setForeground(SystemColor.text);
		buttonModEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonModEmail.setBorder(null);
		buttonModEmail.setBackground(SystemColor.textHighlight);
		
		buttonModCF = new JButton("Modifica");
		buttonModCF.setForeground(SystemColor.text);
		buttonModCF.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonModCF.setBorder(null);
		buttonModCF.setBackground(SystemColor.textHighlight);
		
		buttonModCogn = new JButton("Modifica");
		buttonModCogn.setForeground(SystemColor.text);
		buttonModCogn.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonModCogn.setBorder(null);
		buttonModCogn.setBackground(SystemColor.textHighlight);
		
		buttonModNome = new JButton("Modifica");
		buttonModNome.setForeground(SystemColor.text);
		buttonModNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonModNome.setBorder(null);
		buttonModNome.setBackground(SystemColor.textHighlight);
		
		buttonConfScelte = new JButton("Conferma Scelte");
		buttonConfScelte.setForeground(SystemColor.text);
		buttonConfScelte.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonConfScelte.setBackground(SystemColor.textHighlight);
		buttonConfScelte.setBorder(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("resources/iconaUser.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("resources/iconaUser.png"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("resources/iconaUser.png"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("resources/iconaUser.png"));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("resources/iconaPassword.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 603, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(237)
					.addComponent(buttonConfScelte, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(376, Short.MAX_VALUE)
					.addComponent(buttonModPass)
					.addGap(180))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelNome)
						.addComponent(labelCognome, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelCF, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelPassword, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
								.addComponent(nome, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(buttonModNome, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
								.addComponent(cognome, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(buttonModCogn, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(codiceFiscale, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(email, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(buttonModCF, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonModEmail, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))))
					.addGap(231))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(labelNome)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(buttonModNome, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(labelCognome, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(buttonModCogn, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelCF)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addComponent(codiceFiscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(buttonModCF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelEmail))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(buttonModEmail, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(labelPassword)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(buttonModPass)
					.addGap(56)
					.addComponent(buttonConfScelte, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
		);
		contentPane.setLayout(gl_contentPane);
		
		buttonTornaIndietro.setFocusable(false);
		buttonCancProf.setFocusable(false);
		buttonModPass.setFocusable(false);
		buttonModEmail.setFocusable(false);
		buttonModCF.setFocusable(false);
		buttonModCogn.setFocusable(false);
		buttonModNome.setFocusable(false);
		buttonConfScelte.setFocusable(false);
	}
}

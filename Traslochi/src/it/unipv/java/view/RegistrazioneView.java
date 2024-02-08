package it.unipv.java.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class RegistrazioneView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField password;
	private JPasswordField ripetiPassword;
	private JPanel iconaUser3;
	private JLabel iconaUser1;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel labelNome;
	private JLabel labelCognome;
	private JLabel labelCF;
	private JSeparator separator_2;
	private JLabel iconaUser2;
	private JLabel iconaUser4;
	private JLabel labelEmail;
	private JLabel iconaMail;
	private JSeparator separator_2_1;
	private JLabel labelPassword;
	private JSeparator separator_2_1_1;
	private JLabel iconPass1;
	private JLabel labelRipetiPassword;
	private JSeparator separator_3;
	private JLabel iconaPass2;
	private JButton bottoneConfermaReg;
	private JTextArea nome;
	private JTextArea cognome;
	private JTextArea codiceFiscale;
	private JTextArea email;
	private JLabel labelTitolo;
	

	public RegistrazioneView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nikola.manev\\Downloads\\bidons.jpg"));
		setResizable(false);
		setTitle("Registrazione");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iconaUser3 = new JPanel();
		iconaUser3.setBackground(SystemColor.text);
		iconaUser3.setBounds(0, 0, 499, 495);
		contentPane.add(iconaUser3);
		iconaUser3.setLayout(null);
		
		iconaUser1 = new JLabel("");
		iconaUser1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\user5%.png"));
		iconaUser1.setBounds(38, 98, 13, 28);
		iconaUser3.add(iconaUser1);
		
		separator = new JSeparator();
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(61, 124, 175, 2);
		iconaUser3.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(286, 124, 175, 2);
		iconaUser3.add(separator_1);
		
		labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNome.setForeground(SystemColor.textHighlight);
		labelNome.setBounds(61, 84, 46, 14);
		iconaUser3.add(labelNome);
		
		labelCognome = new JLabel("Cognome");
		labelCognome.setForeground(SystemColor.textHighlight);
		labelCognome.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelCognome.setBounds(286, 84, 72, 14);
		iconaUser3.add(labelCognome);
		
		labelCF = new JLabel("Codice Fiscale");
		labelCF.setForeground(SystemColor.textHighlight);
		labelCF.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelCF.setBounds(120, 147, 85, 14);
		iconaUser3.add(labelCF);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(SystemColor.textHighlight);
		separator_2.setBounds(120, 189, 238, 2);
		iconaUser3.add(separator_2);
		
		iconaUser2 = new JLabel("");
		iconaUser2.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\user5%.png"));
		iconaUser2.setBounds(265, 98, 13, 28);
		iconaUser3.add(iconaUser2);
		
		iconaUser4 = new JLabel("");
		iconaUser4.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\user5%.png"));
		iconaUser4.setBounds(96, 163, 13, 28);
		iconaUser3.add(iconaUser4);
		
		labelEmail = new JLabel("Email");
		labelEmail.setForeground(SystemColor.textHighlight);
		labelEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelEmail.setBounds(120, 218, 85, 14);
		iconaUser3.add(labelEmail);
		
		iconaMail = new JLabel("");
		iconaMail.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\iconaMail5%.jpg"));
		iconaMail.setBounds(96, 229, 23, 28);
		iconaUser3.add(iconaMail);
		
		separator_2_1 = new JSeparator();
		separator_2_1.setForeground(SystemColor.textHighlight);
		separator_2_1.setBounds(120, 255, 238, 2);
		iconaUser3.add(separator_2_1);
		
		labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelPassword.setForeground(SystemColor.textHighlight);
		labelPassword.setBounds(120, 285, 85, 14);
		iconaUser3.add(labelPassword);
		
		separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(SystemColor.textHighlight);
		separator_2_1_1.setBounds(120, 325, 238, 2);
		iconaUser3.add(separator_2_1_1);
		
		iconPass1 = new JLabel("");
		iconPass1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\iconaPass5%.png"));
		iconPass1.setBounds(96, 299, 13, 28);
		iconaUser3.add(iconPass1);
		
		labelRipetiPassword = new JLabel("Ripeti Password");
		labelRipetiPassword.setForeground(SystemColor.textHighlight);
		labelRipetiPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelRipetiPassword.setBounds(120, 356, 107, 14);
		iconaUser3.add(labelRipetiPassword);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.textHighlight);
		separator_3.setBounds(120, 394, 238, 2);
		iconaUser3.add(separator_3);
		
		iconaPass2 = new JLabel("");
		iconaPass2.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\iconaPass5%.png"));
		iconaPass2.setBounds(96, 368, 13, 28);
		iconaUser3.add(iconaPass2);
		
		bottoneConfermaReg = new JButton("Conferma Registrazione");
		bottoneConfermaReg.setFont(new Font("Tahoma", Font.BOLD, 11));
		bottoneConfermaReg.setBorder(null);
		bottoneConfermaReg.setBackground(SystemColor.textHighlight);
		bottoneConfermaReg.setForeground(SystemColor.text);
		bottoneConfermaReg.setBounds(120, 425, 238, 23);
		bottoneConfermaReg.setFocusable(false);
		iconaUser3.add(bottoneConfermaReg);
		
		nome = new JTextArea();
		nome.setBorder(null);
		nome.setBounds(61, 103, 175, 23);
		iconaUser3.add(nome);
		
		cognome = new JTextArea();
		cognome.setBorder(null);
		cognome.setBounds(286, 103, 175, 23);
		iconaUser3.add(cognome);
		
		codiceFiscale = new JTextArea();
		codiceFiscale.setBorder(null);
		codiceFiscale.setBounds(120, 168, 238, 23);
		iconaUser3.add(codiceFiscale);
		
		email = new JTextArea();
		email.setBorder(null);
		email.setBounds(120, 234, 238, 23);
		iconaUser3.add(email);
		
		password = new JPasswordField();
		password.setBorder(null);
		password.setBounds(120, 299, 238, 22);
		iconaUser3.add(password);
		
		ripetiPassword = new JPasswordField();
		ripetiPassword.setBorder(null);
		ripetiPassword.setBounds(120, 368, 238, 22);
		iconaUser3.add(ripetiPassword);
		
		labelTitolo = new JLabel("Registrazione");
		labelTitolo.setForeground(SystemColor.textHighlight);
		labelTitolo.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelTitolo.setBounds(176, 29, 139, 32);
		iconaUser3.add(labelTitolo);
	}
	
	public String getNome() {
		return nome.getText();
	}
	
	public String getCognome() {
		return cognome.getText();
	}
	
	public String getCF() {
		return codiceFiscale.getText();
	}
	
	public String getEmail() {
		return email.getText();
	}
	
	public char[] getPass() {
		return password.getPassword();
	}
	
	public char[] getPassRipetuta() {
		return ripetiPassword.getPassword();
	}
	
	
	
	
	
	
	
}

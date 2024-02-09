package it.unipv.java.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.Color;

public class RegisterView extends JFrame {

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
	private JButton registerConfirmButton;
	private JTextArea nome;
	private JTextArea cognome;
	private JTextArea codiceFiscale;
	private JTextArea email;
	private JLabel labelTitolo;
	
	
	

	
    public static void main(String[] args) {
	        // Crea un'istanza della finestra di registrazione
	        RegisterView registerView = new RegisterView();
	        
	        // Imposta la visibilità della finestra
	        registerView.setVisible(true);
	    }
	


	public RegisterView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/Register"));
		setResizable(false);
		setTitle("Registrazione");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		String imagePath = "resources/IconaLogin.png";
		ImageIcon iconLogin= new ImageIcon(imagePath);
		setIconImage(iconLogin.getImage());
		
		this.setLocationRelativeTo(null); //CENTRA IL FRAME AL CENTRO DEL PC

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		iconaUser3 = new JPanel();
		iconaUser3.setBackground(SystemColor.text);
		iconaUser3.setBounds(0, 0, 499, 495);
		contentPane.add(iconaUser3);
		iconaUser3.setLayout(null);
		
		iconaUser1 = new JLabel("");
		iconaUser1.setIcon(new ImageIcon("resources/iconaUser.png")); // da cambiare
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
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelNome.setForeground(new Color(100, 149, 237));
		labelNome.setBounds(61, 84, 46, 14);
		iconaUser3.add(labelNome);
		
		labelCognome = new JLabel("Cognome");
		labelCognome.setForeground(new Color(100, 149, 237));
		labelCognome.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelCognome.setBounds(286, 80, 72, 23);
		iconaUser3.add(labelCognome);
		
		labelCF = new JLabel("Codice Fiscale");
		labelCF.setForeground(new Color(100, 149, 237));
		labelCF.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelCF.setBounds(120, 147, 107, 14);
		iconaUser3.add(labelCF);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(SystemColor.textHighlight);
		separator_2.setBounds(120, 189, 238, 2);
		iconaUser3.add(separator_2);
		
		iconaUser2 = new JLabel("");
		iconaUser2.setIcon(new ImageIcon("resources/iconaUser.png")); // da cambiare
		iconaUser2.setBounds(265, 98, 13, 28);
		iconaUser3.add(iconaUser2);
		
		iconaUser4 = new JLabel("");
		iconaUser4.setIcon(new ImageIcon("resources/iconaUser.png")); // da cambiare
		iconaUser4.setBounds(96, 163, 13, 28);
		iconaUser3.add(iconaUser4);
		
		labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(100, 149, 237));
		labelEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelEmail.setBounds(120, 218, 85, 14);
		iconaUser3.add(labelEmail);
		
		iconaMail = new JLabel("");
		iconaMail.setIcon(new ImageIcon("resources/iconaMail.jpg"));
		iconaMail.setBounds(96, 229, 23, 28);
		iconaUser3.add(iconaMail);
		
		separator_2_1 = new JSeparator();
		separator_2_1.setForeground(SystemColor.textHighlight);
		separator_2_1.setBounds(120, 255, 238, 2);
		iconaUser3.add(separator_2_1);
		
		labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPassword.setForeground(new Color(100, 149, 237));
		labelPassword.setBounds(120, 285, 85, 14);
		iconaUser3.add(labelPassword);
		
		separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(SystemColor.textHighlight);
		separator_2_1_1.setBounds(120, 325, 238, 2);
		iconaUser3.add(separator_2_1_1);
		
		iconPass1 = new JLabel("");
		iconPass1.setIcon(new ImageIcon("resources/iconaPassword.png"));
		iconPass1.setBounds(96, 299, 13, 28);
		iconaUser3.add(iconPass1);
		
		labelRipetiPassword = new JLabel("Ripeti Password");
		labelRipetiPassword.setForeground(new Color(100, 149, 237));
		labelRipetiPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelRipetiPassword.setBounds(120, 356, 107, 14);
		iconaUser3.add(labelRipetiPassword);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.textHighlight);
		separator_3.setBounds(120, 394, 238, 2);
		iconaUser3.add(separator_3);
		
		iconaPass2 = new JLabel("");
		iconaPass2.setIcon(new ImageIcon("resources/iconaPassword.png"));
		iconaPass2.setBounds(96, 368, 13, 28);
		iconaUser3.add(iconaPass2);
		
		registerConfirmButton = new JButton("Conferma Registrazione");
		registerConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		registerConfirmButton.setBorder(null);
		registerConfirmButton.setBackground(new Color(30, 144, 255));
		registerConfirmButton.setForeground(SystemColor.text);
		registerConfirmButton.setBounds(120, 425, 238, 23);
		registerConfirmButton.setFocusable(false);
		iconaUser3.add(registerConfirmButton);
		
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
		labelTitolo.setForeground(new Color(100, 149, 237));
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
	
	public String getPass() {
		 return new String(password.getPassword());
	}
	
	public String getPassRipetuta() {
		return new String(ripetiPassword.getPassword());
	}
	
	public void setPassRipetuta(String pass) {
		ripetiPassword.setText(pass);
	}
	
	public JButton getBottoneConfermaReg() {
		return registerConfirmButton;
	}
	
	public JPasswordField getJPasswordField() {
		return password;
	}
	
	public void riprovaPassword() {
		setPassRipetuta(" ");
	}
	
	
	
	
}

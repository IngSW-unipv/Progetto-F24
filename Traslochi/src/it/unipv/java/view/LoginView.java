package it.unipv.java.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField Password;
	private JPanel panelLogin;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JSeparator separator_1;
	private JButton loginButton;
	private JTextArea Email;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JButton registerButton;
	private JLabel lblNewLabel_1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView login = new LoginView();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginView() {
		setTitle("Login ");
		setResizable(false);
	
		String imagePath = "resources/IconaLogin.png";
		ImageIcon iconLogin= new ImageIcon(imagePath);
		setIconImage(iconLogin.getImage());
		
		
		setBackground(SystemColor.textHighlight);
		setForeground(new Color(0, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setLocationRelativeTo(null); //CENTRA FRAME AL CENTRO DEL PC
		this.setVisible(true);
		
		panelLogin = new JPanel();
		panelLogin.setBackground(Color.WHITE);
		panelLogin.setForeground(Color.WHITE);
		panelLogin.setBounds(0, 0, 222, 261);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 0, 72, 52);
		panelLogin.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setForeground(new Color(100, 149, 237));
		separator.setBounds(10, 83, 191, 2);
		panelLogin.add(separator);
		
		emailLabel = new JLabel("Email");
		emailLabel.setForeground(new Color(100, 149, 237));
		emailLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		emailLabel.setBounds(10, 48, 46, 14);
		panelLogin.add(emailLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(new Color(100, 149, 237));
		passwordLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		passwordLabel.setBounds(10, 96, 60, 14);
		panelLogin.add(passwordLabel);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(100, 149, 237));
		separator_1.setBounds(10, 131, 191, 14);
		panelLogin.add(separator_1);
		
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		loginButton.setBorderPainted(false);
		loginButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		loginButton.setIcon(null);
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(SystemColor.textHighlight);
		loginButton.setBounds(20, 156, 162, 28);
		loginButton.setFocusable(false);
		panelLogin.add(loginButton);
		
		Email = new JTextArea();
		Email.setBounds(10, 63, 191, 22);
		panelLogin.add(Email);
		
		Password = new JPasswordField();
		Password.setBorder(null);
		Password.setBounds(10, 108, 191, 20);
		panelLogin.add(Password);
		
		registerButton = new JButton("Registrati");
		registerButton.setForeground(Color.WHITE);
		registerButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		registerButton.setBorderPainted(false);
		registerButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		registerButton.setBackground(SystemColor.textHighlight);
		registerButton.setBounds(20, 222, 162, 28);
		registerButton.setFocusable(false);
		panelLogin.add(registerButton);
		
		lblNewLabel_1 = new JLabel("OR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setBounds(95, 197, 15, 14);
		panelLogin.add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBounds(220, 0, 222, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIconTextGap(0);
		lblNewLabel_2.setMaximumSize(new Dimension(6, 5));
		lblNewLabel_2.setSize(new Dimension(4, 4));
		
		
		lblNewLabel_2.setIcon(new ImageIcon("resources/immagineLoginPanel.jpg")); // DA SOSTITUIRE LINK 
		lblNewLabel_2.setBounds(-16, 0, 238, 261);
		panel.add(lblNewLabel_2);
		
	}
	
	public String getEmail() {
		return Email.getText();
	}
	
	public String getPassword() {
		return Password.getSelectedText();
	}
	
	void addLoginListener(ActionListener listenForLogin) {
		loginButton.addActionListener(listenForLogin);
	}
	
	void addRegisterListener(ActionListener listenForRegister) {
		registerButton.addActionListener(listenForRegister);
	}
	
	
}

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
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField textAreaPassword;
	private JPanel panelLogin;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JSeparator separator_1;
	private JButton loginButton;
	private JTextArea textAreaEmail;
	private JPanel panel;
	private JLabel lblNewLabel_2;

	public LoginView() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nikola.manev\\Downloads\\Logo-Bidons.png"));
		setBackground(SystemColor.textHighlight);
		setForeground(new Color(0, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelLogin = new JPanel();
		panelLogin.setBackground(Color.WHITE);
		panelLogin.setForeground(Color.WHITE);
		panelLogin.setBounds(0, 0, 222, 261);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 0, 72, 52);
		panelLogin.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(10, 99, 191, 2);
		panelLogin.add(separator);
		
		emailLabel = new JLabel("Email");
		emailLabel.setForeground(Color.GRAY);
		emailLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		emailLabel.setBounds(10, 63, 46, 14);
		panelLogin.add(emailLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(Color.GRAY);
		passwordLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		passwordLabel.setBounds(10, 137, 60, 14);
		panelLogin.add(passwordLabel);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 171, 191, 14);
		panelLogin.add(separator_1);
		
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		loginButton.setBorderPainted(false);
		loginButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		loginButton.setIcon(null);
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(new Color(0, 128, 255));
		loginButton.setBounds(21, 208, 162, 28);
		panelLogin.add(loginButton);
		
		textAreaEmail = new JTextArea();
		textAreaEmail.setBounds(10, 77, 191, 22);
		panelLogin.add(textAreaEmail);
		
		textAreaPassword = new JPasswordField();
		textAreaPassword.setBorder(null);
		textAreaPassword.setBounds(10, 150, 191, 20);
		panelLogin.add(textAreaPassword);
		
		panel = new JPanel();
		panel.setBounds(220, 0, 222, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIconTextGap(0);
		lblNewLabel_2.setMaximumSize(new Dimension(6, 5));
		lblNewLabel_2.setSize(new Dimension(4, 4));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\bidons9.jpg"));
		lblNewLabel_2.setBounds(-16, 0, 238, 261);
		panel.add(lblNewLabel_2);
	}
	
	public String getEmail() {
		return textAreaEmail.getText();
	}
	
	public String getPassword() {
		return textAreaPassword.getSelectedText();
	}
	
	void addLoginListener(ActionListener listenForLogin) {
		loginButton.addActionListener(listenForLogin);
	}
	
	
	
	
}

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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField password;
	private JPanel panelLogin;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JSeparator separator_1;
	private JButton loginButton;
	private JTextArea email;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JButton registerButton;
	private JLabel lblNewLabel_1;
	

	public   void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView login = new LoginView();
				 login.setVisible(true);
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
		
		lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		
		separator = new JSeparator();
		separator.setForeground(new Color(100, 149, 237));
		
		emailLabel = new JLabel("Email");
		emailLabel.setForeground(new Color(100, 149, 237));
		emailLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(new Color(100, 149, 237));
		passwordLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(100, 149, 237));
		
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		loginButton.setBorderPainted(false);
		loginButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		loginButton.setIcon(null);
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(SystemColor.textHighlight);
		
		email = new JTextArea();
		
		password = new JPasswordField();
		password.setBorder(null);
		
		registerButton = new JButton("Registrati");
		registerButton.setForeground(Color.WHITE);
		registerButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		registerButton.setBorderPainted(false);
		registerButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		registerButton.setBackground(SystemColor.textHighlight);
		registerButton.setFocusable(false);
		
		lblNewLabel_1 = new JLabel("OR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		GroupLayout gl_panelLogin = new GroupLayout(panelLogin);
		gl_panelLogin.setHorizontalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(10)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(20)
					.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(95)
					.addComponent(lblNewLabel_1))
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(20)
					.addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelLogin.setVerticalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addGap(48)
							.addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addGap(20)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addGap(12)
							.addComponent(password, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
		);
		panelLogin.setLayout(gl_panelLogin);
		
		panel = new JPanel();
		panel.setBounds(220, 0, 222, 261);
		contentPane.add(panel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIconTextGap(0);
		lblNewLabel_2.setMaximumSize(new Dimension(6, 5));
		
		
		lblNewLabel_2.setIcon(new ImageIcon("resources/immagineLoginPanel.jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		
	}
	
	public JButton getLoginButton() {
		return loginButton;
	}
	public JButton getRegisterButton() {
		return registerButton;
	}
	public String getEmail() {
		return email.getText();
	}
	
	public String getPassword() {
		return password.getSelectedText();
	}
	
	public void setPassword(String pass) {
		password.setText(pass);
	}
	
	public void setEmail(String em) {
		email.setText(em);
	}

	public void apriLogin() {
		this.setVisible(true);
	}
	
	
	
	
}

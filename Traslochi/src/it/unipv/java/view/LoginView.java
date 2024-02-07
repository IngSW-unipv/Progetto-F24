package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(Color.WHITE);
		panelLogin.setForeground(Color.WHITE);
		panelLogin.setBounds(0, 0, 222, 261);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 0, 72, 52);
		panelLogin.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 99, 191, 2);
		panelLogin.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 63, 46, 14);
		panelLogin.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(10, 137, 60, 14);
		panelLogin.add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 171, 191, 14);
		panelLogin.add(separator_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(21, 208, 162, 28);
		panelLogin.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 77, 191, 22);
		panelLogin.add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(10, 150, 191, 20);
		panelLogin.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBounds(220, 0, 222, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIconTextGap(0);
		lblNewLabel_2.setMaximumSize(new Dimension(6, 5));
		lblNewLabel_2.setSize(new Dimension(4, 4));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\bidons9.jpg"));
		lblNewLabel_2.setBounds(-16, 0, 238, 261);
		panel.add(lblNewLabel_2);
	}
}

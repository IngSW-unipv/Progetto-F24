package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;

public class RegistrazioneView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrazioneView frame = new RegistrazioneView();
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
	public RegistrazioneView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(0, 0, 499, 495);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\user5%.png"));
		lblNewLabel.setBounds(38, 38, 13, 28);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(61, 64, 175, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(286, 64, 175, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setBounds(61, 25, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cognome");
		lblNewLabel_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(286, 25, 72, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Codice Fiscale");
		lblNewLabel_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(61, 102, 85, 14);
		panel.add(lblNewLabel_1_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(SystemColor.textHighlight);
		separator_2.setBounds(61, 142, 238, 2);
		panel.add(separator_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\user5%.png"));
		lblNewLabel_2.setBounds(260, 38, 13, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\user5%.png"));
		lblNewLabel_3.setBounds(38, 116, 13, 28);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Email");
		lblNewLabel_1_2_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(61, 174, 85, 14);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\iconaMail5%.jpg"));
		lblNewLabel_3_1.setBounds(38, 188, 23, 28);
		panel.add(lblNewLabel_3_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(SystemColor.textHighlight);
		separator_2_1.setBounds(61, 214, 238, 2);
		panel.add(separator_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Password");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2_1_1.setBounds(61, 250, 85, 14);
		panel.add(lblNewLabel_1_2_1_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(SystemColor.textHighlight);
		separator_2_1_1.setBounds(61, 293, 238, 2);
		panel.add(separator_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\iconaPass5%.png"));
		lblNewLabel_3_1_1.setBounds(38, 267, 13, 28);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Ripeti Password");
		lblNewLabel_1_2_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_1_1.setBounds(61, 322, 107, 14);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.textHighlight);
		separator_3.setBounds(61, 363, 238, 2);
		panel.add(separator_3);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Downloads\\iconaPass5%.png"));
		lblNewLabel_3_1_1_1.setBounds(38, 340, 13, 28);
		panel.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton = new JButton("Conferma Registrazione");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBounds(120, 425, 238, 23);
		panel.add(btnNewButton);
	}

}

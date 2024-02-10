package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class DipendenteView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DipendenteView frame = new DipendenteView();
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
	public DipendenteView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nikola.manev\\Desktop\\immagini java\\IconaRegister.jpg"));
		setTitle("Bidons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1421, 682);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblTurniLavorativi = new JLabel("Turni Lavorativi");
		lblTurniLavorativi.setForeground(new Color(248, 248, 255));
		lblTurniLavorativi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton buttonVisProfilo = new JButton("Visualizza Profilo");
		buttonVisProfilo.setForeground(SystemColor.window);
		buttonVisProfilo.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVisProfilo.setFocusable(false);
		buttonVisProfilo.setBorder(null);
		buttonVisProfilo.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 2571, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(83)
					.addComponent(lblTurniLavorativi, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
					.addGap(937)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addGap(1207))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 67, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTurniLavorativi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(19))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 15, Short.MAX_VALUE)
					.addGap(31))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 2571, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1359, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(220, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

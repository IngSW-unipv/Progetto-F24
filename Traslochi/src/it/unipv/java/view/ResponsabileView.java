package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class ResponsabileView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResponsabileView frame = new ResponsabileView();
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
	public ResponsabileView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1421, 649);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(30, 144, 255));
		
		JLabel lblPannelloDiControllo = new JLabel("Pannello di Controllo");
		lblPannelloDiControllo.setForeground(new Color(248, 248, 255));
		lblPannelloDiControllo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton buttonVisProfilo = new JButton("Visualizza Profilo");
		buttonVisProfilo.setForeground(SystemColor.window);
		buttonVisProfilo.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVisProfilo.setFocusable(false);
		buttonVisProfilo.setBorder(null);
		buttonVisProfilo.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(55)
					.addComponent(lblPannelloDiControllo, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addGap(870)
					.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1208, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblPannelloDiControllo, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(21))))
		);
		panel.setLayout(gl_panel);
		
		JButton btnNewButton = new JButton("Aggiungi Dipendente");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(248, 248, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnAssegnaTurno = new JButton("Assegna Turno");
		btnAssegnaTurno.setBorder(null);
		btnAssegnaTurno.setBackground(SystemColor.textHighlight);
		btnAssegnaTurno.setForeground(new Color(248, 248, 255));
		btnAssegnaTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel = new JLabel("DIPENDENTI");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblTurni = new JLabel("TURNI");
		lblTurni.setForeground(new Color(30, 144, 255));
		lblTurni.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblPrenotazioni = new JLabel("PRENOTAZIONI");
		lblPrenotazioni.setForeground(new Color(30, 144, 255));
		lblPrenotazioni.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Tutti i Dipendenti");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("Turni assegnati");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_2 = new JLabel("Tutte le Prenotazioni");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.textHighlight);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(SystemColor.textHighlight);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBackground(SystemColor.textHighlight);
		scrollPane_2.setForeground(SystemColor.textHighlight);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JButton btnNewButton_1 = new JButton("Rimuovi Dipendente");
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBorder(null);
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(SystemColor.textHighlight);
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 2581, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(156)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(183)
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblTurni, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(86)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(270)
									.addComponent(btnAssegnaTurno, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
							.addGap(330)
							.addComponent(lblPrenotazioni, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(146)
									.addComponent(lblNewLabel_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(42)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)))
							.addGap(94)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(103)
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(204)
									.addComponent(lblNewLabel_1_1)))
							.addGap(90)
							.addComponent(separator_1_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(94)
									.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(174)
									.addComponent(lblNewLabel_1_2)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(45)
									.addComponent(btnAssegnaTurno, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPrenotazioni, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTurni, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
										.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))))
							.addGap(77)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_1_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
										.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
									.addGap(101))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(separator_1_1, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.textHighlight, SystemColor.textHighlight));
		textPane_2.setBackground(SystemColor.inactiveCaptionBorder);
		scrollPane_2.setViewportView(textPane_2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.textHighlight, SystemColor.textHighlight));
		textPane_1.setBackground(SystemColor.inactiveCaptionBorder);
		scrollPane_1.setViewportView(textPane_1);
		
		JTextPane txtpnJJJ = new JTextPane();
		txtpnJJJ.setEditable(false);
		txtpnJJJ.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnJJJ.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.textHighlight, SystemColor.textHighlight));
		scrollPane.setViewportView(txtpnJJJ);
		
		contentPane.setLayout(gl_contentPane);
	}
}

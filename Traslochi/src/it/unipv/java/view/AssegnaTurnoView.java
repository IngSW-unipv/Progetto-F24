package it.unipv.java.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AssegnaTurnoView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonConfTurno;
	private JTextField idDip;
	private JTextField orarioIniTur;
	private JTextField indLavoro;
	private JButton buttonAnnulla;


	
	public static void main(String[] args) {
		try {
			AssegnaTurnoView dialog = new AssegnaTurnoView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
	public AssegnaTurnoView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
		setTitle("Bidons");
		setBounds(100, 100, 450, 392);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("ID Dipendente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 39, 259, 16);
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblOrarioDiInizio = new JLabel("Orario di Inizio Turno");
		lblOrarioDiInizio.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrarioDiInizio.setBounds(81, 134, 259, 16);
		lblOrarioDiInizio.setForeground(SystemColor.activeCaption);
		lblOrarioDiInizio.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblIndirizzoDi = new JLabel("Indirizzo di Lavoro");
		lblIndirizzoDi.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndirizzoDi.setBounds(81, 227, 264, 16);
		lblIndirizzoDi.setForeground(SystemColor.activeCaption);
		lblIndirizzoDi.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(81, 86, 257, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(81, 178, 259, 2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(81, 269, 264, 2);
		
		idDip = new JTextField();
		idDip.setBounds(81, 66, 259, 14);
		idDip.setBackground(SystemColor.inactiveCaptionBorder);
		idDip.setBorder(null);
		idDip.setColumns(10);
		
		orarioIniTur = new JTextField();
		orarioIniTur.setBounds(81, 156, 264, 14);
		orarioIniTur.setBackground(SystemColor.inactiveCaptionBorder);
		orarioIniTur.setBorder(null);
		orarioIniTur.setColumns(10);
		
		indLavoro = new JTextField();
		indLavoro.setBounds(81, 249, 264, 14);
		indLavoro.setBackground(SystemColor.inactiveCaptionBorder);
		indLavoro.setBorder(null);
		indLavoro.setColumns(10);
		{
			buttonConfTurno = new JButton("Conferma ");
			buttonConfTurno.setBounds(59, 315, 140, 21);
			buttonConfTurno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonConfTurno.setBackground(SystemColor.textHighlight);
			buttonConfTurno.setForeground(SystemColor.window);
			buttonConfTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonConfTurno.setBorder(null);
			buttonConfTurno.setActionCommand("OK");
			getRootPane().setDefaultButton(buttonConfTurno);
			buttonConfTurno.setFocusable(false);
		}
		contentPanel.setLayout(null);
		contentPanel.add(lblOrarioDiInizio);
		contentPanel.add(idDip);
		contentPanel.add(separator_1);
		contentPanel.add(orarioIniTur);
		contentPanel.add(indLavoro);
		contentPanel.add(separator);
		contentPanel.add(buttonConfTurno);
		contentPanel.add(lblIndirizzoDi);
		contentPanel.add(lblNewLabel);
		contentPanel.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Per Assegnare un Turno Inserire");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(81, 14, 259, 14);
		contentPanel.add(lblNewLabel_1);
		
		buttonAnnulla = new JButton("Annulla");
		buttonAnnulla.setForeground(SystemColor.window);
		buttonAnnulla.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAnnulla.setFocusable(false);
		buttonAnnulla.setBorder(null);
		buttonAnnulla.setBackground(SystemColor.textHighlight);
		buttonAnnulla.setActionCommand("OK");
		buttonAnnulla.setBounds(228, 315, 140, 21);
		contentPanel.add(buttonAnnulla);
	}
	
	
	public String getIdDip() {
		return idDip.getText();
	}



	public void setIdDip(String stringa) {
		idDip.setText(stringa);
	}



	public String getOrarioIniTur() {
		return orarioIniTur.getText();
	}



	public void setOrarioIniTur(String stringa) {
		orarioIniTur.setText(stringa);
	}



	public String getIndLavoro() {
		return indLavoro.getText();
	}



	public void setIndLavoro(String stringa) {
		indLavoro.setText(stringa);
	}



	public JPanel getContentPanel() {
		return contentPanel;
	}



	public void setButtonConfTurno(JButton buttonConfTurno) {
		this.buttonConfTurno = buttonConfTurno;
	}



	public JButton getButtonConfTurno() {
		return buttonConfTurno;
	}
	
	public JButton getButtonAnnulla() {
		return buttonAnnulla;
	}
	
	
}

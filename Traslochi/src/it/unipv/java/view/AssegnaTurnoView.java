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

public class AssegnaTurnoView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonConfTurno;
	private JTextField idDip;
	private JTextField orarioIniTur;
	private JTextField indLavoro;


	
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
		setBounds(100, 100, 450, 409);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JTextPane txtpnPerAssegnareUn = new JTextPane();
		txtpnPerAssegnareUn.setEditable(false);
		txtpnPerAssegnareUn.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnPerAssegnareUn.setForeground(SystemColor.textHighlight);
		txtpnPerAssegnareUn.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnPerAssegnareUn.setText("Per assegnare un turno inserire\r\n");
		
		JLabel lblNewLabel = new JLabel("ID Dipendente");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblOrarioDiInizio = new JLabel("Orario di Inizio Turno");
		lblOrarioDiInizio.setForeground(SystemColor.activeCaption);
		lblOrarioDiInizio.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblIndirizzoDi = new JLabel("Indirizzo di Lavoro");
		lblIndirizzoDi.setForeground(SystemColor.activeCaption);
		lblIndirizzoDi.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JSeparator separator_2 = new JSeparator();
		
		idDip = new JTextField();
		idDip.setBackground(SystemColor.inactiveCaptionBorder);
		idDip.setBorder(null);
		idDip.setColumns(10);
		
		orarioIniTur = new JTextField();
		orarioIniTur.setBackground(SystemColor.inactiveCaptionBorder);
		orarioIniTur.setBorder(null);
		orarioIniTur.setColumns(10);
		
		indLavoro = new JTextField();
		indLavoro.setBackground(SystemColor.inactiveCaptionBorder);
		indLavoro.setBorder(null);
		indLavoro.setColumns(10);
		{
			buttonConfTurno = new JButton("Conferma ");
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
		 
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(83, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(txtpnPerAssegnareUn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(89))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblOrarioDiInizio, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(132))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(idDip, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
									.addComponent(orarioIniTur, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
									.addComponent(indLavoro, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
									.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
									.addComponent(separator, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
							.addGap(79))))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(140)
					.addComponent(buttonConfTurno, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(156, Short.MAX_VALUE)
					.addComponent(lblIndirizzoDi)
					.addGap(149))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(165)
					.addComponent(lblNewLabel)
					.addContainerGap(167, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(txtpnPerAssegnareUn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(idDip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(lblOrarioDiInizio)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(orarioIniTur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(lblIndirizzoDi)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(indLavoro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(buttonConfTurno, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
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
}

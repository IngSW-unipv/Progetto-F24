package it.unipv.java.view;

import java.awt.BorderLayout;

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
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class RimuoviDipView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton buttonConfermaRim;
	private JTextField idDipendente;
	private JTextField codiceFiscale;
	private JButton buttonAnnulla;

	
	
	public static void main(String[] args) {
		try {
			RimuoviDipView dialog = new RimuoviDipView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public RimuoviDipView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
		setTitle("Bidons");
		setBounds(100, 100, 391, 256);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		
		JTextPane txtpnPerRimuovereUn = new JTextPane();
		txtpnPerRimuovereUn.setEditable(false);
		txtpnPerRimuovereUn.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnPerRimuovereUn.setForeground(SystemColor.textHighlight);
		txtpnPerRimuovereUn.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnPerRimuovereUn.setText("Per rimuovere un Dipendente inserire");
		JLabel lblNewLabel = new JLabel("ID Dipendente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		JLabel lblNewLabel_1 = new JLabel("Codice Fiscale");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.textHighlight);
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		
		idDipendente = new JTextField();
		idDipendente.setBackground(SystemColor.inactiveCaptionBorder);
		idDipendente.setBorder(null);
		idDipendente.setColumns(10);
		
		codiceFiscale = new JTextField();
		codiceFiscale.setBackground(SystemColor.inactiveCaptionBorder);
		codiceFiscale.setBorder(null);
		codiceFiscale.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(54)
					.addComponent(txtpnPerRimuovereUn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(61, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(64, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(codiceFiscale, Alignment.TRAILING)
						.addComponent(idDipendente, Alignment.TRAILING)
						.addComponent(separator_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
						.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
					.addGap(69))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(txtpnPerRimuovereUn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(idDipendente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(codiceFiscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.inactiveCaptionBorder);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				buttonConfermaRim = new JButton("Conferma");
				buttonConfermaRim.setForeground(SystemColor.window);
				buttonConfermaRim.setFont(new Font("Tahoma", Font.BOLD, 11));
				buttonConfermaRim.setBackground(SystemColor.textHighlight);
				buttonConfermaRim.setBorder(null);
				buttonConfermaRim.setActionCommand("OK");
				getRootPane().setDefaultButton(buttonConfermaRim);
				buttonConfermaRim.setFocusable(false);
			}
			
			buttonAnnulla = new JButton("Annulla");
			buttonAnnulla.setForeground(SystemColor.window);
			buttonAnnulla.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonAnnulla.setFocusable(false);
			buttonAnnulla.setBorder(null);
			buttonAnnulla.setBackground(SystemColor.textHighlight);
			buttonAnnulla.setActionCommand("OK");
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(79)
						.addComponent(buttonConfermaRim, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addGap(63)
						.addComponent(buttonAnnulla, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(83, Short.MAX_VALUE))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(buttonAnnulla, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
							.addComponent(buttonConfermaRim, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			buttonPane.setLayout(gl_buttonPane);
		}
	}




	public JButton getButtonConfermaRim() {
		return buttonConfermaRim;
	}


	
	public JButton getButtonAnnulla() {
		return buttonAnnulla;
	}



	public String getIdDipendente() {
		return idDipendente.getText();
	}
	
	public void setIdDipendente(String id) {
		idDipendente.setText(id);
	}

	public String getCodiceFiscale() {
		return codiceFiscale.getText();
	}
	
	public void setCfDipendente(String cf) {
		codiceFiscale.setText(cf);
	}

}


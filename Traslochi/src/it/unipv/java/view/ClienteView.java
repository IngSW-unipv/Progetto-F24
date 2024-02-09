package it.unipv.java.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTable;

public class ClienteView extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClienteView frame = new ClienteView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ClienteView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1450, 686);
        setResizable(true); // Imposta la finestra come ridimensionabile

        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 144, 255));
        panel.setBorder(null);
        
        JLabel lblNewLabel_1 = new JLabel("Trasloco veloce e sicuro");
        lblNewLabel_1.setForeground(SystemColor.activeCaption);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JTextPane txtpnScegliBidonsPer = new JTextPane();
        txtpnScegliBidonsPer.setForeground(SystemColor.activeCaption);
        txtpnScegliBidonsPer.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        txtpnScegliBidonsPer.setBackground(SystemColor.text);
        txtpnScegliBidonsPer.setText("Scegli Bidons per il tuo trasloco: un'azienda giovane e dinamica  conosciuta sul territorio per l’attenzione al cliente e la competenza professionale. Nata a Pavia nel 2023, l’azienda lavora in modo trasparente flessibile, così da poter offrire un servizio impeccabile a prezzo vantaggioso.");
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nikola.manev\\Desktop\\immagini java\\traslochiImmagine50%.png"));
        
        JSeparator separator = new JSeparator();
        
        JLabel lblNewLabel_3 = new JLabel("Per prenotare un Trasloco");
        lblNewLabel_3.setForeground(SystemColor.activeCaption);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JButton btnNewButton = new JButton("Prenota Servizio");
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(SystemColor.textHighlight);
        btnNewButton.setBorder(null);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblNewLabel_4 = new JLabel("Cronologia delle Prenotazioni");
        lblNewLabel_4.setForeground(SystemColor.activeCaption);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JPanel panel_1 = new JPanel();
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(91)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGap(9)
        					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
        				.addComponent(txtpnScegliBidonsPer, GroupLayout.PREFERRED_SIZE, 527, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))
        			.addGap(71)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel_2))
        					.addGap(135))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGap(28))))
        );
        gl_contentPane.setVerticalGroup(
        	gl_contentPane.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGap(24)
        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(42)
        					.addComponent(txtpnScegliBidonsPer, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
        			.addGap(24)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGap(38)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 707, Short.MAX_VALUE)
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 127, Short.MAX_VALUE)
        );
        panel_1.setLayout(gl_panel_1);
        
        JButton btnNewButton_2 = new JButton("Visualizza Profilo");
        btnNewButton_2.setForeground(SystemColor.window);
        btnNewButton_2.setBackground(SystemColor.textHighlight);
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        JLabel lblNewLabel = new JLabel("Home Page");
        lblNewLabel.setForeground(new Color(248, 248, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(83)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 762, Short.MAX_VALUE)
        			.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        			.addGap(19))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNewLabel))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(21)
        					.addComponent(btnNewButton_2)))
        			.addContainerGap(19, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        contentPane.setLayout(gl_contentPane);
    }
}

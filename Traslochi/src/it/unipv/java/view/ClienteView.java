package it.unipv.java.view;

import java.awt.EventQueue;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.util.List;
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
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class ClienteView extends JFrame {

    private JPanel contentPane;
    private JButton buttonVisProfilo;
    private JTextPane txtPaneTesto;
    private JButton buttonPrenotazione;
    private JTextPane textPrenotazioni;

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
    	setIconImage(Toolkit.getDefaultToolkit().getImage("resources/IconaLogin.png"));
    	setTitle("Bidons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1421, 684);
        setResizable(true); // Imposta la finestra come ridimensionabile

        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.text);
        contentPane.setBorder(null);
        setContentPane(contentPane);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 144, 255));
        panel.setBorder(null);
        
        JLabel labelTrasloco = new JLabel("Trasloco veloce e sicuro");
        labelTrasloco.setForeground(SystemColor.activeCaption);
        labelTrasloco.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        txtPaneTesto = new JTextPane();
        txtPaneTesto.setForeground(SystemColor.windowText);
        txtPaneTesto.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        txtPaneTesto.setBackground(SystemColor.inactiveCaptionBorder);
        txtPaneTesto.setText("Scegli Bidons per il tuo trasloco: un'azienda giovane e dinamica  conosciuta sul territorio per l’attenzione al cliente e la competenza professionale. Nata a Pavia nel 2023, l’azienda lavora in modo trasparente flessibile, così da poter offrire un servizio impeccabile a prezzo vantaggioso.");
        txtPaneTesto.setEditable(false);
        
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("resources/traslochiImmagine.png"));
        
        JSeparator separator = new JSeparator();
        separator.setForeground(SystemColor.textHighlight);
        
        JLabel labelPren = new JLabel("Per prenotare un Trasloco");
        labelPren.setForeground(SystemColor.activeCaption);
        labelPren.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        buttonPrenotazione = new JButton("Prenota Servizio");
        buttonPrenotazione.setForeground(Color.WHITE);
        buttonPrenotazione.setBackground(SystemColor.textHighlight);
        buttonPrenotazione.setBorder(null);
        buttonPrenotazione.setFont(new Font("Tahoma", Font.BOLD, 15));
        buttonPrenotazione.setFocusable(false);
        
        JLabel labelCronologia = new JLabel("Cronologia delle Prenotazioni");
        labelCronologia.setForeground(SystemColor.activeCaption);
        labelCronologia.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(SystemColor.textHighlight);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setForeground(SystemColor.textHighlight);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight));
        panel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        panel_1.setBackground(SystemColor.inactiveCaptionBorder);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
        lblNewLabel.setIcon(new ImageIcon("resources/bookPren.jpg"));
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("resources/IconaLista.png"));
        lblNewLabel_1.setBackground(SystemColor.inactiveCaptionBorder);
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 2571, Short.MAX_VALUE)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(91)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        					.addGroup(gl_contentPane.createSequentialGroup()
        						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        							.addGroup(gl_contentPane.createSequentialGroup()
        								.addComponent(labelTrasloco, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addGap(227))
        							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
        						.addGap(88)
        						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
        							.addGroup(gl_contentPane.createSequentialGroup()
        								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        								.addGap(10))
        							.addGroup(gl_contentPane.createSequentialGroup()
        								.addComponent(lblNewLabel_1)
        								.addGap(18))))
        					.addGroup(gl_contentPane.createSequentialGroup()
        						.addComponent(txtPaneTesto, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        						.addGap(207)))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
        					.addGap(378)))
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
        					.addGap(1319))
        				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
        						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
        							.addComponent(buttonPrenotazione, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED))
        						.addComponent(labelPren, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        						.addComponent(labelCronologia, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(separator_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
        					.addGap(1275))))
        );
        gl_contentPane.setVerticalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGap(36)
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
        						.addComponent(labelTrasloco, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        						.addComponent(labelPren)))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(21)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtPaneTesto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(buttonPrenotazione, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        			.addGap(39)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        					.addGap(22))
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        						.addComponent(labelCronologia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        
        textPrenotazioni = new JTextPane();
        textPrenotazioni.setFont(new Font("Tahoma", Font.BOLD, 13));
        textPrenotazioni.setEditable(false);
        textPrenotazioni.setBackground(SystemColor.inactiveCaptionBorder);
        textPrenotazioni.setDisabledTextColor(SystemColor.inactiveCaption);
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(textPrenotazioni, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        			.addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(textPrenotazioni, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        			.addContainerGap())
        );
        panel_1.setLayout(gl_panel_1);
        
        JLabel homePageLabel = new JLabel("Home Page");
        homePageLabel.setForeground(new Color(248, 248, 255));
        homePageLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        
        buttonVisProfilo = new JButton("Visualizza Profilo");
        buttonVisProfilo.setForeground(SystemColor.window);
        buttonVisProfilo.setFont(new Font("Tahoma", Font.BOLD, 11));
        buttonVisProfilo.setBorder(null);
        buttonVisProfilo.setBackground(SystemColor.textHighlight);
        buttonVisProfilo.setFocusable(false);
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(83)
        			.addComponent(homePageLabel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        			.addGap(937)
        			.addComponent(buttonVisProfilo, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        			.addGap(1207))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(homePageLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(19))
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(21)
        			.addComponent(buttonVisProfilo, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
        			.addGap(31))
        );
        panel.setLayout(gl_panel);
        contentPane.setLayout(gl_contentPane);
    }
    
    public void aggiornaPrenotazioni(String prenotazione) {
    	StyledDocument doc = textPrenotazioni.getStyledDocument();
        try {
            // Aggiungi il testo al TextPane con un ritorno a capo alla fine
            doc.insertString(doc.getLength(), prenotazione + "\n", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
   
    
    public JButton getBottoneVisProfilo() {
    	return buttonVisProfilo;
    }
    
    public JButton getBottonePrenotazione() {
    	return buttonPrenotazione;
    }
    
    
}

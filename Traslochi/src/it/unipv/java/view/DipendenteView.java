package it.unipv.java.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;

public class DipendenteView extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton buttonVisProfilo;
    private JTextPane orarioInizioTurno;
    private JTextPane orarioFineTurno;
    private JTextPane indirizzoLavoro;
    private JButton buttonInizioTurno;
    private JButton buttonFineTurno;
    private JTextField oraInizio;
    private JTextField oraFine;
    private JTextField indLavoro;

    
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

    
    public DipendenteView() {
    	setTitle("Bidons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 917, 505);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.window);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
    	JPanel panel = new JPanel();
    	
    	JPanel panel_1 = new JPanel();
    	panel_1.setBackground(new Color(30, 144, 255));
    	panel_1.setBorder(null);
    	GroupLayout gl_panel_1 = new GroupLayout(panel_1);
    	gl_panel_1.setHorizontalGroup(
    		gl_panel_1.createParallelGroup(Alignment.LEADING)
    			.addGap(0, 822, Short.MAX_VALUE)
    	);
    	gl_panel_1.setVerticalGroup(
    		gl_panel_1.createParallelGroup(Alignment.LEADING)
    			.addGap(0, 62, Short.MAX_VALUE)
    	);
    	panel_1.setLayout(gl_panel_1);
    	GroupLayout groupLayout = new GroupLayout(getContentPane());
    	groupLayout.setHorizontalGroup(
    		groupLayout.createParallelGroup(Alignment.LEADING)
    			.addGroup(groupLayout.createSequentialGroup()
    				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
    					.addComponent(panel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
    					.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    				.addContainerGap())
    	);
    	groupLayout.setVerticalGroup(
    		groupLayout.createParallelGroup(Alignment.LEADING)
    			.addGroup(groupLayout.createSequentialGroup()
    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
    	);
    	
    	JLabel lblNewLabel = new JLabel("Orario di Inizio Turno");
    	lblNewLabel.setForeground(SystemColor.activeCaption);
    	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
    	
    	oraInizio = new JTextField();
    	oraInizio.setColumns(10);
    	
    	JLabel lblOrarioDiFine = new JLabel("Orario di Fine Turno");
    	lblOrarioDiFine.setForeground(SystemColor.activeCaption);
    	lblOrarioDiFine.setFont(new Font("Tahoma", Font.BOLD, 11));
    	
    	oraFine = new JTextField();
    	oraFine.setColumns(10);
    	
    	JLabel lblNewLabel_1 = new JLabel("Indirizzo di Lavoro\r\n");
    	lblNewLabel_1.setForeground(SystemColor.activeCaption);
    	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
    	
    	indLavoro = new JTextField();
    	indLavoro.setColumns(10);
    	
    	JButton buttonInizioTurno1 = new JButton("Inizio Turno");
    	buttonInizioTurno1.setFont(new Font("Tahoma", Font.BOLD, 11));
    	buttonInizioTurno1.setForeground(SystemColor.textHighlightText);
    	buttonInizioTurno1.setBackground(SystemColor.textHighlight);
    	buttonInizioTurno1.setBorder(null);
    	
    	JButton buttonFineTurno1 = new JButton("Fine Turno");
    	buttonFineTurno1.setForeground(SystemColor.textHighlightText);
    	buttonFineTurno1.setFont(new Font("Tahoma", Font.BOLD, 11));
    	buttonFineTurno1.setBorder(null);
    	buttonFineTurno1.setBackground(SystemColor.textHighlight);
    	GroupLayout gl_panel = new GroupLayout(panel);
    	gl_panel.setHorizontalGroup(
    		gl_panel.createParallelGroup(Alignment.LEADING)
    			.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
    				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    					.addGroup(gl_panel.createSequentialGroup()
    						.addGap(88)
    						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
    					.addGroup(gl_panel.createSequentialGroup()
    						.addGap(109)
    						.addComponent(oraInizio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
    				.addPreferredGap(ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
    				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
    					.addGroup(gl_panel.createSequentialGroup()
    						.addGap(10)
    						.addComponent(oraFine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    					.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
    						.addComponent(lblOrarioDiFine, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
    						.addGap(84))))
    			.addGroup(gl_panel.createSequentialGroup()
    				.addGap(227)
    				.addComponent(indLavoro, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
    				.addContainerGap(266, Short.MAX_VALUE))
    			.addGroup(gl_panel.createSequentialGroup()
    				.addGap(338)
    				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
    				.addContainerGap(372, Short.MAX_VALUE))
    			.addGroup(gl_panel.createSequentialGroup()
    				.addGap(198)
    				.addComponent(buttonInizioTurno1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    				.addGap(223)
    				.addComponent(buttonFineTurno1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    				.addContainerGap(239, Short.MAX_VALUE))
    	);
    	gl_panel.setVerticalGroup(
    		gl_panel.createParallelGroup(Alignment.LEADING)
    			.addGroup(gl_panel.createSequentialGroup()
    				.addGap(16)
    				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    					.addGroup(gl_panel.createSequentialGroup()
    						.addComponent(lblOrarioDiFine, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
    						.addPreferredGap(ComponentPlacement.RELATED)
    						.addComponent(oraFine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addGroup(gl_panel.createSequentialGroup()
    						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
    						.addPreferredGap(ComponentPlacement.RELATED)
    						.addComponent(oraInizio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
    				.addGap(46)
    				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(indLavoro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
    				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    					.addComponent(buttonInizioTurno1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
    					.addComponent(buttonFineTurno1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
    				.addGap(45))
    	);
    	panel.setLayout(gl_panel);
    	getContentPane().setLayout(groupLayout);
        
    }


	
	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JButton getButtonVisProfilo() {
		return buttonVisProfilo;
	}


	public void setButtonVisProfilo(JButton buttonVisProfilo) {
		this.buttonVisProfilo = buttonVisProfilo;
	}


	public String getOrarioInizioTurno() {
		return orarioInizioTurno.getContentType();
	}


	public void setOrarioInizioTurno(String orarioInizio) {
		orarioInizioTurno.setText(orarioInizio);
 	}


	public JTextPane getOrarioFineTurno() {
		return orarioFineTurno;
	}


	public void setOrarioFineTurno(String  orarioFine) {
		 orarioFineTurno.setText(orarioFine);  
	}


	public JTextPane getIndirizzoLavoro() {
		return indirizzoLavoro;
	}


	public void setIndirizzoLavoro(String indirizzo ) {
		indirizzoLavoro.setText(indirizzo);

	}


	public JButton getButtonInizioTurno() {
		return buttonInizioTurno;
	}


	public void setButtonInizioTurno(JButton buttonInizioTurno) {
		this.buttonInizioTurno = buttonInizioTurno;
	}


	public JButton getButtonFineTurno() {
		return buttonFineTurno;
	}


	public void setButtonFineTurno(JButton buttonFineTurno) {
		this.buttonFineTurno = buttonFineTurno;
	}
	
}

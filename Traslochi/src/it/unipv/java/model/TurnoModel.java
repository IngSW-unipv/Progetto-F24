package it.unipv.java.model;
import java.sql.Time;

import javax.swing.JTextField;
 
public class TurnoModel {
 
    private JTextField orarioini;  
    private JTextField idDipendente; 
    private JTextField indLavoro;    
    
    public TurnoModel() {
    }

	public JTextField getOrarioini() {
		return orarioini;
	}

	public void setOrarioini(JTextField jTextField) {
		this.orarioini = jTextField;
	}

	public JTextField getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(JTextField jTextField) {
		this.idDipendente = jTextField;
	}

	public JTextField getIndLavoro() {
		return indLavoro;
	}

	public void setIndLavoro(JTextField jTextField) {
		this.indLavoro = jTextField;
	}
	public boolean AggiungiTurno() {
		return DataAccessFacade.getInstance().aggiungiTurno(this);
	}
    

     
}//Fine turnModel

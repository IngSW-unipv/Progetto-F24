package it.unipv.java.model;
import java.sql.Time;

import javax.swing.JTextField;
 
public class TurnoModel {
 
    private String orarioini;  
    private String idDipendente; 
    private String indLavoro;    
    
    public TurnoModel() {
    }

	public String getOrarioini() {
		return orarioini;
	}

	public void setOrarioini(String orario) {
		this.orarioini = orario;
	}

	public String getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(String id) {
		this.idDipendente = id;
	}

	public String getIndLavoro() {
		return indLavoro;
	}

	public void setIndLavoro(String indLavoro) {
		this.indLavoro = indLavoro;
	}
	public boolean AggiungiTurno() {
		return DataAccessFacade.getInstance().aggiungiTurno(this);
	}
    

     
}//Fine turnModel

package it.unipv.java.model;
import java.sql.Time;
 
public class TurnoModel {
 
    private Time orarioini;  
    private String idDipendente; 
    private String indLavoro;    
    
    public TurnoModel() {
    }

	public Time getOrarioini() {
		return orarioini;
	}

	public void setOrarioini(Time orarioini) {
		this.orarioini = orarioini;
	}

	public int getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
	}

	public int getIndLavoro() {
		return indLavoro;
	}

	public void setIndLavoro(int indLavoro) {
		this.indLavoro = indLavoro;
	} 
    
	public boolean aggiungiTurno() {
		
	}
    

     
}//Fine turnModel

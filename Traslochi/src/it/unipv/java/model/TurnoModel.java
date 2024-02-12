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

	public String getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(String idDipendente) {
		this.idDipendente = idDipendente;
	}

	public String getIndLavoro() {
		return indLavoro;
	}

	public void setIndLavoro(String indLavoro) {
		this.indLavoro = indLavoro;
	}
 
    

     
}//Fine turnModel

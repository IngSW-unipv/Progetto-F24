package it.unipv.java.model;
import java.util.List;


import it.unipv.java.persistance.PersistanceFacade;
 
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
	
	public boolean aggiungiTurno() {
		return PersistanceFacade.getInstance().aggiungiTurno(this);
	}
	
	public List<TurnoModel> mostraTurni() {
		return PersistanceFacade.getInstance().mostraTurni();
	}
     
	public String toString() {
        return "Orario di Inizio Turno: " + orarioini + ", ID Dipendente: " + idDipendente + ", Indirizzo di Lavoro: " + indLavoro + "\n";
    }
}//Fine turnModel

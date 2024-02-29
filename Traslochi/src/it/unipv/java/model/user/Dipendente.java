package it.unipv.java.model.user;

import it.unipv.java.model.TurnoModel;

public class Dipendente extends User{
	private String idDipendente;
	private TurnoModel turnoAssegnato;
	
	public Dipendente() {
		// TODO Auto-generated constructor stub
	}

	public String getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(String idDipendente) {
		this.idDipendente = idDipendente;
	}

	public TurnoModel getTurnoAssegnato() {
		return turnoAssegnato;
	}

	public void setTurnoAssegnato(TurnoModel turnoAssegnato) {
		this.turnoAssegnato = turnoAssegnato;
	}
	
	@Override
	public String toString() {
	    	return this.getNome() + " " 
	             + this.getCognome() + " " 
	       		 + this.getCf() + " "
	       		 + this.getEmail() + "\n";     
	}

	@Override
	public String getId() {
		return this.getIdDipendente();
	}
}

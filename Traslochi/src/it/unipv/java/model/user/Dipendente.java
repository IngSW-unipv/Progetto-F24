package it.unipv.java.model.user;

import it.unipv.java.model.TurnoData;

public class Dipendente extends User{
	private String idDipendente;
	private TurnoData turnoAssegnato;
	
	public Dipendente() {
		// TODO Auto-generated constructor stub
	}

	public String getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(String idDipendente) {
		this.idDipendente = idDipendente;
	}

	public TurnoData getTurnoAssegnato() {
		return turnoAssegnato;
	}

	public void setTurnoAssegnato(TurnoData turnoAssegnato) {
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

	@Override
	public void setId(String idUser) {
		// TODO Auto-generated method stub
		
	}
}

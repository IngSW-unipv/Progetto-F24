package it.unipv.java.model.newuser;

import java.util.List;

import it.unipv.java.model.TurnoModel;

public class Dipendente extends User{
	private String idDipendente;
	private List<TurnoModel> turno;
	
	public Dipendente(String nome, String cognome, String cf, String email, String password) {
		super(nome, cognome, cf, email, password);
		// TODO Auto-generated constructor stub
	}

	public String getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(String idDipendente) {
		this.idDipendente = idDipendente;
	}

	public List<TurnoModel> getTurno() {
		return turno;
	}

	public void setTurno(List<TurnoModel> turno) {
		this.turno = turno;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"idDipendente=" + this.getIdDipendente() + "]";
	}
}

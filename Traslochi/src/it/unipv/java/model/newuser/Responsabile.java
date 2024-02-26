package it.unipv.java.model.newuser;

import java.util.List;

public class Responsabile extends User{
	private String idResponsabile;
	private List<Dipendente> dipendentiRegistrati;
	
	public Responsabile(String nome, String cognome, String cf, String email, String password) {
		super(nome, cognome, cf, email, password);
		// TODO Auto-generated constructor stub
	}

	public String getIdResponsabile() {
		return idResponsabile;
	}

	public void setIdResponsabile(String idResponsabile) {
		this.idResponsabile = idResponsabile;
	}

	public List<Dipendente> getDipendentiRegistrati() {
		return dipendentiRegistrati;
	}

	public void setDipendentiRegistrati(List<Dipendente> dipendentiRegistrati) {
		this.dipendentiRegistrati = dipendentiRegistrati;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"idResponsabile=" + this.getIdResponsabile() + "]";
	}
}

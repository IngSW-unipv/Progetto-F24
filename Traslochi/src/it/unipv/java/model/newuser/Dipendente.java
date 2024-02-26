package it.unipv.java.model.newuser;

import java.util.List;

import it.unipv.java.model.TurnoModel;

public class Dipendente extends User{
	private String idDipendente;
	private List<TurnoModel> turno;
	
	public Dipendente() {
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

	@Override
	public String getId() {
		return this.getIdDipendente();
	}

	@Override
	public void setId(String idUser) {
		// TODO Auto-generated method stub
		
	}
}

package it.unipv.java.model.user;

import java.util.List;

import it.unipv.java.model.TurnoData;

public class Responsabile extends User{
	private String idResponsabile;
	private List<Dipendente> dipendentiRegistrati;
	private List<TurnoData> turniRegistrati;
	
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

	public List<TurnoData> getTurniRegistrati() {
		return turniRegistrati;
	}

	public void setTurniRegistrati(List<TurnoData> turniRegistrati) {
		this.turniRegistrati = turniRegistrati;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"idResponsabile=" + this.getIdResponsabile() + "]";
	}

	@Override
	public String getId() {
		return this.getIdResponsabile();
	}

	@Override
	public void setId(String idUser) {
		// TODO
		
	}
}

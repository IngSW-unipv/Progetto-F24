package it.unipv.java.model.user;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.persistance.PersistanceFacade;

public class Responsabile extends User{
	private String idResponsabile;
	
	public String getIdResponsabile() {
		return idResponsabile;
	}

	public void setIdResponsabile(String idResponsabile) {
		this.idResponsabile = idResponsabile;
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
	
	
	
	public List<User> getDipendentiRegistrati() {
		return PersistanceFacade.getInstance().getTuttiDipendenti();
	}

	public List<TurnoModel> getTurniRegistrati() {
		return PersistanceFacade.getInstance().mostraTurni();
	}
	
	public List<PrenotazioneModel> getPrenotazioniRegistrate() {
		return PersistanceFacade.getInstance().mostraPrenotazioni();
	}
}

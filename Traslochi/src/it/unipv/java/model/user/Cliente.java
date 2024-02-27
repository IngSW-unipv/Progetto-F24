package it.unipv.java.model.user;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.persistance.PersistanceFacade;

public class Cliente extends User {
	private String idCliente;
	private List<PrenotazioneModel> prenotazioniUtente;
	
	public Cliente() {}
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public List<PrenotazioneModel> getPrenotazioniUtente() {
		return PersistanceFacade.getInstance().getPrenotazioniCliente();
	}

	public void setPrenotazioniUtente(List<PrenotazioneModel> prenotazioniUtente) {
		this.prenotazioniUtente = prenotazioniUtente;
	}
	@Override
	public String toString() {
		return super.toString() + 
				"idCliente=" + this.getIdCliente() + "]";
	}

	@Override
	public String getId() {
		return this.getIdCliente();
	}

	@Override
	public void setId(String idUser) {
		//TO-DO
	}
}

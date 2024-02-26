package it.unipv.java.model.newuser;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;

public class Cliente extends User {
	private String idCliente;
	private List<PrenotazioneModel> prenotazioniCliente;
	
	public Cliente() {}
	
	public List<PrenotazioneModel> getPrenotazioniCliente() {
		return prenotazioniCliente;
	}

	public void setPrenotazioniCliente(List<PrenotazioneModel> prenotazioniCliente) {
		this.prenotazioniCliente = prenotazioniCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
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

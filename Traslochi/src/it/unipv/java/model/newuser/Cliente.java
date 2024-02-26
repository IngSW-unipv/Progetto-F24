package it.unipv.java.model.newuser;

import java.util.List;

import it.unipv.java.model.PrenotazioneModel;

public class Cliente extends User {
	private String idCliente;
	private List<PrenotazioneModel> prenotazioniCliente;
	
	public Cliente(String nome, String cognome, String cf, String email, String password) {
		super(nome, cognome, cf, email, password);
		// TODO Auto-generated constructor stub
	}
	
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
}

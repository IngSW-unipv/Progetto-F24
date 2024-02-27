package it.unipv.java.model;

public class Indirizzo {
	private String via;
	private String numeroCivico;
	private String citta;
	private String CAP;
	private String provincia;
	private String stato;

	// Costruttore
	public Indirizzo(String via, String numeroCivico, String citta, String CAP, String provincia, String stato) {
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.citta = citta;
		this.CAP = CAP;
		this.provincia = provincia;
		this.stato = stato;
	}

	// Getter e Setter
	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCAP() {
		return CAP;
	}

	public void setCAP(String CAP) {
		this.CAP = CAP;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}
}

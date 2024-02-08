package it.unipv.java.model;

public class Prenotazione {
	
	private int idPrenotazione;
	private int idCliente;
	private Indirizzo indirizzoConsegna;
	private Indirizzo indirizzoRitiro;
	private String dataRitiro;
	private String dataConsegna;
	private String metodoPagamento;
	private Float importoPagato;
	private String statoPrenotazione;
	
	public Prenotazione() {
		// TODO Auto-generated constructor stub
	}
	public int getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Indirizzo getIndirizzoConsegna() {
		return indirizzoConsegna;
	}
	public void setIndirizzoConsegna(Indirizzo indirizzoConsegna) {
		this.indirizzoConsegna = indirizzoConsegna;
	}
	public Indirizzo getIndirizzoRitiro() {
		return indirizzoRitiro;
	}
	public void setIndirizzoRitiro(Indirizzo indirizzoRitiro) {
		this.indirizzoRitiro = indirizzoRitiro;
	}
	public String getDataRitiro() {
		return dataRitiro;
	}
	public void setDataRitiro(String dataRitiro) {
		this.dataRitiro = dataRitiro;
	}
	public String getDataConsegna() {
		return dataConsegna;
	}
	public void setDataConsegna(String dataConsegna) {
		this.dataConsegna = dataConsegna;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public Float getImportoPagato() {
		return importoPagato;
	}
	public void setImportoPagato(Float importoPagato) {
		this.importoPagato = importoPagato;
	}
	public String getStatoPrenotazione() {
		return statoPrenotazione;
	}
	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}
	
	 
}

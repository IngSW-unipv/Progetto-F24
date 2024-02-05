package it.unipv.java.model;

public class Prenotazione {
	private String idPrenotazione;
	private String idCliente;
	private String indirizzoConsegna;
	private String indirizzoRitiro;
	private String dataRitiro;
	private String dataConsegna;
	private String metodoPagamento;
	private String importoPagato;
	private String statoPrenotazione;
	
	public String getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(String idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIndirizzoConsegna() {
		return indirizzoConsegna;
	}
	public void setIndirizzoConsegna(String indirizzoConsegna) {
		this.indirizzoConsegna = indirizzoConsegna;
	}
	public String getIndirizzoRitiro() {
		return indirizzoRitiro;
	}
	public void setIndirizzoRitiro(String indirizzoRitiro) {
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
	public String getImportoPagato() {
		return importoPagato;
	}
	public void setImportoPagato(String importoPagato) {
		this.importoPagato = importoPagato;
	}
	public String getStatoPrenotazione() {
		return statoPrenotazione;
	}
	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}
	
}

package it.unipv.java.model;

import it.unipv.java.util.responsabilitychain.PrenotazioneHandler;

public class PrenotazioneData {
	private String idPrenotazione;
	private String idCliente;
	private String idResponsabile;
	private String indirizzoConsegna;
	private String dataRitiro;
	private String dataConsegna;
	private String metodoPagamento;
	private float importo;
	private String statoPrenotazione;
	private String indirizzoRitiro;
	private String cvc;
	private String scadGiorno;
	private String scadMese;
	private String scadAnno;
	
	public PrenotazioneData() {
		
	}

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

	public String getIdResponsabile() {
		return idResponsabile;
	}

	public void setIdResponsabile(String idResponsabile) {
		this.idResponsabile = idResponsabile;
	}

	public String getIndirizzoConsegna() {
		return indirizzoConsegna;
	}

	public void setIndirizzoConsegna(String indirizzoConsegna) {
		this.indirizzoConsegna = indirizzoConsegna;
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

	public float getImporto() {
		return importo;
	}

	public void setImporto(float importo) {
		this.importo = importo;
	}

	public String getStatoPrenotazione() {
		return statoPrenotazione;
	}

	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}

	public String getIndirizzoRitiro() {
		return indirizzoRitiro;
	}

	public void setIndirizzoRitiro(String indirizzoRitiro) {
		this.indirizzoRitiro = indirizzoRitiro;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public String getScadGiorno() {
		return scadGiorno;
	}

	public void setScadGiorno(String scadGiorno) {
		this.scadGiorno = scadGiorno;
	}

	public String getScadMese() {
		return scadMese;
	}

	public void setScadMese(String scadMese) {
		this.scadMese = scadMese;
	}

	public String getScadAnno() {
		return scadAnno;
	}

	public void setScadAnno(String scadAnno) {
		this.scadAnno = scadAnno;
	}

	@Override
	public String toString() {
        return "Indirizzo di Ritiro: " + indirizzoRitiro + 
        		", Indirizzo di Consegna: " + indirizzoConsegna + 
        		", Data di Ritiro: " + dataRitiro + 
        		", Data di Consegna: " + dataConsegna
        		+ "\n";
    }
}

package it.unipv.java.model;

import java.util.Date;

public class PrenotazioneModel {
    private int idPrenotazione;
    private int idCliente;
    private String indirizzoDiConsegna;
    private String dataRitiro;
    private String dataConsegna;
    private String metodoPagamento;
    private float importoPagato;
    private String statoPrenotazione;
    private String indirizzodiRitiro;
    private String cvc;
    private String scadGiorno;
    private String scadMese;
    private String scadAnno;

    // Getters
    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getIndirizzoDiConsegna() {
        return indirizzoDiConsegna;
    }

    public String getDataRitiro() {
        return dataRitiro;
    }

    public String getDataConsegna() {
        return dataConsegna;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public Float getImportoPagato() {
        return importoPagato;
    }

    public String getStatoPrenotazione() {
        return statoPrenotazione;
    }

    // Setters
    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIndirizzoDiConsegna(String indirizzoDiConsegna) {
        this.indirizzoDiConsegna = indirizzoDiConsegna;
    }

    public void setDataRitiro(String dataRitiro) {
        this.dataRitiro = dataRitiro;
    }

    public void setDataConsegna(String dataConsegna) {
        this.dataConsegna = dataConsegna;
    }

    public void setMetodoDiPagamento(String metodoDiPagamento) {
        this.metodoPagamento = metodoDiPagamento;
    }

    public void setImportoPagato(Float importoPagato) {
        this.importoPagato = importoPagato;
    }

    public void setStatoPrenotazione(String statoPrenotazione) {
        this.statoPrenotazione = statoPrenotazione;
    }

	public String getIndirizzodiRitiro() {
		return indirizzodiRitiro;
	}

	public void setIndirizzodiRitiro(String indirizzodiRitiro) {
		this.indirizzodiRitiro = indirizzodiRitiro;
	}

	public String getCVC() {
		return cvc;
	}

	public void setCVC(String cvc) {
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
    
    
}

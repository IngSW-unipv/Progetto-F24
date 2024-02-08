package it.unipv.java.model;

import java.util.Date;

public class PrenotazioneModel {
    private int idPrenotazione;
    private int idCliente;
    private String indirizzoDiConsegna;
    private Date dataRitiro;
    private Date dataConsegna;
    private String metodoDiPagamento;
    private float importoPagato;
    private String statoPrenotazione;

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

    public Date getDataRitiro() {
        return dataRitiro;
    }

    public Date getDataConsegna() {
        return dataConsegna;
    }

    public String getMetodoDiPagamento() {
        return metodoDiPagamento;
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

    public void setDataRitiro(Date dataRitiro) {
        this.dataRitiro = dataRitiro;
    }

    public void setDataConsegna(Date dataConsegna) {
        this.dataConsegna = dataConsegna;
    }

    public void setMetodoDiPagamento(String metodoDiPagamento) {
        this.metodoDiPagamento = metodoDiPagamento;
    }

    public void setImportoPagato(Float importoPagato) {
        this.importoPagato = importoPagato;
    }

    public void setStatoPrenotazione(String statoPrenotazione) {
        this.statoPrenotazione = statoPrenotazione;
    }
}

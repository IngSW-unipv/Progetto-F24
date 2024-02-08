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
}

package it.unipv.java.model;
import java.sql.Time;
 
public class TurnoModel {
 
    private Time orario; 
    private int idResponsabile; 
    private int idDipendente; 
    private int idMezzo;    
    
    public TurnoModel() {
    } 
    
    public Time getOrario() {
        return orario;
    }

    public void setOrario(Time orario) {
        this.orario = orario;
    }

    public int getIdResponsabile() {
        return idResponsabile;
    }

    public void setIdResponsabile(int idResponsabile) {
        this.idResponsabile = idResponsabile;
    }

    public int getIdDipendente() {
        return idDipendente;
    }

    public void setIdDipendente(int idDipendente) {
        this.idDipendente = idDipendente;
    }

    public int getIdMezzo() {
        return idMezzo;
    }

    public void setIdMezzo(int idMezzo) {
        this.idMezzo = idMezzo;
    }

     
}

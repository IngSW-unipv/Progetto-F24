package it.unipv.java.model.user;

import java.util.ArrayList;
import java.util.List;

public class DipendenteModel extends UserModel {
    private String idDipendente;
    private String mezzo;

    // Costruttore di default che chiama il costruttore della superclasse
    /*public DipendenteModel() {
     }*/
    
    // Costruttore parametrizzato per inizializzare un Dipendente con tutti gli attributi
    public DipendenteModel(String nome, String cognome,String cf, String email, String password, UserType userType, String idDipendente) {
        super(nome, cognome,cf, email, password, userType);
        this.idDipendente = idDipendente;
        this.mezzo = mezzo;
    }
    
    /*public List<DipendenteModel> getListaDipendenti() {
        // Crea una nuova lista per memorizzare i dipendenti
        List<DipendenteModel> dipendenti = new ArrayList<>();
        
        // Aggiungi i dipendenti alla lista
        /*dipendenti.add(new DipendenteModel("Mario", "Rossi", "ABCD1234", "mario@example.com", "password123", UserType.DIPENDENTE, "1"));
        dipendenti.add(new DipendenteModel("Luigi", "Verdi", "EFGH5678", "luigi@example.com", "password456", UserType.DIPENDENTE, "2"));
        // Aggiungi altri dipendenti come necessario*/
        
       /* return dipendenti;
    }*/
    
    // Getter e setter per idDipendente
    public String getIdDipendente() {
        return idDipendente;
    }

    public void setIdDipendente(String idDipendente) {
        this.idDipendente = idDipendente;
    }

    // Getter e setter per mezzo
    public String getMezzo() {
        return mezzo;
    }

    public void setMezzo(String mezzo) {
        this.mezzo = mezzo;
    }
}

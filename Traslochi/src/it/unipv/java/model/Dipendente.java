package it.unipv.java.model;
 
public class Dipendente extends UserModel {
    private int idDipendente;
    private String mezzo;

    // Costruttore di default che chiama il costruttore della superclasse
    public Dipendente() {
        super();
    }
    
    // Costruttore parametrizzato per inizializzare un Dipendente con tutti gli attributi
    public Dipendente(String nome, String cognome,String cf, String email, String password, UserType userType, int idDipendente, String mezzo) {
        super(nome, cognome,cf, email, password, userType);
        this.idDipendente = idDipendente;
        this.mezzo = mezzo;
    }

    // Getter e setter per idDipendente
    public int getIdDipendente() {
        return idDipendente;
    }

    public void setIdDipendente(int idDipendente) {
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

package it.unipv.java.model;

public abstract class UserModel {
    
    private String nome;
    private String cognome;
    private String cf;
    private String email; 
    private String password;
    private UserType userType;

    // Costruttore vuoto
    public UserModel() {
        // Inizializzazione di default se necessaria
    }

    // Costruttore completo
    public UserModel(String nome, String cognome,String cf, String email, String password, UserType userType) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf=cf;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
 
    // Getter e Setter per tutti gli attributi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    // Metodi isDipendente e isCliente per controllare il tipo di utente
    public boolean isDipendente() {
        return userType == UserType.DIPENDENTE;
    }

    public boolean isCliente() {
        return userType == UserType.CLIENTE;
    }

    // Metodi per visualizzare e modificare il profilo
    public void visualizzaProfilo(UserModel u) {
        System.out.println("Nome: " + u.getNome());
        System.out.println("Cognome: " + u.getCognome());
        System.out.println("Email: " + u.getEmail());
        System.out.println("Tipo Utente: " + u.getUserType());
    }

    public void modificaProfilo(String nome, String cognome, String email, UserType userType) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.userType = userType;
    }
}

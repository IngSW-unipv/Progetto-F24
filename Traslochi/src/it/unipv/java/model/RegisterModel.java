package it.unipv.java.model;

public class RegisterModel {
	
	private String nome;
	private String cognome;
	private String idCliente;
	private String idDipendente;
	private String idResponsabile;
	private String email;
	private String password;

	public RegisterModel() {
		// TODO Auto-generated constructor stub
	}
	public RegisterModel(String nome, String cognome, String idCliente, String idDipendente, String idResponsabile, String email, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.idCliente = idCliente;
        this.idDipendente = idDipendente;
        this.idResponsabile = idResponsabile;
        this.email = email;
        this.password = password;
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		cognome = cognome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		password = password;
	}
	
	public String getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(String idCliente) {
		idCliente = idCliente;
	}
	
	public String getIdDipendente() {
		return idDipendente;
	}
	
	public void setIdDipendente(String idDipendente) {
		idDipendente = idDipendente;
	}
	
	public String getIdResponsabile() {
		return idResponsabile;
	}
	
	public void setIdResponsabile(String idResponsabile) {
		idResponsabile = idResponsabile;
	}
	
}

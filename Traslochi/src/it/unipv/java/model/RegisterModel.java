package it.unipv.java.model;

public class RegisterModel {
	private String Nome;
	private String Cognome;
	private String IdCliente;
	private String IdDipendente;
	private String Email;
	private String Password;

	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	public String getIdDipendente() {
		return IdDipendente;
	}
	public void setIdDipendente(String idDipendente) {
		IdDipendente = idDipendente;
	}
	
}

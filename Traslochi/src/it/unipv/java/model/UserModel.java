package it.unipv.java.model;

public class UserModel {

	private String nome;
	private String cognome;
	private String cf;
	private String email;
	private String password;
	private UserType userType;
	private String id;

	public UserModel() {
	}

	public UserModel(String nome, String cognome, String cf, String email, String password, UserType userType) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

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

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
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
	

	public boolean isDipendente() {
		return userType == UserType.DIPENDENTE;
	}

	public boolean isCliente() {
		return userType == UserType.CLIENTE;
	}

	public boolean isResponsabile() {
		return userType == UserType.RESPONSABILE;
	}

	public void visualizzaProfilo() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Email: " + email);
		System.out.println("Tipo Utente: " + userType);
	}

	public void modificaProfilo(String nome, String cognome, String email, UserType userType) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.userType = userType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void updateUser(UserModel userModel) {
		//DA FARE
	}
}

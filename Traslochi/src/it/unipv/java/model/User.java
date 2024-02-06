package it.unipv.java.model;

public abstract class User {
private String nome;
private String cognome;
private String email; 
private UserType userType;
public User() {
	// TODO Auto-generated constructor stub
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
public void setCognome(String congnome) {
	this.cognome = congnome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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

public void visualizzaProfilo(User  u) {
		System.out.println("Nome: " + u.nome);
        System.out.println("Cognome: " + u.cognome);
        System.out.println("Email: " + u.email);
        System.out.println("Tipo Utente: " + u.userType);
}

public void modificaProfilo(User  u) {
	
	u.nome = nome;
	u.cognome = cognome;
	u.email = email;
	u.userType = userType;
//MANCA PARTE PER MODIFICA NEL DB
}

}

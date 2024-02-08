package it.unipv.java.model;

public class Responsabile extends UserModel{
int idResponsabile;
public Responsabile() {
	// TODO Auto-generated constructor stub
}
public Responsabile(String nome, String cognome,String cf, String email, String password, UserType userType, int idResponsabile) {
    super(nome, cognome,cf, email, password, userType);
    this.idResponsabile = idResponsabile;
 }

public int getIdResponsabile() {
	return idResponsabile;
}
public void setIdResponsabile(int idResponsabile) {
	this.idResponsabile = idResponsabile;
}
}

package it.unipv.java.model.user;

public class ResponsabileModel extends UserModel {
	int idResponsabile;

	public ResponsabileModel() {
		// TODO Auto-generated constructor stub
	}

	public ResponsabileModel(String nome, String cognome, String cf, String email, String password, UserType userType,
			int idResponsabile) {
		super(nome, cognome, cf, email, password, userType);
		this.idResponsabile = idResponsabile;
	}

	public int getIdResponsabile() {
		return idResponsabile;
	}

	public void setIdResponsabile(int idResponsabile) {
		this.idResponsabile = idResponsabile;
	}
}

package it.unipv.java.model;

import it.unipv.java.model.user.User;

public class RegisterData {
	private User utenteDaRegistrare;

	public RegisterData(User utenteDaRegistrare) {
		this.utenteDaRegistrare = utenteDaRegistrare;
	}

	public User getUtenteDaRegistrare() {
		return utenteDaRegistrare;
	}

	public void setUtenteDaRegistrare(User utenteDaRegistrare) {
		this.utenteDaRegistrare = utenteDaRegistrare;
	}
	
	
}

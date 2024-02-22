package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;

public class SingleSessioneAttiva {
	private UserModel utenteAttivo;
	private static SingleSessioneAttiva instance;
	
	//Singleton Private Constructor
	private SingleSessioneAttiva() {
		this.utenteAttivo = null;
	}
	
	//Singleton getInstance
	public static SingleSessioneAttiva getInstance() {
		if(instance == null) {
			instance = new SingleSessioneAttiva();
		}
		return instance;
	}
	
	//Logout User kills active Instance
	public void logout() {
	    SingleSessioneAttiva.instance = null;
	}
	
	//Getters Setters
	public UserModel getUtenteAttivo() {
		return utenteAttivo;
	}
	public void setUtenteAttivo(UserModel utenteAttivo) {
		this.utenteAttivo = utenteAttivo;
	}
}

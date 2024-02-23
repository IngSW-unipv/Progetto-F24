package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;

public class SingleSessioneAttiva {
	private static SingleSessioneAttiva instance;
	private UserModel utenteAttivo;
	
	//Singleton Private Constructor
	private SingleSessioneAttiva() {
	}
	
	//Singleton getInstance
	public static SingleSessioneAttiva getInstance() {
		if(instance == null) {
			instance = new SingleSessioneAttiva();
		}
		return instance;
	}
	//Login User gives meaning to active Instance
	public void login(UserModel utenteAttivo) {
		this.utenteAttivo = utenteAttivo;
	}
	//Logout User kills active Instance
	public void logout() {
	    SingleSessioneAttiva.instance = null;
	}
	
	//Getters Setters
	public UserModel getUtenteAttivo() {
		return utenteAttivo;
	}
}

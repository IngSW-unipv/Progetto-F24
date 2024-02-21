package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;

public class SingleSessioneAttiva {
	private UserModel utenteAttivo;
	private static SingleSessioneAttiva instance;
	
	//Singleton Private Constructor
	private SingleSessioneAttiva(UserModel utenteDaAttivare) {
		this.utenteAttivo = utenteDaAttivare;
	}
	
	//Singleton getInstance
	public static SingleSessioneAttiva getInstance(UserModel utenteDaAttivare) {
		if(instance == null)
			instance = new SingleSessioneAttiva(utenteDaAttivare);
		return instance;
	}
	
	//Logout User kills active Instance
	public void killInstance() {
		instance = null;
		System.gc();
	}
	
	//Getters Setters
	public UserModel getUtenteAttivo() {
		return utenteAttivo;
	}
	public void setUtenteAttivo(UserModel utenteAttivo) {
		this.utenteAttivo = utenteAttivo;
	}
	
}

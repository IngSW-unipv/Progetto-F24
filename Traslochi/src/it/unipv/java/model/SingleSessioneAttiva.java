package it.unipv.java.model;

import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;

public class SingleSessioneAttiva {
	private static SingleSessioneAttiva instance;
	private User utenteAttivo;
	
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

	public boolean login(LoginData datiLogin) {
		this.utenteAttivo = PersistanceFacade.getInstance().loginUser(datiLogin);
		if(this.utenteAttivo != null)
			return true;
		return false;	
	}
	
	//Logout User per terminare l'istanza
	public void logout() {
	    SingleSessioneAttiva.instance = null;
	    this.utenteAttivo = null;
	}

	//Getters e Setters
	public User getUtenteAttivo() {
		return utenteAttivo;
	}

	public boolean modificaProfilo() {
		return PersistanceFacade.getInstance().modificaProfilo(SingleSessioneAttiva.getInstance().getUtenteAttivo());
 	}
}

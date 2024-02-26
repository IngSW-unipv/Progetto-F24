package it.unipv.java.model;

import java.util.List;

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

	public void login(LoginData datiLogin) {
		User utenteDaAttivare = PersistanceFacade.getInstance().loginUser(datiLogin);
//		Non posso fare datiLogin.getPasswordInserita() == utenteDaAttivare.getPassword() perchè
//		id(PasswordInserita) != id(Password)
		if(datiLogin.getPasswordInserita().equals(utenteDaAttivare.getPassword()))
			this.utenteAttivo = utenteDaAttivare;
		STRATEGIA	
				CLIENTE		INSTANZIA PRENOTAZIONI
				DIPENDENTE 	INSTANZIA TURNI
				RESPONSABILE INSTANZIA TUTTIDIPENDENTI, TUTTE PRENOTAZIONI, TUTTI TURNI
	}
	
	//Logout User kills active Instance
	public void logout() {
	    SingleSessioneAttiva.instance = null;
	}
	
	public List<PrenotazioneModel> setPrenotazioniCliente() {
		return PersistanceFacade.getInstance().getPrenotazioniUtente();
	}
	
	public List<PrenotazioneModel> getPrenotazioniCliente() {
		return PersistanceFacade.getInstance().getPrenotazioniUtente();
	}
	
	//Getters e Setters
	public User getUtenteAttivo() {
		return utenteAttivo;
	}
}

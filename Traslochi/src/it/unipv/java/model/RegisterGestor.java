package it.unipv.java.model;

import it.unipv.java.persistance.PersistanceFacade;

public class RegisterGestor {
	private RegisterData datiRegitrazione;
	
	public RegisterGestor(RegisterData datiRegitrazione) {
		this.datiRegitrazione = datiRegitrazione;
	}

	public RegisterData getDatiRegitrazione() {
		return datiRegitrazione;
	}

	public void setDatiRegitrazione(RegisterData datiRegitrazione) {
		this.datiRegitrazione = datiRegitrazione;
	}
	
	public boolean registraUtente(RegisterData datiRegitrazione) {
		return PersistanceFacade.getInstance().registerUser(datiRegitrazione);
		
	}
}

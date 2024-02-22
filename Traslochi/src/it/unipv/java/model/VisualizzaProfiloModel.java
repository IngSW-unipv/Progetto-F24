package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.PersistanceFacade;

public class VisualizzaProfiloModel {

	public boolean modificaProfilo(UserModel um) {
 		return PersistanceFacade.getInstance().modificaProfilo();
	}

	public UserModel visualizzaProfilo(UserModel um) {
 		return  PersistanceFacade.getInstance().visualizzaProfilo(um);
	}
	
	

}

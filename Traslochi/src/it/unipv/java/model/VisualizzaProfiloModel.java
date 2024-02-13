package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;

public class VisualizzaProfiloModel {

	public boolean modificaProfilo(UserModel um) {
 		return DataAccessFacade.getInstance().modificaProfilo(um);
	}

	public UserModel visualizzaProfilo(UserModel um) {
 		return  DataAccessFacade.getInstance().visualizzaProfilo(um);
	}
	
	

}

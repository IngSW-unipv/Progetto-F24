package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;

public class VisualizzaProfiloModel {

	public void modificaProfilo(UserModel um) {
 		return DataAccessFacade.getInstance().modificaProfilo(um);
	}

}

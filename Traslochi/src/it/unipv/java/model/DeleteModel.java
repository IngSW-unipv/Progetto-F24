package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;

public class DeleteModel {
 	
	public boolean confermaEliminazione(UserModel dm) {
			return DataAccessFacade.getInstance().eliminazioneUser(dm);
	}
}

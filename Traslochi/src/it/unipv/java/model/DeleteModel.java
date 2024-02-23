package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.PersistanceFacade;

public class DeleteModel {
 	
	public boolean confermaEliminazione(UserModel dm) {
			return PersistanceFacade.getInstance().eliminaDipendente(dm);
	}
}

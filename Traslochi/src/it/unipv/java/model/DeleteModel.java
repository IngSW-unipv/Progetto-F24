package it.unipv.java.model;

import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;

public class DeleteModel {
 	
	public boolean confermaEliminazione(User dm) {
			return PersistanceFacade.getInstance().eliminaDipendente(dm);
	}
	
}

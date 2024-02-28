package it.unipv.java.model;

import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;


public class DeleteModel {
 	
	private String idInserito;
	private String cfInserito;
	
	public String getIdInserito() {
		return idInserito;
	}
	
	public String getCfInserito() {
		return cfInserito;
	}
	
	public void setId(String idDip) {
		idInserito= idDip;
	}
	
	public void setCf(String cf) {
		cfInserito= cf;
	}

}

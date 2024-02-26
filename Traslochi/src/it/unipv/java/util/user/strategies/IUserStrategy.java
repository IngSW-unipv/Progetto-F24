package it.unipv.java.util.user.strategies;

import java.awt.event.ActionListener;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.newuser.User;
import it.unipv.java.persistance.PersistanceFacade;

public interface IUserStrategy {
	public void flussoController(ActionListener actionListener);
	public User getUser(PersistanceFacade persistanceFacade, LoginData datiLogin);
}

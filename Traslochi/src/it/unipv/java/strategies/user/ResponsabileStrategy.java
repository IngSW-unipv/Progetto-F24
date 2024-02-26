package it.unipv.java.strategies.user;

import java.awt.event.ActionListener;

import it.unipv.java.controller.user.ResponsabileController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.newuser.User;
import it.unipv.java.persistance.DaoFactory;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.ResponsabileView;

public class ResponsabileStrategy implements IUserStrategy{
	
	public ResponsabileStrategy() {}

	@Override
	public void flussoController(ActionListener actionListener) {
		ResponsabileView rv = new ResponsabileView();
		ResponsabileController rc = new ResponsabileController(rv);
		rv.setVisible(true);
	}

	@Override
	public User getUser(PersistanceFacade persistanceFacade, LoginData datiLogin) {
		return DaoFactory.getInstance().getResponsabilePersistance().getResponsabile(datiLogin);
	}

}

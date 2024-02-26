package it.unipv.java.util.user.strategies;

import java.awt.event.ActionListener;

import it.unipv.java.controller.user.ResponsabileController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.DaoFactory;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.ResponsabileView;

public class ResponsabileStrategy implements IUserStrategy{

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

	@Override
	public boolean createUser(PersistanceFacade persistanceFacade, RegisterData datiRegistrazione) {
		return DaoFactory.getInstance().getResponsabilePersistance().createResponsabile(datiRegistrazione);
	}
}

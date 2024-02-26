package it.unipv.java.util.user.strategies;

import java.awt.event.ActionListener;

import it.unipv.java.controller.user.ClienteController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.newuser.User;
import it.unipv.java.persistance.DaoFactory;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.ClienteView;

public class ClienteStrategy implements IUserStrategy{

	@Override
	public void flussoController(ActionListener actionListener) {
		ClienteView cv = new ClienteView();
		ClienteController cc = new ClienteController(cv);
		cv.setVisible(true);
	}

	@Override
	public User getUser(PersistanceFacade persistanceFacade, LoginData datiLogin) {
		return DaoFactory.getInstance().getClientePersistance().getCliente(datiLogin);
	}

}

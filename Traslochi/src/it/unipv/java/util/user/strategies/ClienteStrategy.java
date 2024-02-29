package it.unipv.java.util.user.strategies;

import java.awt.event.ActionListener;

import it.unipv.java.controller.icontroller.ClienteController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.DaoFactory;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.util.controllerpila.ControllerGestor;
import it.unipv.java.view.ClienteView;

public class ClienteStrategy implements IUserStrategy{

	public ClienteStrategy() {}
	
	@Override
	public void flussoController(ActionListener actionListener) {
		ClienteView cv = new ClienteView();
		ClienteController cc = new ClienteController(cv);
		ControllerGestor.getInstance().getStack().push(cc);
	}

	@Override
	public User getUser(PersistanceFacade persistanceFacade, LoginData datiLogin) {
		return DaoFactory.getInstance().getClientePersistance().getCliente(datiLogin);
	}

	@Override
	public boolean createUser(PersistanceFacade persistanceFacade, RegisterData datiRegistrazione) {
		return DaoFactory.getInstance().getClientePersistance().createCliente(datiRegistrazione);
	}

	@Override
	public boolean updateUser(PersistanceFacade persistanceFacade, User utenteAttivo) {
		return DaoFactory.getInstance().getClientePersistance().updateCliente(utenteAttivo);
	}

}

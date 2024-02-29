package it.unipv.java.util.user.strategies;

import java.awt.event.ActionListener;

import it.unipv.java.controller.icontroller.DipendenteController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.DaoFactory;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.util.controllerpila.ControllerGestor;
import it.unipv.java.view.DipendentView;

public class DipendenteStrategy implements IUserStrategy{

	public DipendenteStrategy() {}
	
	@Override
	public void flussoController(ActionListener actionListener) {
		DipendentView dv = new DipendentView();
		DipendenteController dc = new DipendenteController(dv);
		ControllerGestor.getInstance().getStack().push(dc);
	}

	@Override
	public User getUser(PersistanceFacade persistanceFacade, LoginData datiLogin) {
		return DaoFactory.getInstance().getDipendentePersistance().getDipendente(datiLogin);
	}

	@Override
	public boolean createUser(PersistanceFacade persistanceFacade, RegisterData datiRegistrazione) {
		return DaoFactory.getInstance().getDipendentePersistance().createDipendente(datiRegistrazione);
	}

	@Override
	public boolean updateUser(PersistanceFacade persistanceFacade, User utenteAttivo) {
		return DaoFactory.getInstance().getDipendentePersistance().updateDipendente(utenteAttivo);
	}

}

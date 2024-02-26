package it.unipv.java.util.user.strategies;

import java.awt.event.ActionListener;

import it.unipv.java.controller.user.DipendenteController;
import it.unipv.java.model.LoginData;
import it.unipv.java.model.newuser.User;
import it.unipv.java.persistance.DaoFactory;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.DipendentView;

public class DipendenteStrategy implements IUserStrategy{

	@Override
	public void flussoController(ActionListener actionListener) {
		DipendentView dv= new DipendentView();
		DipendenteController dc= new DipendenteController(dv);
		dv.setVisible(true);
		
	}

	@Override
	public User getUser(PersistanceFacade persistanceFacade, LoginData datiLogin) {
		return DaoFactory.getInstance().getDipendentePersistance().getDipendente(datiLogin);
	}

}

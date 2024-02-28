package it.unipv.java.util.responsabilitychain;

import java.util.List;

import it.unipv.java.model.DeleteModel;
import it.unipv.java.model.user.Dipendente;
import it.unipv.java.model.user.Responsabile;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.WarningView;

public class RemoveDipHandler {
	private DeleteModel dm;
	private Responsabile resp;
	
	public RemoveDipHandler(DeleteModel dm) {
		this.dm= dm;
		this.resp= new Responsabile();
	}
	
	public User getDipendente() {
		List<User> listaDip = resp.getDipendentiRegistrati();
		for (User user: listaDip) {
			Dipendente dipendente = (Dipendente) user;
			if(dipendente.getId() != null  && dipendente.getCf() != null && dipendente.getId().equals(dm.getIdInserito()) && dipendente.getCf().equals(dm.getCfInserito())) {
				return user;
			}
		}
		return null;
	}
	
	
	public boolean eliminaDipendente(User u) {
		boolean b= true;
		if(u != null) {
			PersistanceFacade.getInstance().eliminaDipendente(u);
			b= true;
			return b;
		} else if(u == null){
			b= false;
			return b;
		}
		return b;
	}

}

	

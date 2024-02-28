package it.unipv.java.util.responsabilitychain;

import java.util.List;

import it.unipv.java.model.DeleteModel;
import it.unipv.java.model.user.Responsabile;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.view.WarningView;

public class RemoveDipHandler {
	private DeleteModel dm;
	private Responsabile resp;
	
	public RemoveDipHandler(DeleteModel dm) {
		this.dm= dm;
		this.resp= resp;
	}
	
	public User getDipendente(List<User> listaDip) {
		for (User user: listaDip) {
			if(user.getId().equals(dm.getIdInserito()) && user.getCf().equals(dm.getCfInserito())) {
				return user;
			}
		}
		return null;
	}
	
	
	public boolean eliminaDipendente(User u) {
		//u= getDipendente(resp.getDipendentiRegistrati());
		return PersistanceFacade.getInstance().eliminaDipendente(u);
	}
	
	
	
	
	
/*
	public boolean confermaEliminazione(String idDip) {
		boolean esito= false;
		if(dip.getId().equals(dm.getIdInserito()) && dip.getCf().equals(dm.getCfInserito())) {
			PersistanceFacade.getInstance().eliminaDipendente();
			WarningView wv0= new WarningView();
			wv0.elimEffettuata();
			esito= true;
		} else if (!(dip.getId().equals(dm.getIdInserito()) && dip.getCf().equals(dm.getCfInserito()))){
			WarningView wv= new WarningView();
			wv.idErrato();
			esito=false;
		}
		
		return esito;
		
		
		
     }
	*/
	
	
}

	

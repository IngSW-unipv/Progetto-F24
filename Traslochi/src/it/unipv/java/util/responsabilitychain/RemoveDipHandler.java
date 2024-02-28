package it.unipv.java.util.responsabilitychain;

import java.util.List;

import it.unipv.java.model.DeleteModel;
import it.unipv.java.model.user.Dipendente;
import it.unipv.java.model.user.Responsabile;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;

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
		//u= getDipendente(resp.getDipendentiRegistrati());
 		if(u != null) {
			if(PersistanceFacade.getInstance().eliminaDipendente(u))
				return true;
			else return false;
 		}
		return false;
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

	

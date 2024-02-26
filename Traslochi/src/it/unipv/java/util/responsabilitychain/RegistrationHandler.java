package it.unipv.java.util.responsabilitychain;

import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.RegisterData;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.util.responsabilitychain.handlers.ControlloCF;
import it.unipv.java.util.responsabilitychain.handlers.ControlloConfermaPassword;
import it.unipv.java.util.responsabilitychain.handlers.ControlloEmail;
import it.unipv.java.util.responsabilitychain.handlers.ControlloNome;
import it.unipv.java.util.responsabilitychain.handlers.ControlloPassword;
import it.unipv.java.util.responsabilitychain.handlers.IControllo;
import it.unipv.java.util.responsabilitychain.handlers.VuotoControl;
import it.unipv.java.util.user.UserStrategyFactory;

public class RegistrationHandler {
	private RegisterData datiInseriti;
    private List<IControllo> catenaControlli;

    public RegistrationHandler(RegisterData datiInseriti) {
    	this.datiInseriti = datiInseriti;
    	this.catenaControlli = new ArrayList<IControllo>();
        buildChain();
    }

    public void buildChain() {
       	catenaControlli.add(new ControlloConfermaPassword());
    	catenaControlli.add(new ControlloPassword());
    	catenaControlli.add(new ControlloEmail());
    	catenaControlli.add(new ControlloCF());
    	catenaControlli.add(new ControlloNome());
    	catenaControlli.add(new VuotoControl());
    }

    public boolean executeChainControllo() {
    	boolean verifica = true;
    	
    	for(IControllo controllo : catenaControlli) {
    		verifica = (verifica && controllo.controllaParametro(this.datiInseriti));
    	}
		return verifica;
    }

	public boolean registraUtente(RegisterData datiInseriti) {
		return PersistanceFacade.getInstance().registerUser(datiInseriti);
		
	}
}

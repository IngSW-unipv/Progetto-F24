package it.unipv.java.util.responsabilitychain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import it.unipv.java.model.RegisterData;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.util.responsabilitychain.handlers.ControlloCF;
import it.unipv.java.util.responsabilitychain.handlers.ControlloConfermaPassword;
import it.unipv.java.util.responsabilitychain.handlers.ControlloEmail;
import it.unipv.java.util.responsabilitychain.handlers.ControlloNome;
import it.unipv.java.util.responsabilitychain.handlers.ControlloPassword;
import it.unipv.java.util.responsabilitychain.handlers.IControllo;
import it.unipv.java.util.responsabilitychain.handlers.VuotoControl;

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
		datiInseriti.setUserId(RegistrationHandler.generateIdFromCf(datiInseriti.getCfInserito()));
		return PersistanceFacade.getInstance().registerUser(datiInseriti);
	}
	
	public static String generateIdFromCf(String cf) {
		if (cf == null || cf.length() < 5) {
			throw new IllegalArgumentException("CF non valido");
		}
		String baseId = cf.substring(0, 5); // Estrae le prime 5 cifre dal CF
		Random random = new Random();
		int n1 = random.nextInt(8); // Primo numero tra 0 e 7
		int n2 = n1 + 1 + random.nextInt(8 - n1); // Secondo numero, maggiore di n1
		int n3 = n2 + 1 + random.nextInt(9 - n2); // Terzo numero, maggiore di n2
		return baseId + n1 + n2 + n3;
		}

    public List<IControllo> getCatenaControlli() {
        return this.catenaControlli;
    }
}

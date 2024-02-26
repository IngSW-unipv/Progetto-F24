package it.unipv.java.util.registrazione;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

/**ESEGUE UN CONTROLLO SUL NOME E SUL COGNOME
 * 
 */
public class ControlloNome implements IControllo{
	RegisterData informazioniRegistrazione;
	
	@Override
	public WarningView controllaParametro() {
		String regex = "^[a-zA-Z]+$";
		return null;
	}

	@Override
	public IControllo setNextControllo(IControllo prossimoControllo) {
		// TODO Auto-generated method stub
		return null;
	}

}

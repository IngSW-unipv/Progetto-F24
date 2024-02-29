package it.unipv.java.util.responsabilitychain.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

/**ESEGUE UN CONTROLLO SUL NOME E SUL COGNOME
 * 
 */
public class ControlloNome implements IControllo{
	
    /** Nome o Cognome (senza caratteri speciali):<br><br>
	 *	  ^ Inizio della stringa.<br>
	 *	  [a-zA-Z]+ Almeno un carattere da a-z o A-Z.<br>
	 *	  $ Fine della stringa.
	 */
	@Override
	public boolean controllaParametro(RegisterData datiRegistrazione) {
		if(datiRegistrazione.getNomeInserito().matches("^[a-zA-Z]+$") 
				&& datiRegistrazione.getCognomeInserito().matches("^[a-zA-Z]+$"))
			return true;
		return false;
	}

	@Override
	public void throwWarningView() {
		WarningView wv = new WarningView();
		wv.mostraErroreNome();
		wv.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				wv.closeWindow();
			}
		});	
	}	
}

package it.unipv.java.util.responsabilitychain.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

public class ControlloEmail implements IControllo{
  /** Indirizzo Email:<br><br>
	*	^: Inizio della stringa.<br>
	*	[a-zA-Z0-9._%+-]+: Nome utente che può includere lettere, numeri e i caratteri speciali . _ % + -.<br>
	*	@: Simbolo @.<br>
	*	[a-zA-Z0-9.-]+: Dominio che può includere lettere, numeri, punti e trattini.<br>
	*	\.: Punto per separare il dominio.<br>
	*	[a-zA-Z]{2,}: Estensione di almeno due lettere (es. com, org, it, ecc.).<br>
	*	$: Fine della stringa.<br>
	*/
	@Override
	public boolean controllaParametro(RegisterData datiRegistrazione) {
		if(datiRegistrazione.getEmailInserita().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
			return true;
		
		WarningView wv = new WarningView();
		wv.mostraErrorEmailNonValida();
		wv.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				wv.closeWindow();
			}
		});
		return false;
	}	
}

package it.unipv.java.util.responsabilitychain.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

public class ControlloPassword implements IControllo{
	/**Password (almeno 8 caratteri, almeno un numero e un carattere speciale):<br><br>
	 *
	 * ^: Inizio della stringa.<br>
	 * (?=.*[0-9]): Deve contenere almeno un numero.<br>
	 * (?=.*[!@#$%^&*()-_=+{};:,<.>]): Deve contenere almeno un carattere speciale.<br>
	 * .{8,}: Lunghezza minima di 8 caratteri.<br>
	 * $: Fine della stringa.
	 * 
	 */
	@Override
	public boolean controllaParametro(RegisterData datiRegistrazione) {
		if(datiRegistrazione.getPasswordInserita().matches("^(?=.*[0-9])(?=.*[!@#$%^&*()-_=+{};:,<.>]).{8,}$"))
			return true;
		return false;
	}

	@Override
	public void throwWarningView() {
		WarningView wv = new WarningView();
		wv.mostraErrorPasswordNonValida();
		wv.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				wv.closeWindow();
			}
		});	
	}	
}
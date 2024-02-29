package it.unipv.java.util.responsabilitychain.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

public class ControlloCF implements IControllo {

	/**
	 * Codice Fiscale Italiano:<br>
	 * <br>
	 * ^[A-Z]{6}: Sei lettere maiuscole all'inizio.<br>
	 * \d{2}: Seguito da due cifre.<br>
	 * [ABCDEHLMPRST]: Una lettera tra quelle specificate.<br>
	 * \d{2}: Seguito da due cifre.<br>
	 * [A-Z]: Una lettera maiuscola.<br>
	 * \d{3}: Seguito da tre cifre.<br>
	 * [A-Z]$: Finisce con una lettera maiuscola.
	 */
	@Override
	public boolean controllaParametro(RegisterData datiRegistrazione) {
		if (datiRegistrazione.getCfInserito().matches("^[A-Z]{6}\\d{2}[ABCDEHLMPRST]\\d{2}[A-Z]\\d{3}[A-Z]$"))
			return true;
		return false;
	}

	@Override
	public void throwWarningView() {
		WarningView wv = new WarningView();
		wv.mostraErrorCfErrato();
		wv.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wv.closeWindow();
			}
		});
	}
}
package it.unipv.java.util.responsabilitychain.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

public class ControlloConfermaPassword implements IControllo{

	@Override
	public boolean controllaParametro(RegisterData datiRegistrazione) {
		if (datiRegistrazione.getPasswordInserita().equals(datiRegistrazione.getConfermaPasswordInserita()))
			return true;
		
		WarningView wv = new WarningView();
		wv.mostraErrorPassword();;
		wv.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				wv.closeWindow();
			}
		});
		return false;
	}	
}

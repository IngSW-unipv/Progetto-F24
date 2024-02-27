package it.unipv.java.util.responsabilitychain.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

public class VuotoControl implements IControllo{
	
	/**
	 * fa uso di una reflection
	 */
	@Override
	public boolean controllaParametro(RegisterData datiRegistrazione) {
		Field[] campiRegisterData = datiRegistrazione.getClass().getDeclaredFields();
		boolean verifica = true;
		for(Field attributiDaVerificare: campiRegisterData)
			verifica = verifica && (attributiDaVerificare != null);
		if(verifica)
			return true;
		
		WarningView wv = new WarningView();
		wv.mostraErrorGenerale();
		wv.getBottoneRiprova().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				wv.closeWindow();
			}
		});
		return false;
	}	
}
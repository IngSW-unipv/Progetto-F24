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
	        for (Field campo : campiRegisterData) {
	            campo.setAccessible(true); // Rende il campo accessibile anche se è privato
	            
	            if (!campo.getName().equals("userId")) {  
	                try {
	                    Object valoreCampo = campo.get(datiRegistrazione); // Ottiene il valore del campo
 	                    if (valoreCampo == null || (valoreCampo instanceof String && ((String) valoreCampo).trim().isEmpty())) {
	                        mostraAvviso(); 
	                        return false;
	                    }
	                } catch (IllegalAccessException e) {
	                    e.printStackTrace();
	                    return false; 
	                }
	            }
	        }
	        return true; 
	    }
	    public void throwWarningView() {
	        WarningView wv = new WarningView();
	        wv.mostraErrorCampiVuoti();
	        wv.getBottoneRiprova().addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                wv.closeWindow();
	            }
	        });
	    }
}
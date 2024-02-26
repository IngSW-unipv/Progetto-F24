package it.unipv.java.util.registrazione;

import it.unipv.java.view.WarningView;

public class ControlloCF implements IControllo{

	@Override
	public WarningView controllaParametro() {
		String regex = "^[A-Z]{6}\\d{2}[ABCDEHLMPRST]\\d{2}[A-Z]\\d{3}[A-Z]$";
		return null;
	}

	@Override
	public IControllo setNextControllo(IControllo prossimoControllo) {
		// TODO Auto-generated method stub
		return null;
	}

}

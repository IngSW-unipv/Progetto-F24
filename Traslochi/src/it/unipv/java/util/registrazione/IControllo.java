package it.unipv.java.util.registrazione;

import it.unipv.java.model.RegisterData;
import it.unipv.java.view.WarningView;

public interface IControllo {
	public IControllo setNextControllo(IControllo prossimoControllo);
	public WarningView controllaParametro(RegisterData datiRegistrazione);
}

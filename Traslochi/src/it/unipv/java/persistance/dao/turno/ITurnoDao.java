package it.unipv.java.persistance.dao.turno;

import java.util.List;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.TurnoModel;
 

public interface ITurnoDao {
	public List<TurnoModel> getAllTurni();
    public boolean getTurno(); //fatta da un dipendente
    public boolean createTurno(TurnoModel c);
 }

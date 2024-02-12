package it.unipv.java.persistance.dao.turno;

import java.util.List;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.TurnoModel;
 

public interface ITurnoDao {
	public List<DataAccessFacade> getAllTurni();
    public boolean getTurno(DataAccessFacade g);
    public boolean createTurno(TurnoModel c);
    public boolean updateTurno(DataAccessFacade u);
    public boolean deleteTurno(DataAccessFacade d);
}

package it.unipv.java.persistance.dao.turno;

import java.util.List;

import it.unipv.java.model.Dipendente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Responsabile;
import it.unipv.java.model.Turno;
import it.unipv.java.model.TurnoModel;

public interface ITurnoDao {
	public List<Turno> getAllTurni();
    public Turno getTurno(Dipendente d);
    public boolean createTurno(TurnoModel t);
    public boolean updateTurno(Turno t);
    public boolean deleteTurno(Turno t);
}

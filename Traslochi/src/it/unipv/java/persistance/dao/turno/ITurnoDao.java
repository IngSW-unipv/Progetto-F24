package it.unipv.java.persistance.dao.turno;

import java.util.List;

import it.unipv.java.model.Dipendente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Responsabile;
import it.unipv.java.model.Turno;

public interface ITurnoDao {
	public List<Turno> getAllTurni(Turno t,Responsabile r);
    public Turno getTurno(Turno t,Dipendente d);
    public boolean createTurno(Turno t,Responsabile r);
    public boolean updateTurno(Turno t,Responsabile r);
    public boolean deleteTurno(Turno t,Responsabile r);
}

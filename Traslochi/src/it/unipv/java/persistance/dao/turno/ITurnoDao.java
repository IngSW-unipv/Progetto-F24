package it.unipv.java.persistance.dao.turno;

import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Turno;

public interface ITurnoDao {
	public List<Turno> getAllTurni();
    public Turno getTurno(Turno t);
    public boolean createTurno(Turno t);
    public boolean updateTurno(Turno t);
    public boolean deleteTurno(Turno t);
}

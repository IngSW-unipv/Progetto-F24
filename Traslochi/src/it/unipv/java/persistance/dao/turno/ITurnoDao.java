package it.unipv.java.persistance.dao.turno;

import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Turno;

public interface ITurnoDao {
	public List<Turno> getAllTurni();
    public Turno getTurni(Turno t);
    public boolean createTurni(Turno t);
    public boolean updateTurni(Turno t);
    public boolean deleteTurni(Turno t);
}

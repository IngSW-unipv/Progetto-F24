package it.unipv.java.persistance.dao.turno;

import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Turno;

public interface ITurnoDao {
	public List<Turno> getAllTurni();
    public Turno getTurni(LoginModel login);
    public void createTurni(RegisterModel register);
    public void updateTurni(Turno t);
    public void deleteTurni(Turno t);
}

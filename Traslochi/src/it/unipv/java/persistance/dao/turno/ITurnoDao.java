package it.unipv.java.persistance.dao.turno;

import java.util.List;

public class ITurnoDao {
	public List<Turno> getAllTurni();
    public Turno getTurni(LoginModel login);
    public void createTurni(RegisterModel register);
    public void updateTurni(Turno t);
    public void deleteTurni(Turno t);
}

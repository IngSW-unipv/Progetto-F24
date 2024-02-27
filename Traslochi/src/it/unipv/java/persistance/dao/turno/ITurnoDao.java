package it.unipv.java.persistance.dao.turno;

import java.util.List;

 import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.user.User;
 

public interface ITurnoDao {
	public List<TurnoModel> getAllTurni(); 
    public TurnoModel getTurno(User d); //fatta da un dipendente
    public boolean createTurno(TurnoModel c); //fatta dal responsabile
 }

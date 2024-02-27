package it.unipv.java.persistance.dao.turno;

import java.util.List;

 import it.unipv.java.model.TurnoData;
import it.unipv.java.model.user.User;
 

public interface ITurnoDao {
	public List<TurnoData> getAllTurni();
    public TurnoData getTurno(User d); //fatta da un dipendente
    public boolean createTurno(TurnoData c);
 }

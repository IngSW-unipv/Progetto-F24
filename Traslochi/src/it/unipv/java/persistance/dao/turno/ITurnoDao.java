package it.unipv.java.persistance.dao.turno;

import java.util.List;

import it.unipv.java.model.DipendenteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.ResponsabileModel;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.TurnoModel;

public interface ITurnoDao {
	public List<TurnoModel> getAllTurni();
    public TurnoModel getTurno(DipendenteModel d);
    public boolean createTurno(TurnoModel t);
    public boolean updateTurno(TurnoModel t);
    public boolean deleteTurno(TurnoModel t);
}

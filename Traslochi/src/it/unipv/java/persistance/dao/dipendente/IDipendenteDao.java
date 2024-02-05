package it.unipv.java.persistance.dao.dipendente;

import java.util.List;
import it.unipv.java.model.Dipendente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<Dipendente> getAllDipendenti();
    public Dipendente getDipendente(LoginModel login);
    public boolean createDipendente(RegisterModel register);
    public boolean updateDipendente(Dipendente d);
    public boolean deleteDipendente(Dipendente d);
}
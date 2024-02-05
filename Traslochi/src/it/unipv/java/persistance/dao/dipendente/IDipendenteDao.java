package it.unipv.java.persistance.dao.dipendente;

import java.util.List;
import it.unipv.java.model.Dipendente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<Dipendente> getAllDipendenti();
    public Dipendente getDipendente(LoginModel login);
    public void createDipendente(RegisterModel register);
    public void updateDipendente(Dipendente d);
    public void deleteDipendente(Dipendente d);
}
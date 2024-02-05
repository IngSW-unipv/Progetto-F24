package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

//qua ci sara la import per il testing

public interface IDipendenteDAO {
    public List<Dipendente> getAllDipendenti();
    public Dipendente getDipendente(LoginModel login);
    public void createDipendente(RegisterModel register);
    public void updateDipendente(Dipendente d);
    public void deleteDipendente(Dipendente d);
}
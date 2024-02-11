package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.AuthGestor; 
 

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<AuthGestor> getAllDipendenti();
    public boolean getDipendente(AuthGestor ag);
    public boolean createDipendente(AuthGestor ag);
    public boolean updateDipendente(AuthGestor ag);
    public boolean deleteDipendente(AuthGestor ag);
}
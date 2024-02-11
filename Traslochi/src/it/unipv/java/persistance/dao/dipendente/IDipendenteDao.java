package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.UserModel; 
 

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<UserModel> getAllDipendenti();
    public boolean getDipendente(UserModel ag);
    public boolean createDipendente(UserModel ag);
    public boolean updateDipendente(UserModel ag);
    public boolean deleteDipendente(UserModel ag);
}
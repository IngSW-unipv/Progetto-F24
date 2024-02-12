package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel; 
 

//qua ci sara la import per il testing

public interface IDipendenteDao {
    public List<UserModel> getAllDipendenti();
    public boolean getDipendente(LoginModel ag);
    public boolean createDipendente(RegisterModel ag);
    public boolean updateDipendente(UserModel ag);
    public boolean deleteDipendente(UserModel ag);
}
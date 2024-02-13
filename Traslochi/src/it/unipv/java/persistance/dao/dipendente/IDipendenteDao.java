package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel; 
 

 
public interface IDipendenteDao {
    public List<UserModel> getAllDipendenti();
    public UserModel getDipendente(UserModel ag);
    public boolean createDipendente(RegisterModel ag);
    public boolean updateDipendente(UserModel ag);
    public boolean deleteDipendente(UserModel ag);
}
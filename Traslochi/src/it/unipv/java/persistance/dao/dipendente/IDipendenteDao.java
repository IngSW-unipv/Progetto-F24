package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;
 
public interface IDipendenteDao {
	
    public List<User> getAllDipendenti();
    public User getDipendente(LoginData datiLogin);
    public boolean createDipendente(RegisterData datiRegistrazione);
    public boolean updateDipendente(User utente);
    public boolean deleteDipendente(User utente);
}
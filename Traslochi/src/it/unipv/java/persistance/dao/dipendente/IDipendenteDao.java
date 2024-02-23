package it.unipv.java.persistance.dao.dipendente;

import java.util.List;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel; 
 
public interface IDipendenteDao {
	
    public List<UserModel> getAllDipendenti();
    public boolean getDipendente(UserModel datiLogin);
    public boolean createDipendente(RegisterModel datiRegistrazione);
    public boolean updateDipendente(UserModel utente);
    public boolean deleteDipendente(UserModel utente);
}
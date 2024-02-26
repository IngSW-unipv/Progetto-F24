package it.unipv.java.persistance.dao.responsabile;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;
 
public interface IResponsabileDao {

    public User getResponsabile(LoginData datiLogin);
    public boolean createResponsabile(RegisterData datiRegistrazione);
    public boolean updateResponsabile(User utente);
    public boolean deleteResponsabile(User utente);
}

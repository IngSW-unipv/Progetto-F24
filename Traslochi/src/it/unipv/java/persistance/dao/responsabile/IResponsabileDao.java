package it.unipv.java.persistance.dao.responsabile;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.newuser.User;
import it.unipv.java.model.user.UserModel;
 
public interface IResponsabileDao {

    public User getResponsabile(LoginData datiLogin);
    public boolean createResponsabile(RegisterModel datiRegistrazione);
    public boolean updateResponsabile(UserModel utente);
    public boolean deleteResponsabile(UserModel utente);
}

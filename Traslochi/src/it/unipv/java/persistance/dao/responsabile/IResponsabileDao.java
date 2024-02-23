package it.unipv.java.persistance.dao.responsabile;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;
 
public interface IResponsabileDao {

    public boolean getResponsabile(UserModel datiLogin);
    public boolean createResponsabile(RegisterModel datiRegistrazione);
    public boolean updateResponsabile(UserModel utente);
    public boolean deleteResponsabile(UserModel utente);
}

package it.unipv.java.persistance.dao.responsabile;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;
 

public interface IResponsabileDao {
    public boolean createResponsabile(RegisterModel c);
    public boolean getResponsabile(UserModel datiLogin); 
    public boolean updateResponsabile(UserModel ag);
}

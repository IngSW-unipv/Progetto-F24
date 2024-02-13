package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;
 

public interface IResponsabileDao {
    public boolean createResponsabile(RegisterModel c);
     public boolean getResponsabile(UserModel r); 
}

package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.UserModel;
 

public interface IResponsabileDao {
    public boolean createResponsabile(RegisterModel c);
	public List<UserModel> getAllResponsabili();
    public boolean getResponsabile(LoginModel r);
    public boolean updateResponsabile(UserModel u);
    public boolean deleteResponsabile(UserModel d);
}

package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

import it.unipv.java.model.UserModel;
 

public interface IResponsabileDao {
    public boolean createResponsabile(UserModel c);
	public List<UserModel> getAllResponsabili();
    public boolean getResponsabile(UserModel r);
    public boolean updateResponsabile(UserModel u);
    public boolean deleteResponsabile(UserModel d);
}

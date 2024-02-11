package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.ResponsabileModel;

public interface IResponsabileDao {
    public boolean createResponsabile(AuthGestor c);
	public List<AuthGestor> getAllResponsabili();
    public boolean getResponsabile(AuthGestor r);
    public boolean updateResponsabile(AuthGestor u);
    public boolean deleteResponsabile(AuthGestor d);
}

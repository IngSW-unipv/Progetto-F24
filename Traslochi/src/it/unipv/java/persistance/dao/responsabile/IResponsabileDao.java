package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.ResponsabileModel;

public interface IResponsabileDao {
	public List<ResponsabileModel> getAllResponsabili();
    public boolean getResponsabile(AuthGestor ag);
    public boolean createResponsabile(RegisterModel register);
    public boolean updateResponsabile(ResponsabileModel r);
    public boolean deleteResponsabile(ResponsabileModel r);
}

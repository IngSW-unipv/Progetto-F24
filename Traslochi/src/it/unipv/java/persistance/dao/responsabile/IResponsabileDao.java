package it.unipv.java.persistance.dao.responsabile;

import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Responsabile;

public interface IResponsabileDao {
	public List<Responsabile> getAllResponsabili();
    public Responsabile getResponsabile(LoginModel login);
    public boolean createResponsabile(RegisterModel register);
    public boolean updateResponsabile(Responsabile r);
    public boolean deleteResponsabile(Responsabile r);
}

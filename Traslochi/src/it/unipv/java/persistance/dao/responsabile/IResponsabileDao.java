package it.unipv.java.persistance.dao.responsabile;

import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Responsabile;

public interface IResponsabileDao {
	public List<Responsabile> getAllResponsabili();
    public Responsabile getResponsabile(LoginModel login);
    public void createResponsabile(RegisterModel register);
    public void updateResponsabile(Responsabile r);
    public void deleteResponsabile(Responsabile r);
}

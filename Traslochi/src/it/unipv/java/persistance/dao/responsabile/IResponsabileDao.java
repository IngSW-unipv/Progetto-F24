package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

public class IResponsabileDao {
	public List<Responsabile> getAllResponsabili();
    public Responsabile getResponsabile(LoginModel login);
    public void createResponsabile(RegisterModel register);
    public void updateResponsabile(Responsabile r);
    public void deleteResponsabile(Responsabile r);
}

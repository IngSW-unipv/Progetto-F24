package it.unipv.java.persistance.dao.responsabile;

import java.util.List;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.ResponsabileModel;

public interface IResponsabileDao {
    public boolean createResponsabile(DataAccessFacade c);
	public List<DataAccessFacade> getAllResponsabili();
    public boolean getResponsabile(DataAccessFacade r);
    public boolean updateResponsabile(DataAccessFacade u);
    public boolean deleteResponsabile(DataAccessFacade d);
}

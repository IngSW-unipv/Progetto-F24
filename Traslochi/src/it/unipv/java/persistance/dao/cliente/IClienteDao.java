package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.DataAccessFacade;
import it.unipv.java.model.ClienteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;

public interface IClienteDao {
    public boolean createCliente(DataAccessFacade c);
    public boolean updateCliente(DataAccessFacade u);
    public List<DataAccessFacade> getAllClienti();
    public boolean getCliente(DataAccessFacade arg);
    public boolean deleteCliente(DataAccessFacade d); 
	
}

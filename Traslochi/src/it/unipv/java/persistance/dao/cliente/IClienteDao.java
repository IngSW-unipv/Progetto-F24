package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.ClienteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;

public interface IClienteDao {
    public boolean createCliente(AuthGestor c);
    public boolean updateCliente(AuthGestor u);
    public List<AuthGestor> getAllClienti();
    public boolean getCliente(AuthGestor arg);
    public boolean deleteCliente(AuthGestor d); 
	
}

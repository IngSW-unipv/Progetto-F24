package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.ClienteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;

public interface IClienteDao {
	public List<ClienteModel> getAllClienti();
    public ClienteModel getCliente(AuthGestor ag);
    public boolean createCliente(AuthGestor register);
    public boolean updateCliente(ClienteModel c);
    public boolean deleteCliente(ClienteModel c);
    public boolean verifyCredentials(AuthGestor ag);
}

package it.unipv.java.persistance.dao.cliente;

import java.util.List;
import it.unipv.java.model.Cliente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;

public interface IClienteDao {
	public List<Cliente> getAllClienti();
    public Cliente getCliente(LoginModel login);
    public void createCliente(RegisterModel register);
    public void updateCliente(Cliente c);
    public void deleteCliente(Cliente c);
}

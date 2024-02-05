package it.unipv.java.persistance.dao.cliente;

import java.util.List;

public class IClienteDao {
	public List<Cliente> getAllClienti();
    public Cliente getCliente(LoginModel login);
    public void createCliente(RegisterModel register);
    public void updateCliente(Cliente c);
    public void deleteCliente(Cliente c);
}

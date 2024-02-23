package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;

public interface IClienteDao {
	
	public List<UserModel> getAllClienti();
	public boolean getCliente(UserModel  datiLogin);
	public boolean createCliente(RegisterModel datiRegistrazione);
    public boolean updateCliente(UserModel utente);
    public boolean deleteCliente(UserModel utente); 
}

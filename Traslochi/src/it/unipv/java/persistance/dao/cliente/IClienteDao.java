package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;

public interface IClienteDao {
	
	public List<User> getAllClienti(); //fatto da responsabile
	public User getCliente(LoginData  datiLogin); 
	public boolean createCliente(RegisterData datiRegistrazione); 
    public boolean updateCliente(User utente);
    public boolean deleteCliente(User utente); //non implementata
}

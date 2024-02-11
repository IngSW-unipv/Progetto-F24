package it.unipv.java.persistance.dao.cliente;

import java.util.List; 
import it.unipv.java.model.UserModel;

public interface IClienteDao {
    public boolean createCliente(UserModel c);
    public boolean updateCliente(UserModel u);
    public List<UserModel> getAllClienti();
    public boolean getCliente(UserModel arg);
    public boolean deleteCliente(UserModel d); 
	
}

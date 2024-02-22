package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;

public interface IClienteDao {
    public boolean createCliente(RegisterModel c);
    public boolean updateCliente(UserModel u);
    public List<UserModel> getAllClienti();
    public boolean getCliente(UserModel  datiLogin);
    public boolean deleteCliente(UserModel d); 
	
}

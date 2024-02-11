package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.UserModel;

public interface IClienteDao {
    public boolean createCliente(RegisterModel c);
    public boolean updateCliente(LoginModel u);
    public List<UserModel> getAllClienti();
    public UserModel getCliente(UserModel lm);
    public boolean deleteCliente(UserModel d); 
	
}

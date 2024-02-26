package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.user.User;

public class TxtClienteDao implements IClienteDao{
	
	public TxtClienteDao() {}
	@Override
	public List<User> getAllClienti() {
		// TODO Auto-generated method stub
		System.out.println("getAllClienti succeded");
		return null;
	}

	@Override
	public User getCliente(LoginData datiLogin) {
		// TODO Auto-generated method stub
		System.out.println("getCliente succeded");
		return null;
	}

	@Override
	public boolean createCliente(RegisterData datiRegistrazione) {
		// TODO Auto-generated method stub
		System.out.println("createCliente succeded");
		return true;
	}

	@Override
	public boolean updateCliente(User utente) {
		// TODO Auto-generated method stub
		System.out.println("updateCliente succeded");
		return true;
	}

	@Override
	public boolean deleteCliente(User utente) {
		// TODO Auto-generated method stub
		System.out.println("deleteCliente succeded");
		return true;
	}

}

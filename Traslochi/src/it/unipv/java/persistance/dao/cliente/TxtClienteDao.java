package it.unipv.java.persistance.dao.cliente;

import java.util.List;

import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;

public class TxtClienteDao implements IClienteDao{
	
	public TxtClienteDao() {}
	@Override
	public List<UserModel> getAllClienti() {
		// TODO Auto-generated method stub
		System.out.println("getAllClienti succeded");
		return null;
	}

	@Override
	public boolean getCliente(UserModel datiLogin) {
		// TODO Auto-generated method stub
		System.out.println("getCliente succeded");
		return true;
	}

	@Override
	public boolean createCliente(RegisterModel datiRegistrazione) {
		// TODO Auto-generated method stub
		System.out.println("createCliente succeded");
		return true;
	}

	@Override
	public boolean updateCliente(UserModel utente) {
		// TODO Auto-generated method stub
		System.out.println("updateCliente succeded");
		return true;
	}

	@Override
	public boolean deleteCliente(UserModel utente) {
		// TODO Auto-generated method stub
		System.out.println("deleteCliente succeded");
		return true;
	}

}

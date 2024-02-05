package it.unipv.java.persistance.dao.responsabile;

import java.sql.Connection;
import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Responsabile;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class ResponsabileDao implements IResponsabileDao{
	private String schema;
	private Connection conn;
	
	public ResponsabileDao() {
		super();
		this.schema = "NOME SCHEMA";	//Inserisci Qui nome schema Responsabile
	}
	
	@Override
	public List<Responsabile> getAllResponsabili() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Responsabile getResponsabile(LoginModel login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createResponsabile(RegisterModel register) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateResponsabile(Responsabile r) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteResponsabile(Responsabile r) {
		return false;
		// TODO Auto-generated method stub
		
	}

}

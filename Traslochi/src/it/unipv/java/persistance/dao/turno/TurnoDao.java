package it.unipv.java.persistance.dao.turno;

import java.sql.Connection;
import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Turno;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class TurnoDao implements ITurnoDao{
	private String schema;
	private Connection conn;
	
	public TurnoDao() {
		super();
		this.schema = "NOME SCHEMA";	//Inserisci Qui nome schema Turno
	}
	
	@Override
	public List<Turno> getAllTurni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Turno getTurni(LoginModel login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createTurni(RegisterModel register) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateTurni(Turno t) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteTurni(Turno t) {
		return false;
		// TODO Auto-generated method stub
		
	}

}

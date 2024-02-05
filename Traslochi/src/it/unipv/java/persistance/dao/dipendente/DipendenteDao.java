package it.unipv.java.persistance.dao.dipendente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.Dipendente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class DipendenteDao implements IDipendenteDao{
	private String schema;
	private Connection conn;


	public DipendenteDao() {
		super();
		this.schema = "NOME SCHEMA";	//Inserisci Qui nome schema Dipendente
	}

	@Override
	public List<Dipendente> getAllDipendenti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dipendente getDipendente(LoginModel login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createDipendente(RegisterModel register) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO DIPENDENTI (NOME,COGNOME,EMAIL,PASSWORD,IDDIPENDENTE) VALUES(?,?,?,?,?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1,register.getNome());
			st1.setString(2,register.getCognome());
			st1.setString(3,register.getEmail());
			st1.setString(4,register.getPassword());
			st1.setString(5,register.getIdDipendente());
			
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;

	}

	@Override
	public boolean updateDipendente(Dipendente d) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteDipendente(Dipendente d) {
		return false;
		// TODO Auto-generated method stub
		
	}

	
}

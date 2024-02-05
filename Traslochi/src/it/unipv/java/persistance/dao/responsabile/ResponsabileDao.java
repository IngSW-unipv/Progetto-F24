package it.unipv.java.persistance.dao.responsabile;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO RESPONSABILI(NOME,COGNOME,EMAIL,PASSWORD,IDRESPONSABILE) "
					+ "VALUES(?,?,?,?,?)";
			
			st1 = conn.prepareStatement(query);
			st1.setString(1,register.getNome());
			st1.setString(2,register.getCognome());
			st1.setString(3,register.getEmail());
			st1.setString(4,register.getPassword());
			st1.setString(5,register.getIdResponsabile());
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
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

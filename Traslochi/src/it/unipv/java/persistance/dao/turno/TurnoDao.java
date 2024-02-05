package it.unipv.java.persistance.dao.turno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

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
	public Turno getTurno(Turno t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createTurno(Turno t) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO TURNI(ORARIO) VALUES(?)";
			
			st1 = conn.prepareStatement(query);
			st1.setString(1,t.getOrario());
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
	}

	@Override
	public boolean updateTurno(Turno t) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteTurno(Turno t) {
		return false;
		// TODO Auto-generated method stub
		
	}

}

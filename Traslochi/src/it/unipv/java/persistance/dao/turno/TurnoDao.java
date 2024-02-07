package it.unipv.java.persistance.dao.turno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.Cliente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.Turno;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class TurnoDao implements ITurnoDao{
	private String schema;
	private Connection conn;
	
	public TurnoDao() {
		super();
		this.schema = "Traslochi"; //Inserisci Qui nome schema Turno
	}
	
	@Override
	public List<Turno> getAllTurni() {
		    List<Turno> turni = new ArrayList<>();
	   
	    Statement stmt = null;
	    ResultSet rs = null;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);

 	        stmt = conn.createStatement();

 	        String sql = "SELECT * FROM TURNO";
	        rs = stmt.executeQuery(sql);

	        // Process the result set
	        while (rs.next()) {
	            Turno t = new Turno();
	            t.setOrario(rs.getString("Turno")); // Adjust the method names and types accordingly 
	            turni.add(t);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        
	    } finally {
 	        try {
	            if (rs != null) rs.close();
	            if (stmt != null) stmt.close();
	            DatabaseConnection.closeConnection(conn);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return turni;
	}
 
public Turno getTurno(LoginModel login) {
		
		Turno t = null;
	    conn = DatabaseConnection.startConnection(conn, schema);
	     
	    String sql = "SELECT * FROM TURNO join DipTurno  WHERE EMAIL = ? AND PASSWORD = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql); ){ 
	        
	        // Set the parameters
	        pstmt.setString(1, login.getEmail());
	        pstmt.setString(2, login.getPassword());
	        
	        // Execute the query
	        rs = pstmt.executeQuery();
	        
	        // Process the result set
	        if (rs.next()) {
	            t = new Turno();
	            t.setOrario(rs.getString("ORARIO")); 
 	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
 	        try {
	            if (rs != null) rs.close();
	             
	            DatabaseConnection.closeConnection(conn);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    return t;
	}

	@Override
	public boolean createTurno(Turno t,Responsabile r) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;
//DA RIVEDERE
		try
		{
			String query="INSERT INTO TURNI(ORARIO) VALUES(?) WHERE idDipendente=idResponsabile";
			
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
		
		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE TURNO  SET ORARIO=?, WHERE idDipendente=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, c.getNome());
			st1.setString(2, c.getCognome());
			st1.setString(3, c.getEmail());
			st1.setString(4, c.getPassword());
			st1.setString(5, c.getIdCliente());

			st1.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn);
		}
		return true;
	}

	
 
	

	 
	@Override
	public boolean deleteTurno(Turno t) {
		return false;
		// TODO Auto-generated method stub 
	}

}

package it.unipv.java.persistance.dao.responsabile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.ResponsabileModel;
import it.unipv.java.persistance.dao.DatabaseConnection;
import it.unipv.java.persistance.dao.PasswordUtil;

public class ResponsabileDao implements IResponsabileDao{
	private String schema;
	private Connection conn;
	
	public ResponsabileDao() {
		super();
		this.schema = "Traslochi";	//Inserisci Qui nome schema Responsabile
	}
	
	

	@Override
	public boolean createResponsabile(AuthGestor ag) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO RESPONSABILE(NOME,COGNOME,EMAIL,PASSWORD,IDRESPONSABILE) "
					+ "VALUES(?,?,?,?,?)";
			
			st1 = conn.prepareStatement(query);
			st1.setString(1,ag.getNome());
			st1.setString(2,ag.getCognome());
			st1.setString(3,ag.getEmail());
			st1.setString(4,ag.getPassword());
			st1.setString(5,ag.getIdResponsabile());
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
	}

	@Override
	public boolean updateResponsabile(ResponsabileModel r) {
		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE RESPONSABILE SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, r.getNome());
			st1.setString(2, r.getCognome());
			st1.setString(3, r.getEmail());
			st1.setString(4, r.getPassword());
			st1.setInt(5, r.getIdResponsabile());

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
	public boolean deleteResponsabile(ResponsabileModel r) {
		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "DELETE FROM RESPONSABILE WHERE idResponsabile = ? ";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setInt(1, r.getIdResponsabile());
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
	public List<ResponsabileModel> getAllResponsabili() {
		
		   List<ResponsabileModel> responsabili = new ArrayList<>();
		   
		    Statement stmt = null;
		    ResultSet rs = null;

		    try {
	 	        conn = DatabaseConnection.startConnection(conn, schema);

	 	        stmt = conn.createStatement();

	 	        String sql = "SELECT * FROM RESPONSABILE";
		        rs = stmt.executeQuery(sql);

		        // Process the result set
		        while (rs.next()) {
		        	ResponsabileModel r = new ResponsabileModel();
		            r.setIdResponsabile(rs.getInt("IDDIPENDENTI")); // Adjust the method names and types accordingly
		            r.setNome(rs.getString("NOME"));
		            r.setCognome(rs.getString("COGNOME"));
		            r.setEmail(rs.getString("EMAIL"));
		          
		            responsabili.add(r);
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

		    return responsabili;
	}

	@Override
	public boolean getResponsabile(AuthGestor ag) {
	    boolean loginSuccess = false;
	    conn = DatabaseConnection.startConnection(conn, schema);
	     
	    String sql = "SELECT PASSWORD FROM RESPONSABILE WHERE EMAIL = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	         
	    	pstmt.setString(1, ag.getLm().getUm().getEmail());
	        
 	        rs = pstmt.executeQuery();
	        
 	        if (rs.next()) {
	        	 String storedHash = rs.getString("PASSWORD");
	 	            if (PasswordUtil.verifyPassword(ag.getLm().getUm().getPassword(), storedHash)) {
		                loginSuccess = true; 
		            }
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
	    
	    return loginSuccess;
	}

	
}//fine responsabile
 

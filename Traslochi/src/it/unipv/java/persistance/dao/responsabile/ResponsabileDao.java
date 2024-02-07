package it.unipv.java.persistance.dao.responsabile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.Dipendente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.Responsabile;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class ResponsabileDao implements IResponsabileDao{
	private String schema;
	private Connection conn;
	
	public ResponsabileDao() {
		super();
		this.schema = "Traslochi";	//Inserisci Qui nome schema Responsabile
	}
	
	@Override
	public List<Responsabile> getAllResponsabili() {
		
		   List<Responsabile> responsabili = new ArrayList<>();
		   
		    Statement stmt = null;
		    ResultSet rs = null;

		    try {
	 	        conn = DatabaseConnection.startConnection(conn, schema);

	 	        stmt = conn.createStatement();

	 	        String sql = "SELECT * FROM RESPONSABILE";
		        rs = stmt.executeQuery(sql);

		        // Process the result set
		        while (rs.next()) {
		            Responsabile r = new Responsabile();
		            r.setIdResponsabile(rs.getString("IDDIPENDENTI")); // Adjust the method names and types accordingly
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
	public Responsabile getResponsabile(LoginModel login) {
		Responsabile r = null;
		    conn = DatabaseConnection.startConnection(conn, schema);
		     
		    String sql = "SELECT * FROM RESPONSABILE WHERE EMAIL = ? AND PASSWORD = ?";
		    ResultSet rs = null;
		    
		    try (PreparedStatement pstmt = conn.prepareStatement(sql); ){ 
		        
		        // Set the parameters
		        pstmt.setString(1, login.getEmail());
		        pstmt.setString(2, login.getPassword());
		        
		        // Execute the query
		        rs = pstmt.executeQuery();
		        
		        // Process the result set
		        if (rs.next()) {
		            r = new Responsabile();
		            r.setIdResponsabile(rs.getString("IDDIPENDENTI"));
		            r.setNome(rs.getString("NOME"));
		            r.setCognome(rs.getString("COGNOME"));
		            r.setEmail(rs.getString("EMAIL"));
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
		    
		    return r;
	}

	@Override
	public boolean createResponsabile(RegisterModel register) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO RESPONSABILE(NOME,COGNOME,EMAIL,PASSWORD,IDRESPONSABILE) "
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
		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE RESPONSABILE SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, r.getNome());
			st1.setString(2, r.getCognome());
			st1.setString(3, r.getEmail());
			st1.setString(4, r.getPassword());
			st1.setString(5, r.getIdResponsabile());

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
	public boolean deleteResponsabile(Responsabile r) {
		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "DELETE FROM RESPONSABILE WHERE idResponsabile = ? ";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, r.getIdResponsabile());
			st1.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn);
		}
		return true;
	}

		
	}
 

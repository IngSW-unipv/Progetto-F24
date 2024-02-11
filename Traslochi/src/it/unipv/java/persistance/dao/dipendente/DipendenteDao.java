package it.unipv.java.persistance.dao.dipendente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.DipendenteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.UserModel;
import it.unipv.java.persistance.dao.DatabaseConnection;
import it.unipv.java.persistance.dao.PasswordUtil;

public class DipendenteDao implements IDipendenteDao {
	private String schema;
	private Connection conn;

	public DipendenteDao() {
		super();
		this.schema = "Traslochi"; // Inserisci Qui nome schema Dipendente
	}
	@Override
	public boolean createDipendente(AuthGestor ag) {

		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "INSERT INTO DIPENDENTI (NOME,COGNOME,CF,EMAIL,PASSWORD,IDDIPENDENTI) VALUES(?,?,?,?,?,?)";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {
			st1.setString(1, ag.getRm().getUm().getNome());
			st1.setString(2, ag.getRm().getUm().getCognome());
			st1.setString(2, ag.getRm().getUm().getCf());
			st1.setString(3, ag.getRm().getUm().getEmail());
			st1.setString(4, ag.getRm().getUm().getPassword());
			 st1.setString(5, ag.getRm().getUm().getId());

			st1.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn); // Ensuring connection is closed even if an exception occurs
		}
		return true;
	}

	@Override
	public boolean updateDipendente(DipendenteModel d) {

		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE DIPENDENTI SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, d.getNome());
			st1.setString(2, d.getCognome());
			st1.setString(3, d.getEmail());
			st1.setString(4, d.getPassword());
			st1.setInt(5, d.getIdDipendente());

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
	public boolean deleteDipendente(DipendenteModel d) {

		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "DELETE FROM Dipendenti WHERE idDipendente = ? ";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setInt(1, d.getIdDipendente());
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
	public List<DipendenteModel> getAllDipendenti() {
	    List<DipendenteModel> dipendenti = new ArrayList<>();
	   
	    Statement stmt = null;
	    ResultSet rs = null;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);

 	        stmt = conn.createStatement();

 	        String sql = "SELECT * FROM DIPENDENTI";
	        rs = stmt.executeQuery(sql);

	        // Process the result set
	        while (rs.next()) {
	        	DipendenteModel dipendente = new DipendenteModel();
	            dipendente.setIdDipendente(rs.getInt("IDDIPENDENTI")); // Adjust the method names and types accordingly
	            dipendente.setNome(rs.getString("NOME"));
	            dipendente.setCognome(rs.getString("COGNOME"));
	            dipendente.setEmail(rs.getString("EMAIL"));
	          
	            dipendenti.add(dipendente);
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

	    return dipendenti;
	}

	@Override
	public boolean getDipendente(AuthGestor ag) {
		
	    boolean loginSuccess = false;
	    conn = DatabaseConnection.startConnection(conn, schema); 
	    
	    String sql = "SELECT PASSWORD FROM DIPENDENTI WHERE EMAIL = ?";
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


	

}

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

public class DipendenteDao implements IDipendenteDao {
	private String schema;
	private Connection conn;

	public DipendenteDao() {
		super();
		this.schema = "Traslochi"; // Inserisci Qui nome schema Dipendente
	}

	@Override
	public List<Dipendente> getAllDipendenti() {
	    List<Dipendente> dipendenti = new ArrayList<>();
	   
	    Statement stmt = null;
	    ResultSet rs = null;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);

 	        stmt = conn.createStatement();

 	        String sql = "SELECT * FROM DIPENDENTI";
	        rs = stmt.executeQuery(sql);

	        // Process the result set
	        while (rs.next()) {
	            Dipendente dipendente = new Dipendente();
	            dipendente.setIdDipendente(rs.getString("IDDIPENDENTI")); // Adjust the method names and types accordingly
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
	public Dipendente getDipendente(LoginModel login) {
		
	    Dipendente dipendente = null;
	    conn = DatabaseConnection.startConnection(conn, schema);
	     
	    String sql = "SELECT * FROM DIPENDENTI WHERE EMAIL = ? AND PASSWORD = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql); ){ 
	        
	        // Set the parameters
	        pstmt.setString(1, login.getEmail());
	        pstmt.setString(2, login.getPassword());
	        
	        // Execute the query
	        rs = pstmt.executeQuery();
	        
	        // Process the result set
	        if (rs.next()) {
	            dipendente = new Dipendente();
	            dipendente.setIdDipendente(rs.getString("IDDIPENDENTI"));
	            dipendente.setNome(rs.getString("NOME"));
	            dipendente.setCognome(rs.getString("COGNOME"));
	            dipendente.setEmail(rs.getString("EMAIL"));
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
	    
	    return dipendente;
	}

	@Override
	public boolean createDipendente(RegisterModel register) {

		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "INSERT INTO DIPENDENTI (NOME,COGNOME,EMAIL,PASSWORD,IDDIPENDENTI) VALUES(?,?,?,?,?)";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {
			st1.setString(1, register.getNome());
			st1.setString(2, register.getCognome());
			st1.setString(3, register.getEmail());
			st1.setString(4, register.getPassword());
			st1.setString(5, register.getIdDipendente());

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
	public boolean updateDipendente(Dipendente d) {

		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE DIPENDENTI SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, d.getNome());
			st1.setString(2, d.getCognome());
			st1.setString(3, d.getEmail());
			st1.setString(4, d.getPassword());
			st1.setString(5, d.getIdDipendente());

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
	public boolean deleteDipendente(Dipendente d) {

		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "DELETE FROM Dipendenti WHERE idDipendente = ? ";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, d.getIdDipendente());
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

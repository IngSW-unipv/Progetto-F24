package it.unipv.java.persistance.dao.dipendente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.Dipendente;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.dao.DatabaseConnection;


public class RdbDipendenteDao implements IDipendenteDao {
	private String schema;
	private Connection conn;

	public RdbDipendenteDao() {
		super();
		this.schema = "Traslochi"; 
	}

	@Override
	public boolean createDipendente(RegisterData c) {
		conn = DatabaseConnection.startConnection(conn, schema);
		PreparedStatement st1 = null;
		boolean esito = true;
		try {
			String query = "INSERT INTO Dipendente (IDDipendente, Nome, Cognome, CF, Email, Password) VALUES(?, ?, ?, ?, ?, ?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1, c.getUserId());
			st1.setString(2, c.getNomeInserito());
			st1.setString(3, c.getCognomeInserito());
			st1.setString(4, c.getCfInserito());
			st1.setString(5, c.getEmailInserita());
			st1.setString(6, c.getPasswordInserita());	
			st1.executeUpdate();

		} catch (Exception e) {
	        e.printStackTrace();
	        esito = false;
	    } finally {
 	        if (st1 != null) {
	            try {
	                st1.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        DatabaseConnection.closeConnection(conn);
	    }
	    return esito;
	}

 	@Override
	public boolean updateDipendente(User u) {
 	    Connection conn = null;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);
	        
 	        String query = "UPDATE DIPENDENTE SET NOME=?, COGNOME=?, EMAIL=?, PASSWORD=? WHERE ID=?";
	        
 	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            
 	            st1.setString(1, u.getNome());
	            st1.setString(2, u.getCognome());
	            st1.setString(3, u.getEmail());	            
	            st1.setString(4, u.getPassword());
 	            st1.setString(5, u.getId());
	            
 	            int affectedRows = st1.executeUpdate();
	            
 	            return affectedRows > 0;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    } finally {
 	        DatabaseConnection.closeConnection(conn);
	    }
	}


 	@Override
	public boolean deleteDipendente(User u) {

		conn = DatabaseConnection.startConnection(conn, schema);

		String query = "DELETE FROM Dipendente WHERE idDipendente = ? ";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, u.getId());
			st1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn);
		}

		return true;
	}

 	public List<User> getAllDipendenti() {
		List<User> dipendenti = new ArrayList<>();

		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DatabaseConnection.startConnection(conn, schema);

			stmt = conn.createStatement();

			String sql = "SELECT * FROM DIPENDENTE";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Dipendente dipendente = new Dipendente();
				dipendente.setId(rs.getString("IDDIPENDENTE"));
				dipendente.setNome(rs.getString("NOME"));
				dipendente.setCognome(rs.getString("COGNOME"));
				dipendente.setCf(rs.getString("CF"));
				dipendente.setEmail(rs.getString("EMAIL"));
				dipendenti.add(dipendente);
			}
		} catch (

		Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				DatabaseConnection.closeConnection(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dipendenti;

	}

	public User getDipendente(LoginData ag) {
		conn = DatabaseConnection.startConnection(conn, schema);
		Dipendente um = new Dipendente();
		String sql = "SELECT IDDipendente, Nome, Cognome, CF, Email, Password FROM DIPENDENTE WHERE EMAIL = ?";
		ResultSet rs = null;

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, ag.getEmailInserita());
			rs = pstmt.executeQuery();
			
			
			if (rs.next()) {
				um.setIdDipendente(rs.getString("IDDipendente"));
                um.setNome(rs.getString("Nome"));
                um.setCognome(rs.getString("Cognome"));
                um.setCf(rs.getString("CF"));
                um.setEmail(rs.getString("Email"));
                um.setPassword(rs.getString("Password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				DatabaseConnection.closeConnection(conn);
				return um;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return um;
	}

}

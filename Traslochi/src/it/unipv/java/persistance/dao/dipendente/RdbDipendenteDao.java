package it.unipv.java.persistance.dao.dipendente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.dao.DatabaseConnection;


public class RdbDipendenteDao implements IDipendenteDao {
	private String schema;
	private Connection conn;

	public RdbDipendenteDao() {
		super();
		this.schema = "Traslochi"; 
	}

	@Override
	public boolean createDipendente(RegisterModel c) {

		conn = DatabaseConnection.startConnection(conn, schema);
		PreparedStatement st1;
		boolean esito = true;
		try {
			String query = "INSERT INTO Dipendente (IDDipendente, Nome, Cognome, CF, Email, Password) VALUES(?, ?, ?, ?, ?, ?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1, c.getUm().getId());
			st1.setString(2, c.getUm().getNome());
			st1.setString(3, c.getUm().getCognome());
			st1.setString(4, c.getUm().getCf());
			st1.setString(5, c.getUm().getEmail());
			st1.setString(6, c.getUm().getPassword());
			st1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn);
		}
		return true;
	}

 	@Override
	public boolean updateDipendente(UserModel u) {
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
	public boolean deleteDipendente(UserModel u) {

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

 	public List<UserModel> getAllDipendenti() {
		List<UserModel> dipendenti = new ArrayList<>();

		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DatabaseConnection.startConnection(conn, schema);

			stmt = conn.createStatement();

			String sql = "SELECT * FROM DIPENDENTE";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				UserModel dipendente = new UserModel();
				dipendente.setId(rs.getString("IDDIPENDENTI"));
				dipendente.setNome(rs.getString("NOME"));
				dipendente.setCognome(rs.getString("COGNOME"));
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

	public boolean getDipendente(UserModel ag) {
		conn = DatabaseConnection.startConnection(conn, schema);

		String sql = "SELECT PASSWORD FROM DIPENDENTE WHERE EMAIL = ?";
		ResultSet rs = null;

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, ag.getEmail());
			rs = pstmt.executeQuery();
			
			
			if (rs.next()) {
				UserModel um = new UserModel();
				um.setId(rs.getString("IDCliente"));
                um.setNome(rs.getString("Nome"));
                um.setCognome(rs.getString("Cognome"));
                um.setCf(rs.getString("CF"));
                um.setEmail(rs.getString("Email"));
                um.setPassword(rs.getString("Password"));
                SingleSessioneAttiva.getInstance().login(um);;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				DatabaseConnection.closeConnection(conn);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return false;
	}

 

}

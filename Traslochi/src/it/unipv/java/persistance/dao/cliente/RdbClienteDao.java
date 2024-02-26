package it.unipv.java.persistance.dao.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.newuser.Cliente;
import it.unipv.java.model.newuser.User;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.dao.DatabaseConnection;


public class RdbClienteDao implements IClienteDao {
	private String schema;
	private Connection conn;

	public RdbClienteDao() {
		super();
		this.schema = "Traslochi";
	}

	@Override
	public boolean createCliente(RegisterModel c) {
		conn = DatabaseConnection.startConnection(conn, schema);
		PreparedStatement st1 = null;
		boolean esito = true;
		try {
			String query = "INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES(?, ?, ?, ?, ?, ?)";
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
	public boolean updateCliente(UserModel ag) {

		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE CLIENTE SET NOME=?,COGNOME=?,CF=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, ag.getNome());
			st1.setString(2, ag.getCognome());
			st1.setString(3, ag.getCf());
			st1.setString(4, ag.getEmail());
			st1.setString(5, ag.getPassword());
			st1.setString(6, ag.getId());

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
	public boolean deleteCliente(UserModel  ag) {

		String query = "DELETE FROM ClientE WHERE idCliente = ?";
		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, ag.getId());

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
	public List<UserModel> getAllClienti() {
		List<UserModel> clienti = new ArrayList<>();
 
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DatabaseConnection.startConnection(conn, schema);

			stmt = conn.createStatement();

			String sql = "SELECT * FROM CLIENTE";
			rs = stmt.executeQuery(sql);

			// Process the result set
			while (rs.next()) {
				UserModel c =   new UserModel();
				c.setId(rs.getString("IDDIPENDENTI")); // Adjust the method names and types accordingly
				c.setNome(rs.getString("NOME"));
				c.setCognome(rs.getString("COGNOME"));
				c.setEmail(rs.getString("EMAIL"));

				clienti.add(c);
			}
		} catch (Exception e) {
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
 
		return clienti;
	}
   
	
	public User getCliente(LoginData datiInseriti) {
	    conn = DatabaseConnection.startConnection(conn, schema);
	    Cliente cliente = new Cliente();
 	    String sql = "SELECT IDCliente, Nome, Cognome, CF, Email, Password FROM CLIENTE WHERE EMAIL = ?";
	    ResultSet rs = null;

	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, datiInseriti.getEmailInserita());
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            // = rs.getString("PASSWORD");
 	                cliente.setIdCliente(rs.getString("IDCliente"));
	                cliente.setNome(rs.getString("Nome"));
	                cliente.setCognome(rs.getString("Cognome"));
	                cliente.setCf(rs.getString("CF"));
	                cliente.setEmail(rs.getString("Email"));
	                cliente.setPassword(rs.getString("Password"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            DatabaseConnection.closeConnection(conn);
	            return cliente;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return cliente;
	}

}//fine getCliente

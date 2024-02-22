package it.unipv.java.persistance.dao.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.DataAccessFacade;
import it.unipv.java.persistance.dao.DatabaseConnection;


public class ClienteDao implements IClienteDao {
	private String schema;
	private Connection conn;

	public ClienteDao() {
		super();
		this.schema = "Traslochi";
	}

	@Override
	public boolean createCliente(RegisterModel c) {
		conn = DatabaseConnection.startConnection(conn, schema);
		PreparedStatement st1;
		boolean esito = true;
		try {
			String query = "INSERT INTO CLIENTE (NOME,COGNOME,CF,EMAIL,PASSWORD,IDCLIENTE) VALUES(?,?,?,?,?,?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1, c.getUm().getNome());
			st1.setString(2, c.getUm().getCognome());
			st1.setString(3, c.getUm().getCf());
			st1.setString(4, c.getUm().getEmail());
			st1.setString(5, c.getUm().getPassword());		
			st1.setString(6, c.getUm().getId());
			st1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			esito = false;
		}

		DatabaseConnection.closeConnection(conn);
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
   
	
	public boolean getCliente(LoginModel ag) {
	    conn = DatabaseConnection.startConnection(conn, schema);

 	    String sql = "SELECT IDCliente, Nome, Cognome, CF, Email, PASSWORD FROM CLIENTE WHERE EMAIL = ?";
	    ResultSet rs = null;

	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, ag.getUm().getEmail());
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            // = rs.getString("PASSWORD");
	               UserModel um = new UserModel();
 	                um.setId(rs.getString("IDCliente"));
	                um.setNome(rs.getString("Nome"));
	                um.setCognome(rs.getString("Cognome"));
	                um.setCf(rs.getString("CF"));
	                um.setEmail(rs.getString("Email"));
	                um.setPassword(rs.getString("Password"));
	               SingleSessioneAttiva.getInstance().setUtenteAttivo(um);;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            DatabaseConnection.closeConnection(conn);
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return false;
	}

}//fine getCliente

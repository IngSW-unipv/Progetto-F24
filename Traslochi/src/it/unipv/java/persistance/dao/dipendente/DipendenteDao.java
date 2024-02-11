package it.unipv.java.persistance.dao.dipendente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.DataAccessFacade;
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
	public boolean createDipendente(UserModel c) {

		conn = DatabaseConnection.startConnection(conn, schema);
		PreparedStatement st1;
		boolean esito = true;
		try {
			String query = "INSERT INTO CLIENTI (NOME,COGNOME,EMAIL,PASSWORD,IDCLIENTE) VALUES(?,?,?,?,?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1, c.getNome());
			st1.setString(2, c.getCognome());
			st1.setString(3, c.getEmail());
			String hashedPassword = PasswordUtil.hashPassword(c.getPassword());
			st1.setString(4, hashedPassword);
			st1.setString(5, c.getId());
			st1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn);
		}
		return true;
	}

	// DA IMPLEMENTARE devo vedere dipendente view
	@Override
	public boolean updateDipendente(DataAccessFacade u) {
		/*
		 * conn = DatabaseConnection.startConnection(conn, schema); String query =
		 * "UPDATE DIPENDENTI SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";
		 * 
		 * try (PreparedStatement st1 = conn.prepareStatement(query)) { DIPENDE DALLA
		 * VIEW st1.setString(1, u.get st1.setString(2, d.getCognome());
		 * st1.setString(3, d.getEmail()); st1.setString(4, d.getPassword());
		 * st1.setInt(5, d.getIdDipendente());
		 * 
		 * st1.executeUpdate(query);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); return false; } finally {
		 * DatabaseConnection.closeConnection(conn); }
		 */
		return true;

	}

	// DA IMPLEMENTARE devo vedere responsabile
	@Override
	public boolean deleteDipendente(DataAccessFacade u) {

		/*
		 * conn = DatabaseConnection.startConnection(conn, schema);
		 * 
		 * String query = "DELETE FROM Dipendenti WHERE idDipendente = ? ";
		 * 
		 * try (PreparedStatement st1 = conn.prepareStatement(query)) {
		 * 
		 * st1.setInt(1, d.getIdDipendente()); st1.executeUpdate(query);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); return false; } finally {
		 * DatabaseConnection.closeConnection(conn); }
		 */
		return true;
	}

	@Override // il responsabile fa alldipendenti
	public List<DataAccessFacade> getAllDipendenti() {
		List<DataAccessFacade> dipendenti = new ArrayList<>(); // come si fa?
		/*
		 * Statement stmt = null; ResultSet rs = null;
		 * 
		 * try { conn = DatabaseConnection.startConnection(conn, schema);
		 * 
		 * stmt = conn.createStatement();
		 * 
		 * String sql = "SELECT * FROM DIPENDENTI"; rs = stmt.executeQuery(sql);
		 * 
		 * // Process the result set while (rs.next()) { DataAccessFacade dipendente =
		 * DataAccessFacade.getInstance();
		 * dipendente.setIdDipendente(rs.getInt("IDDIPENDENTI")); // Adjust the method
		 * names and types accordingly dipendente.setNome(rs.getString("NOME"));
		 * dipendente.setCognome(rs.getString("COGNOME"));
		 * dipendente.setEmail(rs.getString("EMAIL"));
		 * 
		 * dipendenti.add(dipendente); } } catch (Exception e) { e.printStackTrace();
		 * 
		 * } finally { try { if (rs != null) rs.close(); if (stmt != null) stmt.close();
		 * DatabaseConnection.closeConnection(conn); } catch (Exception e) {
		 * e.printStackTrace(); } }
		 */
		return dipendenti;

	}

	@Override
	public boolean getDipendente(DataAccessFacade ag) {

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
				if (rs != null)
					rs.close();
				DatabaseConnection.closeConnection(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return loginSuccess;
	}

}

package it.unipv.java.persistance.dao.responsabile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.unipv.java.model.LoginData;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.model.newuser.Responsabile;
import it.unipv.java.model.newuser.User;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.persistance.dao.DatabaseConnection;


public class RdbResponsabileDao implements IResponsabileDao{
	private String schema;
	private Connection conn;
	
	public RdbResponsabileDao() {
		super();
		this.schema = "Traslochi";	//Inserisci Qui nome schema Responsabile
	}
	
	
	@Override
	public boolean createResponsabile(RegisterModel c) {
	    conn = DatabaseConnection.startConnection(conn, schema);
	    PreparedStatement st1 = null;
	    boolean esito = true;
	    try {
 	        String query = "INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES (?, ?, ?, ?, ?, ?)";
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
	public User getResponsabile(LoginData lm) {
	    conn = DatabaseConnection.startConnection(conn, schema);
	    Responsabile responsabile = new Responsabile();
	    String sql = "SELECT IDResponsabile, Nome, Cognome, CF, Email, Password FROM RESPONSABILE WHERE EMAIL = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        
	        pstmt.setString(1, lm.getEmailInserita()); // Usa il parametro corretto
	        rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            responsabile.setIdResponsabile(rs.getString("IDResponsabile"));
	            responsabile.setNome(rs.getString("NOME"));
	            responsabile.setCognome(rs.getString("COGNOME"));
	            responsabile.setEmail(rs.getString("EMAIL"));
	            responsabile.setPassword(rs.getString("PASSWORD"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            DatabaseConnection.closeConnection(conn);
	            return responsabile;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    return responsabile;
	}


	@Override
	public boolean updateResponsabile(UserModel ag) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean deleteResponsabile(UserModel utente) {
		// TODO Auto-generated method stub
		return false;
	}


	
}//fine responsabile
 

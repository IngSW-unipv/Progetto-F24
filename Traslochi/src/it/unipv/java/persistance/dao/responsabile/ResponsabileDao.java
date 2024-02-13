package it.unipv.java.persistance.dao.responsabile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
 
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.model.user.UserModel;
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
	public boolean createResponsabile(RegisterModel c) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO RESPONSABILE(NOME,COGNOME,EMAIL,PASSWORD,IDRESPONSABILE) "
					+ "VALUES(?,?,?,?,?)";
			
			st1 = conn.prepareStatement(query);
			st1.setString(1,c.getUm().getNome());
			st1.setString(2,c.getUm().getCognome());
			st1.setString(3,c.getUm().getEmail());
			String hashedPassword = PasswordUtil.hashPassword(c.getUm().getPassword());
			st1.setString(4, hashedPassword);
			st1.setString(5,c.getUm().getId());
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
	} 
	
	@Override
	public UserModel getResponsabile(UserModel lm) {
	    UserModel responsabile = null; // Inizializza l'utente responsabile come null
	    conn = DatabaseConnection.startConnection(conn, schema);
	     
	    String sql = "SELECT * FROM RESPONSABILE WHERE EMAIL = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        
	        pstmt.setString(1, lm.getEmail()); // Usa il parametro corretto
	        rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            String storedHash = rs.getString("PASSWORD");
	            if (PasswordUtil.verifyPassword(lm.getPassword(), storedHash)) {
 	                responsabile = new UserModel();
	                responsabile.setId(rs.getString("ID"));
	                responsabile.setNome(rs.getString("NOME"));
	                responsabile.setCognome(rs.getString("COGNOME"));
	                responsabile.setEmail(rs.getString("EMAIL"));
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
	    
	    return responsabile; // Restituisce l'utente responsabile se il login ha successo, altrimenti null
	}


	
}//fine responsabile
 

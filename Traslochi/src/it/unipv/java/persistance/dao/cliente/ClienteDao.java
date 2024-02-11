package it.unipv.java.persistance.dao.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import it.unipv.java.model.AuthGestor;
import it.unipv.java.model.ClienteModel; 
import it.unipv.java.persistance.dao.DatabaseConnection;
 
public class ClienteDao implements IClienteDao{
	private String schema;
	private Connection conn;
	
	public ClienteDao() {
		super();
		this.schema = "Traslochi"; 
	}
	
	
	@Override
	public boolean createCliente(AuthGestor ag) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1; 
		boolean esito=true; 
		try
		{
			String query="INSERT INTO CLIENTI (NOME,COGNOME,EMAIL,PASSWORD,IDCLIENTE) VALUES(?,?,?,?,?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1,ag.getRm().getUm().getNome());
			st1.setString(2,ag.getRm().getUm().getCognome());
			st1.setString(3,ag.getRm().getUm().getEmail());
			st1.setString(4,ag.getRm().getUm().getPassword());
			st1.setString(5,ag.getRm().getUm().getId()); 
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
		
	}
 
	@Override
	public boolean updateCliente(AuthGestor ag) {

		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE CLIENTI SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1,ag.getRm().getUm().getNome());
			st1.setString(2,ag.getRm().getUm().getCognome());
			st1.setString(3,ag.getRm().getUm().getEmail());
			st1.setString(4,ag.getRm().getUm().getPassword());
			st1.setString(5,ag.getRm().getUm().getId()); 

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
	public boolean deleteCliente( AuthGestor ag) { 
	    
	    String query = "DELETE FROM Clienti WHERE idCliente = ?";  
	    try (PreparedStatement st1 = conn.prepareStatement(query)) {
	         
	    	st1.setString(1,ag.getRm().getUm().getId()); 
	        
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
	public List<ClienteModel> getAllClienti(){
	    List<ClienteModel> clienti = new ArrayList<>();
	   
	    Statement stmt = null;
	    ResultSet rs = null;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);

 	        stmt = conn.createStatement();

 	        String sql = "SELECT * FROM CLIENTI";
	        rs = stmt.executeQuery(sql);

	        // Process the result set
	        while (rs.next()) {
	        	ClienteModel c = new ClienteModel();
	            c.setIdCliente(rs.getInt("IDDIPENDENTI")); // Adjust the method names and types accordingly
	            c.setNome(rs.getString("NOME"));
	            c.setCognome(rs.getString("COGNOME"));
	            c.setEmail(rs.getString("EMAIL"));
	          
	            clienti.add(c);
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

	    return clienti;
	}
	
	
	@Override
    public ClienteModel getCliente(AuthGestor ag) {
		
		ClienteModel cliente = null;
	    conn = DatabaseConnection.startConnection(conn, schema);
	     
	    String sql = "SELECT * FROM CLIENTE WHERE EMAIL = ? AND PASSWORD = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql); ){ 
	        
	        // Set the parameters
	        pstmt.setString(1,ag.getRm().getUm().getEmail());
	        pstmt.setString(2,ag.getRm().getUm().getEmail());
	        
	        // Execute the query
	        rs = pstmt.executeQuery();
	        
	        // Process the result set
	        if (rs.next()) {
	        	ClienteModel c = new ClienteModel();
	            cliente.setIdCliente(rs.getInt("IDDIPENDENTI"));
	            cliente.setNome(rs.getString("NOME"));
	            cliente.setCognome(rs.getString("COGNOME"));
	            cliente.setEmail(rs.getString("EMAIL"));
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
	    
	    return cliente;
	}
	 
 
	
	
	
 
	
 	}



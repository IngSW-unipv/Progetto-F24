package it.unipv.java.persistance.dao.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.ClienteModel;
import it.unipv.java.model.DipendenteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class ClienteDao implements IClienteDao{
	private String schema;
	private Connection conn;
	
	public ClienteDao() {
		super();
		this.schema = "Traslochi"; 
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
    public ClienteModel getCliente(LoginModel login) {
		
		ClienteModel cliente = null;
	    conn = DatabaseConnection.startConnection(conn, schema);
	     
	    String sql = "SELECT * FROM CLIENTE WHERE EMAIL = ? AND PASSWORD = ?";
	    ResultSet rs = null;
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql); ){ 
	        
	        // Set the parameters
	        pstmt.setString(1, login.getEmail());
	        pstmt.setString(2, login.getPassword());
	        
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
	 
	
	
	@Override
	public boolean createCliente(RegisterModel register) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO CLIENTI (NOME,COGNOME,EMAIL,PASSWORD,IDCLIENTE) VALUES(?,?,?,?,?)";
			st1 = conn.prepareStatement(query);
			st1.setString(1,register.getNome());
			st1.setString(2,register.getCognome());
			st1.setString(3,register.getEmail());
			st1.setString(4,register.getPassword());
			st1.setString(5,register.getIdCliente());
			
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
		
	}
 
	@Override
	public boolean updateCliente(ClienteModel c) {

		conn = DatabaseConnection.startConnection(conn, schema);
		String query = "UPDATE CLIENTI SET NOME=?,COGNOME=?,EMAIL=?,PASSWORD=? WHERE id=?";

		try (PreparedStatement st1 = conn.prepareStatement(query)) {

			st1.setString(1, c.getNome());
			st1.setString(2, c.getCognome());
			st1.setString(3, c.getEmail());
			st1.setString(4, c.getPassword());
			st1.setInt(5, c.getIdCliente());

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
	public boolean deleteCliente(ClienteModel c) { 
	    
	    String query = "DELETE FROM Clienti WHERE idCliente = ?"; // Use the actual column name for client ID
	    try (PreparedStatement st1 = conn.prepareStatement(query)) {
	         
	    	st1.setInt(1, c.getIdCliente()); // Assuming idCliente is an integer. Use setString if it's a VARCHAR
	        
	    	st1.executeUpdate();
	        
	        // If one or more rows were affected, the deletion was successful
	    } catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DatabaseConnection.closeConnection(conn);
		}
		return true;
	}
	
	public boolean checkExistingEmail(String email) {
		conn= DatabaseConnection.startConnection(conn, schema);
		String query = "SELECT * FROM CLIENTI WHERE EMAIL = ?";
		ResultSet rs= null;
		
		try (PreparedStatement pstmt = conn.prepareStatement(query)) { 
	        // Set the parameter
	        pstmt.setString(1, email);
	        
	        // Execute the query
	        rs = pstmt.executeQuery();
	        
	        // If the result set has at least one row, the email exists
	        return rs.next();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    } finally {
	        try {
	            if (rs != null) rs.close();
	             
	            DatabaseConnection.closeConnection(conn);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		
	} 
 	}



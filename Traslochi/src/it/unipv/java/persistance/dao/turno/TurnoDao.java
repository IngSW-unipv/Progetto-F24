package it.unipv.java.persistance.dao.turno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.ClienteModel;
import it.unipv.java.model.DipendenteModel;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.model.TurnoModel;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class TurnoDao implements ITurnoDao{
	
	private String schema;
	private Connection conn;
	
	public TurnoDao() {
		super();
		this.schema = "Traslochi"; //nome schema 
	}
	
	public List<TurnoModel> getAllTurni() {
	    List<TurnoModel> turni = new ArrayList<>();
	    Connection conn = null; 
	    try {
	        conn = DatabaseConnection.startConnection(conn, schema); // Ensure this method returns a valid connection object

	        String sql = "SELECT * FROM Turno";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            // Process the result set
	            while (rs.next()) {
	            	TurnoModel t = new TurnoModel(); 
	                t.setOrario(rs.getTime("Orario"));  
	                turni.add(t);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.closeConnection(conn); // Ensure the connection is closed properly
	    }

	    return turni;
	}

 
	public TurnoModel getTurno(DipendenteModel d) {
		TurnoModel t = null;
	    Connection conn = null; // Ensure conn is declared and initialized

 	    String sql = "SELECT * FROM Turno "
	               + "JOIN Dipendente ON Turno.idDipendente = Dipendente.idDipendente "
	               + "WHERE Dipendente.EMAIL = ? AND Dipendente.PASSWORD = ?";
	    
	    ResultSet rs = null;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema); // Ensure this method returns a valid connection object
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            
 	            pstmt.setString(1, d.getEmail());
	            pstmt.setString(2, d.getPassword());
	            
 	            rs = pstmt.executeQuery();
	            
 	            if (rs.next()) {
	                t = new TurnoModel();
 	                t.setOrario(rs.getTime("ORARIO")); 
 	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
 	        try {
	            if (rs != null) rs.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        DatabaseConnection.closeConnection(conn);
	    }

	    return t;
	}


 	public boolean createTurno(TurnoModel t) {
		conn=DatabaseConnection.startConnection(conn,schema);

	    PreparedStatement st1;

	    boolean esito = true;

	    try {
 	        String query = "INSERT INTO Turno (Orario, IDResponsabile, idDipendente, IDMezzo) VALUES (?, ?, ?, ?)";

	        st1 = conn.prepareStatement(query);
	        st1.setTime(1, t.getOrario());
	        st1.setInt(2, t.getIdResponsabile());
	        st1.setInt(3, t.getIdDipendente());
	        st1.setInt(4, t.getIdMezzo());

	        
	        if (t.getIdDipendente() == t.getIdResponsabile()) {
	            st1.executeUpdate();
	        } else {
	            
	            esito = false;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        esito = false;
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }

	    return esito;
	}

 
	public boolean updateTurno(TurnoModel t) {
	    Connection conn = null;
	    boolean success = true;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);
	         
	        String query = "UPDATE Turno SET Orario=? WHERE idDipendente=?";
 
	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            
	            
	            st1.setTime(1, t.getOrario()); 
	            st1.setInt(2, t.getIdDipendente());  

 	            st1.executeUpdate(); 

	        } catch (Exception e) {
	            e.printStackTrace();
	            success = false;
	        }
	    } finally {
 	        DatabaseConnection.closeConnection(conn);
	    }
	    return success;
	}


	@Override
	public boolean deleteTurno(TurnoModel turno) {
	    Connection conn = null;
	    PreparedStatement st1 = null;
	    boolean esito = false;

	    try {
 	        conn = DatabaseConnection.startConnection(conn, schema);

 	        String query = "DELETE FROM Turno WHERE Orario = ? AND IDResponsabile = ?";

 	        st1 = conn.prepareStatement(query);

 	        st1.setTime(1, turno.getOrario());
	        st1.setInt(2, turno.getIdResponsabile());

 	        int rowsAffected = st1.executeUpdate();
	        esito = rowsAffected > 0;  
	    } catch (SQLException e) {
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


}

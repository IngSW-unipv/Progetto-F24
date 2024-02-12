package it.unipv.java.persistance.dao.turno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.TurnoModel; 
import it.unipv.java.model.TurnoModel;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class TurnoDao implements ITurnoDao {
	
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
			conn=DatabaseConnection.startConnection(conn,schema);

	        String sql = "SELECT * FROM Turno";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            // Processa il ResultSet
	            while (rs.next()) {
	                TurnoModel t = new TurnoModel();
	                // Supponendo che in TurnoModel ci sia un metodo setOrarioInizio che accetta un parametro di tipo Time
	                t.setOrarioini(rs.getString("OrarioInizio")); 
	                t.setIdDipendente(rs.getString("idDipendente"));
	                t.setIndLavoro(rs.getString("IndirizzoLavoro"));
	                turni.add(t);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.closeConnection(conn); // Assicurati che la connessione venga chiusa correttamente
	    }

	    return turni;
	}

 
	/*public TurnoModel getTurno(DipendenteModel d) {
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
	}*/


 	public boolean createTurno(TurnoModel t) {
		conn=DatabaseConnection.startConnection(conn,schema);

	    PreparedStatement st1;

	    boolean esito = true;

	    try {
 	        String query = "INSERT INTO Turno (Orario,idDipendente, IDMezzo) VALUES (?, ?, ?, ?)";

	        st1 = conn.prepareStatement(query);
	        st1.setString(1, t.getOrarioini());
 	        st1.setString(3, t.getIdDipendente());
	        st1.setString(4, t.getIndLavoro());
 
	  
	    } catch (SQLException e) {
	        e.printStackTrace();
	        esito = false;
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }

	    return esito;
	}

 
	 


}

package it.unipv.java.persistance.dao.prenotazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.PrenotazioneModel;
 import it.unipv.java.persistance.dao.DatabaseConnection;

public class PrenotazioneDao implements IPrenotazioneDao{
	private String schema;
	private Connection conn;
	
	public PrenotazioneDao() {
		super();
		this.schema = "Traslochi";	//Inserisci Qui nome schema Prenotazione
	}
  

	@Override
	public List <PrenotazioneModel> getAllPrenotazioni() {
	    List<PrenotazioneModel> prenotazioni = new ArrayList<>();
	    Connection conn = null;
	    ResultSet rs = null;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String sql = "SELECT * FROM Prenotazioni";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            rs = stmt.executeQuery();
	            while (rs.next()) {
	            	PrenotazioneModel p = new PrenotazioneModel();
	                p.setIdPrenotazione(rs.getString ("IDPrenotazione"));
	                p.setIdCliente(rs.getString("IDCliente"));
	                //p.setIndirizzoConsegna(rs.getString() .getIndirizzoDiConsegna("IndirizzoDiConsegna"));
	                p.setDataRitiro(rs.getString("DataRitiro"));
	                p.setDataConsegna(rs.getString("DataConsegna"));
	                p.setMetodoDiPagamento(rs.getString("MetodoDiPagamento"));
	                p.setImportoPagato(rs.getFloat("ImportoPagato"));
	                p.setStatoPrenotazione(rs.getString("StatoPrenotazione"));
	                prenotazioni.add(p);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }
	    return prenotazioni;
	}

	@Override
	public PrenotazioneModel getPrenotazione(ClienteModel c) {
		PrenotazioneModel prenotazione = null;
	    Connection conn = null;
	    ResultSet rs = null;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String sql = "SELECT * FROM Prenotazioni WHERE IDCliente = ?";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, c.getIdCliente());
	            rs = stmt.executeQuery();
	            if (rs.next()) {
	                prenotazione = new PrenotazioneModel();
	                prenotazione.setIdPrenotazione(rs.getInt("IDPrenotazione"));
	                // Set the other fields of prenotazione from the ResultSet
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }
	    return prenotazione;
	}

	@Override
	public boolean createPrenotazione(PrenotazioneModel p) {
	    Connection conn = null;
	    boolean esito = true;
 
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String query = "INSERT INTO Prenotazioni(IDPrenotazione, IDCliente, IndirizzoDiConsegna, DataRitiro, DataConsegna, MetodoDiPagamento, ImportoPagato, StatoPrenotazione) VALUES(?,?,?,?,?,?,?,?)";
	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            st1.setString(1, p.getIdPrenotazione());
	            st1.setString(2, p.getIdCliente());
	            st1.setString(3, p.getIndirizzoDiConsegna());
	            st1.setString(4, p.getDataRitiro());
	            st1.setString(5, p.getDataConsegna());
	            st1.setString(6, p.getMetodoPagamento());
	            st1.setFloat(7, p.getImportoPagato());
	            st1.setString(8, p.getStatoPrenotazione());
	            st1.executeUpdate();
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	        esito = false;
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }
	       return esito;}
  
	
	public boolean updatePrenotazione(PrenotazioneModel p) {
	    Connection conn = null;
	    boolean success = true;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String query = "UPDATE Prenotazioni SET IDCliente=?, IndirizzoDiConsegna=?, DataRitiro=?, DataConsegna=?, MetodoDiPagamento=?, ImportoPagato=?, StatoPrenotazione=? WHERE IDPrenotazione=?";
	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            st1.setString(1, p.getIdCliente());
	            st1.setString(2, p.getIndirizzoDiConsegna());
	            st1.setString(3, p.getDataRitiro());
	            st1.setString(4, p.getDataConsegna());
	            st1.setString(5, p.getMetodoPagamento());
	            st1.setFloat(6, p.getImportoPagato());
	            st1.setString(7, p.getStatoPrenotazione());
	            st1.setString(8, p.getIdPrenotazione());

	            int rowsUpdated = st1.executeUpdate();
	            success = rowsUpdated > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        success = false;
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }

	    return success;
	}

	@Override
	public boolean deletePrenotazione(PrenotazioneModel p) {
	    Connection conn = null;
	    boolean success = false;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String query = "DELETE FROM Prenotazioni WHERE IDPrenotazione=?";
	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            st1.setInt(1, p.getIdPrenotazione());

	            int rowsDeleted = st1.executeUpdate();
	            success = rowsDeleted > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        success = false;
	    } finally {
	        DatabaseConnection.closeConnection(conn);
	    }

	    return success;
	} 
 
	}

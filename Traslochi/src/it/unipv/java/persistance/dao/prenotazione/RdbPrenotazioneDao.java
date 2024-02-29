package it.unipv.java.persistance.dao.prenotazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.SingleSessioneAttiva;
import it.unipv.java.persistance.DatabaseConnection;

public class RdbPrenotazioneDao implements IPrenotazioneDao{
	private String schema;
	private Connection conn;
	
	public RdbPrenotazioneDao() {
		super();
		this.schema = "Traslochi";	//Inserisci Qui nome schema Prenotazione
	}
  

	@Override
	public List <PrenotazioneData> getAllPrenotazioni() {
	    List<PrenotazioneData> prenotazioni = new ArrayList<>();
	    Connection conn = null;
	    ResultSet rs = null;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String sql = "SELECT * FROM Prenotazione";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            rs = stmt.executeQuery();
	            while (rs.next()) {
	            	PrenotazioneData p = new PrenotazioneData();
	                p.setIdPrenotazione(rs.getString ("IDPrenotazione"));
	                p.setIdCliente(rs.getString("IDCliente"));
	                p.setIndirizzoConsegna(rs.getString("IndirizzoDiConsegna")); 
	                p.setIndirizzoRitiro(rs.getString("IndirizzoDiRitiro"));
	                p.setDataRitiro(rs.getString("DataRitiro"));
	                p.setDataConsegna(rs.getString("DataConsegna"));
	                p.setMetodoPagamento(rs.getString("MetodoDiPagamento"));
	                p.setImporto(rs.getFloat("ImportoDaPagare"));
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
	public  List <PrenotazioneData> getPrenotazioniUtente() {
	    List<PrenotazioneData> prenotazioni = new ArrayList<>();

	    Connection conn = null;
	    ResultSet rs = null;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String sql = "SELECT * FROM Prenotazione WHERE IDCliente = ?";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, SingleSessioneAttiva.getInstance().getUtenteAttivo().getId());
	            rs = stmt.executeQuery();
	            if (rs.next()) {
	            	PrenotazioneData prenotazione  = new PrenotazioneData();
	                prenotazione.setIdPrenotazione(rs.getString("IDPrenotazione"));
	            	prenotazione.setIndirizzoRitiro(rs.getString("IndirizzoDiRitiro"));
	    	        prenotazione.setIndirizzoConsegna(rs.getString("IndirizzoDiConsegna"));
	    	        prenotazione.setDataRitiro(rs.getString("DataRitiro"));
	    	        prenotazione.setDataConsegna(rs.getString("DataConsegna"));
	    	        prenotazioni.add(prenotazione);
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
	public boolean createPrenotazione(PrenotazioneData p) {
		conn = DatabaseConnection.startConnection(conn, schema);
		PreparedStatement st1 = null;
	    boolean esito = true;
	    try {
	    	String query = "INSERT INTO Prenotazione(IDPrenotazione, IDCliente, IndirizzoDiConsegna, "
	        										+ "IndirizzoDiRitiro, DataRitiro, DataConsegna, "
	        										+ "MetodoDiPagamento, ImportoDaPagare,"
	        										+ " StatoPrenotazione) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    	st1 = conn.prepareStatement(query);
	    	st1.setString(1, p.getIdPrenotazione());
	        st1.setString(2, p.getIdCliente());
	        st1.setString(3, p.getIndirizzoConsegna());
	        st1.setString(4, p.getIndirizzoRitiro());
	        st1.setString(5, p.getDataRitiro());
	        st1.setString(6, p.getDataConsegna());
	        st1.setString(7, p.getMetodoPagamento());
	        st1.setFloat(8, p.getImporto());
	        st1.setString(9, p.getStatoPrenotazione());
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
  
	public boolean updatePrenotazione(PrenotazioneData p) {
	    Connection conn = null;
	    boolean success = true;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String query = "UPDATE Prenotazione SET IDCliente=?, IndirizzoDiConsegna=?, DataRitiro=?, DataConsegna=?, MetodoDiPagamento=?, ImportoDaPagare=?, StatoPrenotazione=? WHERE IDPrenotazione=?";
	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            st1.setString(1, p.getIdCliente());
	            st1.setString(2, p.getIndirizzoConsegna());
	            st1.setString(3, p.getDataRitiro());
	            st1.setString(4, p.getDataConsegna());
	            st1.setString(5, p.getMetodoPagamento());
	            st1.setFloat(6, p.getImporto());
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
	public boolean deletePrenotazione(PrenotazioneData p) {
	    Connection conn = null;
	    boolean success = false;

	    try {
	        conn = DatabaseConnection.startConnection(conn, schema);
	        String query = "DELETE FROM Prenotazione WHERE IDPrenotazione=?";
	        try (PreparedStatement st1 = conn.prepareStatement(query)) {
	            st1.setString(1, p.getIdPrenotazione());

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
 
	  
 
	}//finePrenotazioneDao

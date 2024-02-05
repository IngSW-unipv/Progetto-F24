package it.unipv.java.persistance.dao.prenotazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.Prenotazione;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class PrenotazioneDao implements IPrenotazioneDao{
	private String schema;
	private Connection conn;
	
	public PrenotazioneDao() {
		super();
		this.schema = "NOME SCHEMA";	//Inserisci Qui nome schema Prenotazione
	}
	@Override
	public List<Prenotazione> getAllPrenotazioni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prenotazione getPrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createPrenotazione(Prenotazione p) {
		conn=DatabaseConnection.startConnection(conn,schema);
		PreparedStatement st1;
		
		boolean esito=true;

		try
		{
			String query="INSERT INTO PRENOTAZIONI("
					+ "IDPRENOTAZIONE,IDCLIENTE,"
					+ "INDCONS,INDRIT,DATARIT,"
					+ "DATACONS,"
					+ "METODOPAG,IMPORTOPAG,STATOPRENOT) "
					+ "VALUES(?,?,?,?,?,?,?,?,?)";
			
			st1 = conn.prepareStatement(query);
			st1.setString(1,p.getIdPrenotazione());
			st1.setString(2,p.getIdCliente());
			st1.setString(3,p.getIndirizzoConsegna());
			st1.setString(4,p.getIndirizzoRitiro());
			st1.setString(5,p.getDataRitiro());
			st1.setString(6,p.getDataConsegna());
			st1.setString(7,p.getMetodoPagamento());
			st1.setString(8,p.getImportoPagato());
			st1.setString(9,p.getStatoPrenotazione());
			st1.executeUpdate(query);

		}catch (Exception e){
			e.printStackTrace();
			esito=false;
		}

		DatabaseConnection.closeConnection(conn);
		return esito;
	}

	@Override
	public boolean updatePrenotazione(Prenotazione p) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletePrenotazione(Prenotazione p) {
		return false;
		// TODO Auto-generated method stub
		
	}

}

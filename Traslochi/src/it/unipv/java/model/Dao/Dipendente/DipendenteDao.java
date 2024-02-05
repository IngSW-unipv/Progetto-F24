package it.unipv.java.model.Dao;

import it.unipv.java.model.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 

public class DipendenteDAO implements IDipendenteDAO{
	
	private String schema;
	private Connection conn;
	
	public DipendenteDAO() {
		super();
		this.schema = "PROVA"; //anche in un file configurazione 
		// chiede al FACTORY di costruire la connessione e il factory gliela da  
	}

	@Override
	public List<DipendenteDAO> getAllDipendenti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DipendenteDAO getDipendente(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createDipendente(RegisterModel reg, Responsabile res) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDipendente(Dipendente d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDipendente(DipendenteDAO d) {
		// TODO Auto-generated method stub
		
	}

 

}

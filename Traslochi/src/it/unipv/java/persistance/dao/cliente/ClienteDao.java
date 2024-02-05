package it.unipv.java.persistance.dao.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import it.unipv.java.model.Cliente;
import it.unipv.java.model.LoginModel;
import it.unipv.java.model.RegisterModel;
import it.unipv.java.persistance.dao.DatabaseConnection;

public class ClienteDao implements IClienteDao{
	private String schema;
	private Connection conn;
	
	public ClienteDao() {
		super();
		this.schema = "NOME SCHEMA";	//Inserisci Qui nome schema Cliente
	}
	
	@Override
	public List<Cliente> getAllClienti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getCliente(LoginModel login) {
		// TODO Auto-generated method stub
		return null;
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
	public boolean updateCliente(Cliente c) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteCliente(Cliente c) {
		return false;
		// TODO Auto-generated method stub
		
	}

}

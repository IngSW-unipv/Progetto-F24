package it.unipv.test.persistance;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.unipv.java.persistance.DatabaseConnection;

public class DatabaseConnectionTest {
	private List<String> schemi;
	private Connection conn;
	
	@Before
	public void initSchemas() {
		schemi = new ArrayList<String>();
		schemi.add("Traslochi");
	}

	@Test
	public void dbConnectionTest() {
		try {
			for(String schema : schemi) {
				conn = DatabaseConnection.startConnection(conn, schema);
				Assert.assertNotNull("Connessione allo schema " + schema + " non riuscita!",conn);
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
package it.unipv.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;

public class DatabaseConnectionTest {
	
    public static void main(String[] args) {
        // Nome del database
        String databaseName = "Traslochi"; // Modifica con il nome del tuo database
        
        // Parametri di connessione
        String url = String.format("jdbc:mysql://localhost:3306/%s?serverTimezone=UTC", databaseName); // Usa il nome del database
        String username = "root"; // Modifica con il tuo username
        String password = "Password23."; // Modifica con la tua password

        try {
            // Caricamento del driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Stabilire una connessione
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connessione al database riuscita!");
                conn.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Il driver JDBC non è stato trovato.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connessione al database fallita.");
            e.printStackTrace();
        }
    }
}//fineConnection
package it.unipv.java.model;

public class RegisterModel {

	private String nome;         // dalla view
	private String cognome;     // dalla view
 	private String email;      // dalla view
	private String password;  // dalla view

	public RegisterModel(String nome, String cognome, String id, String email, String password) {
		this.nome = nome;
		this.cognome = cognome;
		// this.id = id;
		this.email = email;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String cs) {
		this.password = cs;
	}
 

	public boolean validaDati() {

		if (nome == null || nome.trim().isEmpty()) {
			return false;
		}

		if (cognome == null || cognome.trim().isEmpty()) {
			return false;
		}

		if (email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")) { //espressione regex
		    return false;
		}


		if (password == null || password.length() < 8) {  //password deve essere lunga almeno 8 caratteri
			return false;
		}

		return true; // Tutti i controlli di validità superati
	}

	public boolean confermaRegistrazione() {
	    if (!validaDati()) {
 	        //gestione nella view
	        return false; // I dati non sono validi, la registrazione non può procedere
	    } else {
	        try {
 	            boolean registrazioneRiuscita = AuthGestor.registerUser(this);
	            if (!registrazioneRiuscita) { 
	                System.err.println("Registrazione fallita a causa di un errore nel processo di salvataggio.");//fare questo per la view
	                return false; 
	            }
	        } catch (Exception e) {
	             
	            System.err.println("Errore durante la registrazione: " + e.getMessage());//fare questo per la view
	            return false; // Restituisce false per indicare che la registrazione non è riuscita a causa di un'eccezione 
	        }
	    }
	  //fare questo per la view
	    return true; // Restituisce true se la registrazione è avvenuta con successo
	}


}// fine register model

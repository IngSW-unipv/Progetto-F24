package it.unipv.java.model;

public class RegisterModel {
    private UserModel um;  
 
    public RegisterModel(UserModel um) {
        this.um = um;
    }

     public boolean validaDati() {
        if (um.getNome() == null || um.getNome().trim().isEmpty()) {
            return false;
        }
        if (um.getCognome() == null || um.getCognome().trim().isEmpty()) {
            return false;
        }
        // Utilizza una regex per validare l'email
        if (um.getEmail() == null || !um.getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")) {
            return false;
        }
        // Controlla che la password sia lunga almeno 8 caratteri
        if (um.getPassword() == null || um.getPassword().length() < 8) {
            return false;
        }
        return true; // Tutti i controlli di validità superati
    }

    public UserModel getUm() {
		return um;
	}

	public void setUm(UserModel um) {
		this.um = um;
	}

	// Metodo per impostare o sostituire l'istanza di UserModel
    public void setUserModel(UserModel um) {
        this.um = um;
    }

    // Metodo per confermare la registrazione
    public boolean confermaRegistrazione() {
        if (!validaDati()) {
            return false; // I dati non sono validi, la registrazione non può procedere
        } else {
            try {
                // Assumi che AuthGestor.registerUser possa lavorare direttamente con UserModel
                boolean registrazioneRiuscita = AuthGestor.registerUser(um);
                if (!registrazioneRiuscita) {
                    System.err.println("Registrazione fallita a causa di un errore nel processo di salvataggio.");
                    return false;
                }
            } catch (Exception e) {
                System.err.println("Errore durante la registrazione: " + e.getMessage());
                return false; // Restituisce false in caso di errore
            }
        }
        return true; // Restituisce true se la registrazione è avvenuta con successo
    }
}

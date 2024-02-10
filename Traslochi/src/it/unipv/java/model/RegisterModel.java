package it.unipv.java.model;

public class RegisterModel {
    private UserModel um; // Istanza di UserModel per gestire le proprietà dell'utente

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
        if (um.getEmail() == null || !um.getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")) {
            return false;
        }
        if (um.getPassword() == null || um.getPassword().length() < 8) {
            return false;
        }
        return true; // Tutti i controlli di validità superati
    }

    public boolean confermaRegistrazione() {
        if (!validaDati()) {
            return false; // I dati non sono validi, la registrazione non può procedere
        } else {
            try {
                boolean registrazioneRiuscita = AuthGestor.registerUser(um); // Assumi che AuthGestor possa lavorare direttamente con UserModel
                if (!registrazioneRiuscita) {
                    System.err.println("Registrazione fallita a causa di un errore nel processo di salvataggio.");
                    return false;
                }
            } catch (Exception e) {
                System.err.println("Errore durante la registrazione: " + e.getMessage());
                return false;
            }
        }
        return true;
    }

	public void setUserModel(UserModel um2) {
		// TODO Auto-generated method stub
		
	}
}

package it.unipv.java.model;

import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.persistance.dao.dipendente.DipendenteDao;
import it.unipv.java.persistance.dao.responsabile.ResponsabileDao;
import java.util.Random;

public class DataAccessFacade  {
	RegisterModel rm;
	LoginModel lm;
    private static DataAccessFacade instance;

    private DataAccessFacade() {
    }
    public static DataAccessFacade getInstance() {
        if (instance == null) {
            synchronized (DataAccessFacade.class) {
                if (instance == null) {
                    instance = new DataAccessFacade();
                }
            }
        }
        return instance;
    }
	public RegisterModel getRm() {
		return rm;
	}

	public void setRm(RegisterModel rm) {
		this.rm = rm;
	}

	public LoginModel getLm() {
		return lm;
	}

	public void setLm(LoginModel lm) {
		this.lm = lm;
	}

	public String generateIdFromCf(String cf) {
		if (cf == null || cf.length() < 5) {
			throw new IllegalArgumentException("CF non valido");
		}
		String baseId = cf.substring(0, 5); // Estrae le prime 5 cifre dal CF
		Random random = new Random();
		int n1 = random.nextInt(8); // Primo numero tra 0 e 7
		int n2 = n1 + 1 + random.nextInt(8 - n1); // Secondo numero, maggiore di n1
		int n3 = n2 + 1 + random.nextInt(9 - n2); // Terzo numero, maggiore di n2
		return baseId + n1 + n2 + n3;
	}

	// Metodo per determinare il UserType
	public static UserType determineUserType(String email) {
		String dominio = email.substring(email.indexOf("@") + 1);
		if ("bidons.it".equals(dominio)) {
			return UserType.DIPENDENTE;
		} else if ("bidonsResp.it".equals(dominio)) {
			return UserType.RESPONSABILE;
		} else {
			return UserType.CLIENTE;
		}
	}

	public   boolean registerUser(RegisterModel rm) {
		
		 DataAccessFacade ag = DataAccessFacade.getInstance();
			String id = ag.generateIdFromCf(rm.getUm().getCf());
			rm.getUm().setId(id);
			UserType userType = determineUserType(rm.getUm().getEmail());
			rm.getUm().setUserType(userType);
			boolean esito=false;
		switch (userType) {
		case DIPENDENTE:
			esito=new DipendenteDao().createDipendente(rm);
			break;
		case RESPONSABILE:
			esito=new ResponsabileDao().createResponsabile(rm);
			break;
		case CLIENTE:
			esito=new ClienteDao().createCliente(rm); 
			break;
		}
		return esito;
	}

	
	
	public boolean loginUser(LoginModel lm) {
	    UserType userType = determineUserType(lm.getUm().getEmail());
	    boolean loginSuccess = false;

	    // A seconda del tipo di utente, chiama il metodo DAO corrispondente.
	    switch (userType) {
	        case CLIENTE:
	            loginSuccess = new ClienteDao().getCliente(lm);
	            break;
	        case DIPENDENTE:
	            loginSuccess = new DipendenteDao().getDipendente(lm);
	            break;
	        case RESPONSABILE:
	            loginSuccess = new ResponsabileDao().getResponsabile(lm);
	            break;
	    }

	    return loginSuccess;
	}


}//fine facade

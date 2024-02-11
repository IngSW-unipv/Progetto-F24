package it.unipv.java.model;

import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.persistance.dao.dipendente.DipendenteDao;
import it.unipv.java.persistance.dao.responsabile.ResponsabileDao;
import java.util.Random;

public class AuthGestor {
	RegisterModel rm;
	LoginModel lm;

	public AuthGestor() {
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

	public static boolean registerUser(UserModel um) {
		AuthGestor ag = new AuthGestor();
		String id = ag.generateIdFromCf(um.getCf());
		um.setId(id);
		UserType userType = determineUserType(um.getEmail());
		um.setUserType(userType);

		switch (userType) {
		case DIPENDENTE:
			new DipendenteDao().createDipendente(ag);
			break;
		case RESPONSABILE:
			new ResponsabileDao().createResponsabile(ag);
			break;
		case CLIENTE:
			new ClienteDao().createCliente(ag);
			break;
		}
		return true;
	}

	public static boolean loginUser(UserModel loginuser) {
		UserType userType = determineUserType(loginuser.getEmail());
		boolean loginSuccess = false;
		AuthGestor ag = new AuthGestor();
		ag.setLm(new LoginModel());
		ag.getLm().setUm(loginuser);
		if (userType == UserType.CLIENTE) {
			loginSuccess = new ClienteDao().getCliente(ag);
		} else if (userType == UserType.DIPENDENTE) {
			loginSuccess = new DipendenteDao().getDipendente(ag);
		} else if (userType == UserType.RESPONSABILE) {
			loginSuccess = new ResponsabileDao().getResponsabile(ag);
		}

		return loginSuccess;
	}

}

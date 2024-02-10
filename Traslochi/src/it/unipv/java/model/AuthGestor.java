package it.unipv.java.model;

import it.unipv.java.persistance.dao.cliente.ClienteDao;
import it.unipv.java.persistance.dao.dipendente.DipendenteDao;
import it.unipv.java.persistance.dao.responsabile.ResponsabileDao;
import java.util.Random;

public class AuthGestor {
	RegisterModel rm;

	public AuthGestor() {
	}

	public String generateIdFromCf(String cf) {
		if (cf == null || cf.length() < 5) {
			throw new IllegalArgumentException("CF non valido");
		}

		String baseId = cf.substring(0, 5); // estraggo le prime 5 cifre dal CF

		// Genera 3 numeri interi casuali in ordine crescente
		Random random = new Random();
		int n1 = random.nextInt(8); // Primo numero tra 0 e 7
		int n2 = n1 + 1 + random.nextInt(8 - n1); // Secondo numero, maggiore di n1
		int n3 = n2 + 1 + random.nextInt(9 - n2); // Terzo numero, maggiore di n2

		return baseId + n1 + n2 + n3;
	}

	public static boolean registerUser(UserModel um) {
		AuthGestor ag = new AuthGestor();

		String id = ag.generateIdFromCf(um.getCf());
		um.setId(id); // Assumi che UserModel abbia un metodo setId

		String dominio = um.getEmail().substring(um.getEmail().indexOf("@") + 1);
		if ("bidons.it".equals(dominio)) {
			um.setUserType(UserType.DIPENDENTE);
		} else if ("bidonsResp.it".equals(dominio)) {
			um.setUserType(UserType.RESPONSABILE);
		} else {
			um.setUserType(UserType.CLIENTE);
		}

		if (um.getUserType() == UserType.DIPENDENTE) {
			DipendenteDao d = new DipendenteDao();
			d.createDipendente(ag);
		} else if (um.getUserType() == UserType.RESPONSABILE) {
			ResponsabileDao r = new ResponsabileDao();
			r.createResponsabile(ag);
		} else {
			ClienteDao c = new ClienteDao();
			c.createCliente(ag);
		}
		return true;
	}

	public RegisterModel getRm() {
		return rm;
	}

	public void setRm(RegisterModel rm) {
		this.rm = rm;
	}

}

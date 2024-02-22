package it.unipv.java.model.user;

import java.util.Random;

public class UserModelUtil {
	
	public static String generateIdFromCf(String cf) {
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
	public static UserType determineUserType(UserModel um) {
		String dominio = um.getEmail().substring(um.getEmail().indexOf("@") + 1);
		if ("bidons.it".equals(dominio)) {
			return UserType.DIPENDENTE;
		} else if ("bidonsResp.it".equals(dominio)) {
			return UserType.RESPONSABILE;
		} else {
			return UserType.CLIENTE;
		}
	}

	
}

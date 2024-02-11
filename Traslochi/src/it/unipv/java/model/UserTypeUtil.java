package it.unipv.java.model;

public class UserTypeUtil {

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
}

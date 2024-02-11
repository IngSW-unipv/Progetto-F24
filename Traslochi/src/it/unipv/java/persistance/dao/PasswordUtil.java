package it.unipv.java.persistance.dao;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class PasswordUtil {

	// Crea un hash sicuro di una password in chiaro. 
    public static String hashPassword(String plainTextPassword) {
        return BCrypt.withDefaults().hashToString(12, plainTextPassword.toCharArray());
    }
 // Verifica un hash sicuro di una password in chiaro. 
    public static boolean verifyPassword(String plainTextPassword, String hashedPassword) {
        return BCrypt.verifyer().verify(plainTextPassword.toCharArray(), hashedPassword).verified;
    }
}

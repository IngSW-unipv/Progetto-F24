package it.unipv.java.model;
/**
 * Semplice Pojo per contenere i dati di Login
 */
public class LoginData {
	private String emailInserita;
	private String passwordInserita;
	
	public LoginData(String emailInserita, String passwordInserita) {
		this.emailInserita = emailInserita;
		this.passwordInserita = passwordInserita;
	}

	public String getEmailInserita() {
		return emailInserita;
	}

	public void setEmailInserita(String emailInserita) {
		this.emailInserita = emailInserita;
	}

	public String getPasswordInserita() {
		return passwordInserita;
	}

	public void setPasswordInserita(String passwordInserita) {
		this.passwordInserita = passwordInserita;
	}
	
}
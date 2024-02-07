package it.unipv.java.model;

public class LoginModel {
	private String email;
	private String dominio; //if bidons.it --> cerca Dip 
	private String password;
	 
public LoginModel() {
		// TODO Auto-generated constructor stub
	}

public void setDominio(String Email) {
	String[] parts = this.email.split("@");
		this.dominio = dominio;
	}
 public String getDominio() {
	 String[] parts = this.email.split("@");

	// Check if the email contains '@' and has a domain part
	if (parts.length > 1) {
	    String dominio = parts[1];// Output: bidons.com
	} 
	   
	return dominio;
}
 public String getPassword() {
	return password;
}

public String getEmail() {
	 
	return email;
}
 public void setEmail(String email) {
	this.email = email;
}
 public void setPassword(String password) {
	this.password = password;
}
}

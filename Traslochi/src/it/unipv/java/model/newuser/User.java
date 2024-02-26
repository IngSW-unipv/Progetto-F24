package it.unipv.java.model.newuser;

public abstract class User {
    private String nome;
    private String cognome;
    private String cf;
    private String email;
    private String password;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Override
    public String toString() {
    	return "User=" + this.getClass().getSimpleName() + "\n" 
    		 + "nome=" + this.getNome() + "\n" 
    		 + "cognome=" + this.getCognome() + "\n" 
    		 + "cf=" + this.getCf() + "\n" 
    		 + "email=" + this.getEmail() + "\n" 
    		 + "password" + this.getPassword() + "\n";
    }
}

package it.unipv.java.model;

public class LoginModel {
    private UserModel um;  

    public LoginModel() {
	}
 
	 
	public UserModel getUm() {
		return um;
	}
	public void setUm(UserModel um) {
		this.um = um;
	}
	
	public boolean confermaLogin() {
        boolean registrazioneRiuscita = DataAccessFacade.getInstance().loginUser(this);

 		return false;
	}
 
}//fine loginModel

package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.model.user.UserTypeUtil;

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
        if(registrazioneRiuscita) return true;
 		return false;
	}
	public UserType checkuser(UserModel um) { 
 		return  UserTypeUtil.determineUserType(um);
	}
	
	


}//fine loginModel

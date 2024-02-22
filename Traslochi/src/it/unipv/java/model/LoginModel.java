package it.unipv.java.model;

import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.model.user.UserModelUtil;
import it.unipv.java.persistance.PersistanceFacade;

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
        return PersistanceFacade.getInstance().loginUser(um);
	}
 
	public UserType checkuser(UserModel um) { 
 		return  UserModelUtil.determineUserType(um);
	}
	


}//fine loginModel

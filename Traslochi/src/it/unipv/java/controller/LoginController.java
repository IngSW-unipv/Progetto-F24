package it.unipv.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.java.model.LoginModel;
import it.unipv.java.model.user.UserModel;
import it.unipv.java.model.user.UserType;
import it.unipv.java.view.ClienteView;
import it.unipv.java.view.DipendentView;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;
import it.unipv.java.view.ResponsabileView;
import it.unipv.java.view.WarningView;

public class LoginController {
	public LoginModel lm;
	public LoginView lv;
	private ClienteView cv;
	private DipendentView dv;
	private ResponsabileView rv;

	public LoginController(LoginView lv) {
		this.lv = lv;
		setListeners();
	}

	private void setListeners() {
		lv.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserModel loginuser = new UserModel();
				loginuser.setEmail(lv.getEmail());
				loginuser.setPassword(lv.getPassword());
				lm.setUm(loginuser);
				if (lm.confermaLogin()) {
					//istanzio la home page quale? dipende dal valore di ritorno di conferma login se dip,cliente,respons
					UserType ut= lm.checkuser(loginuser);//QUA RITORNA UN USERTYPE
					switch(ut) {
					case CLIENTE: 
						lv.setVisible(false);
						cv.setVisible(true);
						dv.setVisible(false);
						rv.setVisible(false);
						break;
					case DIPENDENTE:
						lv.setVisible(false);
						cv.setVisible(false);
						dv.setVisible(true);
						rv.setVisible(false);
					    break;
					case RESPONSABILE:
						lv.setVisible(false);
						cv.setVisible(false);
						dv.setVisible(false);
						rv.setVisible(true);
						break;
					}
					
				} else {
					// lm.showErrorMessage("Errore nella registrazione. Verifica i dati inseriti.");
					WarningView wv= new WarningView();
					wv.mostraErrorGenerale();
					wv.getBottoneRiprova().addActionListener(new ActionListener() {
						 public void actionPerformed(ActionEvent e) { 
							 wv.closeWindow();
							 lv.setPassword("");
							 lv.setEmail("");
						 } });
				}
			}
		});

		lv.getRegisterButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				RegisterController rc= new RegisterController(registerView);
				registerView.setVisible(true);
			}
		});

	}
	
	public ActionListener getLoginButtonActionListener() {
        return lv.getLoginButton().getActionListeners()[0];
    }
	

}// fine loginController
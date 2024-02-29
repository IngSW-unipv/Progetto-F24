package it.unipv.java.controller.icontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import it.unipv.java.model.RegisterData;
import it.unipv.java.util.controllerpila.ControllerGestor;
import it.unipv.java.util.responsabilitychain.RegistrationHandler;
import it.unipv.java.view.LoginView;
import it.unipv.java.view.RegisterView;

public class RegisterController implements IController{
	private RegisterView registerView;
	private RegisterData datiInseriti;
	
	public RegisterController(RegisterView registerView) {
		this.registerView = registerView;
		this.datiInseriti = new RegisterData();
		this.registerView.setVisible(true);
		setListeners(); 
	}
	private void setListeners() {
		registerView.getBottoneConfermaReg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datiInseriti.setNomeInserito(registerView.getNome());
				datiInseriti.setCognomeInserito(registerView.getCognome());
				datiInseriti.setCfInserito(registerView.getCF());
				datiInseriti.setEmailInserita(registerView.getEmail());
				datiInseriti.setPasswordInserita(registerView.getPass());
				datiInseriti.setConfermaPasswordInserita(registerView.getPassRipetuta()); 
				//Pseudo Chain Of Responsability
				RegistrationHandler gestoreRegistrazione = new RegistrationHandler(datiInseriti);
				if(gestoreRegistrazione.executeChainControllo()) {	
					gestoreRegistrazione.registraUtente(datiInseriti);
				} else {
					registerView.setPass("");
					registerView.setPassRipetuta("");
				}
			}
		}); 
		registerView.getBottoneReturn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerView.setVisible(false);	
				ControllerGestor.getInstance().getStack().pop();
				IController controllerPrec = ControllerGestor.getInstance().getStack().peek();
				controllerPrec.getView().setVisible(true);
			}
		});
	}
	
	@Override
	public JFrame getView() {
		return this.registerView;
	}
}
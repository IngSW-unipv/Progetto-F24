package it.unipv.java.model;

public class AuthGestor {
	//SI OCCUPERA DI GESTIRE SE I DATI INSERITI SONO DI UN DIPENDENTE,RESPONSABILE O CLIENTE
	RegisterModel rm;
	
	private void confermaRegistrazione() {
		
		//CONTROLLO SE PASS= PASSRIPETUTA e SE MAIL ESISTE GIA'
		if(!registerView.getPass().equals(registerView.getPassRipetuta())) {
			warningView.mostraErrorPassword();
		} else if(clienteDao.checkExistingEmail(registerView.getEmail())) {
			warningView.mostraErrorEmail();
		}else if(registerView.getPass().equals(registerView.getPassRipetuta()) && clienteDao.checkExistingEmail(registerView.getEmail()) == false) {
			registerModel.setNome(registerView.getNome());
			registerModel.setCognome(registerView.getCognome());
			registerModel.setEmail(registerView.getEmail());
			registerModel.setPassword(registerView.getPass());
			registerModel.setIdCliente(registerView.getCF());
			
			
			/*boolean registrazioneSuccesso = clienteDao.createCliente(registerModel);
			
			if(registrazioneSuccesso) {
				registerView.dispose(); // CHIUDI SCHERMATA REGISTRAZIONE
		        loginView.setVisible(true); // APRI SCHERMATA LOGIN
			} */
			
		}
	}

	public static void authUser(RegisterModel rm) {
		// TODO Auto-generated method stub
		
	}

}

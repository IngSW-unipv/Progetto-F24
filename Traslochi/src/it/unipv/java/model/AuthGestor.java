package it.unipv.java.model;

public class AuthGestor {
	//SI OCCUPERA DI GESTIRE SE I DATI INSERITI e tamite il dominio dell'email verifica il tipo di user SONO DI UN DIPENDENTE,RESPONSABILE O CLIENTE
	RegisterModel rm;
	String id;//questo id puo essere idCliente,idResponsabile,idDipendente
	
	
	public AuthGestor() {
		// TODO Auto-generated constructor stub
	}
	
	
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

	public static boolean authUser(RegisterModel rm) {
		
		rm.getEmail() fa un controllo di quello che
		return false;
		// TODO Auto-generated method stub
		
	}

	public static boolean registerUser(RegisterModel registerModel) {
		//qua creo id
		return false;
		// TODO Auto-generated method stub
		
	}

 
}

package it.unipv.java.util.responsabilitychain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;
import it.unipv.java.util.responsabilitychain.handlers.ControlloCF;
import it.unipv.java.util.responsabilitychain.handlers.ControlloConfermaPassword;
import it.unipv.java.util.responsabilitychain.handlers.ControlloEmail;
import it.unipv.java.util.responsabilitychain.handlers.ControlloNome;
import it.unipv.java.util.responsabilitychain.handlers.ControlloPassword;
import it.unipv.java.util.responsabilitychain.handlers.IControllo;
import it.unipv.java.util.responsabilitychain.handlers.VuotoControl;

public class PrenotazioneHandler {
	private PrenotazioneData datiInseriti;
    private List<IControllo> catenaControlli;
    
	public PrenotazioneHandler(PrenotazioneData datiInseriti) {
		this.datiInseriti = datiInseriti;
		datiInseriti.setImporto(calcolaImporto());
    	this.catenaControlli = new ArrayList<IControllo>();
        buildChain();
	}
	
	public void buildChain() {
       	catenaControlli.add(new ControlloConfermaPassword());
    	catenaControlli.add(new ControlloPassword());
    	catenaControlli.add(new ControlloEmail());
    	catenaControlli.add(new ControlloCF());
    	catenaControlli.add(new ControlloNome());
    	catenaControlli.add(new VuotoControl());
    }
	
//	potrebbe esserci uno strategy per il calcolo degli importi.
	public float calcolaImporto() {
		long giorni = calcolagiorni(datiInseriti.getDataRitiro(), datiInseriti.getDataConsegna());
		float tariffaMinima = 300;
		float aggiuntaPerGiorno = 50;

		float importo = tariffaMinima + (giorni * aggiuntaPerGiorno);

		return importo;
	}

	public long calcolagiorni(String dataRitiro, String dataConsegna) {

		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date date1 = myFormat.parse(dataRitiro);
			Date date2 = myFormat.parse(dataConsegna);
			long diff = date2.getTime() - date1.getTime();
			return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public boolean registraPrenotazione() {
		if (validaDati()) {
			datiInseriti.setIdPrenotazione(generateUniqueId());
			if(PersistanceFacade.getInstance().createPrenotazione(datiInseriti))
				return true;
			else return false;
		}
		return false;
	}

	public boolean validaDati() {
		// Validazione Dati
		/*
		 * if (um.getNome() == null || um.getNome().trim().isEmpty()) { return false; }
		 * if (um.getCognome() == null || um.getCognome().trim().isEmpty()) { return
		 * false; } // Utilizza una regex per validare l'email if (um.getEmail() == null
		 * ||
		 * !um.getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")) {
		 * return false; } // Controlla che la password sia lunga almeno 8 caratteri if
		 * (um.getPassword() == null || um.getPassword().length() < 8) { return false; }
		 */
		return true; // Tutti i controlli di validità superati
	}

	private String generateUniqueId() {
		return UUID.randomUUID().toString();
	}

	public List<PrenotazioneData> mostratuttePrenotazioni() {
		return PersistanceFacade.getInstance().mostraPrenotazioni();
	}

	public List<PrenotazioneData> getPrenotazioniUtente(User um) {
		return PersistanceFacade.getInstance().getPrenotazioniCliente();
	}

	public void setScadGiorno(String textField_7) {
		// TODO Auto-generated method stub

	}
}

package it.unipv.java.util.prenotazionegestor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import it.unipv.java.model.PrenotazioneData;
import it.unipv.java.model.PrenotazioneModel;
import it.unipv.java.model.user.User;
import it.unipv.java.persistance.PersistanceFacade;

public class PrenotazioneHandler {
	private PrenotazioneData datiInseriti;

	public PrenotazioneHandler(PrenotazioneData datiInseriti) {
		this.datiInseriti = datiInseriti;
		datiInseriti.setImporto(calcolaImporto());
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
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
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

	public boolean savePrenotazione() {
		if (validaDati()) {
			this.setIdPrenotazione(UUID.randomUUID().toString());
			this.setImportoPagato(importoPagato); // Calcola automaticamente l'importo
			boolean createSuccess = PersistanceFacade.getInstance().createPrenotazione(this);
			return createSuccess;
		} else {
			return false;
		}
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

	public List<PrenotazioneModel> mostratuttePrenotazioni() {
		return PersistanceFacade.getInstance().mostraPrenotazioni();
	}

	public List<PrenotazioneModel> getPrenotazioniUtente(User um) {
		return PersistanceFacade.getInstance().getPrenotazioniCliente();
	}

	public void setScadGiorno(String textField_7) {
		// TODO Auto-generated method stub

	}

	public void registraPrenotazione() {
		// TODO Auto-generated method stub

	}
}
